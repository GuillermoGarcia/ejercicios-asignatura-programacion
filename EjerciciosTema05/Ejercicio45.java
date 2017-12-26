/*
 * Solución Ejercicio 45 Tema 5
 *
 * Escribe un programa que cambie un dígito dentro de un número dando la posición y el valor nuevo.
 * Las posiciones se cuentan de izquierda a derecha empezando por el 1. Se recomienda usar long en
 * lugar de int ya que el primero admite números más largos. Suponemos que el usuario introduce
 * correctamente los datos.
 * 
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio45 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);
    long numero = 0;
    long temp = 0;
    int longitud = 0;
    
    do {
      System.out.print("\033[1mPor favor, Introduzca un número entero positivo:\033[0m ");
      numero = s.nextLong();
    } while (numero < 0);

    System.out.print("\033[1mPor favor, Introduzca la posición donde cambiar el dígito:\033[0m ");
    int posicion = s.nextInt();

    System.out.print("\033[1mPor favor, Introduzca el nuevo dígito:\033[0m ");
    int digito = s.nextInt();


    System.out.print("El número resultante de cambiar en la posicion " + posicion + " del número "
    + numero + " el dígito " + digito + " es \033[4m");

    do {
      temp = (temp * 10) + (numero % 10);
      numero = numero / 10;
      longitud++;
    } while (numero > 0);

    for (int i = 1; i < posicion; i++) {
      numero = (numero * 10) + (temp % 10);
      temp = temp / 10;
    }

    numero = (numero * 10) + digito;
    temp = temp / 10;

    for (int i = 1; i <= (longitud - posicion); i++) {
      numero = (numero * 10) + (temp % 10);
      temp = temp / 10;
    }

    System.out.println(numero + "\033[0m.");

  }
}
