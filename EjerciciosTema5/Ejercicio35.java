/*
 * Solución Ejercicio 35 Tema 5
 *
 * Realiza un programa que pinte una X hecha de asteriscos. El programa debe pedir la altura. Se
 * debe comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se debe
 * mostrar un mensaje de error.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio35 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    int altura = 0;

    do {
      System.out.print("\033[1mPor favor, Introduzca la altura de la X:\033[0m ");
      altura = s.nextInt();
      if ((altura < 3) || ((altura % 2) == 0)) {
        System.out.println("La altura debe ser un numero impar mayor o igual a 3.");
      }
    } while ((altura < 3) || ((altura % 2) == 0));

    /* Mitad Superior de la X */
    for (int i = 1; i <= (altura / 2); i++){
      for (int j = 1; j <= (i - 1); j++){
        System.out.print(" ");
      }
      System.out.print("*");
      for (int j = (altura - (2 * i)); j >= 1; j--){
        System.out.print(" ");
      }
      System.out.println("*");
    }

    /* Centro de la X */
    for (int i = 1; i <= (altura / 2); i++){
      System.out.print(" ");
    }    
    System.out.println("*");

    /* Mitad inferior de la X */
    for (int i = (altura / 2); i >= 1; i--){
      for (int j = (i - 1); j >= 1; j--){
        System.out.print(" ");
      }
      System.out.print("*");
      for (int j = (altura - (2 *i)); j >= 1; j--){
        System.out.print(" ");
      }
      System.out.println("*");
    }

  }
}
