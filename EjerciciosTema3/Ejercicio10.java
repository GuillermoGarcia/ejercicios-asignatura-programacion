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
    
    System.out.printf("%.4f Megabytes son %.4f Kilobytes", megas, (megas*1024));
    
  }  
}
