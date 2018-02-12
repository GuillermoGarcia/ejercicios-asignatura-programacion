/*
 * Solución Ejercicio 2 Examen Repesca 2013 2014
 *
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El programa pedirá la
 * altura y la anchura.
 *
 * 
 * @author Guillermo García
 */

import java.util.Scanner;

public class Examen1314Repesca2 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);
    int altura = 0;
    int anchura = 0;

    do {
      System.out.print("\033[1mPor favor, Introduzca la altura de la L:\033[0m ");
      altura = s.nextInt();
      if (altura < 0) {
        System.out.println("La altura debe ser un número entero positivo.");
      }
    } while (altura < 0);

    do {
      System.out.print("\033[1mPor favor, Introduzca la anchura de la L:\033[0m ");
      anchura = s.nextInt();
      if (anchura < 0) {
        System.out.println("La anchura debe ser un número entero positivo.");
      }
    } while (anchura < 0);

    /* Pintamos el lateral de la L */

    for (int i = 1; i <= (altura - 1); i++) {
      System.out.println("*");
    }

    /* Pintamos la base de la L */

    for (int i = 1; i <= anchura; i++){ //Recorremos el numero invertido
      System.out.print("*");
    }
    System.out.println();

  }
}
