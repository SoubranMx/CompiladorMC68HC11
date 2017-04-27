
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
    private String[] directivas;
    public List<List<String>> provicional;
    public List <Integer> prov1;
    private Object in;
    
    //CONSTRUCTOR
    public Nmemonicos(List<List<String>> codigo, List<Integer> palabras){
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
        
        prov1 = palabras;
        setVariables(codigo);
        
        /*provicional = new ArrayList<List<String>>();
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
        provicional.add(prov1);*/
    };
    
    //METODOS
    public void mainMethod(){
        //CrearArchivo archi;   //Tania
        buscarOpcode();
        //archi = new CrearArchivo(provicional);
        //archi.mainMethod();
        
    }
    public void buscarOpcode(){
          Nodo aux,bN;
          int i, swch;
          //for(i=0; i<20; i++){
          i=5;
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
                  break;
              case 2:
                  dosElementos(i,bN);
                  break;
              case 3:
                  tresElementos(i,bN);
                  break;
              case 4:
                 cuatroElementos(i,bN);
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
        String opcode,operando;
        if(str != "" ){  //es etiqueta *CMNT
            opcode = "";
            operando = "";
        }
        else{
            aux = inherentes.buscaNodo(bN,1,0);
            if(aux != null){
                opcode = aux.getDato().get(1);  //get(0) Nombre de nemonico   get(1) OPCODE de INH
                operando = "";
            }
            else{
                opcode = "";
                operando = "";
            }
        }
        provicional.get(i).add(opcode);
        provicional.get(i).add(operando);
        //return aux;
    }
    
    public void tresElementos(int i, Nodo bN){
        // Funciona caso
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
        6- "ETI MNE OPE"        INICIO  CLR    U4
        */
        Nodo aux;
        String str = bN.getDato().get(0);   //
        String opcode,operando,auxp,auxx;
        int x,swch;
        opcode = "";
        operando = "";
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
                          //Directos empieza su operando en $, puede ser de 8 bits
                          //Indexado empieza operando con $, operando de 8 bits separados por COMAS  BSET  $00,X,#$40
                          //Extendido empieza su operando con $, SOLO ES DE 16 BITS
                          auxp = bN.getDato().get(2);   //El operando
                          auxx = auxp;
                          if(auxx.charAt(0)!='#'){
                              // los que empiezan con $
                              auxx = auxp.substring(1); //Lo deja sin $
                              swch = auxx.length(); //tamaño de caracteres.
                              if(swch <= 2){        //$25 Directo
                                  operando = auxx;
                                  opcode = aux.getDato().get(2);
                              }
                              else if(swch <=4){    //$1650 Extendido
                                  operando = auxx;
                                  opcode = aux.getDato().get(5);
                              }
                              else{     //Indexado X o Y
                                  auxp = auxx;      //$25,X,$50
                                  for (String retval: auxp.split(",")) {
                                    auxx = retval.substring(1); //25    ''   50
                                    operando = operando.concat(opcode);
                                    if(retval == "X")
                                        opcode = aux.getDato().get(3);
                                    else if(retval == "Y")
                                        opcode = aux.getDato().get(4);
                                }
                              }
                          }
                          else if(auxx.charAt(0)=='#'){
                              // Inmediato
                              operando = auxx.substring(2); //25CB
                              opcode = aux.getDato().get(1);
                          }
                          else{
/**************************/// VARIABLE
                          }
                      }
                      else{
                          // Es __ DIR OPE
                          opcode = "";
                          str = bN.getDato().get(2);
                          if(str.charAt(0)=='$'){
                            x = bN.getDato().get(2).length();
                            if(x>5){    //Caso de FCB  $99,$B6
                                str = bN.getDato().get(2);
                                for (String retval: str.split(",")) {
                                  //operando =operando.concat(retval);
                                  opcode = retval.substring(1);
                                  operando = operando.concat(opcode);
                                }
                                opcode = "";
                            }
                            else{
                                operando = bN.getDato().get(2).substring(1);    //get(2) operando
                            }
                          }
                          else{
/**************************///ES UNA VARIABLE EL OPERANDO
                          }
                      }
                }
                else{
                    //Es __ REL OPE
                    opcode = aux.getDato().get(1); //en aux, get(0) es nombre del nemonico
                    //para operando, debemos "desmenuzar" el operando del relativo
                    //Relativos operando de 8 bits
                    str = bN.getDato().get(2);  //Obtiene operando
                    if(str.charAt(0)=='$'){
                        operando=str.substring(1);   //Deberia quitar el $ del operando
                    }
                    else{
/**************************///DEBE FUNCIONAR EL ARBOL VARIABLES
                        //entonces toma el valor de la variable
                        //aux = variables.buscaNodo(bN, 2, 0);
                        //operando = aux.getDato().get(1); //dentro de variables, get(0) es el nombre de variable, get(1) es el valor de la variable/constante
                    }
                    
                }
            }
            else{
                //es __ INH *CMNT
                opcode = aux.getDato().get(1);
                operando = "";
            }
        }
        else{
/**************************/
            // 2- "VAR EQU VAL"        U1      EQU    8C42
            // 6- "ETI MNE OPE"        INICIO  CLR    U4
            //aux = variables.buscaNodo(bN, 1, 0);
        }
        provicional.get(i).add(opcode);
        provicional.get(i).add(operando);
    }
    
    public void cuatroElementos(int i, Nodo bN){
        /*
        1 - "____ MNE OPE *CMNT" 
        2 - "____ DIR OPE *CMNT" 
        3 - "VAR EQU VAL *CMNT" 
        */
        Nodo aux;
        String str = bN.getDato().get(0);   //
        String opcode,operando,auxp,auxx;
        int x,swch;
        opcode = "";
        operando = "";
        if(str == ""){
            aux = mnemonicos.buscaNodo(bN, 1, 0);
            if(aux == null){
                //es directiva
            }
            else{
                //es mnemonico
                auxp = bN.getDato().get(2);   //El operando
                auxx = auxp;
                if(auxx.charAt(0)!='#'){
                    // con $
                    auxx = auxp.substring(1); //Lo deja sin $
                    swch = auxx.length(); //tamaño de caracteres.
                    if(swch <= 2){        //$25 Directo
                        operando = auxx;
                        opcode = aux.getDato().get(2);
                    }
                    else if(swch <=4){    //$1650 Extendido
                        operando = auxx;
                        opcode = aux.getDato().get(5);
                    }
                    else{     //Indexado X o Y
                        auxp = auxx;      //$25,X,$50
                        for (String retval: auxp.split(",")) {
                          auxx = retval.substring(1); //25    ''   50
                          operando = operando.concat(opcode);
                          if(retval == "X")
                              opcode = aux.getDato().get(3);
                          else if(retval == "Y")
                              opcode = aux.getDato().get(4);
                      }
                    }
                }
                else if(auxx.charAt(0)=='#'){
                    // Inmediato
                    operando = auxx.substring(2); //25CB
                    opcode = aux.getDato().get(1);
                }
                else{
                    // ES VARIABLE
                }
            }
        }
        else{
            //3 - "VAR EQU VAL *CMNT" 
        }
    }

    public void setVariables(List<List<String>> codigo){
        int i,j;
        List<List<String>> varUp = new ArrayList<List<String>>();
        List<String> varDwn;
        List<List<String>> varUpA = new ArrayList<List<String>>();
        //List<String> varDwnA;
        String comp1,comp2;
        provicional = codigo;
        String equ;
        Nodo aux,auxv;
        
        for(i=0;i<prov1.size();i++){
            if(prov1.get(i)==3){
                //ETIQ MNE OPE
                //VAR EQU VAL   debo revisar si es EQU, solo esas son variables.
                equ = provicional.get(i).get(1);    //Deberia tener un EQU
                if(equ == "EQU"){
                    varDwn = new ArrayList<String>();
                    varDwn.add(provicional.get(i).get(0));  //guarda VAR
                    varDwn.add(provicional.get(i).get(2));  //guarda VAL
                    varUp.add(varDwn);
                    //aux = new Nodo(provicional.get(i));
                    //variables.addNodo(aux, 0, 0);
                }
            }
        }
        
        // Organiza varUp por orden alfabético
        j=1;
        for(i=0;i<=varUp.size()-1;i++){
            comp1 = varUp.get(i).get(0);
            if(varUpA.isEmpty()){
                varUpA.add(varUp.get(0));
            }
            else{
                comp2 = varUpA.get(i).get(0);
                if(comp1.compareTo(comp2)<0){    //comp1 viene antes lexicograficamente que comp2
                    varUpA.add(0,varUp.get(i));
                }
                else{   //comp1 viene después que comp2
                    varUpA.add(j,varUp.get(i));
                    j++;
                }
            }
        }
        System.out.println(varUp);
        System.out.println(varUpA);
        System.out.println();
    }
}