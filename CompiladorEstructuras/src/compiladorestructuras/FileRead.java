package compiladorestructuras;

import java.io.*;
import java.util.Scanner;
import java.util.*;

public class FileRead {
    //ATRIBUTOS
    private Scanner s;
    private String archivo;
    private List<List<String>> guardaCodigo;    //cada indice es una linea de codigo. Se accede a cada linea con guardaCodigo.get(x)
    private List<String> code;                  //0 tabuladores o variables / 1- mnemonico o directiva / 3- direcciones o instrucciones / 4- Comentarios (de haberlos en la misma linea)
    private int n_lineas;
    
    //CONSTRUCTOR
    public FileRead(){
        int i;
        n_lineas = 0;
        archivo = "";
        guardaCodigo = new ArrayList<List<String>>();   //Crea [0][x]
        code = new ArrayList<String>();                   //Crea memora para [x]
        for(i=0;i<=3;i++)
            code.add("");   //Aqui logra crear los espacios que corresponderian a [x..][0..1..2..3]
        s = new Scanner (System.in);
    }
    
    //METODOS
    private void cuentaLineas(){
        // Pide el nombre del archivo, lo guarda, abre un FileReader llamado archi y cuenta lineas hasta que encuentra 13, que es el ascii del enter
        //el tab es un 9 ascii, 13 10 enter, 32 space
        int cuenta;
        try{
            System.out.println("Ingrese el nombre del archivo: ");
            archivo = s.nextLine();
            FileReader archi = new FileReader(archivo);
            cuenta = archi.read();
            while(cuenta!=-1){
                if(cuenta == 13)
                    n_lineas++;
                cuenta = archi.read();
            }
            n_lineas++;
            System.out.println("Lineas: "+n_lineas);
            archi.close();
        }catch(IOException e){
            System.out.println(e);
        }
    };
    
    private void addElementoH (ArrayList<String> mne){  //H es Horizontal
        int i;
        this.guardaCodigo.add(mne);
    };
    
    public void fileR(){
        String palabra="";
        ArrayList<String> nemo = new ArrayList<String>();
        //char car;
        int enteroByte = 0,i=0,j;
        
        try{
            FileReader f = new FileReader(archivo);
            enteroByte = f.read();
            //el tab es un 9 ascii, 13 10 enter, 32 space, 42 asterisco
            while(enteroByte!=-1){
            //  **** Para matriz [0][x] *****
                if(enteroByte == 32 || enteroByte == 9){    //Hay un espacio o tabulador al principio
                    nemo.add(0,"0");      //equivale a matriz[i][0] = "0";
                }
                else if (enteroByte !=42) {     //Se asegura que no es un tabulador, ni un asterisco al principio
                    if(enteroByte != 13){
                        while(enteroByte != 9 || enteroByte != 32){     //concatena la palabra que encuentre hasta que haya un espacio
                            palabra = palabra.concat(""+(char)enteroByte);
                            enteroByte = f.read();
                        }
                        //enteroByte debe ser un espacio o enter
                        nemo.add(0,palabra);    //matriz[0][i] = palabra;
                        enteroByte = addRepetido(1,palabra, enteroByte, f, nemo);    //Solo es un elemento, guarda lo demas en 0
                    }
                    else{       //enter es 13 10, enteroByte en este punto es 13
                        enteroByte = f.read();      //enteroByte en este punto es 10
                        enteroByte = f.read();      //enteroByte en este punto debe ser nueva linea
                    }
                }
//                else if(enteroByte == 42){  //Existe un comentario al principio de la linea, no se tomara en cuenta
                palabra = "";
            //En este punto, ya se tiene un elemento en la posicion 0 de nemo
            
//          ******* Para matriz[1][x] *******
                while(enteroByte != 9 || enteroByte != 32){
                    palabra = palabra.concat(""+(char)enteroByte);
                    enteroByte = f.read();
                }
                nemo.add(1,palabra);    //matriz[1][i] = palabra;
                enteroByte = addRepetido(2,palabra, enteroByte, f, nemo);    //2 elementos
                palabra = "";
                // ******* Para matriz[2][x] ****
                while(enteroByte != 9 || enteroByte != 32){
                    palabra = palabra.concat(""+(char)enteroByte);
                    enteroByte = f.read();
                }
                nemo.add(2,palabra);    //matriz[1][i] = palabra;
                enteroByte = addRepetido(3,palabra, enteroByte, f, nemo);    //3 elementos
                palabra = "";
            // ******* Para matriz[3][x] ****
                if(enteroByte == 42){   //Es un comentario al final de la linea, se toma en cuenta
                    while(enteroByte!=13){
                        palabra = palabra.concat(""+(char)enteroByte);
                        enteroByte = f.read();
                    }
                    nemo.add(3,palabra);
                }
                else{
                    //error
                }
                //Ya se leyó toda la linea
                
            }
            System.out.println();
            /*for(i=0;i<3;i++)
               System.out.print(matriz[0][i]+i+"\t");*/
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
    public int addRepetido(int x, String palabra,int enteroByte, FileReader f, ArrayList<String>nemr){
        while(enteroByte == 9 || enteroByte == 32)  //me aseguro que enteroByte pase a la siguiente palabra o llegue a un enter
            enteroByte = f.read();
        if(enteroByte == 13){
            for(i=x;i<=3;i++)
                nemr.add(x,"0");
        }
        return enteroByte;
    };

    public int getNLineas(){
        return n_lineas;
    };
}