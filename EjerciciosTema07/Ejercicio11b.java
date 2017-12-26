/*
 * Solución Ejercicio 11 Tema 7 Bidimensional
 *
 * Realiza un programa que muestre por pantalla un array de 10 filas por 10 columnas relleno con
 * números aleatorios entre 200 y 300. A continuación, el programa debe mostrar los números de la
 * diagonal que va desde la esquina superior izquierda a la esquina inferior derecha, así como el
 * máximo, el mínimo y la media de los números que hay en esa diagonal.
 *
 * @author Guillermo García
 */


public class Ejercicio11b {

    static final int filas = 10;
    static final int columnas = 10;


  public static void main (String[] args) {

    int[][] matriz = new int[filas][columnas];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    int total = 0;

    // Array Original
    // Pintamos Zona Superior de la Tabla
    System.out.print("┌");
    for (int i = 0; i < columnas; i++){
      System.out.print("──────────");
      if (i < (columnas - 1)) {
        System.out.print("┬");
      }
    }
    System.out.println("┐");

    // Generamos y Pintamos Zona Interior de la Tabla
    for (int i = 0; i < filas; i++){
      for (int j = 0; j < columnas; j++){
        matriz[i][j] = (int)(Math.random() * 101) + 200;
        int esp = 10 - Integer.toString(matriz[i][j]).length();
        int mitad = (esp / 2) + (esp % 2);
        if (j == 0) {
          System.out.print("│");
        }
        for (int k = 1; k <= mitad ; k++){ System.out.print(" "); }
        System.out.print(matriz[i][j]);
        for (int k = 1; k <= (esp - mitad) ; k++){ System.out.print(" "); }
        System.out.print("│");
      }
      if (i < (filas - 1)) {
        System.out.print("\n├");
        for (int j = 0; j < columnas; j++){
          System.out.print("──────────");
          if (j < (columnas - 1)) {
            System.out.print("┼");
          }
        }
        System.out.println("┤");
      }
    }

    // Pintamos Zona Inferior de la Tabla
    System.out.print("\n└");
    for (int i = 0; i < columnas; i++){
      System.out.print("──────────");
      if (i < (columnas - 1)) {
        System.out.print("┴");
      }
    }
    System.out.println("┘");

    System.out.println("Los valores de la Diagonal son: ");

    // Valores de la Diagonal
    // Pintamos Zona Superior de la Tabla
    System.out.print("┌");
    for (int i = 0; i < columnas; i++){
      System.out.print("──────────");
      if (i < (columnas - 1)) {
        System.out.print("┬");
      }
    }
    System.out.println("┐");

    // Pintamos la diagonal de la Tabla
    for (int i = 0; i < filas; i++){
      // Guardamos el valor máximo
      if (matriz[i][i] > maximo)
        maximo = matriz[i][i];

      // Guardamos el valor mínimo
      if (matriz[i][i] < minimo)
        minimo = matriz[i][i];

      // Sumamos a total para la media
      total += matriz[i][i];

      int esp = 10 - Integer.toString(matriz[i][i]).length();
      int mitad = (esp / 2) + (esp % 2);
      if (i == 0) {
        System.out.print("│");
      }
      for (int k = 1; k <= mitad ; k++){ System.out.print(" "); }
      System.out.print(matriz[i][i]);
      for (int k = 1; k <= (esp - mitad) ; k++){ System.out.print(" "); }
      System.out.print("│");
    }

    // Pintamos Zona Inferior de la Tabla
    System.out.print("\n└");
    for (int i = 0; i < columnas; i++){
      System.out.print("──────────");
      if (i < (columnas - 1)) {
        System.out.print("┴");
      }
    }
    System.out.println("┘");

    System.out.println("El valor Máximo de la Diagonal es " + maximo + ".");
    System.out.println("El valor Mínimo de la Diagonal es " + minimo + ".");
    System.out.println("La media de los valores de la Diagonal es " + (total / filas) + ".");

  }
}
