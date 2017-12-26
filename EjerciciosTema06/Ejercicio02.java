/*
 * Solución Ejercicio 2 Tema 6
 * 
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa. Esta baraja
 * está dividida en cuatro palos: picas, corazones, diamantes y tréboles. Cada palo está formado por
 * 13 cartas, de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q,
 * K y A (que sería el 1). Para convertir un número en una cadena de caracteres podemos usar
 * String.valueOf(n) .
 *  
 * @author Guillermo García
 */

public class Ejercicio02 {
  public static void main (String[] args){

    int carta = (int)(Math.random()*12)+1;;
    if (carta == 1){
      System.out.print("As");
    } else if (carta > 10){
      switch (carta){
        case 11: System.out.print("J"); break;
        case 12: System.out.print("Queen"); break;
        case 13: System.out.print("King"); break;
      }
    } else {
      System.out.print(carta);
    }

    switch ((int)(Math.random()*4)+1) {
      case 1: System.out.println(" de Picas."); break;
      case 2: System.out.println(" de Corazones."); break;
      case 3: System.out.println(" de Diamantes."); break;
      default: System.out.println(" de Tréboles.");
    }

  }
}
