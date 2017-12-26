/* 
 * Resolución Ejercicio 6 Tema 3
 * 
 * Escribe un programa que calcule el área de un triángulo.
 *
 * @author Guillermo García
 */ 

import java.util.Scanner;

public class Ejercicio06 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Por favor, facilite la base del triángulo:");
    int base = s.nextInt();

    System.out.println("Por favor, facilite la altura del triángulo:");
    int altura = s.nextInt();
    
    System.out.printf("El área de un triángulo de base %d y altura %d es %d\n",
    base,altura,((base*altura)/2));
    
  }  
}
