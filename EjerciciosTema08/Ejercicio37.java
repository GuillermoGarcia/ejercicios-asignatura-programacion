/*
 * Solución Ejercicio 37 Tema 8
 *
 * Crea una función con la siguiente cabecera:
 *
 * public String convierteEnMorse(int n)
 *
 * Esta función convierte el número n al sistema Morse y lo devuelve en una cadena de caracteres.
 * Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en Morse. Utiliza esta función en un
 * programa para comprobar que funciona bien. Desde la función no se debe mostrar nada por pantalla,
 * solo se debe usar print desde el programa principal.
 *
 * 1 . _ _ _ _     6 _ . . . .
 * 2 . . _ _ _     7 _ _ . . .
 * 3 . . . _ _     8 _ _ _ . .
 * 4 . . . . _     9 _ _ _ _ .
 * 5 . . . . .     0 _ _ _ _ _
 *
 * @author: Guillermo García
 *
 */

import java.util.Scanner;

public class Ejercicio37 {

  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);
    int numero;
    do {
      System.out.print("\033[1mPor favor, Introduzca un numero entero positivo:\033[0m ");
      numero = Integer.parseInt(s.nextLine());
    } while (numero < 0);

    System.out.print("El número decimal \033[1m" + numero + "\033[0m en el sistema palotes es el " +
    "\033[1m" + convierteEnMorse(numero) + "\033[0m.\n");
  }

  public static String convierteEnMorse(int n){

    String morse = "";
    while (n > 0){
      switch(n % 10){
        case 1: morse = ". _ _ _ _" + morse; break;
        case 2: morse = ". . _ _ _" + morse; break;
        case 3: morse = ". . . _ _" + morse; break;
        case 4: morse = " . . . . _" + morse; break;
        case 5: morse = " . . . . ." + morse; break;
        case 6: morse = " _ . . . ." + morse; break;
        case 7: morse = " _ _ . . ." + morse; break;
        case 8: morse = " _ _ _ . ." + morse; break;
        case 9: morse = " _ _ _ _ ." + morse; break;
        default: morse = " _ _ _ _ _" + morse;
      }
      n /= 10;
    }

    return morse;

  }

}

