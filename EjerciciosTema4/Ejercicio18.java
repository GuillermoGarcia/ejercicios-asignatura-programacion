/*
 * Solución Ejercicio 18 Tema 4
 *
 * Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio18 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número entero: ");

    long numero = s.nextLong();
    String ultimaCifra = Long.toString(numero);
    ultimaCifra.substring(ultimaCifra.lenght()-1,1);

    switch(Integer.parseInt(ultimaCifra)){
      case 1: System.out.println(); break;
    }



  }
}
