/*
 * Solución Ejercicio 4 Tema 7
 *
 * Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo. Carga el
 * array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben almacenar los
 * cuadrados de los valores que hay en el array numero. En el array cubo se deben almacenar los
 * cubos de los valores que hay en numero. A continuación, muestra el contenido de los tres arrays
 * dispuesto en tres columnas.
 *  
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio04 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];

    /*
     * Generamos 20 números aleatorios que guardamos en el array numero
     * En el array cuadrado guardamos los cuadrados de los números generados
     * En el array cubo guardamos los cubos de los números generados
     */
     
    for (int i = 0; i <= 19; i++) {
      numero[i] = (int)(Math.random() * 101);
      cuadrado[i] = numero[i] * numero[i];
      cubo[i] = cuadrado[i] * numero[i];
    }

    System.out.println("Número  Cuadrado Cubo%n");

    for (int i = 0; i <= 19; i++){ // Recorremos el array del final al principio
      System.out.printf("%-6d  %-8d %-8d%n",numero[i], cuadrado[i], cubo[i]);
    }
  }
}
