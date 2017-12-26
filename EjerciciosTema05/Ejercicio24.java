/*
 * Solución Ejercicio 24 Tema 5
 *
 * Escribe un programa que lea un número n e imprima una pirámide de números con n filas como en la
 * siguiente figura:
 *    1
 *   121
 *  12321
 * 1234321
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio24 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);
    String bl = "\033[1;5;7;100m%\033[0m ";

    System.out.print("\033[1m¿Cuantas filas desea que tenga la piramide?: \033[0m");

    int filas = s.nextInt();

    for (int i = 1; i <= filas; i++) {
      for (int j = 1; j <= (filas-i); j++){
        System.out.print(" ");
      }
      for (int j = 1; j < i; j++){
        System.out.print("\033["+ (30 + i) + "m"+ j + "\033[0m");
      }
      for (int j = i; j > 0; j--){
        System.out.print("\033["+ (30 + i) + "m"+ j + "\033[0m");
      }
      System.out.println();
    }

  }
}
