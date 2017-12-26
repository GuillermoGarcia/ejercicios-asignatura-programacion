/*
 * Solución Ejercicio 10 Tema 7
 *
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en
 * un array. El programa debe ser capaz de pasar todos los números pares a las primeras posiciones
 * del array (del 0 en adelante) y todos los números impares a las celdas restantes. Utiliza arrays
 * auxiliares si es necesario.
 *  
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio10 {
  public static void main (String[] args){

    //Scanner s = new Scanner(System.in);

    int[] numeros = new int[20];
    int posPar = 0; // Posicion Actual de los números pares
    int posImpar = numeros.length - 1; // Posicion Actual de los números impares

    for (int i = 0; i <= (numeros.length - 1); i++) { // Guardamos en un array los números generados
      int numero = (int)(Math.random() * 101);
      if ((numero % 2 ) == 0) { // Si el número par lo guardamos en la posicion posPar
        numeros[posPar] = numero;
        posPar++;
      } else { // Si no, el número es impar y lo guardamos en la posicion posImpar
        numeros[posImpar] = numero;
        posImpar--;
      }
      
    }

    System.out.println("\n Los números generados aleatoriamente, pares primero, son: ");

    for (int i = 0; i < (numeros.length - 1); i++){
      System.out.printf(numeros[i] + ", ");
    }
    System.out.printf(numeros[numeros.length -1] + ".");
  }
}
