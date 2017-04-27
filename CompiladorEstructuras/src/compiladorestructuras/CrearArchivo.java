package compiladorestructuras;
import java.io.*;
import java.util.*;
import java.io.File;
/*import java.io.IOException;*/
public class CrearArchivo {
    
	private List<List<String>> codigo;
	private String fichero;
	
	
	public CrearArchivo(List<List<String>> code, String fich){
		codigo = code;
		fichero = fich;
	}
	
    public void mainMethod(){
		LST();
                HEX();
                System.out.println("TERMINADO");
	}
      
	public String sumaHex(String linHex,int hex){
		Integer hexa;
		hexa = Integer.parseInt(linHex,16);	//Integer de hexadecimal
		hexa += hex;
		linHex = Integer.toHexString(hexa);
                linHex = linHex.toUpperCase();
		return linHex;
	}
      public void LST(){
            String str = fichero.replace(".asc", "");
            String str1,str2,str3,str4,str5,str6,hexx,fix,aux;
            String linHex="0000";
            int i,linea,hex,auxi;

            hex = 0;
            auxi=0;
            FileWriter fwLST;
            try{
			/*
			0	ALGO
			1	ALGO
			2	ALGO
			3	ALGO
			4	OPCODE
			5	OPERANDO
			*/
                        str = str.concat(".lst");
			fwLST = new FileWriter(str);
                        fix = "";
			for(i=0;i<(codigo.size());i++){
				//Numero de linea : codigo fuente :codigo objeto
				// 145 : CLRA					: 8084(4F)
				// 146 : LDAB 	V4				: 8085(D61E)
				// 147 : JSR	BNBCD	*SUB	: 8087(BD822A)
				str1 = codigo.get(i).get(0).trim();
				str2 = codigo.get(i).get(1).trim();
				str3 = codigo.get(i).get(2).trim();
				str4 = codigo.get(i).get(3).trim();
				str5 = codigo.get(i).get(4).trim();
				str6 = codigo.get(i).get(5).trim();
                                aux = str5+str6;
                                linea = aux.length();
                                switch(linea){
                                    case 8:
                                        fix=    "\t";
                                        break;
                                    case 6:
                                        fix = "\t";
                                        break;
                                    case 4:
                                        fix = "\t\t";
                                        break;
                                    case 2:
                                        fix = "\t\t";
                                        break;
                                    default:
                                        fix = "\t\t\t";
                                        break;
                                }
                                fwLST.write((i+1)+"\t:\t"+linHex+"("+str5+str6+")"+fix+":  "+str1+"\t"+str2+"\t"+str3+"\t"+str4+"\n");
				hexx = str5+str6;
                                if(str2.compareTo("ORG")==0){
                                    auxi = i;
                                    linHex = str6;
                                }
                                if(str2.compareTo("END")==0){
                                    auxi = i;
                                    linHex = "";
                                }
                                if(codigo.get(auxi).get(1).compareTo("ORG")==0){
                                    if(hexx.length()==2)			//FF
                                            hex++;
                                    else if(hexx.length()==4)                   //FFBB
                                            hex += 2;
                                    else if(hexx.length()==6)			//FFBBAA
                                            hex +=3;
                                    else if(hexx.length()==8)			//18CE1060
                                            hex +=4;
                                    if(hexx.length()!=0)
                                        linHex = sumaHex(linHex,hex);
                                }
				hex = 0;
			}
			fwLST.close();
		}catch(Exception ex){ex.printStackTrace();}

          
      }
          
      
      public void HEX(){
        String str = fichero.replace(".asc", "");
          String str1,str2,str3,str4,str5,str6,hexx,fix,aux;
          String h1[];
          String linHex="0000";
          int i,j,k,p,linea,hex,auxi;
          boolean ok=false;
          boolean otro = false;

          hex = 0;
          auxi=0;
          k=0;
          h1= new String[4];
          FileWriter fwLST;
          try{
                /*
                0	ALGO
                1	ALGO
                2	ALGO
                3	ALGO
                4	OPCODE
                5	OPERANDO
                */
                str = str.concat(".hex");
                fwLST = new FileWriter(str);
                fwLST.write("<    >\t");
                for(i=0;i<16;i++){
                    if(i==10)
                        fwLST.write("XA ");
                    if(i==11)
                        fwLST.write("XB ");
                    if(i==12)
                        fwLST.write("XC ");
                    if(i==13)
                        fwLST.write("XD ");
                    if(i==14)
                        fwLST.write("XE ");
                    if(i==15)
                        fwLST.write("XF ");
                    if(i<10)
                        fwLST.write("X"+i+" ");
                }
                fwLST.write("\n");
                for(i=0;i<(codigo.size());i++){
                        str1 = codigo.get(i).get(0).trim();
                        str2 = codigo.get(i).get(1).trim();
                        str3 = codigo.get(i).get(2).trim();
                        str4 = codigo.get(i).get(3).trim();
                        str5 = codigo.get(i).get(4).trim();
                        str6 = codigo.get(i).get(5).trim();
                        //h1 = str5.substring();
                        aux = str5+str6;
                        linea = aux.length();
                        h1[0]="";
                        h1[1]="";
                        h1[2]="";
                        h1[3]="";
                        j=0;
                        switch(linea){
                            case 2: //AA 00   00 AA
                                hex++;
                                if(str5.length()==2)    //AA 00
                                    h1[0] = str5;
                                else
                                    h1[2] = str6;
                                break;
                            case 4: //00    AAAA    AA AA   AAAA 00
                                hex+=2;
                                if(str5.length()==4){
                                    h1[0] = str5.substring(0,2);
                                    h1[1] = str5.substring(2);
                                }
                                else if(str6.length()==4){
                                    h1[2] = str6.substring(0,2);
                                    h1[3] = str6.substring(2);
                                }
                                else if(str5.length()==2 && str6.length()==2){
                                    h1[0] = str5;
                                    h1[2] = str6;
                                }
                                break;
                            case 6: //AA FFFF   AAAA FF
                                hex+=3;
                                if(str5.length()==2){    //AA FFFF
                                    h1[0] = str5;
                                    h1[2] = str6.substring(0,2);
                                    h1[3] = str6.substring(2);
                                }
                                else{   //AAAA FF
                                    h1[0] = str5.substring(0, 2);
                                    h1[1] = str5.substring(2);
                                    h1[2] = str6;
                                }
                                break;
                            case 8:
                                hex+=4;
                                h1[0] = str5.substring(0, 2);
                                h1[1] = str5.substring(2);
                                h1[2] = str6.substring(0, 2);
                                h1[3] = str6.substring(2);
                                break;
                            default:
                                hex=0;
                                break;
                        }
                        
                        if(str2.compareTo("ORG")==0){
                            auxi = i;
                            otro = true;
                            ok = true;
                            fwLST.write("\n<"+linHex+">\t");
                            System.out.print("\n<"+linHex+">\t");
                            linHex = str6;
                        }
                        else
                            otro = false;
                        
                        if(str2.compareTo("END")==0){
                            auxi = i;
                            linHex = "";
                        }
                        if(ok){
                            while(hex!=0){
                                String esp=" ";
                                if(k<16){
                                    if(j<4){
                                        if(h1[j].compareTo("")==0)
                                            esp="";
                                        else{
                                            esp=" ";
                                            hex --;
                                            k++;
                                        }
                                        fwLST.write(h1[j]+esp);
                                        System.out.print(h1[j]+esp);
                                        //hex--;
                                        j++;
                                    }
                                    else{
                                        j=0;
                                    }
                                }
                                else{
                                    linHex = sumaHex(linHex,16);
                                    fwLST.write("\n");
                                    System.out.print("\n");
                                    fwLST.write("<"+linHex+">\t");
                                    System.out.print("<"+linHex+">\t");
                                    k=0;
                                }
                            }
                        }
                        hex = 0;
                }
                fwLST.close();
              }catch(Exception ex){ex.printStackTrace();}
 }
      
      
}    
//}
 