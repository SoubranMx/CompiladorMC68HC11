
package compiladorestructuras;
import java.util.ArrayList;
import java.util.*;

public class Nmemonicos {
    //ATRIBUTOS
    private String[][] simbolos;
	private Arbol inherentes;
	private Arbol relativos;
	private Arbol mnemonicos;
	private Arbol variables;
    public List<List<String>> provicional;
    public List <String> prov1;
    private Object in;
    
    //CONSTRUCTOR
    public Nmemonicos(){
        simbolos = new String[][] {{" ","20"},{"!","21"},{"","22"},{"#","23"},{"$","24"},{"%","25"},{"&","26"},{"'","27"},{"(","28"},{")","29"},{"*","2A"},{"+","2B"},{",","2C"},{"-","2D"},{".","2E"},{"/","2F"},{"0","30"},{"1","31"},{"2","32"},{"3","33"},{"4","34"},{"5","35"},{"6","36"},{"7","37"},{"8","38"},{"9","39"},{":","3A"},{";","3B"},{"<","3C"},{"=","3D"},{">","3E"},{"?","3F"},{"@","40"},{"A","41"},{"B","42"},{"C","43"},{"D","44"},{"E","45"},{"F","46"},{"G","47"},{"H","48"},{"I","49"},{"J","4A"},{"K","4B"},{"L","4C"},{"M","4D"},{"N","4E"},{"O","4F"},{"P","50"},{"Q","51"},{"R","52"},{"S","53"},{"T","54"},{"U","55"},{"V","56"},{"W","57"},{"X","58"},{"Y","59"},{"Z","5A"},{"[","5B"},{"?","5C"},{"]","5D"},{"^","5E"},{"_","5F"},{"`","60"},{"a","61"},{"b","62"},{"c","63"},{"d","64"},{"e","65"},{"f","66"},{"g","67"},{"h","68"},{"i","69"},{"j","6A"},{"k","6B"},{"l","6C"},{"m","6D"},{"n","6E"},{"o","6F"},{"p","70"},{"q","71"},{"r","72"},{"s","73"},{"t","74"},{"u","75"},{"v","76"},{"w","77"},{"x","78"},{"y","79"},{"z","7A"},{"{","7B"},{"|","7C"},{"}","7D"},{"?","7E"},{"+","A2"}};
        InsertaNemonicos IN = new InsertaNemonicos();
        inherentes = IN.getInh();
        relativos = IN.getRel();
        mnemonicos = IN.getMne();
		
        provicional = new ArrayList<List<String>>();
        prov1 = new ArrayList<String>();
//1        //  ORG $8000   
        prov1.add("0");
        prov1.add("ORG");
        prov1.add("$8000");
        prov1.add("0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//2        //  LDAA    SCSR    
        prov1.add(0,"0");
        prov1.add(1,"LDAA");
        prov1.add(2,"SCSR");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//3        //       LDD   #$302C  * CONFIGURA PUERTO SERIAL
        prov1.add(0,"0");
        prov1.add(1,"LDD");
        prov1.add(2,"#$302C");
        prov1.add(3,"* CONFIGURA PUERTO SERIAL");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//4        //  DDRD  EQU  $1009
        prov1.add(0,"DDRD");
        prov1.add(1,"EQU");
        prov1.add(2,"$1009");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//5        //  u1  equ  $0000
        prov1.add(0,"u1");
        prov1.add(1,"equ");
        prov1.add(2,"$0000");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//6        //      LDAA  #$04
        prov1.add(0,"0");
        prov1.add(1,"LDAA");
        prov1.add(2,"#$04");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//7        //      clr  u4
        prov1.add(0,"0");
        prov1.add(1,"clr");
        prov1.add(2,"u4");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//8        //      ldaa  #'?
        prov1.add(0,"0");
        prov1.add(1,"ldaa");
        prov1.add(2,"#'?");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//9        //      BNE  NO_ES_S
        prov1.add(0,"0");
        prov1.add(1,"BNE");
        prov1.add(2,"NO_ES_S");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//10        //      STAA  u1
        prov1.add(0,"0");
        prov1.add(1,"STAA");
        prov1.add(2,"u1");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//11        //      BNE  BORRA
        prov1.add(0,"0");
        prov1.add(1,"BNE");
        prov1.add(2,"BORRA");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//12        // BORRA
        prov1.add(0,"BORRA");
        prov1.add(1,"0");
        prov1.add(2,"0");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//13        //      RTI
        prov1.add(0,"0");
        prov1.add(1,"RTI");
        prov1.add(2,"0");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//14        //      FCB   $F1,$00
        prov1.add(0,"0");
        prov1.add(1,"FCB");
        prov1.add(2,"$F1,$00");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//15        //  RESET FCB  $80,$00
        prov1.add(0,"RESET");
        prov1.add(1,"FCB");
        prov1.add(2,"$80,$00");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//16        //      JMP  INICIO
        prov1.add(0,"0");
        prov1.add(1,"JMP");
        prov1.add(2,"INICIO");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//17        //      STAA  SCCR1  * 8 BITS
        prov1.add(0,"0");
        prov1.add(1,"STAA");
        prov1.add(2,"SCCR1");
        prov1.add(3,"* 8 BITS");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//18        //      TAP
        prov1.add(0,"0");
        prov1.add(1,"TAP");
        prov1.add(2,"0");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//19        //ORDEN equ  $0004
        prov1.add(0,"ORDEN");
        prov1.add(1,"equ");
        prov1.add(2,"$0004");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//20        //      JMP  CHECA_S
        prov1.add(0,"0");
        prov1.add(1,"JMP");
        prov1.add(2,"CHECA_S");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//21        //HPRIO  EQU   $103C  *DECLARACION DE CONSTANTES
        prov1.add(0,"HPRIO");
        prov1.add(1,"EQU");
        prov1.add(2,"$103C");
        prov1.add(3,"*DECLARACION DE CONSTANTES");
        provicional.add(prov1);
    };
    
    //METODOS
    public void buscarOpcode(/*List<List<String>> codigo*/){
          /*int resultado=0;
          String palabra;*/
          Nodo aux,bN;
          for(i=0; i<20; i++){
          bN = new Nodo(provicional.get(i));    // ___ LDAA  SCSR   3 palabras
          aux = inherentes.buscaNodo(bN,1,0);
          if(aux == null){
              aux = relativos.buscaNodo(bN, 1, 0);
              if(aux == null){
                    aux = mnemonicos.buscaNodo(bN, 1, 0);
                    ///uriel
                    if(aux == null)
                    aux= variables.buscaNodo(bN, x, i);
                    //// uriel
              }
          }
          System.out.println("nmemonicos");
          }
          
          
         /*
		 prov1.set(0, provicional.get(0).get(0));   //""
         prov1.set(1, provicional.get(0).get(1));   //ORG
         prov1.set(2, provicional.get(0).get(2));   //$8000
         prov1.set(3, provicional.get(0).get(3));   //""
		 */
    
    //
	//	int buscarprov = in.nextInt;
        
    
     
        /*for(int filas=0; filas<mnemonicos.length; filas++){
            for(int columnas=0; columnas < mnemonicos[filas].length; columnas++){
                if(mnemonicos[filas][columnas]==buscarprov ){
                    //?
                else 
                    for(int filas=0; filas<relativos.length; filas++){
                        for(int columnas=0; columnas < relativos[filas].length; columnas++){
                            if(relativos[filas][columnas]==buscarprov){
                                //??
                                else
                                for(int filas=0; filas<inherentes.length; filas++){
                                    for(int columnas=0; columnas<inherentes[filas].length; columnas++){
                                        if(inherentes[filas][columnas]==buscarprov){
                                            //???
                                            else
                                                for(int filas=0; filas<simbolos.length; filas++){
                                                    for(int columnas=0; columnas<simbolos[filas].length; columnas++){
                                                        if(simbolos[filas][columnas]==buscarprov){
                                                         //????
                                                         else
                                                            //Sino esta en ningun arreglo, dependeria en que columna este la palabra a buscar para saber que hace?
                                                        }
                                                        
                                                    }
                                                }
                                        }
                                    }
                                }
                            }
                         }
                     }
                                
                }
            }
        
        }*/
    
         
        return;
    }
	
	
}