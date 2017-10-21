/*
 * Solución Ejercicio 22 Tema 5
 *
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 *
 * @author Guillermo García
 */


public class Ejercicio22 {
  public static void main (String[] args){

    System.out.print("Los números primos entre el 2 y el 100, ambos inclusives son: ");

    for (int i = 2; i <= 100; i++) {

      int divisor = 2;
      boolean esPrimo = true;
      while ((esPrimo) && (divisor < i)) {
        if ((i % divisor) != 0) {
          divisor++;
        } else {
          esPrimo = false;
        }
      }
      if (esPrimo) {
        if (i == 2) {
          System.out.print(i);
        } else {
          System.out.print(", " + i);
        }
      }

    }

    System.out.println(".");

  }
}
