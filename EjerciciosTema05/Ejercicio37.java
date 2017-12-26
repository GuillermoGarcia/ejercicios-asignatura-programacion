/*
 * Solución Ejercicio 37 Tema 5
 *
 * Realiza un conversor del sistema decimal al sistema de “palotes”.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio37 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);
    String palotes = "";
    long numero;

    do {
      System.out.print("\033[1mPor favor, Introduzca un numero entero positivo:\033[0m ");
      numero = s.nextLong();
    } while (numero < 0);

    System.out.print("El número decimal \033[1m" + numero + "\033[0m en el sistema palotes es el ");

    while (numero > 9){
      for (long i = 1; i <= (numero % 10); i++ ){
        palotes = "|" + palotes;
      }
      palotes = "-" + palotes;
      numero = numero / 10;
    }
    for (long i = 1; i <= numero; i++ ){
      palotes = "|" + palotes;
    }
    System.out.println("\033[1m"+ palotes + "\033[0m.");

  }
}
