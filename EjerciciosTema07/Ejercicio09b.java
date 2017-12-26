/*
 * Solución Ejercicio 9 Tema 7 Bidimensional
 *
 * Realiza un programa que sea capaz de rotar todos los elementos de una matriz cuadrada una
 * posición en el sentido de las agujas del reloj. La matriz debe tener 12 filas por 12 columnas y
 * debe contener números generados al azar entre 0 y 100. Se debe mostrar tanto la matriz original
 * como la matriz resultado, ambas con los números convenientemente alineados.
 *
 * @author Guillermo García
 */


public class Ejercicio09b {

    static final int filas = 12;
    static final int columnas = 12;


  public static void main (String[] args) {

    int[][] matriz = new int[filas][columnas];
    int aux;
    int aux2;

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
        matriz[i][j] = (int)(Math.random() * 101);
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


    // Giramos la matriz por zonas

    for (int zona = 0; zona < (filas / 2); zona++) {

      int nuevaFila = filas - zona - 1;
      int nuevaColumna = columnas - zona - 1;

      aux = matriz[zona][nuevaColumna];
      // Zona Superior
      for (int i = (nuevaColumna); i > zona; i--) {
        matriz[zona][i] = matriz[zona][i - 1];
      }

      aux2 = matriz[nuevaFila][nuevaColumna];

      // Zona Derecha
      for (int i = (nuevaFila); i > (zona + 1); i--) {
        matriz[i][nuevaColumna] = matriz[i - 1][nuevaColumna];
      }

      matriz[zona + 1][nuevaColumna] = aux;
      aux = matriz[nuevaFila][zona];

      // Zona Inferior
      for (int i = zona + 1; i < (nuevaColumna); i++) {
        matriz[nuevaFila][i - 1] = matriz[nuevaFila][i];
      }

      matriz[nuevaFila][columnas - zona - 2] = aux2;

      // Zona Izquierda
      for (int i = (zona + 1); i < (nuevaFila); i++) {
        matriz[i - 1][zona] = matriz[i][zona];
      }

      matriz[filas - zona - 2][zona] = aux;
    }

    // Array Girado
    // Pintamos Zona Superior de la Tabla
    System.out.print("┌");
    for (int i = 0; i < columnas; i++){
      System.out.print("──────────");
      if (i < (columnas - 1)) {
        System.out.print("┬");
      }
    }
    System.out.println("┐");

    // Pintamos Zona Interior de la Tabla
    for (int i = 0; i < filas; i++){
      for (int j = 0; j < columnas; j++){
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


  }
}
