/*
 * Solución Ejercicio 29 Tema 5
 *
 * Escribe un programa que muestre por pantalla todos los números enteros positivos menores a uno
 * leído por teclado que no sean divisibles entre otro también leído de igual forma.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio29 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    long factorial = 1;
    int maximo = 0;
    int divisor = 0;
    boolean primero = true;

    do {
      System.out.print("\033[1mPor favor, Introduzca un número entero positivo: \033[0m");
      maximo = s.nextInt();
    } while (maximo < 1);

    do {
      System.out.print("\033[1mPor favor, Introduzca un segundo número entero positivo: \033[0m");
      divisor = s.nextInt();
    } while (divisor < 1);

    System.out.print("Los números ");

    for (int i = maximo; i >= 1; i--) {
      if ((i % divisor) != 0) {
        if (primero) {
          System.out.print(i);
          primero = false;
        } else {
          System.out.print(", " + i);
        }
      }
    }

    System.out.println(" no son divisibles por " + divisor + ".");

  }
}
