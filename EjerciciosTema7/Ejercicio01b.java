/*
 * Solución Ejercicio 1 Tema 7 Bidimensional
 * 
 * Define un array de números enteros de 3 filas por 6 columnas con nombre 'num' y asigna los valores
 * según la siguiente tabla. Muestra el contenido de todos los elementos del array dispuestos en
 * forma de tabla como se muestra en la figura.
 *  
 * @author Guillermo García
 */

public class Ejercicio01b {
  public static void main (String[] args){

    final int filas = 3;
    final int columnas = 6;

    int[][] num = new int[filas][columnas];

    num[0][0] = 0;
    num[0][1] = 30;
    num[0][2] = 2;
    num[0][5] = 5;
    num[1][1] = 75;
    num[1][4] = 0;
    num[2][2] = -2;
    num[2][3] = 9;
    num[2][5] = 11;


    System.out.println("Array num   Columna0   Columna1   Columna2   Columna3   Columna4   Columna5");
    System.out.println("          ┌──────────┬──────────┬──────────┬──────────┬──────────┬──────────┐");
    for (int i = 0; i <= (filas - 1); i++){ // Pintamos las filas
      System.out.print("  Fila " + i + "  │");
      for (int j = 0; j <= (columnas - 1); j++){  // Pintamos las columnas
        int esp = 10 - Integer.toString(num[i][j]).length();
        int mitad = (esp / 2) + (esp % 2);
        for (int k = 1; k <= mitad ; k++){ System.out.print(" "); }
        System.out.print(num[i][j]);
        for (int k = 1; k <= (esp - mitad) ; k++){ System.out.print(" "); }
        System.out.print("│");
      }
      System.out.println();
      if (i < (filas - 1)){
        System.out.println("          ├──────────┼──────────┼──────────┼──────────┼──────────┼──────────┤");
      }
    }
    System.out.println("          └──────────┴──────────┴──────────┴──────────┴──────────┴──────────┘");
  }
}
