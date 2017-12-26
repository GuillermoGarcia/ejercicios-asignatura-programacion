/*
 * Solución Ejercicio 27 Tema 5
 *
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un número
 * leído por teclado.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio27 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    System.out.print("\033[1mIntroduzca un número entero positivo: \033[0m");

    int numero = s.nextInt();
    int suma = 0;
    int cantidad = 0;

    System.out.print("Los multiplos de 3 entre el 1 y el " + numero + " son: ");
    for (int i = 3; i <= numero; i += 3) {
      if (i == 3){ System.out.print(i); }
      else { System.out.print(", " + i); }
      suma += i;
      cantidad++;
    }

    System.out.println(".");
    System.out.println("Se han mostrado " + cantidad + " multiplos de 3 y en total suman " + suma);


  }
}
