/*
 * Solución Ejercicio 3 Tema 7
 *
 * Escribe un programa que lea 10 números por teclado y que luego los muestre en orden inverso, es
 * decir, el primero que se introduce es el último en mostrarse y viceversa.
 *  
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio03 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    int[] num = new int[10];
    

    for (int i = 0; i <= 9; i++) { // Guardamos en un array los números
      System.out.print("Por favor, introduzca un entero: ");
      num[i] = s.nextInt();
    }

    for (int i = 9; i >= 0; i--){ // Recorremos el array del final al principio
      System.out.print(num[i] + " ");
    }
  }
}
