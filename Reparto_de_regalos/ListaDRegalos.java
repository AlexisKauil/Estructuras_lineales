
package listadregalos;

//Alexis Eliseo Kauil Dzib
public class ListaDRegalos {

    public static void main(String[] args) throws Exception {
        
        
         listaE lista = new listaE();
         listaE listaResultados = new listaE();
         pilas pila = new pilas();
         int l1=0, l2=1,l3=2,l4=3;
         
         //lista de regalos de los clientes
         
         pila.apilar("Televisor");//4
         pila.apilar("Celular");//3
         pila.apilar("Motocicleta");//2
         pila.apilar("Computadora");//1
         
         System.out.println("lista de regalos");
         pila.listar();
         System.out.println("LISTA DE CLIENTES \n");
        
        //Lista de clientes
        lista.agregarAlInicio("Julio","9852345678");
        lista.agregarAlFinal("Patricio","9856574895");
        lista.agregarAlFinal("Patricio","9855674859");
        lista.agregarAlFinal("Jeorge","6786572315");
        
        
        lista.listar();
        System.out.println("");
        
         
        if (!lista.getValor(l1).equals(lista.getValor(l2)) && !lista.getValor(l1).equals(lista.getValor(l3)) &&
                !lista.getValor(l1).equals(lista.getValor(l4))){
              listaResultados.agregarAlFinal(lista.getValor(l1),pila.GetDato(l1));
              
        }
        if (!lista.getValor(l2).equals(lista.getValor(l1)) && !lista.getValor(l2).equals(lista.getValor(l3)) &&
                !lista.getValor(l2).equals(lista.getValor(l4))){
              listaResultados.agregarAlFinal(lista.getValor(l2),pila.GetDato(l2));
              
        }
        if (!lista.getValor(l3).equals(lista.getValor(l1)) || !lista.getValor(l3).equals(lista.getValor(l2)) ||
                !lista.getValor(l3).equals(lista.getValor(l3))){
              listaResultados.agregarAlFinal(lista.getValor(l3),pila.GetDato(l3));
              
        }
        if (!lista.getValor(l4).equals(lista.getValor(l1)) || !lista.getValor(l4).equals(lista.getValor(l2)) ||
                !lista.getValor(l4).equals(lista.getValor(l3))){
              listaResultados.agregarAlFinal(lista.getValor(l4),pila.GetDato(l4));
              
        }
        
         System.out.println("\n======A continuacion se presenta cada cliente con su respectivo regalo=======");
         
        listaResultados.listar();
        
    }
    
}
