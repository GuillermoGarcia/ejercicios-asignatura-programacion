/*
 * Solución Ejercicio 8 Tema 7
 *
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de un determinado año
 * y que muestre a continuación un diagrama de barras horizontales con esos datos. Las barras del
 * diagrama se pueden dibujar a base de asteriscos o cualquier otro carácter.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio08 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre",
    "Octubre","Noviembre","Diciembre"};
    int[] media = new int[12];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;

    for (int i = 0; i <= (meses.length - 1); i++) {
      System.out.print("¿Cual fue la temperatura media en el mes de " + meses[i] + "?: ");
      media[i] = s.nextInt();
      if (media[i] > maximo) { maximo = media[i]; }
      if (media[i] < minimo) { minimo = media[i]; }
    }


    for (int i = maximo; i >= minimo; i--) {
      if ((i  % 2) == 0) {
        System.out.printf("%-2d...",i);
      } else {
        System.out.printf("%-2d   ",i);
      }
      for (int j = 0; j <= (media.length - 1); j++) {
        if (media[j] >= i) {
          if ((i  % 2) == 0) {
            System.out.print(".....▓▓.....");
          } else {
            System.out.print("     ▓▓     ");
          }
        } else {
          if ((i  % 2) == 0) {
            for (int k = 1; k <= 12; k++) {
              System.out.print(".");
            }
          } else {
            System.out.printf("%-12s","  ");
          }
        }
      }
      System.out.println();
    }

    System.out.print("     ");

    for (int j = 0; j <= (meses.length - 1); j++) {
      System.out.printf("%-12s",meses[j]);
    }

    System.out.println();

  }
}
