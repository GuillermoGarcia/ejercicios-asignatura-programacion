/* 
 * Resolución Ejercicio 7 Tema 3
 * 
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible.
 *
 * @author Guillermo García
 */ 

import java.util.Scanner;

public class Ejercicio07 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Por favor, facilite la base imponible de la factura:");
    float baseImponible = s.nextFloat();    
    
    System.out.println("Siendo la base imponible " + baseImponible + " el IVA es "
     + ((float)baseImponible * (float)0.21) + " para un total de "
     + ((float)baseImponible * (float)1.21));
    
  }  
}
