/*
 * Solución Ejercicio 42 Tema 5
 *
 * Escribe un programa que pida un número entero positivo por teclado y que muestre a continuación
 * los 5 números consecutivos a partir del número introducido. Al lado de cada número se debe
 * indicar si se trata de un primo o no.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio42 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);
    int numero = 0;
    
    do {
      System.out.print("\033[1mPor favor, Introduzca un número entero positivo:\033[0m ");
      numero = s.nextInt();
    } while (numero < 0);

    for (int i = numero; i <= (numero+5); i++) {
      int divisor = 2;
      boolean esPrimo = true;
      while ((esPrimo) && (divisor < i)) {
        if ((i % divisor) != 0) {
          divisor++;
        } else {
          esPrimo = false;
        }
      }
      System.out.print("El número \033[4m" + i + "\033[0m ");
      if (esPrimo) {
        System.out.println("\033[100mes primo\033[0m.");
      } else {
        System.out.println("\033[101mno es primo\033[0m.");
      }
    }

  }
}
