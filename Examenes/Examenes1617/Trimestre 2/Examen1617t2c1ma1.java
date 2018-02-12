/*
 * Solución Examen 16/17 Trimestre 2 Control 1 Modelo A Ejercicio 1
 * 
 * Realiza un programa que, a partir de un array de 5 filas por 5 columnas con números generados al
 * azar entre 10 y 99, muestre a la derecha la cantidad de múltiplos de 5 encontrados en la fila y
 * que muestre debajo de cada columna el valor mínimo encontrado en esa columna.
 *  
 * @author Guillermo García
 */


import java.util.Scanner;

public class Examen1617t2c1ma1 {
  public static void main (String[] args){

    //Scanner s = new Scanner(System.in);
    int[][] array = new int[5][5];
    int[] minimo = {100,100,100,100,100};
    int[] multiplos = {0,0,0,0,0};

    System.out.println("Vamos a crear un array bidimensional de 5x5 con valores aleatorios.\n");

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        array[i][j] = ((int)(Math.random() * 90) + 10);
        if (minimo[j] > array[i][j]){
          minimo[j] = array[i][j];
        }
        if ((array[i][j] % 5) == 0){
          multiplos[i]++;
        }
      }
    }

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println("| " + multiplos[i]);
    }
    System.out.println("---------------");
    for (int i = 0; i < 5; i++) {
      System.out.print(minimo[i] + " ");
    }
  }
}
