package compiladorestructuras;

import java.io.*;
import java.util.*;
//https://serprogramador.es/programar-arboles-binarios-parte-1-introduccionclasesagregar-nodo/
public class Arbol {
 
    /* Atributos */
    private Nodo raiz;
 
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
	private void addNodo( Nodo nodo, Nodo raiz ) {
        /* 2.- Partiendo de la raíz preguntamos: Nodo == null ( o no existe ) ? */
        if ( raiz == null ) {
            /* 
             * 3.- En caso afirmativo X pasa a ocupar el lugar del nodo y ya 
             * hemos ingresado nuestro primer dato. 
             * ==== EDITO =====
             * Muchas gracias a @Espectro por la corrección de esta línea
             */
            this.setRaiz(nodo);
        }
        else {
            /* 4.- En caso negativo preguntamos: X < Nodo */
            if ( nodo.getDato().get(0).compareTo(raiz.getDato().get(0)) < 0 ) {	//get(0) obtiene el String del nemonico. 0 es igual, menor a 0 va a la izquierda, mayor a 0 va a la derecha.
				/*
				lexicographically es como se podria encontrar una palabra en un diccionario, por orden alfabético.
				The value 0 if the argument is a string lexicographically equal to this string;
				a value less than 0 if the argument is a string lexicographically greater than this string;
				and a value greater than 0 if the argument is a string lexicographically less than this string.
				*/
                /* 
                 * 5.- En caso de ser menor pasamos al Nodo de la IZQUIERDA del
                 * que acabamos de preguntar y repetimos desde el paso 2 
                 * partiendo del Nodo al que acabamos de visitar 
                 */
                if (raiz.getIzq() == null) {
                    raiz.setIzq(nodo);
                }
                else {
                    addNodo(nodo , raiz.getIzq() );
                }
            }
            else {
                /* 
                 * 6.- En caso de ser mayor pasamos al Nodo de la DERECHA y tal
                 * cual hicimos con el caso anterior repetimos desde el paso 2
                 * partiendo de este nuevo Nodo.
                 */
                if (raiz.getDer() == null) {
                    raiz.setDer(nodo);
                }
                else {
                    addNodo( nodo, raiz.getDer() );
                }
            }
        }
    }
 
    public void addNodo( Nodo nodo ) {
        this.addNodo( nodo , this.raiz );
    }
 
}