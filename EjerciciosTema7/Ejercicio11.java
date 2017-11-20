/*
 * Solución Ejercicio 11 Tema 7
 *
 * Realiza un programa que pida 10 números por teclado y que los almacene en un array. A
 * continuación se mostrará el contenido de ese array junto al índice (0 – 9) utilizando para ello
 * una tabla. Seguidamente el programa pasará los primos a las primeras posiciones, desplazando el
 * resto de números (los que no son primos) de tal forma que no se pierda ninguno. Al final se debe
 * mostrar el array resultante.
 *  
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio11 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    int[] numeros = new int[10];

    System.out.println("Voy a solicitarle diez números enteros positivos: ");
    for (int i = 0; i <= (numeros.length - 1); i++) { // Guardamos en un array los números
      System.out.print("Escriba un número entero positivo: ");
      numeros[i] = s.nextInt();
    }

    System.out.println("\n La tabla con los números que ha introducido queda así ");

    for (int j = 1; j <= 5; j++){ // Pintamos la tabla
      for (int i = 0; i <= (numeros.length - 1); i++){
        int longitud = String.valueOf(numeros[i]).length(); // Longitud del número
        int mitad = (longitud / 2) + (longitud % 2);

        switch(j) { 
          case 1: if (i == 0) { System.out.print("┌─"); }
                  else { System.out.print("─┬─"); }
                  for (int k = 1; k <= longitud ; k++){ System.out.print("─"); }
                  if (i == (numeros.length - 1)){ System.out.print("─┐"); }
                  break;
          case 2: System.out.print("│ ");
                  for (int k = 1; k <= (mitad -1) ; k++){ System.out.print(" "); }
                  System.out.print(i);
                  for (int k = 1; k <= (longitud - mitad) ; k++){ System.out.print(" "); }
                  System.out.print(" ");
                  if (i == (numeros.length - 1)){ System.out.print("│"); }
                  break;
          case 3: if (i == 0) { System.out.print("├─"); }
                  else { System.out.print("─┼─"); }
                  for (int k = 1; k <= longitud ; k++){ System.out.print("─"); }
                  if (i == (numeros.length - 1)){ System.out.print("─┤"); }
                  break;
          case 4: System.out.print("│ " + numeros[i] + " ");
                  if (i == (numeros.length - 1)){ System.out.print("│"); }
                  break;
          case 5: if (i == 0) { System.out.print("└─"); }
                  else { System.out.print("─┴─"); }
                  for (int k = 1; k <= longitud ; k++){ System.out.print("─"); }
                  if (i == (numeros.length - 1)){ System.out.print("─┘"); }
        }
      }
      System.out.println();
    }

    System.out.println("\nTras mover los números primos al inicio la tabla quedá así");

    int finalFor = 0; // Valor donde parar el bucle for que recorremos del final al inicio

    for (int i = (numeros.length - 1); i >= finalFor; i--){
      boolean esPrimo = true;
      int divisor = 2;
      int numeroActual = numeros[i];

      while ((esPrimo) && (divisor < Math.sqrt(numeroActual))) {
        if ((numeroActual % divisor) != 0) { divisor++; }
        else { esPrimo = false; }
      }

      if (esPrimo) { // Si es primo movemos los números de delante una posición hacia delante
        for (int j = i; j >= 1 ; j--){
          numeros[j] = numeros[j - 1];
        }
        numeros[0] = numeroActual;
        finalFor++;
      }
    }

    for (int j = 1; j <= 5; j++){ // Volvemos a pintar la tabla
      for (int i = 0; i <= (numeros.length - 1); i++){
        int longitud = String.valueOf(numeros[i]).length();
        int mitad = (longitud / 2) + (longitud % 2);

        switch(j) {
          case 1: if (i == 0) { System.out.print("┌─"); }
                  else { System.out.print("─┬─"); }
                  for (int k = 1; k <= longitud ; k++){ System.out.print("─"); }
                  if (i == (numeros.length - 1)){ System.out.print("─┐"); }
                  break;
          case 2: System.out.print("│ ");
                  for (int k = 1; k <= (mitad -1) ; k++){ System.out.print(" "); }
                  System.out.print(i);
                  for (int k = 1; k <= (longitud - mitad) ; k++){ System.out.print(" "); }
                  System.out.print(" ");
                  if (i == (numeros.length - 1)){ System.out.print("│"); }
                  break;
          case 3: if (i == 0) { System.out.print("├─"); }
                  else { System.out.print("─┼─"); }
                  for (int k = 1; k <= longitud ; k++){ System.out.print("─"); }
                  if (i == (numeros.length - 1)){ System.out.print("─┤"); }
                  break;
          case 4: System.out.print("│ " + numeros[i] + " ");
                  if (i == (numeros.length - 1)){ System.out.print("│"); }
                  break;
          case 5: if (i == 0) { System.out.print("└─"); }
                  else { System.out.print("─┴─"); }
                  for (int k = 1; k <= longitud ; k++){ System.out.print("─"); }
                  if (i == (numeros.length - 1)){ System.out.print("─┘"); }
        }
      }
      System.out.println();
    }

  }
}
