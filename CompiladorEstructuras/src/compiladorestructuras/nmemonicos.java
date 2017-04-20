package compiladorestructuras;
import java.util.ArrayList;
import java.util.*;

public class nmemonicos {
    //ATRIBUTOS
    private String[][] simbolos;
    private String [][] inherentes;
    private String [][] relativos;
    private String [][] mnemonicos;
    public List<List<String>> provicional;
    public List <String> prov1;
    
    //CONSTRUCTOR
    public nmemonicos(){
        simbolos = new String[][] {{" ","20"},{"!","21"},{"","22"},{"#","23"},{"$","24"},{"%","25"},{"&","26"},{"'","27"},{"(","28"},{")","29"},{"*","2A"},{"+","2B"},{",","2C"},{"-","2D"},{".","2E"},{"/","2F"},{"0","30"},{"1","31"},{"2","32"},{"3","33"},{"4","34"},{"5","35"},{"6","36"},{"7","37"},{"8","38"},{"9","39"},{":","3A"},{";","3B"},{"<","3C"},{"=","3D"},{">","3E"},{"?","3F"},{"@","40"},{"A","41"},{"B","42"},{"C","43"},{"D","44"},{"E","45"},{"F","46"},{"G","47"},{"H","48"},{"I","49"},{"J","4A"},{"K","4B"},{"L","4C"},{"M","4D"},{"N","4E"},{"O","4F"},{"P","50"},{"Q","51"},{"R","52"},{"S","53"},{"T","54"},{"U","55"},{"V","56"},{"W","57"},{"X","58"},{"Y","59"},{"Z","5A"},{"[","5B"},{"?","5C"},{"]","5D"},{"^","5E"},{"_","5F"},{"`","60"},{"a","61"},{"b","62"},{"c","63"},{"d","64"},{"e","65"},{"f","66"},{"g","67"},{"h","68"},{"i","69"},{"j","6A"},{"k","6B"},{"l","6C"},{"m","6D"},{"n","6E"},{"o","6F"},{"p","70"},{"q","71"},{"r","72"},{"s","73"},{"t","74"},{"u","75"},{"v","76"},{"w","77"},{"x","78"},{"y","79"},{"z","7A"},{"{","7B"},{"|","7C"},{"}","7D"},{"?","7E"},{"+","A2"}};
        inherentes = new String[][] {{"ABA","0","0","0","0","0","1B","0"},{"ABX","0","0","0","0","0","3A","0"},{"ABY","0","0","0","0","0","183A","0"},{"ASLA","0","0","0","0","0","48","0"},{"ASLB","0","0","0","0","0","58","0"},{"ASLD","0","0","0","0","0","5","0"},{"ASRA","0","0","0","0","0","47","0"},{"ASRB","0","0","0","0","0","57","0"},{"CBA","0","0","0","0","0","11","0"},{"CLC","0","0","0","0","0","0C","0"},{"CLI","0","0","0","0","0","0E","0"},{"CLRA","0","0","0","0","0","4F","0"},{"CLRB","0","0","0","0","0","5F","0"},{"CLV","0","0","0","0","0","0A","0"},{"COMA","0","0","0","0","0","43","0"},{"COMB","0","0","0","0","0","53","0"},{"DAA","0","0","0","0","0","19","0"},{"DECA","0","0","0","0","0","4A","0"},{"DECB","0","0","0","0","0","5A","0"},{"DES","0","0","0","0","0","34","0"},{"DEX","0","0","0","0","0","09","0"},{"DEY","0","0","0","0","0","1809","0"},{"FDIV","0","0","0","0","0","03","0"},{"IDIV","0","0","0","0","0","02","0"},{"INCA","0","0","0","0","0","4C","0"},{"INCB","0","0","0","0","0","5C","0"},{"INS","0","0","0","0","0","31","0"},{"INX","0","0","0","0","0","08","0"},{"INY","0","0","0","0","0","1808","0"},{"LSLA","0","0","0","0","0","48","0"},{"LSLB","0","0","0","0","0","58","0"},{"LSLD","0","0","0","0","0","05","0"},{"LSRA","0","0","0","0","0","44","0"},{"LSRB","0","0","0","0","0","54","0"},{"LSRD","0","0","0","0","0","04","0"},{"MUL","0","0","0","0","0","3D","0"},{"NEGA","0","0","0","0","0","40","0"},{"NEGB","0","0","0","0","0","50","0"},{"NOP","0","0","0","0","0","01","0"},{"PSHA","0","0","0","0","0","36","0"},{"PSHB","0","0","0","0","0","37","0"},{"PSHX","0","0","0","0","0","3C","0"},{"PSHY","0","0","0","0","0","183C","0"},{"PULA","0","0","0","0","0","32","0"},{"PULB","0","0","0","0","0","33","0"},{"PULX","0","0","0","0","0","38","0"},{"PULY","0","0","0","0","0","1838","0"},{"ROLA","0","0","0","0","0","49","0"},{"ROLB","0","0","0","0","0","59","0"},{"RORA","0","0","0","0","0","46","0"},{"RORB","0","0","0","0","0","56","0"},{"RTI","0","0","0","0","0","3B","0"},{"RTS","0","0","0","0","0","39","0"},{"SBA","0","0","0","0","0","10","0"},{"SEC","0","0","0","0","0","OD","0"},{"SEI","0","0","0","0","0","OF","0"},{"SEV","0","0","0","0","0","OB","0"},{"STOP","0","0","0","0","0","CF","0"},{"SWI","0","0","0","0","0","3F","0"},{"TAB","0","0","0","0","0","16","0"},{"TAP","0","0","0","0","0","06","0"},{"TBA","0","0","0","0","0","17","0"},{"TEST","0","0","0","0","0","00","0"},{"TPA","0","0","0","0","0","07","0"},{"TSTA","0","0","0","0","0","4D","0"},{"TSTB","0","0","0","0","0","5D","0"},{"TSX","0","0","0","0","0","30","0"},{"TSY","0","0","0","0","0","1830","0"},{"TXS","0","0","0","0","0","35","0"},{"TYS","0","0","0","0","0","1835","0"},{"WAI","0","0","0","0","0","3E","0"},{"XGDX","0","0","0","0","0","8F","0"},{"XGDY","0","0","0","0","0","188F","0"}};
        relativos = new String[][] {{"BHS","0","0","0","0","0","0","24"},{"BCS","0","0","0","0","0","0","25"},{"BEQ","0","0","0","0","0","0","27"},{"BGE","0","0","0","0","0","0","2C"},{"BGT","0","0","0","0","0","0","2E"},{"BHI","0","0","0","0","0","0","22"},{"BHS","0","0","0","0","0","0","24"},{"BLE","0","0","0","0","0","0","2F"},{"BLO","0","0","0","0","0","0","25"},{"BLS","0","0","0","0","0","0","23"},{"BLT","0","0","0","0","0","0","2D"},{"BMI","0","0","0","0","0","0","2B"},{"BNE","0","0","0","0","0","0","26"},{"BPL","0","0","0","0","0","0","2A"},{"BRA","0","0","0","0","0","0","20"},{"BRN","0","0","0","0","0","0","21"},{"BSR","0","0","0","0","0","0","8D"},{"BVC","0","0","0","0","0","0","28"},{"BVS","0","0","0","0","0","0","29"}};
        mnemonicos = new String[][] {{"ADCA","89","99","A9","18A9","B9","0","0"},{"ADCB","C9","D9","E9","18E9","F9","0","0"},{"ADDA","8B","9B","AB","18AB","BB","0","0"},{"ADDB","CB","DB","EB","18EB","FB","0","0"},{"ADDD","C3","D3","E3","18E3","F3","0","0"},{"ANDA","84","94","A4","18A4","B4","0","0"},{"ANDB","C4","D4","E4","18E4","F4","0","0"},{"ASL","0","0","68","1868","78","0","0"},{"ASR","0","0","67","1867","77","0","0"},{"BCLR","0","15","1D","181D","0","0","0"},{"BITA","85","95","A5","18A5","B5","0","0"},{"BITB","C5","D5","E5","18E5","F5","0","0"},{"BRCLR","0","13","IF","181F","0","0","0"},{"BRSET","0","12","1E","181E","0","0","0"},{"BSET","0","14","1C","181C","0","0","0"},{"CLR","0","0","6F","186F","7F","0","0"},{"CMPA","81","91","A1","18A1","B1","0","0"},{"CMPB","C1","D1","E1","18E1","F1","0","0"},{"COM","0","0","63","1863","73","0","0"},{"CPD","1A83","1A93","1AA3","CDA3","1AB3","0","0"},{"CPX","8C","9C","AC","CDAC","BC","0","0"},{"CPY","188C","189C","1AAC","18AC","18BC","0","0"},{"DEC","0","0","6A","186A","7A","0","0"},{"EORA","88","98","A8","18A8","B8","0","0"},{"EORB","C8","D8","E8","18E8","F8","0","0"},{"INC","0","0","6C","186C","7C","0","0"},{"LDAA","86","96","A6","18A6","B6","0","0"},{"LDAB","C6","D6","E6","18E6","F6","0","0"},{"LDD","CC","DC","EC","18EC","FC","0","0"},{"LDS","8E","9E","AE","18AE","BE","0","0"},{"LDX","CE","DE","EE","CDEE","FE","0","0"},{"LDY","18CE","18DE","1AEE","18EE","18FE","0","0"},{"LSL","0","0","68","1868","78","0","0"},{"LSR","0","0","64","1864","74","0","0"},{"NEG","0","0","60","1860","70","0","0"},{"ORAA","8A","9A","AA","18AA","BA","0","0"},{"ORAB","CA","DA","EA","18EA","FA","0","0"},{"ROL","0","0","69","1869","79","0","0"},{"ROR","0","0","66","1866","76","0","0"},{"SBCA","82","92","A2","18A2","B2","0","0"},{"SBCB","C2","D2","E2","18E2","F2","0","0"},{"STAA","0","97","A7","18A7","B7","0","0"},{"STAB","0","D7","E7","18E7","F7","0","0"},{"STD","0","DD","ED","18ED","FD","0","0"},{"STS","0","9F","AF","18AF","BF","0","0"},{"STX","0","D","EF","CDEF","FF","0","0"},{"STY","0","18DF","1AEF","18EF","FF","0","0"},{"SUBA","80","90","A0","18A0","B0","0","0"},{"SUBB","C0","D0","E0","18E0","F0","0","0"},{"SUBD","83","93","A3","18A3","B3","0","0"},{"TST","0","0","6D","186D","7D","0","0"}};
        
        provicional = new ArrayList<List<String>>();
        prov1 = new ArrayList<String>();
        //  ORG $8000   
        prov1.add("0");
        prov1.add("ORG");
        prov1.add("$8000");
        prov1.add("0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
        //  LDAA    SCSR    
        prov1.add(0,"0");
        prov1.add(1,"LDAA");
        prov1.add(2,"SCSR");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
        //       LDD   #$302C  * CONFIGURA PUERTO SERIAL
        prov1.add(0,"0");
        prov1.add(1,"LDD");
        prov1.add(2,"#$302C");
        prov1.add(3,"* CONFIGURA PUERTO SERIAL");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
        //  DDRD  EQU  $1009
        prov1.add(0,"DDRD");
        prov1.add(1,"EQU");
        prov1.add(2,"$1009");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
        //  u1  equ  $0000
        prov1.add(0,"u1");
        prov1.add(1,"equ");
        prov1.add(2,"$0000");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
        //      LDAA  #$04
        prov1.add(0,"0");
        prov1.add(1,"LDAA");
        prov1.add(2,"#$04");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
        //      clr  u4
        prov1.add(0,"0");
        prov1.add(1,"clr");
        prov1.add(2,"u4");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
        //      ldaa  #'?
        prov1.add(0,"0");
        prov1.add(1,"ldaa");
        prov1.add(2,"#'?");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
        //      BNE  NO_ES_S
        prov1.add(0,"0");
        prov1.add(1,"BNE");
        prov1.add(2,"NO_ES_S");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
        //      STAA  u1
        prov1.add(0,"0");
        prov1.add(1,"STAA");
        prov1.add(2,"u1");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
        //      BNE  BORRA
        prov1.add(0,"0");
        prov1.add(1,"BNE");
        prov1.add(2,"BORRA");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
        // BORRA
        prov1.add(0,"BORRA");
        prov1.add(1,"0");
        prov1.add(2,"0");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
        //      RTI
        prov1.add(0,"0");
        prov1.add(1,"RTI");
        prov1.add(2,"0");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
        //      FCB   $F1,$00
        prov1.add(0,"0");
        prov1.add(1,"FCB");
        prov1.add(2,"$F1,$00");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
        //  RESET FCB  $80,$00
        prov1.add(0,"RESET");
        prov1.add(1,"FCB");
        prov1.add(2,"$80,$00");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
        //      JMP  INICIO
        prov1.add(0,"0");
        prov1.add(1,"JMP");
        prov1.add(2,"INICIO");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
        //      STAA  SCCR1  * 8 BITS
        prov1.add(0,"0");
        prov1.add(1,"STAA");
        prov1.add(2,"SCCR1");
        prov1.add(3,"* 8 BITS");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
        //      TAP
        prov1.add(0,"0");
        prov1.add(1,"TAP");
        prov1.add(2,"0");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
        //ORDEN equ  $0004
        prov1.add(0,"ORDEN");
        prov1.add(1,"equ");
        prov1.add(2,"$0004");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
        //      JMP  CHECA_S
        prov1.add(0,"0");
        prov1.add(1,"JMP");
        prov1.add(2,"CHECA_S");
        prov1.add(3,"0");
        provicional.add(prov1);
        prov1 = new ArrayList<String>();
        //HPRIO  EQU   $103C  *DECLARACION DE CONSTANTES
        prov1.add(0,"HPRIO");
        prov1.add(1,"EQU");
        prov1.add(2,"$103C");
        prov1.add(3,"*DECLARACION DE CONSTANTES");
        provicional.add(prov1);
    };
    
    //METODOS
    public void buscarOpcode(/*List<List<String>> codigo*/){
          int resultado=0;
          String palabra;
          System.out.println("nmemonicos");
         prov1.set(0, provicional.get(0).get(0));   //""
         prov1.set(1, provicional.get(0).get(1));   //ORG
         prov1.set(2, provicional.get(0).get(2));   //$8000
         prov1.set(3, provicional.get(0).get(3));   //""
         
         if()
         
        return;
    }
}
