/*
 * Solución Ejercicio 3 Tema 5
 * 
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle 'do-while'.
 *  
 * @author Guillermo García
 */

public class Ejercicio03 {
  public static void main (String[] args){
    
    int i = 1;
    do{
      if ((i % 5) == 0) {
        System.out.printf("El número %s es múltiplo de 5.\n",i);
      }
      i++;
    }while (i<=100);
    
  }
}
