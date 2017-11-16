/*
 * Solución Ejercicio 6 Tema 7
 *
 * Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota los
 * elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1, el de
 * la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la posición 0.
 * Finalmente, muestra el contenido del array.
 *  
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio06 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    int[] num = new int[15];

    for (int i = 0; i <= (num.length - 1); i++) { // Guardamos en un array los números que solicitamos
      System.out.print("Por favor, introduzca un entero: ");
      num[i] = s.nextInt();
    }

    System.out.println("\nNúmeros introducidos: ");

    int ultimo = num[num.length - 1]; // Guardamos el último número antes de rotar

    for (int i = (num.length - 1); i >= 1; i--){ // Rotamos los números
      num[i] = num [i-1];
    }
    num[0] = ultimo; // Ponemos en la primera posición el último número previamente guardado

    System.out.print("Los números tras la rotación quedan: ");

    for (int i = 0; i < (num.length - 1); i++){
      System.out.print(num[i] + ", ");
    }
    System.out.print(num[num.length - 1] + ".");



  }
}
