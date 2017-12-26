/*
 * Solución Ejercicio 39 Tema 5
 *
 * Escribe un programa que pida un número entero positivo por teclado y que muestre a continuación
 * los números desde el 1 al número introducido junto con su factorial.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio39 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);
    int numero = 0;
    int factorial = 1;

    do {
      System.out.print("\033[1mPor favor, Introduzca un número entero positivo:\033[0m ");
      numero = s.nextInt();
      if (numero <= 0) {
        System.out.println("Solo se aceptan números enteros positivos, mayores de 0.");
      }
    } while (numero <= 0);

    for (int i = 1; i <= numero; i ++){
      for (int j = i; j > 1; j--) {
        factorial *= j;
      }
      System.out.println("El factorial de \033[4m" + i + "!\033[0m es " + factorial);
      factorial = 1;
    }

  }
}
