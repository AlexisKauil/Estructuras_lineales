
package ejercicio1;
public class Pila {
    
    char dato;
    Pila siguiente;
    private Pila tope;
    int tamaño;
    //constructor de pila
    public Pila(char d){
        dato=d;
        siguiente=null;
        
    }
    //constructor para el nodo
    public Pila() {
        tope=null;
        tamaño=0;
    }
    
    
    boolean Vacia(){
        return tope==null;
    }
    
    //Agregar elementos en la pila
    void Agregar(char elemento){
        Pila nuevo=new Pila(elemento);//objeto para la pila
        nuevo.siguiente=tope;
        tope=nuevo;
        tamaño++;
    }
    
    /*int cima(){
        return tope.dato;
    }*/
    
   /* int tamaño(){
        if(tamaño>0){
            return tamaño;
        }else{
            return 0;
        }
    }*/
    //Imprimi elementos de la pila
    String MostrarPila(){
        Pila temporal=tope;
        String mpila="";
        while(!Vacia()){
        mpila+=tope.dato+"\n";
        tope=tope.siguiente;
     
    }
        tope=temporal;
        return mpila;
        
  }
    String pilaOriginal( String cadena){
    //procedimiento para agregar los caracteres en una pila
    char letras[]; 
    letras = cadena.toCharArray();
    for(int a=0;a<letras.length;a++){
      Agregar(letras[a]);
        
         }
    System.out.println("Pila original");
     return MostrarPila();
   }
    
    //Invierte los elementos de una pila
    String Invertir_pila(){
    System.out.println("Pila invertida");
    Pila temporal=tope;
        Pila cc=new Pila();
        while(!Vacia()){
            cc.Agregar(tope.dato);
            tope=tope.siguiente;
        }
        tope=temporal;
        return cc.MostrarPila();
    }
}
    
   
    

