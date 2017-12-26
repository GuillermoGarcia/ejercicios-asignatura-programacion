/*
 * Solución Ejercicio 20 Tema 6
 * 
 * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de agua. La capacidad
 * será indicada por el usuario. La cuba se llenará con una cantidad aleatoria de agua que puede ir
 * entre 0 y la capacidad máxima que pueda admitir. El ancho de la cuba no varía.
 *  
 * @author Guillermo García
 */


import java.util.Scanner;

public class Ejercicio20 {
  public static void main (String[] args){

    
    Scanner s = new Scanner(System.in);

    int maximoPar = Integer.MIN_VALUE; // Inicializamos al valor mas pequeño de Integer
    int minimoImpar = Integer.MAX_VALUE; // Inicializamos al valor mas grande de Integer
    int suma = 0; // Inicializamos la variable a 0


    System.out.print("Por favor, indicame la capacidad de la cuba: ");

    int capacidad = s.nextInt(); // Leemos la capacidad máxima de la cuba

    int agua = (int)(Math.random() * capacidad); // Generamos la cantidad de agua aleatoriamente

    System.out.println();

    for (int i = 1; i <= capacidad; i++) {

      System.out.print("*"); // Pintamos el exterior de la cuba

      if ((capacidad - agua) < i) {
        System.out.print("===="); // Rellenamos de agua
      } else {
        System.out.print("    "); // No rellenamos de agua
      }

      System.out.println("*"); // Pintamos el exterior de la cuba
    }

    System.out.println("******"); // Pintamos la base de la cuba

    System.out.println("La cuba tiene una capacidad máxima de " + capacidad + " litros y contiene "
     + agua + " litros de agua");
  }
}
