/*
 * Solución Ejercicio 42 Tema 5
 *
 * Escribe un programa que pida un número entero positivo por teclado y que muestre a continuación
 * los 5 números consecutivos a partir del número introducido. Al lado de cada número se debe
 * indicar si se trata de un primo o no.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio42 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    System.out.print("\033[1mPor favor, Introduzca un número entero positivo:\033[0m ");
    long numero = s.nextLong();
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
