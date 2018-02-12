/*
 * Solución Examen 15/16 Trimestre 2 Control 1 Modelo A Ejercicio 1
 * 
 * Realiza el programa bomba numérica. En primer lugar, el programa debe generar y mostrar por
 * pantalla un array de 5 filas por 8 columnas con números aleatorios entre 100 y 200. A
 * continuación se le preguntará al usuario las coordenadas donde quiere hacer explotar la bomba.
 * Justo en la posición donde explota la bomba, el número se multiplica por 2. Los números
 * adyacentes a éste se multiplican por 3 y los números adyacentes a éstos últimos se multiplican
 * por 4. La bomba se puede hacer explotar en cualquier parte del array, incluso en los bordes.
 *
 * @author Guillermo García
 */


import java.util.Scanner;

public class Examen1516t2c1ma1 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);
    int[][] array = new int[5][8];


    System.out.println("Creamos un array bidimensional de 5x8 con valores aleatorios.\n");

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        array[i][j] = ((int)(Math.random() * 101) + 100);
      }
    }

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("¿Donde desea explotar la bomba númerica?");
    System.out.print("Fila(1 - 5): ");
    int f = s.nextInt() - 1;
    System.out.print("Columna(1 - 8): ");
    int c = s.nextInt() - 1;

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        if ((i == f) && (j == c)){
          array[i][j] *= 2;
        } else if (((Math.abs(i - f) + Math.abs(j - c)) <= 2) && (Math.abs(i - f) <= 1)
         && (Math.abs(j - c) <= 1)){
          array[i][j] *= 3;
        } else if (((Math.abs(i - f) + Math.abs(j - c)) <= 4) && (Math.abs(i - f) <= 2)
         && (Math.abs(j - c) <= 2)){
          array[i][j] *= 4;
        }
      }
    }

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }

  }
}
