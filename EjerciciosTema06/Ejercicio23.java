/*
 * Solución Ejercicio 23 Tema 6
 * 
 * Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8. Escribe un
 * programa que genere de forma aleatoria la tirada de cinco dados.
 *  
 * @author Guillermo García
 */


import java.util.Scanner;

public class Ejercicio23 {
  public static void main (String[] args){

    //Scanner s = new Scanner(System.in);

    System.out.println("Vamos a lanzar cinco dados de poker: ");

    for (int i = 1; i <= 5; i++) {

      switch ((int)(Math.random() * 7)) {
        case 1: System.out.print("As "); break; // Ha salido un As
        case 2: System.out.print("K "); break; // Ha salido un K
        case 3: System.out.print("Q "); break; // Ha salido un Q
        case 4: System.out.print("J "); break; // Ha salido un J
        case 5: System.out.print("7 "); break; // Ha salido un 7
        default: System.out.print("8 "); // Ha salido un 8
      }

    }

  }
}
