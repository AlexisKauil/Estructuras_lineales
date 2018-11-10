
package ejercicio2;

import java.util.Scanner;
public class Ejercicio2 {

   
    public static void main(String[] args) {
         int dato=0,tamaño;
      Scanner leer = new Scanner(System.in);
      System.out.println("Digite el tamaño de la pila");
        tamaño=leer.nextInt();
        Pila a=new Pila(tamaño);
        Cola b=new Cola();
        for(int i=0;i<tamaño;i++){
            System.out.println("Ingrese un numero: ");
            dato=leer.nextInt();
             a.Agregar_a_pila(dato); 
             
        }
        System.out.println("Pila llena: ");
        a.Mostrar();
        for(int i=0;i<tamaño;i++){
            //llena la cola apartir de los datos de la pila
            b.agregar_a_cola(a.Eliminar_a_pila());//El dato que se elimina de almacena en la cola 
          } 
        System.out.println("Cola llena apartir de la pila: ");
        //b.eliminar_a_cola();
        b.MostrarCola();
       
     }
    
}

       