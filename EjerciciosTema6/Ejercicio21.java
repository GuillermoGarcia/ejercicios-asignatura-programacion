/*
 * Solución Ejercicio 21 Tema 6
 * 
 * Realiza un programa que genere una secuencia de cinco monedas de curso legal lanzadas al aire.
 * Las monedas disponibles son de 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 20 céntimos, 50
 * céntimos, 1 euro y 2 euros. Las dos posiciones posibles son cara y cruz.
 *  
 * @author Guillermo García
 */


import java.util.Scanner;

public class Ejercicio21 {
  public static void main (String[] args){

    
    Scanner s = new Scanner(System.in);

    int maximoPar = Integer.MIN_VALUE; // Inicializamos al valor mas pequeño de Integer
    int minimoImpar = Integer.MAX_VALUE; // Inicializamos al valor mas grande de Integer
    int suma = 0; // Inicializamos la variable a 0


    System.out.println("Vamos a lanzar 5 monedas al aire veamos si sale cara o cruz: ");

    for (int i = 1; i <= 5; i++) {

      switch(i){
        case 1: System.out.print("2 céntimos - "); break; // Moneda de 2 céntimos
        case 2: System.out.print("20 céntimos - "); break; // Moneda de 20 céntimos
        case 3: System.out.print("50 céntimos - "); break; // Moneda de 50 céntimos
        case 4: System.out.print("1 euro - "); break; // Moneda de 1 euro
        default: System.out.print("2 euros - "); // Moneda de 2 euros
      }

      switch ((int)(Math.random() * 2)){
        case 1: System.out.println("cara"); break;
        default: System.out.println("cruz");
      }

    }

  }
}
