/*
 * Solución Ejercicio 5 Tema 7
 *
 * Escribe un programa que pida 10 números por teclado y que luego muestre los números introducidos
 * junto con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo respectivamente.
 *  
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio05 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    int[] num = new int[10];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    

    for (int i = 0; i <= 9; i++) { // Guardamos en un array los números que solicitamos
      System.out.print("Por favor, introduzca un entero: ");
      num[i] = s.nextInt();
      if (num[i] > maximo) {
        maximo = num[i];
      } else if (num[i] < minimo) {
        minimo = num[i];
      }
      
    }

    System.out.println("\nNúmeros introducidos: ");

    for (int i = 0; i <= 9; i++){
      if (num[i] == maximo){
        System.out.printf("%9d Máximo%n",num[i]);
      } else if (num[i] == minimo){
        System.out.printf("%9d Mínimo%n",num[i]);
      } else {
        System.out.printf("%9d%n",num[i]);
      }
    }

  }
}
