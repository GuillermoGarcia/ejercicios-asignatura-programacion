/*
 * Solución Ejercicio 2 Tema 5
 * 
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle 'while'.
 *  
 * @author Guillermo García
 */

public class Ejercicio02 {
  public static void main (String[] args){
    
    int i = 1;
    while (i<=100){
      if ((i % 5) == 0) {
        System.out.printf("El número %s es múltiplo de 5.\n",i);
      }
      i++;
    }
    
  }
}
