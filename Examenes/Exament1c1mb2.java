/*
 * Solución Ejercicio 2 Examen Trimestre 1 Control 1 Modelo B
 *
 * Escribe un programa que mezcle los dígitos de dos números de la misma longitud que se introducen
 * por teclado. Se debe comprobar que los dos números efectivamente tienen la misma longitud. Se
 * recomienda usar long en lugar de int ya que el primero admite números más largos.
 *
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Exament1c1mb2 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);
    long numeroUno = 0;
    long numeroDos = 0;
    long temp = 0;

    System.out.print("\033[1mPor favor, Introduzca un número entero positivo:\033[0m ");
    numeroUno = s.nextLong();

    System.out.print("\033[1mPor favor, Introduzca otro número entero positivo de la misma " +
    "longitud que el anterior:\033[0m ");
    numeroDos = s.nextLong();

    while ((numeroUno > 0) && ( numeroDos > 0)){
      temp = (temp * 100) + ((numeroUno % 10) + ((numeroDos % 10) * 10));
      numeroDos = numeroDos / 10;
      numeroUno = numeroUno / 10;
      System.out.println(numeroUno + " __ " + numeroDos + " __ " + temp);
    }

    if ((numeroUno >= 10) || (numeroDos >= 10)) {

      System.out.print("Los datos introducidos no son válidos, los dos números deben tener " +
      "la misma longitud.");

    } else {

      while (temp > 0) {
        numeroUno = (numeroUno * 10) + (temp % 10);
        temp = temp / 10;
      }

      System.out.print("La mezcla de los dos números es: " + numeroUno);
    }
  }
}
