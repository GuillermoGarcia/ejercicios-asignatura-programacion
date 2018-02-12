/*
 * Solución Ejercicio 4 Examen Trimestre 1 Control 1 Modelo A Año 2014
 *
 * Realiza un programa que pinte la letra Z hecha de asteriscos. El programa debe pedir la altura de
 * la letra, que deberá ser un número mayor o igual que 4. En caso de que el usuario introduzca un
 * número no válido, se mostrará un mensaje de error.
 *
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Examen1415t1c1ma4 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);
    int altura = 0;
    long digito = 0;

    System.out.print("\033[1mPor favor, Introduzca la altura de la Z:\033[0m ");
    altura = s.nextInt();

    while (altura < 4) {
      System.out.println("\033[1mLa altura de la Z debe ser mayor o igual de 4.\033[0m");
      System.out.print("\033[1mPor favor, Introduzca la altura de la Z:\033[0m ");
      altura = s.nextInt();
    }

    // Parte superior de la Z
    for (int i = 1; i <= altura ; i++){
      System.out.print("*");
    }

    System.out.println();

    // Parte central de la Z
    for (int i = (altura - 2); i >= 1 ; i--){
      for (int j = 1; j <= i; j++){
        System.out.print(" ");
      }
      System.out.println("*");
    }

    // Parte inferior de la Z
    for (int i = 1; i <= altura ; i++){
      System.out.print("*");
    }

  }
}
