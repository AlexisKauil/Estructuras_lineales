
package ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {

    
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        Pila pila=new Pila();//objeto de la clase
        
        String dat;
        System.out.println("Ingrese una palabra: ");
        dat=teclado.next();
        System.out.println(pila.pilaOriginal(dat));
        System.out.println(pila.Invertir_pila());
        
    }
    
}
