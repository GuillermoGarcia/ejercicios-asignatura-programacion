/* 
 * Resolución Ejercicio 10 Tema 3
 * 
 * Realiza un conversor de Mb a Kb.
 *
 * @author Guillermo García
 */ 

import java.util.Scanner;

public class Ejercicio10 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Por favor, cuantos Megabytes vamos a convertir:");
    double megas = s.nextDouble();
    
    System.out.printf("%.2f Megabytes son %.2f Kilobytes\n", megas, (megas*1024));
    
  }  
}
