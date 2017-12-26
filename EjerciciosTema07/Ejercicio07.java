/*
 * Solución Ejercicio 7 Tema 7
 *
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por pantalla
 * separados por espacios. El programa pedirá entonces por teclado dos valores y a continuación
 * cambiará todas las ocurrencias del primer valor por el segundo en la lista generada anteriormente.
 * Los números que se han cambiado deben aparecer entrecomillados.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio07 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    int[] num = new int[100];

    for (int i = 0; i <= (num.length - 1); i++) { // Guardamos en un array los números generados
      num[i] = (int)(Math.random() * 21);
    }

    System.out.println("\nNúmeros generados:");

    for (int i = 0; i <= (num.length - 1); i++){ // Rotamos los números
      System.out.print(" " + num[i]);
    }

    System.out.print("\nPor favor, introduzca el número a modificar entre los generados: ");
    int viejo = s.nextInt();

    System.out.print("Por favor, introduzca el nuevo número: ");
    int nuevo = s.nextInt();

    System.out.print("Tras el cambio los números serian: ");

    for (int i = 0; i < (num.length - 1); i++){
      if (num[i] == viejo) { num[i] = nuevo; }
      System.out.print(" " + num[i]);
    }

  }
}
