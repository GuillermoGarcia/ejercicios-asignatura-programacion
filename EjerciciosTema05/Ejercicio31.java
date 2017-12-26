/*
 * Solución Ejercicio 31 Tema 5
 *
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El programa pedirá la
 * altura. El palo horizontal de la L tendrá una longitud de la mitad (división entera entre 2) de
 * la altura más uno.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio31 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    System.out.print("\033[1mPor favor, Introduzca la altura deseada para la L:\033[0m ");
    int altura = s.nextInt();

    System.out.println();
    for (int i = 1; i < altura; i++) {
      System.out.println("*");
    }
    for (int i = 1; i <= ((altura / 2) + 1); i++) {
      System.out.print("*");
    }
    System.out.println("\n");

  }
}
