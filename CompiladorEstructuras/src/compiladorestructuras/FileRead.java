package compiladorestructuras;

import java.io.*;
import java.util.Scanner;
import java.util.*;

public class FileRead {
    //ATRIBUTOS
    private Scanner s;
    private String archivo;
    private List<List<String>> guardaCodigo;    //cada indice es una linea de codigo. Se accede a cada linea con guardaCodigo.get(x)
    private List<String> code;                  //0-tabuladores o variables / 1- mnemonico o directiva / 3- direcciones o instrucciones / 4- Comentarios (de haberlos en la misma linea)
    private int n_lineas;
    //private int eByte;
    
    public String palabra;
    public List<Integer> n_palabras;   // cuenta las palabras por linea
    
    //CONSTRUCTOR
    public FileRead(){
        int i;
        //eByte=0;
        n_lineas = 0;
        archivo = "";
        guardaCodigo = new ArrayList<List<String>>();   //Crea [0][x]
        code = new ArrayList<String>();                   //Crea memora para [x]
        for(i=0;i<=3;i++)
            code.add("");   //Aqui logra crear los espacios que corresponderian a [x..][0..1..2..3]
        s = new Scanner (System.in);
        palabra = "";
        n_palabras = new ArrayList<Integer>();
    }
    
    //METODOS
    private void cuentaLineas(){
        // Pide el nombre del archivo, lo guarda, abre un FileReader llamado archi y cuenta lineas hasta que encuentra 13, que es el ascii del enter
        //el tab es un 09 ascii, 13 10 enter, 32 space
        int Byte, n_lin=0, pal = 0;
        try{
            //el tab es un 9 ascii, 13 10 enter, 32 space, 42 asterisco
            System.out.println("Ingrese el nombre del archivo: ");
            archivo = s.nextLine();
            FileReader archi = new FileReader(archivo);
            Byte = archi.read();
            // Pal tomara valores de acuerdo al numero de "palabras". Máximo 4. 0 = espacios vacios, enters, en sola linea. 1= comentarios completos de una linea (en cualquier parte de la linea), etiquetas, etc.
            while(Byte!=-1){
                if(Byte != 42 && Byte != 13){
                    if(Byte == 32){
                        while(Byte == 32 || Byte == 9)
                            Byte = archi.read();
                        if(Byte == 42)
                            while(Byte!=13)
                                Byte = archi.read();
                        else if(Byte!=13)    //Esto asegura que hay algo escrito aparte de espacios. Puede que los espacios en blanco del .asc hayan "trampas". Bug fixed.
                            pal++;
                    }
                    while(Byte!=13 && Byte!=-1){
                        while(Byte == 32 || Byte == 9)
                            Byte = archi.read();
                        if(Byte != 42){
                            while(Byte != 32 && Byte != 9 && Byte != 13 && Byte != -1)
                                Byte = archi.read();
                            pal++;
                        }
                        else{
                            while(Byte != 13)
                                Byte = archi.read();
                            pal++;
                        }
                    }
                }
                else if (Byte == 42){
                    while(Byte != 13)
                        Byte = archi.read();
                    Byte = archi.read();    //En este punto, Byte es 13, uno mas es 10
                    pal++;
                }
                if(Byte == 13)
                    Byte = archi.read();
                n_lin++;
                Byte = archi.read();    //Siguiente linea
                n_palabras.add(pal);    //cada localidad será una linea del codigo de forma n-1, get(x) me dará el numero de palabras en cada linea
                pal = 0;
            }
            n_lin++;
            n_lineas = n_lin;
            archi.close();
        }catch(IOException e){
            System.out.println(e);
        }
    };
    
    private void addElementoH (List<String> pal){  //H es Horizontal, mete cada linea de codigo a guardaCodigo -> [espacios][Directiva][Instruccion][Comentario]
        guardaCodigo.add(pal);
    };
    
    public int unElemento(int eByte,FileReader f, List<String> pal){   //Puede ser que contenga una etiqueta (debe ir pegada al margen) o comentarios (en cualquier lugar)
        //String palabra = "";
        try{
            while(eByte != 13){
                palabra = palabra.concat((char)eByte+"");
                eByte = f.read();
            }
            eByte = f.read();   //10
            eByte = f.read();   //Sig. linea
            //addCode(1,palabra);
            palabra = palabra.toUpperCase();
            pal.set(0,palabra);    // En la localidad 0 siempre estará la etiqueta o toooodo el comentario.
            for(int i = 1; i<=3 ; i++)
                pal.set(i,"0");
            palabra = "";
        }catch(IOException e){
            System.out.println(e);
        }
        return eByte;
    };
    
    public int dosElemento(int eByte, FileReader f, List<String> pal){        // dos elementos solo son inherentes
        try{
            while(eByte == 32)
                eByte = f.read();
            while(eByte != 13){
                palabra = palabra.concat((char)eByte+"");
                eByte = f.read();
            }
            eByte = f.read();   //10
            eByte = f.read();   //Sig. linea
            palabra = palabra.toUpperCase();    //Convierte a MAYUSCULAS
            pal.set(0,"0");
            pal.set(1,palabra);
            for(int i = 2; i<=3 ; i++)
                pal.set(i,"0");
            palabra = "";
        }catch(IOException e){
            System.out.println(e);
        }
        return eByte;
    };
    
    public int tresElemento(int eByte, FileReader f, List<String> pal){      //Hay instrucciones, deben tener un space al principio: '   'ORG    $8000
        int i;
        try{
            if(eByte == 32){    //'   'ORG    $8000
                i=1;
                while(eByte != 13){
                    while(eByte == 32)
                        eByte = f.read();
                    while(eByte != 32 && eByte != 13){
                        palabra = palabra.concat((char)eByte+"");
                        eByte = f.read();
                    }
                    palabra = palabra.toUpperCase();
                    pal.set(i,palabra);
                    i++;
                    palabra = "";
                }
                pal.set(0,"0");
                pal.set(3,"0");
            }
            else{   //DDRD   EQU   $1009
                i=0;
                while(eByte != 13){
                    while(eByte == 32)
                        eByte = f.read();
                    while(eByte != 32 && eByte != 13){
                        palabra = palabra.concat((char)eByte+"");
                        eByte = f.read();
                    }
                    palabra = palabra.toUpperCase();
                    pal.set(i,palabra);
                    i++;
                    palabra = "";
                }
            }
            eByte = f.read();   //10
            eByte = f.read();   //Sig. linea
            i=1;
        }catch(IOException e){
            System.out.println(e);
        }
        return eByte;
    };
    
    public int cuatroElemento(int eByte, FileReader f, List<String> pal){
        int i;
        try{
            if(eByte == 32){    //'   'ORG    $8000 *Coments
                i=1;
                while(eByte != 13){
                    while(eByte == 32)
                        eByte = f.read();
                    if(eByte == 42){
                        while(eByte != 13){
                            palabra = palabra.concat((char)eByte+"");
                            eByte = f.read();
                        }
                    }
                    while(eByte != 32 && eByte != 42 && eByte != 13){
                        palabra = palabra.concat((char)eByte+"");
                        eByte = f.read();
                    }
                    palabra = palabra.toUpperCase();
                    pal.set(i,palabra);
                    i++;
                    palabra = "";
                }
                eByte = f.read();   //10
                eByte = f.read();   //Sig. linea
                pal.set(0,"0");
            }
            else{
                i=0;
                while(eByte != 13){
                    if(i!=3){
                        while(eByte == 32)
                            eByte = f.read();
                        while(eByte != 32 && eByte != 42 && eByte != 13){
                            palabra = palabra.concat((char)eByte+"");
                            eByte = f.read();
                        }
                       /* palabra = palabra.toUpperCase();
                        code.set(i,palabra);
                        i++;
                        palabra = "";*/
                    }
                    else{
                        while(eByte != 13){
                            palabra = palabra.concat((char)eByte+"");
                            eByte = f.read();
                        }
                    }
                    palabra = palabra.toUpperCase();
                    pal.set(i,palabra);
                    i++;
                    palabra = "";
                }
                eByte = f.read();   //10
                eByte = f.read();   //Sig. linea
            }
        }catch(IOException e){
            System.out.println(e);
        }
        return eByte;
    };
    
    public void fileR(){
        int eByte = 0,i=0,swch,j;
        ListaLigada LisL = new ListaLigada();
       /**** Nodo pal = new Nodo();     ****/
        List<String> pala = new ArrayList<String>();
        for(i=0;i<=3;i++)
            pala.add("");
        try{
            FileReader f = new FileReader(archivo);
            eByte = f.read();
            //while(enteroByte!=-1){
            for(i=0;i<=40;i++){
                swch = n_palabras.get(i);
                switch(swch){
                    case 1:
                        eByte = unElemento(eByte,f,pala);
                        break;
                    case 2:
                        eByte = dosElemento(eByte,f,pala);
                        break;
                    case 3:
                        eByte = tresElemento(eByte,f,pala);
                        break;
                    case 4:
                        eByte = cuatroElemento(eByte,f,pala);
                        break;
                    default:
                        eByte = f.read();
                        eByte = f.read();
                        for(j=0;j<=3;j++)
                            code.set(j,"0");
                        break;
                }
                LisL.InsertarAlFinal(pala);
                addElementoH(LisL.Extraer());
            }
            j=1;
            for(i=0;i<=40;i++){
                System.out.println((j++)+"  "+guardaCodigo.get(i));
            }
              //  i++;
            //}
            System.out.println();
        }catch(IOException e){
            System.out.println(e);
        }
    };
    
    public int addRepetido(int x, String palabra,int enteroByte, FileReader f, ArrayList<String> nemr){
        // Use esto para evitar usar más codigo en fileR.
        int i;
        try{
            while(enteroByte == 9 || enteroByte == 32)  //me aseguro que enteroByte pase a la siguiente palabra o llegue a un enter
                enteroByte = f.read();
            if(enteroByte == 13){
                for(i=x;i<=3;i++)
                    nemr.add(x,"0");
                enteroByte = f.read();      //10
                enteroByte = f.read();      //Sig linea
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
        return enteroByte;
    };  //Ya no se usa?

    public int getNLineas(){
        return n_lineas;
    };
    
    
    public void mainMethod(){
        cuentaLineas();
        System.out.println(n_palabras);
        fileR();
    }
}