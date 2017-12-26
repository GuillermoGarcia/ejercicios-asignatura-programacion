/*
 * Solución Ejercicio 41 Tema 5
 *
 * Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares hay dentro de un
 * número. Se recomienda usar long en lugar de int ya que el primero admite números más largos.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio41 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);
    long numero = 0;

    do {
      System.out.print("\033[1mPor favor, Introduzca un número entero positivo:\033[0m ");
      numero = s.nextLong();
    } while (numero < 0);

    int pares = 0;
    int impares = 0;

    System.out.print("El número \033[4m" + numero + "\033[0m contiene ");
    
    while (numero > 0) {
      long digito = numero % 10;
      if ((digito % 2) == 0){
        pares++;
      } else {
        impares++;
      }
      numero = numero / 10;
    }

    System.out.println(pares + " dígitos pares y " + impares + " dígitos impares.");

  }
}
