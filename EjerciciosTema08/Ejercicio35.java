/*
 * Solución Ejercicio 35 Tema 8
 *
 * Esta función convierte el número n al sistema de palotes y lo devuelve en una cadena de
 * caracteres. Por ejemplo, el 470213 en decimal es el | | | | - | | | | | | | - - | | - | - | | |
 * en el sistema de palotes. Utiliza esta función en un programa para comprobar que funciona bien.
 * Desde la función no se debe mostrar nada por pantalla, solo se debe usar print desde el programa
 * principal.
 *
 * @author: Guillermo García
 */

import java.util.Scanner;

public class Ejercicio35 {

  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);
    int numero;
    do {
      System.out.print("\033[1mPor favor, Introduzca un numero entero positivo:\033[0m ");
      numero = Integer.parseInt(s.nextLine());
    } while (numero < 0);

    System.out.print("El número decimal \033[1m" + numero + "\033[0m en el sistema palotes es el " +
    "\033[1m" + convierteEnPalotes(numero) + "\033[0m.\n");

  }

  public static String convierteEnPalotes(int n){

    String palotes = "";
    while (n > 9){
      for (int i = 1; i <= (n % 10); i++ ){
        palotes = "|" + palotes;
      }
      palotes = "-" + palotes;
      n /= 10;
    }
    for (int i = 1; i <= n; i++ ){
      palotes = "|" + palotes;
    }

    return palotes;

  }

}

