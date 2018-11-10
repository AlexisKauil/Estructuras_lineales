
package ejercicio2;

public class Cola {
    
    int dato;
    Cola siguiente;
    Cola inicio,fin; 
    int tam;
    
    //Constructores para nodo
    public Cola(int dat){   
        dato=dat;
        siguiente=null;
    }
    //constructor para pila
    public Cola(){
        inicio=fin=null;
        tam=0;
    }
    public boolean estaVacia(){
        return inicio==null;
    }
    public int  agregar_a_cola(int elemento){
        Cola nuevo=new Cola(elemento);
        if(estaVacia()){
            inicio=nuevo;
        }else{
            fin.siguiente=nuevo; 
        }
        fin=nuevo;
        tam++;
        return 0;
    }
    public int eliminar_a_cola(){
        int aux=inicio.dato;
        inicio=inicio.siguiente;
        tam--;
        return aux;
    }
    public void MostrarCola(){
        Cola aux=inicio;
        if(estaVacia()){
            System.out.println("Esta vacia");
        }else{
            String mostrar="";
            while(aux !=null){
                mostrar=aux.dato+"\n"+mostrar;
                aux=aux.siguiente;
                //System.out.println(""+mostrar);
            }
        System.out.println(""+mostrar);
        }
    
     }
}
