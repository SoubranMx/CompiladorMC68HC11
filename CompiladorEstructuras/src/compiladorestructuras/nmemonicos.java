
package compiladorestructuras;
import java.util.ArrayList;
import java.util.*;

public class nmemonicos {
    //ATRIBUTOS
    private String[][] simbolos;
    private Arbol inherentes;
    private Arbol relativos;
    private Arbol mnemonicos;
    private Arbol variables;
    private String[] directivas;
    public List<List<String>> provicional;
    public List <String> prov1;
    private Object in;
    
    //CONSTRUCTOR
    public nmemonicos(){
        simbolos = new String[][] {{" ","20"},{"!","21"},{"","22"},{"#","23"},{"$","24"},{"%","25"},{"&","26"},{"'","27"},{"(","28"},{")","29"},{"*","2A"},{"+","2B"},{",","2C"},{"-","2D"},{".","2E"},{"/","2F"},{"0","30"},{"1","31"},{"2","32"},{"3","33"},{"4","34"},{"5","35"},{"6","36"},{"7","37"},{"8","38"},{"9","39"},{":","3A"},{";","3B"},{"<","3C"},{"=","3D"},{">","3E"},{"?","3F"},{"@","40"},{"A","41"},{"B","42"},{"C","43"},{"D","44"},{"E","45"},{"F","46"},{"G","47"},{"H","48"},{"I","49"},{"J","4A"},{"K","4B"},{"L","4C"},{"M","4D"},{"N","4E"},{"O","4F"},{"P","50"},{"Q","51"},{"R","52"},{"S","53"},{"T","54"},{"U","55"},{"V","56"},{"W","57"},{"X","58"},{"Y","59"},{"Z","5A"},{"[","5B"},{"?","5C"},{"]","5D"},{"^","5E"},{"_","5F"},{"`","60"},{"a","61"},{"b","62"},{"c","63"},{"d","64"},{"e","65"},{"f","66"},{"g","67"},{"h","68"},{"i","69"},{"j","6A"},{"k","6B"},{"l","6C"},{"m","6D"},{"n","6E"},{"o","6F"},{"p","70"},{"q","71"},{"r","72"},{"s","73"},{"t","74"},{"u","75"},{"v","76"},{"w","77"},{"x","78"},{"y","79"},{"z","7A"},{"{","7B"},{"|","7C"},{"}","7D"},{"?","7E"},{"+","A2"}};
        InsertaNemonicos IN = new InsertaNemonicos();
        inherentes = IN.getInh();
        relativos = IN.getRel();
        mnemonicos = IN.getMne();
        directivas = new String[4];
        directivas[0]="ORG";
        directivas[1]="EQU";
        directivas[2]="FCB";
        directivas[3]="END";
        
        provicional = new ArrayList<List<String>>();
        prov1 = new ArrayList<String>();
//1        //  ORG $8000   
        prov1.add("");
        prov1.add("ORG");
        prov1.add("$8000");
        prov1.add("");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//2        //  LDAA    SCSR    
        prov1.add(0,"");
        prov1.add(1,"LDAA");
        prov1.add(2,"SCSR");
        prov1.add(3,"");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//3        //       LDD   #$302C  * CONFIGURA PUERTO SERIAL
        prov1.add(0,"");
        prov1.add(1,"LDD");
        prov1.add(2,"#$302C");
        prov1.add(3,"* CONFIGURA PUERTO SERIAL");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//4        //  DDRD  EQU  $1009
        prov1.add(0,"DDRD");
        prov1.add(1,"EQU");
        prov1.add(2,"$1009");
        prov1.add(3,"");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//5        //  u1  equ  $0000
        prov1.add(0,"U1");
        prov1.add(1,"EQU");
        prov1.add(2,"$0000");
        prov1.add(3,"");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//6        //      LDAA  #$04
        prov1.add(0,"");
        prov1.add(1,"LDAA");
        prov1.add(2,"#$04");
        prov1.add(3,"");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//7        //      clr  u4
        prov1.add(0,"");
        prov1.add(1,"CLR");
        prov1.add(2,"U4");
        prov1.add(3,"");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//8        //      ldaa  #'?
        prov1.add(0,"");
        prov1.add(1,"LDAA");
        prov1.add(2,"#'?");
        prov1.add(3,"");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//9        //      BNE  NO_ES_S
        prov1.add(0,"");
        prov1.add(1,"BNE");
        prov1.add(2,"NO_ES_S");
        prov1.add(3,"");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//10        //      STAA  u1
        prov1.add(0,"");
        prov1.add(1,"STAA");
        prov1.add(2,"U1");
        prov1.add(3,"");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//11        //      BNE  BORRA
        prov1.add(0,"");
        prov1.add(1,"BNE");
        prov1.add(2,"BORRA");
        prov1.add(3,"");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//12        // BORRA
        prov1.add(0,"BORRA");
        prov1.add(1,"");
        prov1.add(2,"");
        prov1.add(3,"");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//13        //      RTI  *coment
        prov1.add(0,"");
        prov1.add(1,"RTI");
        prov1.add(2,"*coment");
        prov1.add(3,"");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//14        //      FCB   $F1,$00
        prov1.add(0,"");
        prov1.add(1,"FCB");
        prov1.add(2,"$F1,$00");
        prov1.add(3,"");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//15        //  RESET FCB  $80,$00
        prov1.add(0,"RESET");
        prov1.add(1,"FCB");
        prov1.add(2,"$80,$00");
        prov1.add(3,"");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//16        //      JMP  INICIO
        prov1.add(0,"");
        prov1.add(1,"JMP");
        prov1.add(2,"INICIO");
        prov1.add(3,"");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//17        //      STAA  SCCR1  * 8 BITS
        prov1.add(0,"");
        prov1.add(1,"STAA");
        prov1.add(2,"SCCR1");
        prov1.add(3,"* 8 BITS");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//18        //      TAP
        prov1.add(0,"");
        prov1.add(1,"TAP");
        prov1.add(2,"");
        prov1.add(3,"");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//19        //ORDEN equ  $0004
        prov1.add(0,"ORDEN");
        prov1.add(1,"EQU");
        prov1.add(2,"$0004");
        prov1.add(3,"");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
//20        //      JMP  CHECA_S
        prov1.add(0,"");
        prov1.add(1,"JMP");
        prov1.add(2,"CHECA_S");
        prov1.add(3,"");
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
          Nodo aux,bN;
          int i, swch;
          //for(i=0; i<20; i++){
          i=0;
          bN = new Nodo(provicional.get(i));    // ___ LDAA  SCSR   3 palabras
          swch = 3;
          // Funciona caso Relativo, Directiva, Inherente
        /*
            3- "___ INH *COMNT"     __ RTI  *CMNT
            4- "___ DIR OPE"        __ ORG  $8000
            5- "___ REL OPE         __ BCC  $42
        */
          switch(swch){
              case 1:
                  unElemento(i);
                  /*
                  1- Es comentario
                  2- Es etiqueta
                  */
                  break;
              case 2:
                  dosElementos(i,bN);
                  /*
                  1- "__ INH" (INH es inherente, no tienen operando
                  2- "etiqueta *CMNT"
                  */
                  break;
              case 3:
                  tresElementos(i,bN);
                  // Funciona caso Relativo, Directiva, Inherente
                    /*
                        3- "___ INH *COMNT"     __ RTI  *CMNT
                        4- "___ DIR OPE"        __ ORG  $8000
                        5- "___ REL OPE"        __ BCC  $42
                    */
                  /*
                  1- "___ MNE OPE"  __ LDAA $4C
                  2- "VAR EQU VAL"  U1 EQU 8C42
                  3- "___ INH *COMNT"
                  4- "___ DIR OPE"  ORG $8000
                  5- "___ DIR *CMNT"    ??
                  */
                  break;
              case 4:
                 // aux = cuatroElementos(7,bN);
                  /*
                 1 - "____ MNE OPE *CMNT" 
                 2 - "____ DIR OPE *CMNT" 
                 3 - "VAR EQU VAL *CMNT" 
                  */
                  break;
          }
          System.out.println("nmemonicos");
          //}
        return;
    }
    
    public void unElemento(int i){
        /*
        1- Es comentario
        2- Es etiqueta
        */
        provicional.get(i).add("");     //Añade la localidad 4 que ocupará OPCODE
        provicional.get(i).add("");     //Añade la localidad 5 que ocupará el Operando "desmenuzado"
    }
    
    public void dosElementos(int i, Nodo bN){
        /*
        1- "__ INH" (INH es inherente, no tienen operando
        2- "etiqueta *CMNT"
        */
        Nodo aux;
        String str = bN.getDato().get(0);
        String dentro1,dentro2;
        if(str != "" ){  //es etiqueta *CMNT
            dentro1 = "";
            dentro2 = "";
        }
        else{
            aux = inherentes.buscaNodo(bN,1,0);
            if(aux != null){
                dentro1 = aux.getDato().get(1);  //get(0) Nombre de nemonico   get(1) OPCODE de INH
                dentro2 = "";
            }
            else{
                dentro1 = "";
                dentro2 = "";
            }
        }
        provicional.get(i).add(dentro1);
        provicional.get(i).add(dentro2);
        //return aux;
    }
    
    public void tresElementos(int i, Nodo bN){
        // Funciona caso Relativo, Directiva, Inherente
        /*
            3- "___ INH *COMNT"     __ RTI  *CMNT
            4- "___ DIR OPE"        __ ORG  $8000
            5- "___ REL OPE         __ BCC  $42
        */
        /*
        1- "___ MNE OPE"        __ LDAA $4C
        2- "VAR EQU VAL"        U1 EQU  8C42
        3- "___ INH *COMNT"     __ RTI  *CMNT
        4- "___ DIR OPE"        __ ORG  $8000
        5- "___ REL OPE         __ BCC  $42
        */
        Nodo aux;
        String str = bN.getDato().get(0);   //
        String dentro1,dentro2;
        int x;
        dentro1 = "";
        dentro2 = "";
        if(str == ""){
            aux = inherentes.buscaNodo(bN,1,0);
            if(aux == null){
                aux = relativos.buscaNodo(bN, 1, 0);
                if(aux == null){
                      aux = mnemonicos.buscaNodo(bN, 1, 0);
                      if(aux!= null){
                          // Es  __ MNE OPE
                          //esta es la parte "dificil"
                          //Inmediatos  empieza su operando en #$ puede ser de8 o 16 bits
                          //Directos empieza su operando en $, puede ser de 8 o 16 bits
                          //Indexado empieza operando con $, operando de 8 bits separados por COMAS  BSET  $00,X,#$40
                          //Extendido empieza su operando con $, SOLO ES DE 16 BITS
                      }
                      else{
                          // Es __ DIR OPE
                          dentro1 = "";
                          x = bN.getDato().get(2).length();
                          if(x>5){    //Caso de FCB  $99,$B6
                              str = bN.getDato().get(2);
                              for (String retval: str.split(",")) {
                                //dentro2 =dentro2.concat(retval);
                                dentro1 = retval.substring(1);
                                dentro2 = dentro2.concat(dentro1);
                              }
                              dentro1 = "";
                          }
                          else{
                              dentro2 = bN.getDato().get(2).substring(1);    //get(2) operando
                          }
                      }
                }
                else{
                    //Es __ REL OPE
                    dentro1 = aux.getDato().get(1); //en aux, get(0) es nombre del nemonico
                    //para dentro2, debemos "desmenuzar" el operando del relativo
                    //Relativos operando de 8 bits
                    str = bN.getDato().get(2);  //Obtiene operando
                    if(str.charAt(0)=='$'){
                        dentro2=str.substring(1);   //Deberia quitar el $ del operando
                    }
                    else{
                        //DEBE FUNCIONAR EL ARBOL VARIABLES
                        //entonces toma el valor de la variable
                        //aux = variables.buscaNodo(bN, 2, 0);
                        //dentro2 = aux.getDato().get(1); //dentro de variables, get(0) es el nombre de variable, get(1) es el valor de la variable/constante
                    }
                    
                }
            }
            else{
                //es __ INH *CMNT
                dentro1 = aux.getDato().get(1);
                dentro2 = "";
            }
        }
        else{
            // VAR EQU VAL
            //aux = variables.buscaNodo(bN, 1, 0);
        }
        provicional.get(i).add(dentro1);
        provicional.get(i).add(dentro2);
    }
    
    //public void cuatroElementos(int i, Nodo bN){
        /*
        1 - "____ MNE OPE *CMNT" 
        2 - "____ DIR OPE *CMNT" 
        3 - "VAR EQU VAL *CMNT" 
        
        Nodo aux;
        return aux;
        */
    //}
}