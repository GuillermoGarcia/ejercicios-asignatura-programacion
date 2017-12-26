/*
 * Solución Ejercicio 16 Tema 7
 *
 * Escribe un programa que rellene un array de 20 elementos con números enteros aleatorios
 * comprendidos entre 0 y 400 (ambos incluidos). A continuación el programa mostrará el array y
 * preguntará si el usuario quiere resaltar los múltiplos de 5 o los múltiplos de 7. Seguidamente
 * se volverá a mostrar el array escribiendo los números que se quieren resaltar entre corchetes.
 *  
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio16 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    int[] numeros = new int[20];

    System.out.println("Voy a generar 20 números aleatorios.");
    for (int i = 0; i <= (numeros.length - 1); i++) { // Guardamos en un array los números generados
      numeros[i] = (int)(Math.random() * 401);
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

    System.out.print("\nSi desea resaltar los multiplos de 5 pulse 1, si desea resaltar los " + 
    "multiplos de 7 pulse 2: ");
    int opc = s.nextInt();

    System.out.println("\nTras mover las numeros que son colores al inicio de la tabla, esta " + 
    "queda así: ");

    for (int j = 1; j <= 5; j++){ // Volvemos a pintar la tabla
      for (int i = 0; i <= (numeros.length - 1); i++){
        int longitud = Integer.max(Integer.toString(numeros[i]).length(),
                        Integer.toString(i).length()); // Longitud del número
        int mitad = (longitud / 2) + (longitud % 2);
        
        boolean resaltar = false;
        if (opc == 1) { resaltar = ((numeros[i] % 5) == 0);}
        else { resaltar = ((numeros[i] % 7) == 0); }
        if (resaltar) { longitud += 3; mitad++; }

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
          case 4: if (resaltar) { System.out.print("│ [" + numeros[i] + "] "); }
                  else { System.out.print("│ " + numeros[i] + " "); }
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
