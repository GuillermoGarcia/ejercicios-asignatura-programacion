/*
 * Solución Ejercicio 40 Tema 5
 *
 * Realiza un programa que pinte por pantalla un rombo hueco hecho con asteriscos. El programa debe
 * pedir la altura. Se debe comprobar que la altura sea un número impar mayor o igual a 3, en caso
 * contrario se debe mostrar un mensaje de error.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio40 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);
    int altura = 0;

    do {
      System.out.print("\033[1mPor favor, Introduzca la altura del rombo:\033[0m ");
      altura = s.nextInt();
      if ((altura < 3) || ((altura % 2) == 0)) {
        System.out.println("La altura debe ser un numero impar mayor o igual a 3.");
      }
    } while ((altura < 3) || ((altura % 2) == 0));


    /* Mitad Superior del Rombo */
    for (int i = 1; i <= (altura / 2) + 1; i++){
      System.out.print(" ");
      for (int j = 1; j <= ((altura / 2) - i + 1); j++){
        System.out.print(" ");
      }
      System.out.print("*");
      for (int j = ((2 * i) - 3); j >= 1; j--){
        System.out.print(" ");
      }
      if (i == 1){
        System.out.println();
      } else {
        System.out.println("*");
      }
    }

    /* Mitad inferior del Rombo */
    for (int i = (altura / 2); i >= 1; i--){
      System.out.print(" ");
      for (int j = 1; j <= ((altura / 2) - i + 1); j++){
        System.out.print(" ");
      }
      System.out.print("*");
      for (int j = ((2 * i) - 3); j >= 1; j--){
        System.out.print(" ");
      }
      if (i == 1){
        System.out.println();
      } else {
        System.out.println("*");
      }
    }

  }
}
