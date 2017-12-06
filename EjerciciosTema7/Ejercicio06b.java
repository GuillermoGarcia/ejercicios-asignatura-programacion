/*
 * Solución Ejercicio 6 Tema 7 Bidimensional
 *
 * Modifica el programa anterior de tal forma que no se repita ningún número en el array.
 *
 * Anterior: 
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros positivos
 * comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa deberá dar la posición
 * tanto del máximo como del mínimo.
 *  
 * @author Guillermo García
 */


public class Ejercicio06b {
  public static void main (String[] args) throws InterruptedException {

    final int filas = 6;
    final int columnas = 10;

    int[][] num = new int[filas][columnas];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;

    int[] posMaximo = new int[2];
    int[] posMinimo = new int[2];


    System.out.println("Voy a generar 60 números enteros aleatorios entre 0 y 1000 y guardarlos en un array 6x10.");

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

  }
}
