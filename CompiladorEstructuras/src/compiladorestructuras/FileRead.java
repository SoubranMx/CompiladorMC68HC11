package compiladorestructuras;

import java.io.*;
import java.util.Scanner;
import java.util.*;

public class FileRead {
    //ATRIBUTOS
    Scanner s = new Scanner(System.in);
    String archivo = "";
    List<List<String>> matriz = new ArrayList<List<String>>();
    int n_lineas;
    //CONSTRUCTOR
    public FileRead(){
        n_lineas = 0;
    }
    
    //METODOS
    public void FileRead(){
        String ej,palabra="";
        char car;
        int enteroByte = 0,i,j;
        
        System.out.println("Ingrese el nombre del archivo: ");
        archivo = s.nextLine();
        try{
            FileReader f = new FileReader(archivo);
            enteroByte = f.read();
            while(enteroByte!=-1){
                if(enteroByte == 13)
                    n_lineas++;
                enteroByte = f.read();
            }
            n_lineas++;
            
            System.out.println("Lineas: "+n_lineas);
        }catch(IOException e){
            System.out.println(e);
        }
        
        try{
            FileReader f = new FileReader(archivo);
            enteroByte = f.read();
            //el tab es un 9 ascii, 13 10 enter, 32 space
            //matriz [0][x] aqui estan tabuladores o variables
            //matriz [1][x] aqui estan nmemonicos o directivas
            //matriz [2][x] aqui estan direcciones o instrucciones
            //matriz [3][x] aqui estan los comentarios, de haberlos en la misma linea
            i=0;
                while(enteroByte!=-1){
                    //  **** Para matriz [0][x] *****
                    if(enteroByte == 32 || enteroByte == 9){    //Hay un espacio o tabulador al principio
                        matriz[0][i] = "    ";
                    }
                    else{
                        if(enteroByte != 13){
                            while(enteroByte != 9 || enteroByte != 32){
                                car = (char)enteroByte;
                                palabra = palabra.concat(""+car);
                                enteroByte = f.read();
                            }
                            matriz[0][i] = palabra;
                            enteroByte = f.read();
                        }
                        else{
                            enteroByte = f.read();
                            enteroByte = f.read();
                        }
                    }
                    if(enteroByte == 42){
                        matriz[0][i] = "0";
                        matriz[1][i] = "0";
                        matriz[2][i] = "0";
                        matriz[3][i] = "0";
                    }
                    palabra = "";
                    // ******* Para matriz[1][x] ****
                    for(j=1;j<=2;j++){
                        while(enteroByte != 9 || enteroByte != 32){
                            car = (char)enteroByte;
                            palabra = palabra.concat(""+car);
                            enteroByte = f.read();
                        }
                        matriz[j][i] = palabra;
                        enteroByte = f.read();
                        palabra = "";
                    }
                    
                    // ******* Para matriz[2][x] ****
                    // ******* Para matriz[3][x] ****
                    while(enteroByte!=13){
                        car = (char)enteroByte;
                        palabra = palabra.concat(""+car);
                        enteroByte = f.read();
                    }
                    matriz[3][i] = palabra;
                    
                    i++;
                }
            
            for(i=0;i<3;i++)
               System.out.print(matriz[0][i]+i+"\t");
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
