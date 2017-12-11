/*
 * Solución Ejercicio 10 Tema 7 Bidimensional
 *
 * Realiza el juego de las tres en raya.
 *
 * @author Guillermo García
 */


import java.util.Scanner;

public class Ejercicio10b {

    static final int FILAS = 3;
    static final int COLUMNAS = 3;
    static final int CIRCULO = 1;
    static final int CRUZ = 4;
    static final int VACIO = 0;

    public static void main(String[] args) {
       
      int[][] matriz = new int[FILAS][COLUMNAS];
      Scanner s = new Scanner(System.in);
      int posFila;
      int posCol;
      int jugador = 1;
      int ganador = 0;
      int libres = FILAS*COLUMNAS;


      // Pintamos la zona de juego
    
      for (int i = 0; i < 5; i++){
        switch (i % 2){
          case 0: System.out.println("     │     │   ");
                  break;
          default: System.out.println("───┼───┼───");
        }
      }
      System.out.println("Comenzaremos por el jugador 1.");
      do {
        do {
          if (jugador == 1)
            System.out.println("\n\nTurno del jugador 1.");
          else 
            System.out.println("\n\nTurno del jugador 2.");
          System.out.print("¿En que fila (1-3) desea poner su ficha? ");
          posFila = s.nextInt() - 1;
          System.out.print("¿En que columna (1-3) desea poner su ficha? ");
          posCol = s.nextInt() - 1;
        } while (matriz[posFila][posCol] != VACIO);

        if (jugador == 1){
          matriz[posFila][posCol] = CIRCULO;
          jugador = 2;
        } else {
          matriz[posFila][posCol] = CRUZ;
          jugador = 1;
        }
        for (int i = 0; i < FILAS; i++){
          for (int j = 0; j < COLUMNAS; j++){
            System.out.print("  ");
            switch (matriz[i][j]){
              case 1: System.out.print("O"); break;
              case 4: System.out.print("X"); break;
              default: System.out.print(" ");
            }
            System.out.print("  ");
            if (j < (COLUMNAS - 1))
              System.out.print("|");
          }
          if (i < (FILAS - 1))
            System.out.println("\n───┼───┼───");
        }
        int sumaFila;
        int sumaCol;
        
        // Comprobamos si hay ganador
        for (int i = 0; i < FILAS; i++){
          sumaFila = 0;
          sumaCol = 0;
          for (int j = 0; j < COLUMNAS; j++){
            sumaFila += matriz[i][j];
            sumaCol += matriz[j][i];
          }
          if ((sumaFila == 3) || (sumaCol == 3))
            ganador = 1;
          if ((sumaFila == 12) || (sumaCol == 12))
            ganador = 2;
        }
        // Comprobamos las diagonales
        sumaFila = 0;
        sumaCol = 0;
        for (int i = 0; i < FILAS; i++){
          sumaFila += matriz[i][i];
          sumaCol += matriz[i][COLUMNAS - i - 1];
        }
        if ((sumaFila == 3) || (sumaCol == 3))
          ganador = 1;
        if ((sumaFila == 12) || (sumaCol == 12))
          ganador = 2;
        
        libres--;
      } while ((ganador == 0) && (libres > 0));

      if (ganador == 1)
        System.out.println("\n\nFin del Juego, ha ganado el jugador 1.");
      else if (ganador == 2)
        System.out.println("\n\nFin del juego, ha ganado el jugador 2.");
      else
        System.out.println("\n\nFin del juego, ¡Empate!.");

    }
}
