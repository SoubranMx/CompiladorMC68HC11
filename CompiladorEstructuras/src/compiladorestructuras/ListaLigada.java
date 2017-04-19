package compiladorestructuras;
import java.util.*;
public class ListaLigada {
   //Atributos
    private Nodo h;
    private Nodo t;
    private boolean existe;

    //Constructores
    /*si se crea la lista con datos iniciales no se necesita
    crear un constructor
    */

    //Métodos
    public boolean Vacio(){
      return(h==null);
    }

    public void InsertarAlFinal(List<String> dato){
      Nodo q = new Nodo(dato,null);
      if(Vacio())
            h=t=q;
      else
            t.setSig(q);
      t=q;
      return;
    }

    /*public void Listar(){
      Nodo i;
      List<String> list;
      int j=1;
      i=h;
      while(i!=null){
            list = i.getDato(); //getDato regresa tipo Muestra
            list.Nombrate(j++); //j para que aparezca numerico, se suma despues de ser usado
            i=i.getSig();
      }
      System.out.println("---------------------------------");
    }*/

    public Nodo BuscaNodoAnterior(List<String> dato){
      Nodo q=h;
      Nodo anterior=null;
      existe=false;
      while(q!=null){
            //anterior=q;
            if(existe = q.getDato()==dato){
              q=null;
            }
            else{
              anterior=q;
              q=q.getSig();
            }
      }
      return anterior;
    }

    //public Nodo Borrar(Muestra dato)  Se extrae como si se tratase de cola normal, no es necesario buscar.
    public List<String> Extraer(){
      Nodo aux=t; 
      Nodo anterior;
      anterior=BuscaNodoAnterior(t.getDato());
      if(anterior!=null){   //Si es diferente de null, encontró el anterior
            aux = t;
            anterior.setSig(null);
            t=anterior;
      }
      //t=anterior;
      return aux.getDato();
    }
}
