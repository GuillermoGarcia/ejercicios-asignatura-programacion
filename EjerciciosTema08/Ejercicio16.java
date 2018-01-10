/*
 * Muestra los números capicúa que hay entre 1 y 99999.
 * 
 * @author: Guillermo García
 */

import ejerciciostema8.Ejercicios1a14Tema8;


public class Ejercicio16 {
  
  public static void main (String[] args) {

    for (int i = 1; i <= 99999; i++){

      if (Ejercicios1a14Tema8.esCapicua(i)){
        System.out.println("El numero " + i + " es Capicua.");
      }
    }

  }
}

