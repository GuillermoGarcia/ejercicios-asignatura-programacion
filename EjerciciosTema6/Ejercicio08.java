/*
 * Solución Ejercicio 8 Tema 6
 * 
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14
 * partidos y el pleno al quince (15 filas).
 * Modifica el programa anterior para que la probabilidad de que salga un 1 sea de 1/2, la
 * probabilidad de que salga x sea de 1/3 y la probabilidad de que salga 2 sea de 1/6.
 * Pista: 1/2 = 3/6 y 1/3 = 2/6.
 *  
 * @author Guillermo García
 */


import java.util.Scanner;

public class Ejercicio08 {
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
        int azar = (int)(Math.random()*6);
        switch (azar) {
          case 0:
          case 1:
          case 2: System.out.printf("%5s", "1"); break;
          case 3: System.out.printf("%5s", "2"); break;
          default: System.out.printf("%5s", "X");
        }
        System.out.printf("%5s", " ");
      }
      System.out.println();
    }
    System.out.print("Pleno al Quince: ");
    int azar = (int)(Math.random()*6);
    switch (azar) {
      case 0:
      case 1:
      case 2: System.out.println("1"); break;
      case 3: System.out.println("2"); break;
      default: System.out.println("X");
    }
  }
}
