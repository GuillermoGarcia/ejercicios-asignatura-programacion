/* 
 * Resolución Ejercicio 11 Tema 3
 * 
 * Realiza un conversor de Kb a Mb.
 *
 * @author Guillermo García
 */ 

import java.util.Scanner;

public class Ejercicio11 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Por favor, cuantos Kilobytes vamos a convertir:");
    double kilo = s.nextDouble();
    
    System.out.printf("%.2f Kilobytes son %.2f Megabytes\n", kilo, (kilo/1024));
    
  }  
}
