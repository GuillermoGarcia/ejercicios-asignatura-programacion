/*
 * Solución Examen 15/16 Trimestre 2 Control 1 Modelo A Ejercicio 2
 * 
 * Realiza un programa que, a partir de un array de 4 filas por 6 columnas con números generados al
 * azar entre 10 y 99, muestre a la derecha los mínimos de la fila y debajo los máximos de las
 * columnas.
 *
 * @author Guillermo García
 */


import java.util.Scanner;

public class Examen1516t2c1ma2 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);
    int[][] array = new int[4][6];
    int[] minimo = {100,100,100,100};
    int[] maximo = {0,0,0,0,0,0};

    System.out.println("Creamos un array bidimensional de 4x6 con valores aleatorios.\n");

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        array[i][j] = ((int)(Math.random() * 90) + 10);
        if (minimo[i] > array[i][j]){
          minimo[i] = array[i][j];
        }
        if (maximo[j] < array[i][j]){
          maximo[j] = array[i][j];
        }
      }
    }

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println("| " + minimo[i]);
    }
    System.out.println("---------------");
    for (int i = 0; i < maximo.length; i++) {
      System.out.print(maximo[i] + " ");
    }

  }
}
