/*
 * Solución Ejercicio 43 Tema 5
 *
 * Escribe un programa que permita partir un número introducido por teclado en dos partes. Las
 * posiciones se cuentan de izquierda a derecha empezando por el 1. Suponemos que el usuario
 * introduce correctamente los datos, es decir, el número introducido tiene dos dígitos como mínimo
 * y la posición en la que se parte el número está entre 2 y la longitud del número. No se permite
 * en este ejercicio el uso de funciones de manejo de String (por ej. para extraer subcadenas dentro
 * de una cadena).
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio43 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);
    long numero = 0;
    long temp = 0;
    int longitud = 0;
    
    do {
      System.out.print("\033[1mPor favor, Introduzca un número entero positivo:\033[0m ");
      numero = s.nextLong();
    } while (numero < 0);

    System.out.print("\033[1mPor favor, Introduzca la posición por la que partir el número:\033[0m ");
    int posicion = s.nextInt();

    System.out.print("El número " + numero + " partido por la posición " + posicion +
    " resulta en los numeros: \033[4m");

    do {
      temp = (temp * 10) + (numero % 10);
      numero = numero / 10;
      longitud++;
    } while (numero > 0);

    for (int i = 1; i < posicion; i++) {
      numero = (numero * 10) + (temp % 10);
      temp = temp / 10;
    }

    System.out.print(numero + "\033[0m y \033[4m");
    numero = 0;

    for (int i = 1; i <= (longitud - posicion + 1); i++) {
      numero = (numero * 10) + (temp % 10);
      temp = temp / 10;
    }

    System.out.println(numero + "\033[0m.");
    
  }
}
