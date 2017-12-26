/*
 * Solución Ejercicio 3 Tema 7 Bidimensional
 * 
 * Modifica el programa anterior de tal forma que los números que se introducen en el array se
 * generen de forma aleatoria (valores entre 100 y 999).
 *  
 * @author Guillermo García
 */


public class Ejercicio03b {
  public static void main (String[] args){

    final int filas = 4;
    final int columnas = 5;

    int[][] num = new int[filas][columnas];
    int total = 0;
    
    System.out.println("Voy a generar 20 números enteros aleatorios y guardarlos en un array 4x5.");

    for (int i = 0; i <= (filas - 1); i++){ // Filas
      for (int j = 0; j <= (columnas - 1); j++){  // Columnas
        num[i][j] = (int)(Math.random() * 900) + 100;
      }
    }

    System.out.println("┌──────────┬──────────┬──────────┬──────────┬──────────┬┬──────────┐");

    for (int i = 0; i <= (filas - 1); i++){ // Pintamos las filas
      System.out.print("│");
      int suma = 0;
      for (int j = 0; j <= (columnas - 1); j++){  // Pintamos las columnas
        int esp = 10 - Integer.toString(num[i][j]).length();
        int mitad = (esp / 2) + (esp % 2);
        for (int k = 1; k <= mitad ; k++){ System.out.print(" "); }
        System.out.print(num[i][j]);
        for (int k = 1; k <= (esp - mitad) ; k++){ System.out.print(" "); }
        System.out.print("│");
        suma += num[i][j];
      }

      if (i <= (filas - 1)){
        System.out.print("│");
        int esp = 10 - Integer.toString(suma).length();
        int mitad = (esp / 2) + (esp % 2);
        for (int k = 1; k <= mitad ; k++){ System.out.print(" "); }
        System.out.print(suma);
        for (int k = 1; k <= (esp - mitad) ; k++){ System.out.print(" "); }
        System.out.print("│");
        System.out.println();
        System.out.println("├──────────┼──────────┼──────────┼──────────┼──────────┼┼──────────┤");
      }

      total += suma;
    }

    for (int j = 0; j <= (columnas - 1); j++){ // Columnas
      System.out.print("│");
      int suma = 0;
      for (int i = 0; i <= (filas - 1); i++){  // Filas
        suma += num[i][j];
      }
      int esp = 10 - Integer.toString(suma).length();
      int mitad = (esp / 2) + (esp % 2);
      for (int k = 1; k <= mitad ; k++){ System.out.print(" "); }
      System.out.print(suma);
      for (int k = 1; k <= (esp - mitad) ; k++){ System.out.print(" "); }
      total += suma;
    }
    System.out.print("││");
    int esp = 10 - Integer.toString(total).length();
    int mitad = (esp / 2) + (esp % 2);
    for (int k = 1; k <= mitad ; k++){ System.out.print(" "); }
    System.out.print(total);
    for (int k = 1; k <= (esp - mitad) ; k++){ System.out.print(" "); }
    System.out.println("│");

    System.out.println("└──────────┴──────────┴──────────┴──────────┴──────────┴┴──────────┘");
  }
}
