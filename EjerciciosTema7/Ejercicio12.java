/*
 * Solución Ejercicio 12 Tema 7
 *
 * Realiza un programa que pida 10 números por teclado y que los almacene en un array. A
 * continuación se mostrará el contenido de ese array junto al índice (0 – 9). Seguidamente el
 * programa pedirá dos posiciones a las que llamaremos “inicial” y “final”. Se debe comprobar que
 * inicial es menor que final y que ambos números están entre 0 y 9. El programa deberá colocar el
 * número de la posición inicial en la posición final, rotando el resto de números para que no se
 * pierda ninguno. Al final se debe mostrar el array resultante.
 *  
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio12 {
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

    int posInicial = 0;
    int posFinal = 0;

    do {
      System.out.print("\n¿De que posición (0 - 9) quiere mover el valor? ");
      posInicial = s.nextInt();
      if ((posInicial < 0) || (posInicial > 9)) {
        System.out.println("\nLa posición debe estar entre el 0 y el 9");
      }
    } while ((posInicial < 0) || (posInicial > 9));
    
    do {
      System.out.print("¿A que posición (0 - 9) mayor que la anterior quiere mover el valor? ");
      posFinal = s.nextInt();
      if ((posFinal < 0) || (posFinal > 9)) {
        System.out.println("\nLa posición debe estar entre el 0 y el 9");
      }
      if (posFinal < posInicial) {
        System.out.println("\nLa posición a la que mover el valor debe ser mayor a la posición" +
        " actual");
      }
    } while (((posFinal < 0) || (posFinal > 9)) || (posFinal < posInicial));

    int valor = numeros[posInicial];

    for (int i = posInicial; i < posFinal; i++){
      numeros[i] = numeros[i + 1];
    }
    numeros[posFinal] = valor;

    System.out.println("\nTras mover el valor de la posición " + posInicial + " a la posición " +
    posFinal + " la tabla queda así: ");

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
