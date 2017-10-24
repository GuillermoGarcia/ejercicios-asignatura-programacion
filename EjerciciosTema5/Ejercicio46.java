/*
 * Solución Ejercicio 46 Tema 5
 *
 * Realiza un programa que pinte por pantalla un rectángulo hueco hecho con asteriscos. Se debe
 * pedir al usuario la anchura y la altura. Hay que comprobar que tanto la anchura como la altura
 * sean mayores o iguales que 2, en caso contrario se debe mostrar un mensaje de error.
 * 
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio46 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);
    int anchura = 0;
    int altura = 0;

    System.out.print("\033[1mPor favor, Introduzca la anchura del réctangulo (mínimo 2):\033[0m ");
    anchura = s.nextInt();
    System.out.print("\033[1mPor favor, Introduzca la altura del réctangulo (mínimo 2):\033[0m ");
    altura = s.nextInt();

    if ((anchura >= 2) && (altura >= 2)) {
      
    } else {
      System.out.println("\033[1mLo siento, la altura y/o la anchura introducida no son correctas."+
      "el valor mínimo para la anchura y la altura es de 2.\033[0m");
    }



    for (int i = 1; i <= altura; i++) {
      System.out.print(" ");
      for (int j = 1; j <= anchura; j++) {
        if (((i > 1) && (i < altura)) && ((j > 1) && (j < anchura))){
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
    }

  }
}
