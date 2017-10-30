/*
 * Solución Ejercicio 1 Examen Trimestre 1 Control 1 Modelo A Año 2014
 *
 * Escribe un programa que mezcle los dígitos de dos números de la misma longitud que se introducen
 * por teclado. Se debe comprobar que los dos números efectivamente tienen la misma longitud. Se
 * recomienda usar long en lugar de int ya que el primero admite números más largos.
 *
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Examen1415t1c1ma2 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);
    long numero = 0;
    long digito = 0;

    System.out.print("\033[1mPor favor, Introduzca un número entero positivo:\033[0m ");
    numero = s.nextLong();

    if (numero < 0) { numero *= -1; }

    System.out.print("Los dígitos del número " + numero);

    do {
      digito = numero % 10;
      numero = numero / 10;
    } while (((numero % 10) <= digito) && (numero > 0));


    if (numero == 0) {

      System.out.print(" están ordenados.");

    } else {

      System.out.print(" no están ordenados.");
    }
  }
}
