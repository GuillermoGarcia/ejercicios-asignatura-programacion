/*
 * Muestra los números primos que hay entre 1 y 1000.
 * 
 * @author: Guillermo García
 */

import ejerciciostema8.Ejercicios1a14Tema8;


public class Ejercicio15 {
  
  public static void main (String[] args) {

    for (int i = 1; i <= 1000; i++){

      if (Ejercicios1a14Tema8.esPrimo(i)){
        System.out.println("El numero " + i + " es primo.");
      }
    }

  }
}

