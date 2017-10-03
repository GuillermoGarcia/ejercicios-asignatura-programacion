/*
 * 
 * Resolución Ejercicio 2 Tema 3
 * 
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado. * 
 * 
 * @author Guillermo García
 * 
 */

import java.util.Scanner;

public class Ejercicio02 {
  public static void main (String args[]){

    Scanner s = new Scanner(System.in);
  
    System.out.println("Escriba la cantidad de Euros a ser convertidas a pesetas.");
  
    double euros = s.nextDouble();

    System.out.printf("%.2f Euros son %.2f pesetas\n",euros,(euros * 166.386));
    
  }
}
