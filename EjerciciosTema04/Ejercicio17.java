/*
 * Solución Ejercicio 17 Tema 4
 *
 * Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio17 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número entero: ");

    long numero = s.nextLong();
    long ultimaCifra = numero % 10;

    System.out.printf("La última cifra del número %d es %d.\n", numero, ultimaCifra);

  }
}
