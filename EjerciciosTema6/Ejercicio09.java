/*
 * Solución Ejercicio 9 Tema 6
 * 
 * Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no termine de
 * generar números hasta que no saque el 24. El programa deberá decir al final cuántos números se
 * han generado.
 *  
 * @author Guillermo García
 */


import java.util.Scanner;

public class Ejercicio09 {
  public static void main (String[] args){

    
    //Scanner s = new Scanner(System.in);

    System.out.println("Vamos a ir generando números aleatorios hasta que generemos un 24.");
    boolean primero = true;
    int contador = 0;
    int azar = 0;

    do {
      azar = (int)(Math.random()*101);
      contador++;
      if (primero) {
        System.out.print(azar);
        primero = false;
      } else {
        System.out.print(", " + azar);
      }
    } while (azar != 24);
    System.out.println(".\nHemos generado aleatoriamente un total de " + contador + " números.");

  }
}
