package ejercicio2;

public class Pila {
    private int tope,max;
 private int pila[];

 public Pila(int m)
 {
  max=m;
  pila=new int[max];//tamaño de la pila 
  tope=0; 
 }

 //Metodo que agrega un dato
 public int Agregar_a_pila(int n)
 {
  if(tope<max)
  {
   pila[tope]=n;
   tope++;
   System.out.println("Dato agregado");
  }
  else
  {
   System.out.println("Ya no caben mas datos");
  }
  return 0;
 }

 //Metodo que elimina un dato de la pila
 public int Eliminar_a_pila(){
     int aux=0;
  if(tope>0){ 
   aux=tope--;
   //ystem.out.println(aux);
  }
  else
  {
   System.out.println("Ya no hay datos para eliminar");
  }
  return aux;
 }
 private boolean Vacia()
 {
  if(pila==null) return true;
  else return false;
 }

 //Metodo que muestra los datos *Ultimo -> Primero*
 public void Mostrar()
 {
  if(!Vacia())
  {
   for(int a=(tope-1);a>=0;a--)
   {
   System.out.println(pila[a]);
   } 
  }
  else System.out.println("Pila vacia");
 }
   
}
   /*private int vectorPila[];
   private int tope;
   
   //Metodo establecer tamaño de pila
  public Pila(int tamaño){
      vectorPila = new int[tamaño];
      tope=0;
  }  
  //Metodo Insertar elmento en la pila
  public int Inserta(int dato){
      vectorPila[tope]=dato;
      tope++;
      return 0;
  }
  //Metodo Eliminar elemento de una pila
   public int Eliminar_a_pila(){
       int eliminar=0;
       if(tope==0){
           System.out.println("La pila esta vacia");
       }else{
           eliminar=vectorPila[tope];
           tope--;
       }
       
       return eliminar;
   
      /*if(tope>0){
        tope--;
         System.out.println("Dato eliminado");
        }
      return tope;*/
  //}
  
  //Metodo para mostrar si esta o no vacio
  /* public boolean vacio(){
      if(tope == 0){
          return true;
      }else{
          return false;
      }
   
}
  //Metodo para imprimir la pila.
   public void MostrarPila(){
  if(!vacio())
  {
   for(int a=(tope-1);a>=0;a--)
   {
   System.out.println(vectorPila[a]);
   } 
  }
  else System.out.println("Pila vacia");
 }
 public int Tamaño(){
      return vectorPila.length;
  } 

}  */

  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 
    
    /*Scanner teclado = new Scanner(System.in);
    int pila1[]=new int[4];
    int tope=-1;
     inicio=null;

public int Ingresar_Elemento(){
 
        if(tope>=pila1.length-1){
            System.out.println("la pila está llena");
        }else
        {
            tope+=1;
            System.out.println("ingrese el dato");
            pila1[tope]=teclado.nextInt();
        }
        return tope;
 
    }
public void imprimir_Pila(){
 
        for(int tope=3;tope>=0;tope--){
            System.out.println("Datos de la pila: "+pila1[tope]);
      }
    }*/
