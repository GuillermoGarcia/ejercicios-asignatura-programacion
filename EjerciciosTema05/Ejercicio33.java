/*
 * Solución Ejercicio 33 Tema 5
 *
 * Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El programa pedirá la
 * altura. Fíjate que el programa inserta un espacio y pinta dos asteriscos menos en la base para
 * simular la curvatura de las esquinas inferiores.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio33 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    System.out.print("\033[1mPor favor, Introduzca la altura desea para la U:\033[0m ");
    int altura = s.nextInt();

    for (int i = 1; i <= (altura - 1); i++){
      System.out.print("*");
      for (int j = (altura - 2); j >= 1; j--){
        System.out.print(" ");
      }
      System.out.println("*");
    }

    System.out.print(" ");
    for (int i = (altura - 2); i >= 1; i--){
      System.out.print("*");
    }
    System.out.println();

  }
}
