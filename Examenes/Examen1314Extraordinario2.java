/*
 * Solución Ejercicio 2 Examen Extraordinario 2013 2014
 *
 * Realiza un programa que trocee un número introducido por teclado en otros dos números. Un trozo
 * se formará con los dígitos de las posiciones pares y otro trozo con los dígitos de las posiciones
 * impares. Se debe conservar el orden de los dígitos. Da igual el trozo que se muestre primero con
 * tal de que cada trozo esté bien formado.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Examen1314Extraordinario2 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);
    long invertido = 0;
    int longitud = 0;
    long primerTrozo = 0;
    long segundoTrozo = 0;
    
    System.out.print("\033[1mPor favor, Introduzca un número entero:\033[0m ");
    long numero = s.nextInt();
    if (numero < 0) {
      numero *= -1;
    }

    System.out.print("Al dividir el número " + numero + " por sus posiciones quedan estos dos trozos: ");

    /* Le damos la vuelta al número */

    while (numero != 0){
      invertido = (invertido * 10) + (numero % 10);
      numero = numero / 10;
      longitud++;
    }

    for (int i = 1; i <= longitud; i++){ //Recorremos el numero invertido
      long digito = (invertido % 10);
      if ((i % 2) == 0){ // Posiciones Pares
        primerTrozo = (primerTrozo * 10) + digito;
      } else { // Posiciones Impares
        segundoTrozo = (segundoTrozo * 10) + digito;
      }
      invertido = invertido / 10;
    }
    System.out.print("\nPrimer Trozo Posiciones Pares: " + primerTrozo +
     "\nSegundo Trozo Posiciones Impares: " + segundoTrozo + "\n");

  }
}
