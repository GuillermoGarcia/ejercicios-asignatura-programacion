/*
 * Solución Ejercicio 3 Examen Recuperación Trimestre 1 Año 2015
 *
 * Realiza un programa que pinte una cruz hecha de asteriscos. El programa debe pedir la longitud
 * del brazo de la cruz. El asterisco del centro no cuenta en esa longitud.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Examen1415t1rec3 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);
    int altura = 0;
    long digito = 0;

    System.out.print("\033[1mPor favor, Introduzca la longitud del brazo de la cruz:\033[0m ");
    brazo = s.nextInt();

    while (altura < 0) {
      System.out.println("\033[1mLa longitud del brazo debe ser positiva.\033[0m");
      System.out.print("\033[1mPor favor, ntroduzca la longitud del brazo de la cruz:\033[0m ");
      brazo = s.nextInt();
    }


    for (int i = 1; i <= ((brazo * 2) + 1)  ; i++){
      if (i == (brazo +1)){
        for (int j = 1; j <= ((brazo * 2) + 1)  ; j++){
          System.out.print("*");
        }
      } else {
        for (int j = 2; j < i ; j++){
          System.out.print(" ");
        }
      }

  }
}
