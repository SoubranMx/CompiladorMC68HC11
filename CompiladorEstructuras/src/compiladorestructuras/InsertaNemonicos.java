package compiladorestructuras;

import java.util.*;
public class InsertaNemonicos{
	private Arbol inherentes;
	private Arbol relativos;
	private Arbol mnemonicos;
	
	public InsertaNemonicos(){
		setInherentes();
		setRelativos();
		setMnemonicos();
	}
	
	
	public void setInherentes(){
		List<String> INH = new ArrayList<String>();
		Nodo aux;
		
/*1*/		INH.add("ABA");
		INH.add("1B");
		inherentes = new Arbol(INH);		//Crea el arbol con la raiz ABA,1B
		
/*2*/		INH = new ArrayList<String>();		//Se prepara para otro nemonico
		INH.add("ABX");
		INH.add("3A");
		aux = new Nodo(INH);		//Crea un nodo con los datos ABX, 3A
		inherentes.addNodo(aux);
		
/*3*/		INH = new ArrayList<String>();
		INH.add("ABY");
		INH.add("183A");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
		
/*4*/		INH = new ArrayList<String>();
		INH.add("ASLA");
		INH.add("48");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
		
/*5*/		INH = new ArrayList<String>();
		INH.add("ASLB");
		INH.add("58");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
		
/*6*/		INH = new ArrayList<String>();
		INH.add("ASLD");
		INH.add("5");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*7*/		INH = new ArrayList<String>();
		INH.add("ASRA");
		INH.add("47");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*8*/		INH = new ArrayList<String>();
		INH.add("ASRB");
		INH.add("57");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*9*/		INH = new ArrayList<String>();
		INH.add("CBA");
		INH.add("11");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*10*/		INH = new ArrayList<String>();
		INH.add("CLC");
		INH.add("0C");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*11*/		INH = new ArrayList<String>();
		INH.add("CLI");
		INH.add("0E");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*12*/		INH = new ArrayList<String>();
		INH.add("CLRA");
		INH.add("4F");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*13*/		INH = new ArrayList<String>();
		INH.add("CLRB");
		INH.add("5F");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*14*/		INH = new ArrayList<String>();
		INH.add("CLV");
		INH.add("0A");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*15*/		INH = new ArrayList<String>();
		INH.add("COMA");
		INH.add("43");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*16*/		INH = new ArrayList<String>();
		INH.add("COMB");
		INH.add("53");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*17*/		INH = new ArrayList<String>();
		INH.add("DAA");
		INH.add("19");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*18*/		INH = new ArrayList<String>();
		INH.add("DECA");
		INH.add("4A");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*19*/		INH = new ArrayList<String>();
		INH.add("DECB");
		INH.add("5A");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*20*/		INH = new ArrayList<String>();
		INH.add("DES");
		INH.add("34");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*21*/		INH = new ArrayList<String>();
		INH.add("DEX");
		INH.add("09");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*22*/		INH = new ArrayList<String>();
		INH.add("DEY");
		INH.add("1809");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*23*/		INH = new ArrayList<String>();
		INH.add("FDIV");
		INH.add("03");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*24*/		INH = new ArrayList<String>();
		INH.add("IDIV");
		INH.add("02");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*25*/		INH = new ArrayList<String>();
		INH.add("INCA");
		INH.add("4C");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*26*/		INH = new ArrayList<String>();
		INH.add("INCB");
		INH.add("5C");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*27*/		INH = new ArrayList<String>();
		INH.add("INS");
		INH.add("31");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*28*/		INH = new ArrayList<String>();
		INH.add("INX");
		INH.add("08");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*29*/		INH = new ArrayList<String>();
		INH.add("INY");
		INH.add("1808");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*30*/		INH = new ArrayList<String>();
		INH.add("LSLA");
		INH.add("48");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*31*/		INH = new ArrayList<String>();
		INH.add("LSLB");
		INH.add("58");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*32*/		INH = new ArrayList<String>();
		INH.add("LSLD");
		INH.add("05");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*33*/		INH = new ArrayList<String>();
		INH.add("LSRA");
		INH.add("44");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*34*/		INH = new ArrayList<String>();
		INH.add("LSRB");
		INH.add("54");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*35*/		INH = new ArrayList<String>();
		INH.add("LSRD");
		INH.add("04");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*36*/		INH = new ArrayList<String>();
		INH.add("MUL");
		INH.add("3D");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*37*/		INH = new ArrayList<String>();
		INH.add("NEGA");
		INH.add("40");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*38*/		INH = new ArrayList<String>();
		INH.add("NEGB");
		INH.add("50");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*39*/		INH = new ArrayList<String>();
		INH.add("NOP");
		INH.add("01");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*40*/		INH = new ArrayList<String>();
		INH.add("PSHA");
		INH.add("36");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*41*/		INH = new ArrayList<String>();
		INH.add("PSHB");
		INH.add("37");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*42*/		INH = new ArrayList<String>();
		INH.add("PSHX");
		INH.add("3C");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*43*/		INH = new ArrayList<String>();
		INH.add("PSHY");
		INH.add("183C");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*44*/		INH = new ArrayList<String>();
		INH.add("PULA");
		INH.add("32");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*45*/		INH = new ArrayList<String>();
		INH.add("PULB");
		INH.add("33");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*46*/		INH = new ArrayList<String>();
		INH.add("38");
		INH.add("02");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*47*/		INH = new ArrayList<String>();
		INH.add("PULY");
		INH.add("1838");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*48*/		INH = new ArrayList<String>();
		INH.add("ROLA");
		INH.add("49");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*49*/		INH = new ArrayList<String>();
		INH.add("ROLB");
		INH.add("59");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*50*/		INH = new ArrayList<String>();
		INH.add("RORA");
		INH.add("46");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*51*/		INH = new ArrayList<String>();
		INH.add("RORB");
		INH.add("56");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*52*/		INH = new ArrayList<String>();
		INH.add("RTI");
		INH.add("3B");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*53*/		INH = new ArrayList<String>();
		INH.add("RTS");
		INH.add("39");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*54*/		INH = new ArrayList<String>();
		INH.add("SBA");
		INH.add("10");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*55*/		INH = new ArrayList<String>();
		INH.add("SEC");
		INH.add("0D");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*56*/		INH = new ArrayList<String>();
		INH.add("SEI");
		INH.add("0F");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*57*/		INH = new ArrayList<String>();
		INH.add("SEV");
		INH.add("0B");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*58*/		INH = new ArrayList<String>();
		INH.add("STOP");
		INH.add("CF");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*59*/		INH = new ArrayList<String>();
		INH.add("SWI");
		INH.add("3F");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*60*/		INH = new ArrayList<String>();
		INH.add("TAB");
		INH.add("16");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*61*/		INH = new ArrayList<String>();
		INH.add("TAP");
		INH.add("06");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*62*/		INH = new ArrayList<String>();
		INH.add("TBA");
		INH.add("17");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*63*/		INH = new ArrayList<String>();
		INH.add("TEST");
		INH.add("00");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*64*/		INH = new ArrayList<String>();
		INH.add("TPA");
		INH.add("07");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*65*/		INH = new ArrayList<String>();
		INH.add("TSTA");
		INH.add("4D");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*66*/		INH = new ArrayList<String>();
		INH.add("TSTB");
		INH.add("5D");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*67*/		INH = new ArrayList<String>();
		INH.add("TSX");
		INH.add("30");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*68*/		INH = new ArrayList<String>();
		INH.add("TSY");
		INH.add("1830");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*69*/		INH = new ArrayList<String>();
		INH.add("TXS");
		INH.add("35");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*70*/		INH = new ArrayList<String>();
		INH.add("TYS");
		INH.add("1835");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*71*/		INH = new ArrayList<String>();
		INH.add("WAI");
		INH.add("3E");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*72*/		INH = new ArrayList<String>();
		INH.add("XGDX");
		INH.add("8F");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
/*73*/		INH = new ArrayList<String>();
		INH.add("XGDY");
		INH.add("188F");
		aux = new Nodo(INH);
		inherentes.addNodo(aux);
	}
	
	public void setRelativos(){
		List<String> REL = new ArrayList<String>();
		Nodo aux;
		
/*1*/		REL.add("BCC");
		REL.add("24");
		relativos = new Arbol(REL);		//Crea el arbol con la raiz ABA,1B
		
/*2*/		REL = new ArrayList<String>();		//Se prepara para otro nemonico
		REL.add("BCS");
		REL.add("25");
		aux = new Nodo(REL);		//Crea un nodo con los datos ABX, 3A
		relativos.addNodo(aux);
/*3*/		REL = new ArrayList<String>();		//Se prepara para otro nemonico
		REL.add("BEQ");
		REL.add("27");
		aux = new Nodo(REL);		//Crea un nodo con los datos ABX, 3A
		relativos.addNodo(aux);
/*4*/		REL = new ArrayList<String>();		//Se prepara para otro nemonico
		REL.add("BGE");
		REL.add("2C");
		aux = new Nodo(REL);		//Crea un nodo con los datos ABX, 3A
		relativos.addNodo(aux);
/*5*/		REL = new ArrayList<String>();		//Se prepara para otro nemonico
		REL.add("BGT");
		REL.add("2E");
		aux = new Nodo(REL);		//Crea un nodo con los datos ABX, 3A
		relativos.addNodo(aux);
/*6*/		REL = new ArrayList<String>();		//Se prepara para otro nemonico
		REL.add("BHI");
		REL.add("22");
		aux = new Nodo(REL);		//Crea un nodo con los datos ABX, 3A
		relativos.addNodo(aux);
/*7*/		REL = new ArrayList<String>();		//Se prepara para otro nemonico
		REL.add("BHS");
		REL.add("24");
		aux = new Nodo(REL);		//Crea un nodo con los datos ABX, 3A
		relativos.addNodo(aux);
/*8*/		REL = new ArrayList<String>();		//Se prepara para otro nemonico
		REL.add("BLE");
		REL.add("2F");
		aux = new Nodo(REL);		//Crea un nodo con los datos ABX, 3A
		relativos.addNodo(aux);
/*9*/		REL = new ArrayList<String>();		//Se prepara para otro nemonico
		REL.add("BLO");
		REL.add("25");
		aux = new Nodo(REL);		//Crea un nodo con los datos ABX, 3A
		relativos.addNodo(aux);
/*10*/		REL = new ArrayList<String>();		//Se prepara para otro nemonico
		REL.add("BLS");
		REL.add("23");
		aux = new Nodo(REL);		//Crea un nodo con los datos ABX, 3A
		relativos.addNodo(aux);
/*11*/		REL = new ArrayList<String>();		//Se prepara para otro nemonico
		REL.add("BLT");
		REL.add("2D");
		aux = new Nodo(REL);		//Crea un nodo con los datos ABX, 3A
		relativos.addNodo(aux);
/*12*/		REL = new ArrayList<String>();		//Se prepara para otro nemonico
		REL.add("BMI");
		REL.add("2B");
		aux = new Nodo(REL);		//Crea un nodo con los datos ABX, 3A
		relativos.addNodo(aux);
/*13*/		REL = new ArrayList<String>();		//Se prepara para otro nemonico
		REL.add("BNE");
		REL.add("26");
		aux = new Nodo(REL);		//Crea un nodo con los datos ABX, 3A
		relativos.addNodo(aux);
/*14*/		REL = new ArrayList<String>();		//Se prepara para otro nemonico
		REL.add("BPL");
		REL.add("2A");
		aux = new Nodo(REL);		//Crea un nodo con los datos ABX, 3A
		relativos.addNodo(aux);
/*15*/		REL = new ArrayList<String>();		//Se prepara para otro nemonico
		REL.add("BRA");
		REL.add("20");
		aux = new Nodo(REL);		//Crea un nodo con los datos ABX, 3A
		relativos.addNodo(aux);
/*16*/		REL = new ArrayList<String>();		//Se prepara para otro nemonico
		REL.add("BRN");
		REL.add("21");
		aux = new Nodo(REL);		//Crea un nodo con los datos ABX, 3A
		relativos.addNodo(aux);
/*17*/		REL = new ArrayList<String>();		//Se prepara para otro nemonico
		REL.add("BSR");
		REL.add("8D");
		aux = new Nodo(REL);		//Crea un nodo con los datos ABX, 3A
		relativos.addNodo(aux);
/*18*/		REL = new ArrayList<String>();		//Se prepara para otro nemonico
		REL.add("BVC");
		REL.add("28");
		aux = new Nodo(REL);		//Crea un nodo con los datos ABX, 3A
		relativos.addNodo(aux);
/*19*/		REL = new ArrayList<String>();		//Se prepara para otro nemonico
		REL.add("BVS");
		REL.add("29");
		aux = new Nodo(REL);		//Crea un nodo con los datos ABX, 3A
		relativos.addNodo(aux);
	}
	
	public void setMnemonicos(){
		List<String> MNE = new ArrayList<String>();
		Nodo aux;
/*1*/		MNE.add("ADCA");
		MNE.add("89");
		MNE.add("99");
		MNE.add("A9");
		MNE.add("18A9");
		MNE.add("B9");
		mnemonicos = new Arbol(MNE);
		
/*2*/		MNE = new ArrayList<String>();
		MNE.add("ADCB");
		MNE.add("C9");
		MNE.add("D9");
		MNE.add("E9");
		MNE.add("18E9");
		MNE.add("F9");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*3*/		MNE = new ArrayList<String>();
		MNE.add("ADDA");
		MNE.add("8B");
		MNE.add("9B");
		MNE.add("AB");
		MNE.add("18AB");
		MNE.add("BB");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*4*/		MNE = new ArrayList<String>();
		MNE.add("ADDB");
		MNE.add("CB");
		MNE.add("DB");
		MNE.add("EB");
		MNE.add("18EB");
		MNE.add("FB");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*5*/		MNE = new ArrayList<String>();
		MNE.add("ADDD");
		MNE.add("C3");
		MNE.add("D2");
		MNE.add("E3");
		MNE.add("18E3");
		MNE.add("F3");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*6*/		MNE = new ArrayList<String>();
		MNE.add("ANDA");
		MNE.add("84");
		MNE.add("94");
		MNE.add("A4");
		MNE.add("18A4");
		MNE.add("B4");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*7*/		MNE = new ArrayList<String>();
		MNE.add("ANDB");
		MNE.add("C4");
		MNE.add("D4");
		MNE.add("E4");
		MNE.add("18E4");
		MNE.add("F4");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*8*/		MNE = new ArrayList<String>();
		MNE.add("ASL");
		MNE.add("0");
		MNE.add("0");
		MNE.add("68");
		MNE.add("1868");
		MNE.add("78");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*9*/		MNE = new ArrayList<String>();
		MNE.add("ASR");
		MNE.add("0");
		MNE.add("0");
		MNE.add("67");
		MNE.add("1867");
		MNE.add("77");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*10*/		MNE = new ArrayList<String>();
		MNE.add("BCLR");
		MNE.add("0");
		MNE.add("15");
		MNE.add("1D");
		MNE.add("181D");
		MNE.add("0");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*11*/		MNE = new ArrayList<String>();
		MNE.add("BITA");
		MNE.add("85");
		MNE.add("95");
		MNE.add("A5");
		MNE.add("18A5");
		MNE.add("B5");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*12*/		MNE = new ArrayList<String>();
		MNE.add("BITB");
		MNE.add("C5");
		MNE.add("D5");
		MNE.add("E5");
		MNE.add("18E5");
		MNE.add("F5");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*13*/		MNE = new ArrayList<String>();
		MNE.add("BRCLR");
		MNE.add("0");
		MNE.add("13");
		MNE.add("1F");
		MNE.add("181F");
		MNE.add("0");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*14*/		MNE = new ArrayList<String>();
		MNE.add("BRSET");
		MNE.add("0");
		MNE.add("12");
		MNE.add("1E");
		MNE.add("181E");
		MNE.add("0");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*15*/		MNE = new ArrayList<String>();
		MNE.add("BSET");
		MNE.add("0");
		MNE.add("14");
		MNE.add("1C");
		MNE.add("181C");
		MNE.add("0");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*16*/		MNE = new ArrayList<String>();
		MNE.add("CLR");
		MNE.add("0");
		MNE.add("0");
		MNE.add("6F");
		MNE.add("186F");
		MNE.add("7F");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*17*/		MNE = new ArrayList<String>();
		MNE.add("CMPA");
		MNE.add("81");
		MNE.add("91");
		MNE.add("A1");
		MNE.add("18A1");
		MNE.add("B1");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*18*/		MNE = new ArrayList<String>();
		MNE.add("CMPB");
		MNE.add("C1");
		MNE.add("D1");
		MNE.add("E1");
		MNE.add("18E1");
		MNE.add("F1");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*19*/		MNE = new ArrayList<String>();
		MNE.add("COM");
		MNE.add("0");
		MNE.add("0");
		MNE.add("63");
		MNE.add("1863");
		MNE.add("73");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*20*/		MNE = new ArrayList<String>();
		MNE.add("CPD");
		MNE.add("1A83");
		MNE.add("1A93");
		MNE.add("1AA3");
		MNE.add("CDA3");
		MNE.add("1AB3");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*21*/		MNE = new ArrayList<String>();
		MNE.add("CPX");
		MNE.add("8C");
		MNE.add("9C");
		MNE.add("AC");
		MNE.add("CDAC");
		MNE.add("BC");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*22*/		MNE = new ArrayList<String>();
		MNE.add("CPY");
		MNE.add("188C");
		MNE.add("189C");
		MNE.add("1AAC");
		MNE.add("18AC");
		MNE.add("18BC");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*23*/		MNE = new ArrayList<String>();
		MNE.add("DEC");
		MNE.add("0");
		MNE.add("0");
		MNE.add("6A");
		MNE.add("186A");
		MNE.add("7A");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*24*/		MNE = new ArrayList<String>();
		MNE.add("EORA");
		MNE.add("88");
		MNE.add("98");
		MNE.add("A8");
		MNE.add("18A8");
		MNE.add("B8");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*25*/		MNE = new ArrayList<String>();
		MNE.add("EORB");
		MNE.add("C8");
		MNE.add("D8");
		MNE.add("E8");
		MNE.add("18E8");
		MNE.add("F8");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*26*/		MNE = new ArrayList<String>();
		MNE.add("INC");
		MNE.add("0");
		MNE.add("0");
		MNE.add("6C");
		MNE.add("186C");
		MNE.add("7C");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*27*/		MNE = new ArrayList<String>();
		MNE.add("LDAA");
		MNE.add("86");
		MNE.add("96");
		MNE.add("A6");
		MNE.add("18A6");
		MNE.add("B6");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*28*/		MNE = new ArrayList<String>();
		MNE.add("LDAB");
		MNE.add("C6");
		MNE.add("D6");
		MNE.add("E6");
		MNE.add("18E6");
		MNE.add("F6");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*29*/		MNE = new ArrayList<String>();
		MNE.add("LDD");
		MNE.add("CC");
		MNE.add("DC");
		MNE.add("EC");
		MNE.add("18EC");
		MNE.add("FC");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*30*/		MNE = new ArrayList<String>();
		MNE.add("LDS");
		MNE.add("8E");
		MNE.add("9E");
		MNE.add("AE");
		MNE.add("18AE");
		MNE.add("BE");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*31*/		MNE = new ArrayList<String>();
		MNE.add("LDX");
		MNE.add("CE");
		MNE.add("DE");
		MNE.add("EE");
		MNE.add("CDEE");
		MNE.add("FE");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*32*/		MNE = new ArrayList<String>();
		MNE.add("LDY");
		MNE.add("18CE");
		MNE.add("18DE");
		MNE.add("1AEE");
		MNE.add("18EE");
		MNE.add("18FE");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*33*/		MNE = new ArrayList<String>();
		MNE.add("LSL");
		MNE.add("0");
		MNE.add("0");
		MNE.add("68");
		MNE.add("1868");
		MNE.add("78");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*34*/		MNE = new ArrayList<String>();
		MNE.add("LSR");
		MNE.add("0");
		MNE.add("0");
		MNE.add("64");
		MNE.add("1864");
		MNE.add("74");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*35*/		MNE = new ArrayList<String>();
		MNE.add("NEG");
		MNE.add("0");
		MNE.add("0");
		MNE.add("60");
		MNE.add("1860");
		MNE.add("70");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*36*/		MNE = new ArrayList<String>();
		MNE.add("ORAA");
		MNE.add("8A");
		MNE.add("9A");
		MNE.add("AA");
		MNE.add("18AA");
		MNE.add("BA");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*37*/		MNE = new ArrayList<String>();
		MNE.add("ORAB");
		MNE.add("CA");
		MNE.add("DA");
		MNE.add("EA");
		MNE.add("18EA");
		MNE.add("FA");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*38*/		MNE = new ArrayList<String>();
		MNE.add("ROL");
		MNE.add("0");
		MNE.add("0");
		MNE.add("69");
		MNE.add("1869");
		MNE.add("79");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*39*/		MNE = new ArrayList<String>();
		MNE.add("ROR");
		MNE.add("0");
		MNE.add("0");
		MNE.add("66");
		MNE.add("1866");
		MNE.add("76");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*40*/		MNE = new ArrayList<String>();
		MNE.add("SBCA");
		MNE.add("82");
		MNE.add("92");
		MNE.add("A2");
		MNE.add("18A2");
		MNE.add("B2");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*41*/		MNE = new ArrayList<String>();
		MNE.add("SBCB");
		MNE.add("C2");
		MNE.add("D2");
		MNE.add("E2");
		MNE.add("18E2");
		MNE.add("F2");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*42*/		MNE = new ArrayList<String>();
		MNE.add("STAA");
		MNE.add("0");
		MNE.add("97");
		MNE.add("A7");
		MNE.add("18A7");
		MNE.add("B7");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*43*/		MNE = new ArrayList<String>();
		MNE.add("STAB");
		MNE.add("0");
		MNE.add("D7");
		MNE.add("E7");
		MNE.add("18E7");
		MNE.add("F7");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*44*/		MNE = new ArrayList<String>();
		MNE.add("STD");
		MNE.add("0");
		MNE.add("DD");
		MNE.add("ED");
		MNE.add("18ED");
		MNE.add("FD");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*45*/		MNE = new ArrayList<String>();
		MNE.add("STS");
		MNE.add("0");
		MNE.add("9F");
		MNE.add("AF");
		MNE.add("18AF");
		MNE.add("BF");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*46*/		MNE = new ArrayList<String>();
		MNE.add("STX");
		MNE.add("0");
		MNE.add("D");
		MNE.add("EF");
		MNE.add("CDEF");
		MNE.add("FF");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*47*/		MNE = new ArrayList<String>();
		MNE.add("STY");
		MNE.add("0");
		MNE.add("18DF");
		MNE.add("1AEF");
		MNE.add("18EF");
		MNE.add("18FF");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*48*/		MNE = new ArrayList<String>();
		MNE.add("SUBA");
		MNE.add("80");
		MNE.add("90");
		MNE.add("A0");
		MNE.add("18A0");
		MNE.add("B0");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*49*/		MNE = new ArrayList<String>();
		MNE.add("SUBB");
		MNE.add("C0");
		MNE.add("D0");
		MNE.add("E0");
		MNE.add("18E0");
		MNE.add("F0");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*50*/		MNE = new ArrayList<String>();
		MNE.add("SUBD");
		MNE.add("83");
		MNE.add("93");
		MNE.add("A3");
		MNE.add("18A3");
		MNE.add("B3");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
/*51*/		MNE = new ArrayList<String>();
		MNE.add("TST");
		MNE.add("0");
		MNE.add("0");
		MNE.add("6D");
		MNE.add("186D");
		MNE.add("7D");
		aux = new Nodo(MNE);
		mnemonicos.addNodo(aux);
	}

	public Arbol getInh(){
		return inherentes;
	}
	public Arbol getRel(){
		return relativos;
	}
	public Arbol getMne(){
		return mnemonicos;
	}
}