/* 
 * Resolución Ejercicio 5 Tema 3
 * 
 * Escribe un programa que calcule el área de un rectángulo.
 *
 * @author Guillermo García
 */ 

import java.util.Scanner;

public class Ejercicio05 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Por favor, facilite la base del rectángulo:");
    int base = s.nextInt();

    System.out.println("Por favor, facilite la altura del rectángulo:");
    int altura = s.nextInt();
    
    System.out.printf("El área de un rectángulo de base %d y altura %d es %d\n",
    base,altura,(base*altura));
    
  }  
}
