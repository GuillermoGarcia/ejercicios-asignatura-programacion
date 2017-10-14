/*
 * Solución Ejercicio 18 Tema 4
 *
 * Escribe un programa que diga cuál es la primera cifra de un número entero introducido por
 * teclado. Se permiten números de hasta 5 cifras.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio18 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número entero de máximo 5 cifras: ");

    int numero = s.nextInt();
    int primeraCifra = 0;

    if (numero < 10){
      primeraCifra = numero;
    } else if (numero < 100) {
      primeraCifra = numero / 10;
    } else if (numero < 1000) {
      primeraCifra = numero / 100;
    } else if (numero < 10000) {
      primeraCifra = numero / 1000;
    } else {
      primeraCifra = numero / 10000;
    }

    System.out.printf("La primera cifra del número %d es %d.\n", numero, primeraCifra);



  }
}
