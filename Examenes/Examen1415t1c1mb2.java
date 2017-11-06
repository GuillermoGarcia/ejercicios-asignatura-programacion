/*
 * Solución Ejercicio 2 Examen Trimestre 1 Control 1 Modelo B Año 2014
 *
 * Realiza un programa que pida 10 números enteros por teclado y que luego diga cuántos de esos
 * números son primos. Los primos repetidos también cuentan. El número 1, por convenio, no se
 * considera primo (el 0 tampoco es primo).
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Examen1415t1c1mb2 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);
    int cantidadPrimos = 0;
    String primos = ""; 

    for (int i = 0; i < 10; i++ ) {
      System.out.print("\033[1mPor favor, Introduzca un número entero:\033[0m ");
      int valor = s.nextInt();
      int divisor = 2;
      boolean esPrimo = true;
      int tope = valor / 2;
      while ((esPrimo) && (divisor <= tope)) {
        if ((valor % divisor) != 0) {
          divisor++;
        } else {
          esPrimo = false;
        }
      }
      if ((esPrimo) && (valor > 1)) {
        if (cantidadPrimos == 0) {
          primos += valor + "";
        } else {
          primos += ", " + valor;
        }
        cantidadPrimos++;
      }
    }

    System.out.print("En total ha introducido " + cantidadPrimos + " números primos, los cuales" +
    " son " + primos + ".");

  }
}
