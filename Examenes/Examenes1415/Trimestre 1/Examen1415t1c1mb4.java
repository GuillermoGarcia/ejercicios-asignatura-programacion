/*
 * Solución Ejercicio 4 Examen Trimestre 1 Control 1 Modelo B Año 2014
 *
 * Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares hay dentro de un
 * número. Usa long en lugar de int donde sea necesario para admitir números más largos.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Examen1415t1c1mb4 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);
    long numero = 0;
    int longitud = 0;
    int pares = 0;

    do{
      System.out.print("\033[1mPor favor, Introduzca un número entero positivo:\033[0m ");
      numero = s.nextLong();
    } while ( numero < 0);

    System.out.print("El número " + numero + " contiene ");

    while (numero > 0) {
      if (((numero % 10) % 2) == 0) {
        pares++;
      }
      longitud++;
      numero = numero / 10;
    }

    System.out.println(pares + " dígitos pares y " + (longitud - pares) + " dígitos impares.");

  }
}
