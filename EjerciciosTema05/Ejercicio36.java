/*
 * Solución Ejercicio 36 Tema 5
 *
 * Escribe un programa que diga si un número introducido por teclado es o no capicúa. Los números
 * capicúa se leen igual hacia delante y hacia atrás. El programa debe aceptar números de cualquier
 * longitud siempre que lo permita el tipo, en caso contrario el ejercicio no se dará por bueno. Se
 * recomienda usar long en lugar de int ya que el primero admite números más largos.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio36 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    System.out.print("\033[1mPor favor, Introduzca un numero entero:\033[0m ");
    long numero = s.nextLong();

    if (numero < 0) { numero *= -1; }

    long temp = numero;
    long capicua = 0;

    while (temp > 0) {
      capicua = (capicua * 10) + (temp % 10);
      temp = temp / 10;
    }

    if ((numero - capicua) == 0){
      System.out.println("El número es capicúa.");
    } else {
      System.out.println("El número no es capicúa.");
    }

  }
}
