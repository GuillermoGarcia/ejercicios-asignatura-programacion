/*
 * Solución Ejercicio 34 Tema 5
 *
 * Escribe un programa que pida dos números por teclado y que luego mezcle en dos números diferentes
 * los dígitos pares y los impares. Se van comprobando los dígitos de la siguiente manera: primer
 * dígito del primer número, primer dígito del segundo número, segundo dígito del primer número,
 * segundo dígito del segundo número, tercer dígito del primer número... Para facilitar el ejercicio,
 * podemos suponer que el usuario introducirá dos números de la misma longitud y que siempre habrá
 * al menos un dígito par y uno impar. Usa long en lugar de int donde sea necesario para admitir
 * números largos.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio34 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    System.out.print("\033[1mPor favor, Introduzca un numero entero positivo:\033[0m ");
    int primerNumero = s.nextInt();

    System.out.print("\033[1mPor favor, Introduzca otro numero entero positivo:\033[0m ");
    int segundoNumero = s.nextInt();

    int temp1 = 0;
    int temp2 = 0;
    int longitud = 0;
    long numeroPares = 0;
    long numeroImpares = 0;

    while (primerNumero > 0) {
      temp1 = (temp1 * 10) + (primerNumero % 10);
      primerNumero = primerNumero / 10;
      temp2 = (temp2 * 10) + (segundoNumero % 10);
      segundoNumero = segundoNumero / 10;
      longitud++;
    }

    for (int i = longitud; i >= 1; i--){
      int digito = temp1 % 10;
      if ((digito % 2) == 0) {
        numeroPares = (numeroPares * 10) + digito;
      } else {
        numeroImpares = (numeroImpares * 10) + digito;
      }

      digito = temp2 % 10;
      if ((digito % 2) == 0) {
        numeroPares = (numeroPares * 10) + digito;
      } else {
        numeroImpares = (numeroImpares * 10) + digito;
      }
      temp1 = temp1 / 10;
      temp2 = temp2 / 10;
    }

    System.out.println("El número formado por los dígitos pares es \033[1m" + numeroPares +
    "\033[0m.");
    System.out.println("El número formado por los dígitos impares es \033[1m" + numeroImpares +
    "\033[0m.");

  }
}
