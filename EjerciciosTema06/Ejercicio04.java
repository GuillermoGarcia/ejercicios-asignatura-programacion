/*
 * Solución Ejercicio 4 Tema 6
 * 
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.
 *  
 * @author Guillermo García
 */

public class Ejercicio04 {
  public static void main (String[] args){

    for (int i = 1; i <= 20; i++) {
      System.out.println("Número " + i + ": " + ((int)(Math.random()*10) + 1));
    }

  }
}
