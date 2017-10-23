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

    System.out.print("\033[1mPor favor, Introduzca un número entero positivo: \033[0m");

    int numero = s.nextInt();
    int factorial = 1;

    for (int i = numero; i > 1; i--) {
      factorial *= i;
    }

    System.out.println("El factorial de " + numero + " es " + factorial + ".");

  }
}
