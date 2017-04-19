package compiladorestructuras;
import java.util.*;

public class Nodo{
    //Atributos
    private List<String> dato;
    private Nodo sig;

    //Constructores
    public Nodo (List<String> dato, Nodo sig){
      this.dato=dato;
      this.sig=sig;
    }
    public Nodo(){
        this.dato =null;
        this.sig=null;
    }

    //Métodos

    public void setSig(Nodo sig){
      this.sig=sig;
    }

    public List<String> getDato(){
      return dato;
    }

    public Nodo getSig(){
      return sig;
    }
}
