/*
 * Resolución Ejercicio 3 Tema 3
 * 
 * 
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 * 
 * @author Guillermo García
 * 
 */

import java.util.Scanner;
 
public class Ejercicio03 {
  
  public static void main (String args[]) {
  
    Scanner s = new Scanner(System.in);
    
    System.out.println("Escriba la cantidad de pesetas a convertir en Euros.");
    
    double pesetas = s.nextDouble();
    
    System.out.printf("%.0f pesetas son %.2f Euros.\n",pesetas,(pesetas / 166.386));
    
  }
}

