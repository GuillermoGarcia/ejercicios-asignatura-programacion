/*
 * Solución Ejercicio 7 Tema 6
 * 
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14
 * partidos y el pleno al quince (15 filas).
 *  
 * @author Guillermo García
 */


import java.util.Scanner;

public class Ejercicio07 {
  public static void main (String[] args){

    
    Scanner s = new Scanner(System.in);
    int partido = 5;
    int prueba = 0;
    System.out.println("Quiniela:");
    System.out.println("            Columna 1 Columna 2 Columna 3");
    for (int i = 1; i <= 14; i++) {
      if (i > 9) {
        System.out.print("Partido " + i + ": ");
      } else {
        System.out.print("Partido  " + i + ": ");
      }
      for (int j = 1; j <= 3; j++) {
        int azar = (int)(Math.random()*3);
        switch (azar) {
          case 1: System.out.printf("%5s", "1"); break;
          case 2: System.out.printf("%5s", "2"); break;
          default: System.out.printf("%5s", "X");
        }
        System.out.printf("%5s", " ");
      }
      System.out.println();
    }
    System.out.print("Pleno al Quince: ");
    int azar = (int)(Math.random()*3);
    switch (azar) {
      case 1: System.out.println("1"); break;
      case 2: System.out.println("2"); break;
      default: System.out.println("X");
    }
  }
}
