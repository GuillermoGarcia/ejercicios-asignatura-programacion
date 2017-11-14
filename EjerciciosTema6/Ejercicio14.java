/*
 * Solución Ejercicio 14 Tema 6
 * 
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El programa
 * intentará adivinar el número que estás pensando - un número entre 0 y 100 - teniendo para ello 5
 * oportunidades. En cada intento fallido, el programa debe preguntar si el número que estás
 * pensando es mayor o menor que el que te acaba de decir.
 *  
 * @author Guillermo García
 */


import java.util.Scanner;

public class Ejercicio14 {
  public static void main (String[] args){

    
    Scanner s = new Scanner(System.in);

    System.out.println("Piensa un número entre 0 y 100. Voy a intentar adivinarlo.");

    int azar = 0;
    int contador = 0;
    boolean noAdivinado = true;
    int opc = 0;
    int maximo = 101;
    int minimo = 0;

    azar = (int)(Math.random()*101);

    do {

      contador++;
      System.out.println("¿Estas pensando en el número " + azar + " ? ");
      System.out.println("  Opción 1: El número que estoy pensando es mayor.");
      System.out.println("  Opción 2: El número que estoy pensando es menor.");
      System.out.println("  Opción 3: ¡Has acertado!.");
      System.out.print("  Opción: ");
      opc = s.nextInt();

      switch (opc) {
        case 1: minimo = azar; break;
        case 2: maximo = azar + 1; break;
        case 3: noAdivinado = false; break;
      }

      azar = (int)(Math.random()*(maximo - minimo)) + minimo;

    } while ((noAdivinado) && (contador < 5));

    if (!noAdivinado){
      System.out.println("\nHe acertado el número en " + contador + " intentos.");
    } else {
      System.out.println("\nNo he conseguido acertar el número tras mis 5 intentos.");
    }
  }
}
