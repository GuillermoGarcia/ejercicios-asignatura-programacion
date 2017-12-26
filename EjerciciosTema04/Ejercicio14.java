/*
 * Solución Ejercicio 14 Tema 4
 * 
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 * 
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio14 {
  public static void main (String[] args){
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduzca un número entero: ");
    int numero = s.nextInt();

    int par = numero%2;
    int cinco = numero%5;

    System.out.printf("El número %d ",numero);
    if(par == 0){ System.out.print("es par"); }
    else { System.out.print("no es par"); }
    if(cinco == 0){ System.out.print(" y es divisible por 5."); }
    else { System.out.print(" y no es divisible por 5."); }
    System.out.println();
  }
}
