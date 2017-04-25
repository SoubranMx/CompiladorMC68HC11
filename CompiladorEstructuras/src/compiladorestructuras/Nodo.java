package compiladorestructuras;

import java.io.*;
import java.util.*;

public class Nodo{
	private List<String> dato;
	private Nodo izq;
	private Nodo der;
	private Nodo padre;
	
	//Constructores
	public Nodo(List<String> dat){
		this.dato = dat;
		this.padre = null;
		this.izq = null;
		this.der = null;
	}
	
	//Setters Getters
	
	public List<String> getDato(){
		return dato;
	}
	
	public void setDato(List<String> dat){
		this.dato = dat;
	}
	
	public Nodo getPadre(){
		return padre;
	}
	public void setPadre(Nodo padre){
		this.padre = padre;
	}
	
	public Nodo getIzq(){
		return izq;
	}
	public void setIzq(Nodo hojaizq){
		this.izq = hojaizq;
	}
	
	public Nodo getDer(){
		return der;
	}
	public void setDer(Nodo hojader){
		this.der = hojader;
	}
}