/*
 * Solución Ejercicio 24 Tema 6
 * 
 * Escribe un programa que, dado un número introducido por teclado, elija al azar uno de sus dígitos.
 *  
 * @author Guillermo García
 */


import java.util.Scanner;

public class Ejercicio24 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    System.out.println("Voy a escoger un dígito de tu número.");
    System.out.print("Por favor, introduza un número entero positivo: ");

    int numero = s.nextInt();
    int longitud = 0; // Tamaño del número
    int reves = 0; // Número al reves

    while (numero > 0){ // Le damos la vuelta al número
      reves = (reves * 10) + (numero % 10);
      numero = numero / 10;
      longitud++;
    }

    int posicion = (int)(Math.random() * longitud) + 1; // Posición aleatoria entre 1 y longitud

    for (int i = 2; i <= posicion; i++) { // Buscamos el valor de dicha posición
      reves = reves / 10;
    }

    System.out.println("Me gusta el digito " + (reves % 10) + " el cual es está en la posición "
    + posicion);

  }
}
