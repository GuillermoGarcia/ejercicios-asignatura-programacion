/*
 * Solución Ejercicio 9 Tema 7
 *
 * Realiza un programa que pida 8 números enteros y que luego muestre esos números junto con la
 * palabra “par” o “impar” según proceda.
 *  
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio09{
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    int[] num = new int[8];

    for (int i = 0; i <= (num.length - 1); i++) { // Guardamos en un array los números que solicitamos
      System.out.print("Por favor, introduzca un entero: ");
      num[i] = s.nextInt();
    }

    System.out.println("\nNúmeros introducidos: ");

    for (int i = 0; i <= (num.length - 1); i++){
      if ((num[i] % 2) == 0){
        System.out.printf("%9d Par%n",num[i]);
      } else {
        System.out.printf("%9d Impar%n",num[i]);
      }
    }

  }
}
