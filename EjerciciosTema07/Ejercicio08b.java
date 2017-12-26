/*
 * Solución Ejercicio 8 Tema 7 Bidimensional
 *
 * Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas
 * podría saltar un alfil que se encuentra en esa posición. Como se indica en la figura, el alfil se
 * mueve siempre en diagonal. El tablero cuenta con 64 casillas. Las columnas se indican con las
 * letras de la “a” a la “h” y las filas se indican del 1 al 8.
 *  
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio08b {

    static final int filas = 8;
    static final int columnas = 8;


  public static void main (String[] args) throws InterruptedException {

    int[][] tablero = new int[filas][columnas];
    int[][] posiciones = new int[2][13];
    int pos = 0;
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca la posición del Álfil: ");
    String posicion = s.nextLine();

    int posX = Integer.parseInt(posicion.substring(0,1),18) - 9;
    int posY = Integer.parseInt(posicion.substring(1));

    // Buscamos las posiciones donde se puede mover el álfil
    for (int i = (posX - 1), j = (posY - 1); (i > 0) && (j > 0); i--, j-- ) {
      posiciones[0][pos] = i;
      posiciones[1][pos] = j;
      pos++;
    }

    for (int i = (posX - 1), j = (posY + 1); (i > 0) && (j < 9); i--, j++ ) {
      posiciones[0][pos] = i;
      posiciones[1][pos] = j;
      pos++;
    }

    for (int i = (posX + 1), j = (posY - 1); (i < 9) && (j > 0); i++, j-- ) {
      posiciones[0][pos] = i;
      posiciones[1][pos] = j;
      pos++;
    }

    for (int i = (posX + 1), j = (posY + 1); (i < 9) && (j < 9); i++, j++ ) {
      posiciones[0][pos] = i;
      posiciones[1][pos] = j;
      pos++;
    }

    // Reordenamos las posiciones de menor a mayor

    int inicio = 0;
    int fin = pos - 1;
    do {
      int minimo = 89;
      int maximo = 0;
      int posMax = 12;
      int posMin = 0;
      int[] aux = new int[2];
      for (int i = inicio; i <= fin; i++){
        int valor = (posiciones[0][i] * 10) + posiciones[1][i];
        // Buscamos el maximo y el minimo
        if (valor > maximo) {
          maximo = valor;
          posMax = i;
        }
        if (valor < minimo) {
          minimo = valor;
          posMin = i;
        }
      }

      // Movemos el mínimo al inicio 
      aux[0] = posiciones[0][inicio];
      aux[1] = posiciones[1][inicio];
      posiciones[0][inicio] = posiciones[0][posMin];
      posiciones[1][inicio] = posiciones[1][posMin];
      posiciones[0][posMin] = aux[0];
      posiciones[1][posMin] = aux[1];

      // Movemos el máximo al final
      aux[0] = posiciones[0][fin];
      aux[1] = posiciones[1][fin];
      posiciones[0][fin] = posiciones[0][posMax];
      posiciones[1][fin] = posiciones[1][posMax];
      posiciones[0][posMax] = aux[0];
      posiciones[1][posMax] = aux[1];

      // Incrementamos Inicio y Decrementamos Final
      inicio++;
      fin--;

    } while (inicio < fin);


    System.out.println("El álfil se puede mover a las siguientes posiciones: ");
    for (int i = 0; i < pos; i++){
      System.out.print(posiciones[0][i] + "" +  posiciones[1][i] + " ");
    }

/*

    for (int i = 0; i <= (filas - 1); i++){ // Filas
      for (int j = 0; j <= (columnas - 1); j++){  // Columnas
        boolean noRepetido;
        do {
          noRepetido = true;
          num[i][j] = (int)(Math.random() * 1001);
          int k = i;
          int l = j - 1;
          while ((k >= 0) && (noRepetido)) {
            if (l >=0 ){
              noRepetido = !(num[i][j] == num[k][l]);
              if (l == 0) {
                k--;
                l = columnas - 1;
              } else {
                l--;
              }
            } else {
              k--;
            }
          }
        } while (!noRepetido);
      }
    }

    System.out.println("┌──────────┬──────────┬──────────┬──────────┬──────────┬──────────┬" +
    "──────────┬──────────┬──────────┬──────────┐");

    for (int i = 0; i <= (filas - 1); i++){ // Pintamos las filas
      System.out.print("│");
      for (int j = 0; j <= (columnas - 1); j++){  // Pintamos las columnas
        if (num[i][j] > maximo){
          maximo = num[i][j];
          posMaximo[0] = i;
          posMaximo[1] = j;
        }
        if (num[i][j] < minimo){
          minimo = num[i][j];
          posMinimo[0] = i;
          posMinimo[1] = j;
        }
        int esp = 10 - Integer.toString(num[i][j]).length();
        int mitad = (esp / 2) + (esp % 2);
        for (int k = 1; k <= mitad ; k++){ System.out.print(" "); }
        System.out.print(num[i][j]);
        for (int k = 1; k <= (esp - mitad) ; k++){ System.out.print(" "); }
        System.out.print("│");
      }
      if (i < (filas - 1)) {
        System.out.println("\n├──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼" +
        "──────────┼──────────┼──────────┼──────────┤");
      }

    }

    System.out.println("\n└──────────┴──────────┴──────────┴──────────┴──────────┴──────────┴" +
    "──────────┴──────────┴──────────┴──────────┘\n\n");
    System.out.println("El máximo está en la posicion (" + posMaximo[0] + "," + posMaximo[1] + ")"+
    " y tiene un valor de " + maximo + ".");
    System.out.println("El mínimo está en la posicion (" + posMinimo[0] + "," + posMinimo[1] + ")"+
    " y tiene un valor de " + minimo + ".");
*/
  }
}
