/*
 * Solución Ejercicio 13 Tema 6
 * 
 * Escribe un programa que simule la tirada de dos dados. El programa deberá continuar tirando los
 * dados una y otra vez hasta que en alguna tirada los dos dados tengan el mismo valor.
 *  
 * @author Guillermo García
 */


import java.util.Scanner;

public class Ejercicio13 {
  public static void main (String[] args){

    
    //Scanner s = new Scanner(System.in);

    System.out.println("Vamos a generar tiradas de dados hasta que salga la misma en ambos.");

    int i = 0;
    int dado1 = 0;
    int dado2 = 0;

    do {
      
      dado1 = (int)(Math.random()*6) + 1;
      dado2 = (int)(Math.random()*6) + 1;
      i++;
      System.out.println("Tirada " + i + ": " + dado1 + ", " + dado2);

    } while (dado1 != dado2);
  }
}
