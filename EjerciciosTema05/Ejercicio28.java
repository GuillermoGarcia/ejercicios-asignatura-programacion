/*
 * Solución Ejercicio 28 Tema 5
 *
 * Escribe un programa que calcule el factorial de un número entero leído por teclado.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio28 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    long factorial = 1;
    int numero = 0;

    do {
      System.out.print("\033[1mPor favor, Introduzca un número entero positivo: \033[0m");
      numero = s.nextInt();
    } while (numero < 1);

    for (int i = numero; i > 1; i--) {
      factorial *= i;
    }

    System.out.println("El factorial de " + numero + " es " + factorial + ".");

  }
}
