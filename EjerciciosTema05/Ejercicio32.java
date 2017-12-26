/*
 * Solución Ejercicio 32 Tema 5
 *
 * Escribe un programa que, dado un número entero, diga cuáles son y cuánto suman los dígitos pares.
 * Los dígitos pares se deben mostrar en orden, de izquierda a derecha. Usa long en lugar de int
 * donde sea necesario para admitir números largos.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio32 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    System.out.print("\033[1mPor favor, Introduzca un número entero positivo:\033[0m ");
    long numero = s.nextLong();
    long temp = 0;
    int pares = 0;
    int sumaPares = 0;
    int longitud;

    System.out.print("Los dígitos pares del número \033[4m" + numero + "\033[0m son: ");
    
    while (numero > 0) {
      long digito = numero % 10;
      if ((digito % 2) == 0){
        sumaPares += digito;
        pares++;
        temp = (temp * 10) + (numero % 10);
      }      
      numero = numero / 10;
    }

    if (pares == 0) {
      System.out.print("Ninguno.");
    } else {
      for (int i = pares; i >= 1; i--){
        System.out.print((temp % 10));
        temp = temp / 10;
        if (i == 2){
          System.out.print(" y ");
        } else if (i != 1) {
          System.out.print(", ");
        }
      }
    }
    
    System.out.println("\nLa suma de los dígitos pares es \033[4m" + sumaPares + "\033[0m.");

  }
}
