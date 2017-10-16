/*
 * Solución Ejercicio 1 Tema 5
 * 
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle 'for'.
 *  
 * @author Guillermo García
 */

public class Ejercicio01 {
  public static void main (String[] args){
    
    for (int i=1;i<=100;i++){
      if ((i % 5) == 0) {
        System.out.printf("El número %s es múltiplo de 5.\n",i);
      }
    }
    
  }
}
