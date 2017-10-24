/*
 * Solución Ejercicio 21 Tema 5
 *
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y nos
 * diga cuantos números se han introducido, la media de los impares y el mayor de los pares. El
 * número negativo sólo se utiliza para indicar el final de la introducción de datos pero no se
 * incluye en el cómputo.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio21 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    int total = 0;
    int entrada = 0;
    double mediaImpares = 0;
    int cantidadImpares = 0;
    int mayorPar = Integer.MIN_VALUE;

    System.out.println("Introduzca cuantos números positivos desee, para finalizar introduzca un"+
    "número negativo.");

    System.out.print("Nuevo dato: ");
    entrada = s.nextInt();

    while (entrada >=0) {

      if(entrada > 0) { total++; }

      if ((entrada % 2) == 0){
        if (entrada > mayorPar) {
          mayorPar = entrada;
        }
      } else {
        mediaImpares += entrada;
        cantidadImpares++;
      }
      System.out.print("Nuevo dato: ");
      entrada = s.nextInt();

    }

    mediaImpares = mediaImpares / cantidadImpares;

    System.out.println();
    System.out.println("Se han introducido un total de " + total + " números.");
    System.out.println("La media de los " + cantidadImpares + " números impares introducidos es "
    + mediaImpares + ".");
    System.out.println("El mayor par introducido ha sido el número " + mayorPar + ".");

  }
}
