/*
 * Solución Examen 16/17 Trimestre 1 Control 2 Modelo A Ejercicio 3
 * 
 * En ajedrez, el valor de las piezas se mide en peones según la siguiente tabla:
 * Pieza     Dama    Torre    Alfil  Caballo   Peón
 * Valor 9 peones 5 peones 3 peones 2 peones 1 peón
 * Realiza un programa que genere al azar las capturas que ha hecho un jugador durante una partida.
 * El número de capturas será un valor aleatorio entre 0 y 15. Hay que tener en cuenta que cada
 * jugador tiene la posibilidad de capturar algunas de las siguientes piezas (no más): 1 dama, 2
 * torres, 2 alfiles, 2 caballos y 8 peones. El nombre de las piezas se debe guardar en un array de
 * la forma pieza = {“Dama”, “Torre”, “Alfil”, “Caballo”, “Peón”} y el valor de cada una de ellas en
 * otro array de la forma valor = {9, 5, 3, 2, 1}. El alumno puede utilizar más arrays si lo estima
 * oportuno. Al final debe aparecer la puntuación total. Si hay algún problema con las cadenas de
 * caracteres, se permite cambiar “Peón” por “Peon”.
 *  
 * @author Guillermo García
 */


import java.util.Scanner;

public class Examen1617t1c2ma3 {
  public static void main (String[] args){

    
    //Scanner s = new Scanner(System.in);

    String[] pieza = {"Dama", "Torre", "Alfil", "Caballo", "Peón"};
    int[] valor = {9, 5, 3, 2, 1};
    int[] maximo = {1, 2, 2, 2, 8};

    int capturas = (int)(Math.random() * 16);
    int total= 0;
    int captura = 0;

    System.out.println("El jugador ha capturado las siguientes piezas: ");

    for (int i = 0; i <= capturas; i++) {
      do {
        captura = (int)(Math.random() * 5);
      } while (maximo[captura] == 0);
      maximo[captura]--;

      if (captura < 4) {
        System.out.printf("%s (%d peones)%n", pieza[captura], valor[captura]);
      } else {
        System.out.printf("%s (%d peón)%n", pieza[captura], valor[captura]);
      }
      total += valor[captura];
    }
    System.out.println("Puntos Totales: " + total + " peones.");

  }
}
