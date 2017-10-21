/*
 * Solución Ejercicio 23 Tema 5
 *
 * Escribe un programa que permita ir introduciendo una serie indeterminada de números mientras su
 * suma no supere el valor 10000. Cuando esto último ocurra, se debe mostrar el total acumulado,
 * el contador de los números introducidos y la media.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio23 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);
    String bl = "\033[1;5;7;100m%\033[0m ";

    System.out.println("Introduzca cuantos números desee.");

    int total = 0;
    int acumulado = 0;

    do{
      System.out.printf("%s",bl);
      int entrada = s.nextInt();
      total++;
      acumulado += entrada;
    } while (acumulado <= 10000);

    System.out.printf("Se han introducido %s números en total, la suma acumulada es de %s y la"
    + " media es de %.4f",total,acumulado,(double)(acumulado/total));

  }
}
