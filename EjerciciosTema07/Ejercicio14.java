/*
 * Solución Ejercicio 14 Tema 7
 *
 * Escribe un programa que pida 8 palabras y las almacene en un array. A continuación, las palabras
 * correspondientes a colores se deben almacenar al comienzo y las que no son colores a continuación.
 * Puedes utilizar tantos arrays auxiliares como quieras. Los colores que conoce el programa deben
 * estar en otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
 * blanco y morado.
 *  
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio14 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    String[] palabras = new String[8];
    String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro",
                        "blanco", "morado"};

    System.out.println("Voy a solicitarle ocho palabras distintas: ");
    for (int i = 0; i <= (palabras.length - 1); i++) { // Guardamos en un array las palabras
      System.out.print("Escriba una palabra: ");
      palabras[i] = s.next();
    }

    System.out.println("\n La tabla original con las palabras que ha introducido queda así: ");

    for (int j = 1; j <= 5; j++){ // Pintamos la tabla
      for (int i = 0; i <= (palabras.length - 1); i++){
        int longitud = palabras[i].length(); // Longitud de la palabra
        int mitad = (longitud / 2) + (longitud % 2);

        switch(j) { 
          case 1: if (i == 0) { System.out.print("┌─"); }
                  else { System.out.print("─┬─"); }
                  for (int k = 1; k <= longitud ; k++){ System.out.print("─"); }
                  if (i == (palabras.length - 1)){ System.out.print("─┐"); }
                  break;
          case 2: System.out.print("│ ");
                  for (int k = 1; k <= (mitad -1) ; k++){ System.out.print(" "); }
                  System.out.print(i);
                  for (int k = 1; k <= (longitud - mitad) ; k++){ System.out.print(" "); }
                  System.out.print(" ");
                  if (i == (palabras.length - 1)){ System.out.print("│"); }
                  break;
          case 3: if (i == 0) { System.out.print("├─"); }
                  else { System.out.print("─┼─"); }
                  for (int k = 1; k <= longitud ; k++){ System.out.print("─"); }
                  if (i == (palabras.length - 1)){ System.out.print("─┤"); }
                  break;
          case 4: System.out.print("│ " + palabras[i] + " ");
                  if (i == (palabras.length - 1)){ System.out.print("│"); }
                  break;
          case 5: if (i == 0) { System.out.print("└─"); }
                  else { System.out.print("─┴─"); }
                  for (int k = 1; k <= longitud ; k++){ System.out.print("─"); }
                  if (i == (palabras.length - 1)){ System.out.print("─┘"); }
        }
      }
      System.out.println();
    }

    String[] arrayAux = new String[palabras.length]; // Array Auxiliar
    int posAux = 0; // Posición actual del Array Auxiliar

    // Recorremos el array de palabras, buscando los colores y los añadimos al array Auxiliar
    for (int i = 0; i <= (palabras.length - 1); i++){
      boolean esColor = false;
      int j = 0;
      while ((j <= (colores.length -1)) && (!esColor)) {
        esColor = colores[j].toUpperCase().equals(palabras[i].toUpperCase());
        j++;
      }
      if (esColor) { arrayAux[posAux] = palabras[i]; posAux++; }
    }

    for (int i = 0; i <= (palabras.length - 1); i++){
      boolean esColor = false;
      int j = 0;
      while ((j <= (colores.length -1)) && (!esColor)) {
        esColor = colores[j].toUpperCase().equals(palabras[i].toUpperCase());
        j++;
      }
      if (!esColor) { arrayAux[posAux] = palabras[i]; posAux++;}
    }

    palabras = arrayAux;

    System.out.println("\nTras mover las palabras que son colores al inicio de la tabla, esta " + 
    "queda así: ");

    for (int j = 1; j <= 5; j++){ // Volvemos a pintar la tabla
      for (int i = 0; i <= (palabras.length - 1); i++){
        int longitud = palabras[i].length(); // Longitud de la palabra
        int mitad = (longitud / 2) + (longitud % 2);

        switch(j) {
          case 1: if (i == 0) { System.out.print("┌─"); }
                  else { System.out.print("─┬─"); }
                  for (int k = 1; k <= longitud ; k++){ System.out.print("─"); }
                  if (i == (palabras.length - 1)){ System.out.print("─┐"); }
                  break;
          case 2: System.out.print("│ ");
                  for (int k = 1; k <= (mitad -1) ; k++){ System.out.print(" "); }
                  System.out.print(i);
                  for (int k = 1; k <= (longitud - mitad) ; k++){ System.out.print(" "); }
                  System.out.print(" ");
                  if (i == (palabras.length - 1)){ System.out.print("│"); }
                  break;
          case 3: if (i == 0) { System.out.print("├─"); }
                  else { System.out.print("─┼─"); }
                  for (int k = 1; k <= longitud ; k++){ System.out.print("─"); }
                  if (i == (palabras.length - 1)){ System.out.print("─┤"); }
                  break;
          case 4: System.out.print("│ " + palabras[i] + " ");
                  if (i == (palabras.length - 1)){ System.out.print("│"); }
                  break;
          case 5: if (i == 0) { System.out.print("└─"); }
                  else { System.out.print("─┴─"); }
                  for (int k = 1; k <= longitud ; k++){ System.out.print("─"); }
                  if (i == (palabras.length - 1)){ System.out.print("─┘"); }
        }
      }
      System.out.println();
    }

  }
}
