/*
 * Solución Ejercicio 20 Tema 4
 *
 * Realiza un programa que diga si un número entero positivo introducido por teclado es capicúa. Se
 * permiten números de hasta 5 cifras.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio20 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número entero de máximo 5 cifras: ");

    int numero = s.nextInt();
    int temp = numero;
    int numeroReves = 0;

    if ((numero < 0) || (numero >= 100000)) {
      System.out.println("El número facilitado no es posítivo o tiene más de 5 dígitos.");
    } else {
      if (temp > 10000) {
        numeroReves = (numeroReves * 10) + (temp % 10);
        temp = temp / 10;
      }
      if (temp > 1000) {
        numeroReves = (numeroReves * 10) + (temp % 10);
        temp = temp / 10;
      }
      if (temp > 100){
        numeroReves = (numeroReves * 10) + (temp % 10);
        temp = temp / 10;
      }
      if (temp > 10) {
        numeroReves = (numeroReves * 10) + (temp % 10);
        temp = temp / 10;
      }
      if (temp < 10) {
        numeroReves = (numeroReves * 10) + temp;
      }
      temp = numero - numeroReves;

      if (temp == 0) {
        System.out.printf("El número %d es capicúa.\n", numero);
      } else {
        System.out.printf("El número %d no es capicúa.\n", numero);
      }
    }
  }
}
