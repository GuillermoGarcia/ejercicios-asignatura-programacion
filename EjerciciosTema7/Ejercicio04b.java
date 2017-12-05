/*
 * Solución Ejercicio 4 Tema 7 Bidimensional
 * 
 * Modifica el programa anterior de tal forma que las sumas parciales y la suma total aparezcan en la
 * pantalla con un pequeño retardo, dando la impresión de que el ordenador se queda “pensando” antes
 * de mostrar los números.
 *  
 * @author Guillermo García
 */


public class Ejercicio04b {
  public static void main (String[] args) throws InterruptedException {

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
        Thread.sleep(1000);
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
      Thread.sleep(1000);
      int esp = 10 - Integer.toString(suma).length();
      int mitad = (esp / 2) + (esp % 2);
      for (int k = 1; k <= mitad ; k++){ System.out.print(" "); }
      System.out.print(suma);
      for (int k = 1; k <= (esp - mitad) ; k++){ System.out.print(" "); }
      total += suma;
    }
    System.out.print("││");
    Thread.sleep(1000);
    int esp = 10 - Integer.toString(total).length();
    int mitad = (esp / 2) + (esp % 2);
    for (int k = 1; k <= mitad ; k++){ System.out.print(" "); }
    System.out.print(total);
    for (int k = 1; k <= (esp - mitad) ; k++){ System.out.print(" "); }
    System.out.println("│");

    System.out.println("└──────────┴──────────┴──────────┴──────────┴──────────┴┴──────────┘");
  }
}
