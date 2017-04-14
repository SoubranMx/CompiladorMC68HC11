package compiladorestructuras;

import java.io.*;
import java.util.Scanner;

public class LeerArchivo {
        Scanner s = new Scanner(System.in);
        String archivo = "ejemplo.txt";
        String[][] matriz = new String [4][3];
        String wile,ej,palabra="";
        char car;
        int enteroByte = 0, i;
        
        System.out.println("Ingrese el nombre del archivo: ");
        //archivo = s.nextLine();
        
        try{
            FileReader f = new FileReader(archivo);
            enteroByte = f.read();
            //el tab es un 9 ascii
            for(i=0;i<3;i++){
                while(enteroByte != 9 && (enteroByte != 13)){
                    car = (char)enteroByte;
                    ej = ""+car;
                    palabra = palabra.concat(ej);
                    enteroByte = f.read();
                    car = (char)enteroByte;
                }
                matriz[0][i]=palabra;
                palabra = "";
                if(enteroByte == 13){
                    enteroByte = f.read();
                    enteroByte = f.read();
                }
                else
                    enteroByte = f.read();
            }
            for(i=0;i<3;i++)
               System.out.print(matriz[0][i]+i+"\t");
        }catch(IOException e){
            System.out.println(e);
        }
}
