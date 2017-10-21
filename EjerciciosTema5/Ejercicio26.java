/*
 * Solución Ejercicio 26 Tema 5
 *
 * Realiza un programa que pida primero un número y a continuación un dígito. El programa nos debe
 * dar la posición (o posiciones) contando de izquierda a derecha que ocupa ese dígito en el número
 * introducido.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio26 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);
    String bl = "\033[1;5;7;100m%\033[0m ";

    System.out.print("\033[1mIntroduzca un número: \033[0m");

    long numero = s.nextLong();

    System.out.printf("El número \033[4m%d\033[0m al revés es \033[7m", numero);

    do {
      System.out.printf("%d",(numero % 10));
      numero = numero / 10;
    } while (numero > 10);
    System.out.printf("%d\033[0m.\n",numero);

  }
}
