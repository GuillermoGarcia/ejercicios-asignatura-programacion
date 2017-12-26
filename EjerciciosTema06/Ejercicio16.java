/*
 * Solución Ejercicio 16 Tema 6
 * 
 * Realiza un simulador de máquina tragaperras simplificada que cumpla los siguientes requisitos:
 * a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5 figuras posibles:
 *    corazón, diamante, herradura, campana y limón.
 * b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha perdido”.
 * c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien, ha recuperado su
 *    moneda”.
 * d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado 10 monedas”.
 *  
 * @author Guillermo García
 */


import java.util.Scanner;

public class Ejercicio16 {
  public static void main (String[] args){

    
    Scanner s = new Scanner(System.in);

    System.out.println("Una vez ha metido la moneda hacemos girar la tragaperra.");

    int figura = 0;
    int figura1 = 0;
    int figura2 = 0;
    int figura3 = 0;


    for (int i = 1; i <= 3; i++) {

      figura = (int)(Math.random()*4) + 1;
      switch (figura) {
        case 1: System.out.print("Corazón "); break;
        case 2: System.out.print("Diamante "); break;
        case 3: System.out.print("Herradura "); break;
        case 4: System.out.print("Campana "); break;
        default:  System.out.print("Limón ");
      }
      switch (i){
        case 1: figura1 = figura; break;
        case 2: figura2 = figura; break;
        case 3: figura3 = figura; break;
      }

    }
    
    figura = 0;

    if (figura1 == figura2) { figura++; }
    if (figura2 == figura3) { figura++; }
    if (figura1 == figura3) { figura++; }

    if (figura == 0) {
      System.out.println("\nLo siento, ha perdido.");
    } else if (figura < 2) {
      System.out.println("\nBien, ha recuperado su moneda.");
    } else {
      System.out.println("\nEnhorabuena, ha ganado 10 monedas.");
    }

  }
}
