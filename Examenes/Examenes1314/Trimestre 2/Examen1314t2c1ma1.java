/*
 * Solución Ejercicio 1 Examen Trimestre 2 Control 1 Modelo A Año 2013
 *
 * Realiza un programa que muestre por pantalla un array de 10 filas por 10 columnas relleno con
 * números aleatorios entre 200 y 300. A continuación, el programa debe mostrar los números de la
 * diagonal que va desde la esquina superior izquierda a la esquina inferior derecha, así como el
 * máximo, el mínimo y la media de los números que hay en esa diagonal.
 *
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Examen1314t2c1ma1 {
  public static void main (String[] args){


    //Scanner s = new Scanner(System.in);
    int[][] x = new int[10][10];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int media = 0;

    for (int i = 0; i < x.length; i++){
      for (int j = 0; j < x[0].length; j++){
        x[i][j] = (int)(Math.random() * 101) + 200;
      }
    }
    
    for (int i = 0; i < x.length; i++){
      if (x[i][i] > max ) { max = x[i][i]; }
      if (x[i][i] < min ) { min = x[i][i]; }
      media += x[i][i];
    }

    System.out.println("Array 10x10 con números generados aleatoriamente entre 200 y 300:");


    for (int[] a : x) {
      for (int b : a) {
        System.out.print(b + ", ");
      }
      System.out.println();
    }
    System.out.println();

    System.out.println("El valor mínimo del array es: " + min);
    System.out.println("El valor máximo del array es: " + max);
    System.out.println("La media del array es: " + (media / x.length));

  }
}
