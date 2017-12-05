/*
 * Solución Ejercicio 2 Tema 7 Bidimensional
 * 
 * Escribe un programa que pida 20 números enteros. Estos números se deben introducir en un array de
 * 4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y columnas igual que si
 * de una hoja de cálculo se tratara. La suma total debe aparecer en la esquina inferior derecha.
 *  
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio02b {
  public static void main (String[] args){

    final int filas = 4;
    final int columnas = 5;

    int[][] num = new int[filas][columnas];
    Scanner s = new Scanner(System.in);
    int total = 0;
    
    System.out.println("Voy a solicitarle 20 números enteros.");

    for (int i = 0; i <= (filas - 1); i++){ // Filas
      for (int j = 0; j <= (columnas - 1); j++){  // Columnas
        System.out.print(((i * columnas) + j + 1) + ". Introduzca un número entero: ");
        num[i][j] = s.nextInt();
      }
    }

    System.out.println("┌──────────┬──────────┬──────────┬──────────┬──────────┬┬──────────┐");

    for (int i = 0; i <= (filas - 1); i++){ // Pintamos las filas
      System.out.print("│");
      int suma = 0;
      for (int j = 0; j <= (columnas - 1); j++){  // Pintamos las columnas
        int esp = 10 - Integer.toString(num[i][j]).length();
        int mitad = (esp / 2) + (esp % 2);
        for (int k = 1; k <= mitad ; k++){ System.out.print(" "); }
        System.out.print(num[i][j]);
        for (int k = 1; k <= (esp - mitad) ; k++){ System.out.print(" "); }
        System.out.print("│");
        suma += num[i][j];
      }

      if (i <= (filas - 1)){
        System.out.print("│");
        int esp = 10 - Integer.toString(suma).length();
        int mitad = (esp / 2) + (esp % 2);
        for (int k = 1; k <= mitad ; k++){ System.out.print(" "); }
        System.out.print(suma);
        for (int k = 1; k <= (esp - mitad) ; k++){ System.out.print(" "); }
        System.out.print("│");
        System.out.println();
        System.out.println("├──────────┼──────────┼──────────┼──────────┼──────────┼┼──────────┤");
      }

      total += suma;
    }

    for (int j = 0; j <= (columnas - 1); j++){ // Columnas
      System.out.print("│");
      int suma = 0;
      for (int i = 0; i <= (filas - 1); i++){  // Filas
        suma += num[i][j];
      }
      int esp = 10 - Integer.toString(suma).length();
      int mitad = (esp / 2) + (esp % 2);
      for (int k = 1; k <= mitad ; k++){ System.out.print(" "); }
      System.out.print(suma);
      for (int k = 1; k <= (esp - mitad) ; k++){ System.out.print(" "); }
      total += suma;
    }
    System.out.print("││");
    int esp = 10 - Integer.toString(total).length();
    int mitad = (esp / 2) + (esp % 2);
    for (int k = 1; k <= mitad ; k++){ System.out.print(" "); }
    System.out.print(total);
    for (int k = 1; k <= (esp - mitad) ; k++){ System.out.print(" "); }
    System.out.println("│");

    System.out.println("└──────────┴──────────┴──────────┴──────────┴──────────┴┴──────────┘");
  }
}
