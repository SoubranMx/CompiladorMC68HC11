package compiladorestructuras;

import java.io.*;
import java.util.*;
//https://serprogramador.es/programar-arboles-binarios-parte-1-introduccionclasesagregar-nodo/
public class Arbol {
 
    /* Atributos */
    private Nodo raiz;
    //private int i;
 
    /* Contructores	*/
    public Arbol( List<String> valor ) {
        this.raiz = new Nodo(valor);
    }
 
    public Arbol( Nodo raiz ) {
        this.raiz = raiz;
    }
 
    /* Setters y Getters */
    public Nodo getRaiz() {
        return raiz;
    }
 
    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
	
	// Metodos
    private void addNodo( Nodo nodo, Nodo raiz , int i ) {
        char c1 = nodo.getDato().get(0).charAt(i);
        
        if(isEmpty()){
            this.raiz = nodo;
        }
        else{
            // comparar la letra
            if(raiz.getDato().get(0).charAt(i) == c1){
                // IZQUIERDA
                if(raiz.getIzq()==null){
                    raiz.setIzq(nodo);
                    raiz.getIzq().setPadre(raiz);
                }
                else{
                    addNodo(nodo,raiz.getIzq(),++i);
                }
            }
            else{
                //DERECHA
                if(raiz.getDer()==null){
                    raiz.setDer(nodo);
                    raiz.getDer().setPadre(raiz);
                }
                else
                    addNodo(nodo,raiz.getDer(),0);
            }
        }
    }
 
    public void addNodo( Nodo nodo, int x ) {
        this.addNodo( nodo , this.raiz , x );
    }
    
    public boolean isEmpty(){
        return (raiz == null);
    }
    
    private Nodo buscaNodo(Nodo nodo, Nodo raiz, int x, int i){
        char c1 = nodo.getDato().get(x).charAt(i);
        char c2 = raiz.getDato().get(0).charAt(i);
        String s1 = nodo.getDato().get(x);
        Nodo aux;
        
        if(isEmpty()){
            aux = null;
        }
        else{
            // comparar la letra
            if(c2 == c1){
                // RAIZ
                if(raiz.getDato().get(0) == s1){
                    aux = raiz;
                }
                else{
                    // IZQUIERDA
                    if(raiz.getIzq()==null){
                        aux = null;
                    }
                    else{
                        aux = buscaNodo(nodo,raiz.getIzq(),x,++i);
                    }
                }
            }
            else{
                //DERECHA
                if(raiz.getDer()==null){
                    aux = null;
                }
                else{
                    aux = buscaNodo(nodo,raiz.getDer(),x,0);
                }
            }
        }
        return aux;
    }
 
    public Nodo buscaNodo(Nodo nodo, int x, int i){    //x es el lugar donde está la palabra ?  i es para el charAt
        Nodo aux = buscaNodo(nodo, this.raiz , x , i);
        return aux;
    }
}