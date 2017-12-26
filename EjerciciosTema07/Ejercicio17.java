/*
 * Solución Ejercicio 17 Tema 7
 *
 * Escribe un programa que muestre por pantalla un array de 10 números enteros generados al azar
 * entre 0 y 100. A continuación, el programa debe pedir un número al usuario. Se debe comprobar que
 * el número introducido por teclado se encuentra dentro del array, en caso contrario se mostrará un
 * mensaje por pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
 * correctamente. A continuación, el programa rotará el array hacia la derecha las veces que haga
 * falta hasta que el número introducido quede situado en la posición 0 del array. Por último, se
 * mostrará el array rotado por pantalla.
 *  
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio17 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    int[] numeros = new int[10];

    System.out.println("Voy a generar 10 números aleatorios.");
    for (int i = 0; i <= (numeros.length - 1); i++) { // Guardamos en un array los números generados
      numeros[i] = (int)(Math.random() * 101);
    }

    System.out.println("\n La tabla con las numeros generados es: ");

    for (int j = 1; j <= 5; j++){ // Pintamos la tabla
      for (int i = 0; i <= (numeros.length - 1); i++){
        int longitud = Integer.max(Integer.toString(numeros[i]).length(),
                        Integer.toString(i).length()); // Longitud del número
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
                  int fin = longitud - mitad - Integer.toString(i).length() + 1;
                  for (int k = 1; k <= fin ; k++){ System.out.print(" "); }
                  System.out.print(" ");
                  if (i == (numeros.length - 1)){ System.out.print("│"); }
                  break;
          case 3: if (i == 0) { System.out.print("├─"); }
                  else { System.out.print("─┼─"); }
                  for (int k = 1; k <= longitud ; k++){ System.out.print("─"); }
                  if (i == (numeros.length - 1)){ System.out.print("─┤"); }
                  break;
          case 4: System.out.print("│ " + numeros[i] + " ");
                  if (longitud > Integer.toString(numeros[i]).length()) { System.out.print(" "); }
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

    int pos = -1;
    int numero;
    do {
      System.out.print("\n¿Qué número de la tabla desea que aparezca en la primera posición?: ");
      numero = s.nextInt();
      for (int i = 0; i <= (numeros.length - 1); i++){
        if (numero == numeros[i]) { pos = i; }
      }
    } while (pos < 0);

    System.out.println("\nTras rotar la tabla para que el numero " + numero + " quede en la primera " + 
    "posición, la tabla queda: ");

    int temp[] = new int[numeros.length];
    for (int i = 0; i <= (temp.length - 1); i++){
      temp[i] = numeros[pos];
      if (pos == (numeros.length - 1)) { pos = 0; }
      else { pos++; }
    }
    numeros = temp;

    for (int j = 1; j <= 5; j++){ // Volvemos a pintar la tabla
      for (int i = 0; i <= (numeros.length - 1); i++){
        int longitud = Integer.max(Integer.toString(numeros[i]).length(),
                        Integer.toString(i).length()); // Longitud del número
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
                  int fin = longitud - mitad - Integer.toString(i).length() + 1;
                  for (int k = 1; k <= fin ; k++){ System.out.print(" "); }
                  System.out.print(" ");
                  if (i == (numeros.length - 1)){ System.out.print("│"); }
                  break;
          case 3: if (i == 0) { System.out.print("├─"); }
                  else { System.out.print("─┼─"); }
                  for (int k = 1; k <= longitud ; k++){ System.out.print("─"); }
                  if (i == (numeros.length - 1)){ System.out.print("─┤"); }
                  break;
          case 4: System.out.print("│ " + numeros[i] + " ");
                  if (longitud > Integer.toString(numeros[i]).length()) { System.out.print(" "); }
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
