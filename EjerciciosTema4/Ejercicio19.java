/*
 * Solución Ejercicio 19 Tema 4
 *
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser positivo o
 * negativo. Se permiten números de hasta 5 dígitos.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio19 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número entero, positivo o negativo de máximo 5 cifras: ");

    int numero = s.nextInt();
    int numeroDigitos = 0;

    if (numero >= 100000){
      System.out.println("El número facilitado tiene más de 5 dígitos.");
    } else {
      if (((numero > 0) && (numero < 10)) || ((numero < 0) && (numero > -10))){
        numeroDigitos = 1;
      } else if (((numero > 0) && (numero < 100)) || ((numero < 0) && (numero > -100))){
        numeroDigitos = 2;
      } else if (((numero > 0) && (numero < 1000)) || ((numero < 0) && (numero > -1000))){
        numeroDigitos = 3;
      } else if (((numero > 0) && (numero < 10000)) || ((numero < 0) && (numero > -10000))){
        numeroDigitos = 4;
      } else {
        numeroDigitos = 5;
      }
      System.out.printf("El número %d tiene %d dígitos.\n", numero, numeroDigitos);
    }
  }
}
