/*
 * Solución Ejercicio 25 Tema 6
 * 
 * Escribe un programa que muestre por pantalla 100 números enteros separados por un espacio. Los
 * números deben estar generados de forma aleatoria en un rango entre 10 y 200 ambos incluidos. Los
 * primos deben aparecer entre almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes
 * (p. ej. [25]).
 *  
 * @author Guillermo García
 */


import java.util.Scanner;

public class Ejercicio25 {
  public static void main (String[] args){

    //Scanner s = new Scanner(System.in);

    System.out.print("Vamos a generar 100 números aleatorios entre 10 y 200.\nLos números primos " +
    "iran entre # y los múltiplos de 5 entre []\n\nNúmeros: ");

    for (int i = 1; i <= 100; i++) {
      
      int numero = (int)(Math.random() * 191) + 10; // Generamos un numero aleatorio

      if ((numero % 5) == 0) {
        System.out.print("[" + numero + "] ");
      } else {

        boolean esPrimo = true;
        int divisor = 2;

        do {
          if ((numero % 2) == 0){
            esPrimo = false;
          }
          divisor++;
        } while ((esPrimo) && (divisor <= Math.sqrt(numero)));

        if (esPrimo) {
          System.out.print("#" + numero + "# ");
        } else {
          System.out.print(numero + " ");
        }
      }
    }

  }
}
