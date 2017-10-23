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
    long temp = 0;
    int longitud = 0;
    int posicion = 1;
    int veces = 0;

    System.out.print("\033[1mIntroduzca el dígito a buscar: \033[0m");
    int digito = s.nextInt();

    System.out.print("En el ńumero \033[1m" + numero + "\033[0m el dígito " + digito);

    while (numero > 0) {
      if (digito == (numero % 10)){ veces++; }
      temp = (temp * 10) + (numero % 10);
      numero = numero / 10;
      longitud++;
    }

    if (veces == 0){
      System.out.print(" no aparece ninguna vez.");
    } else {
      if (veces == 1){
        System.out.print(" aparece en la posición ");
      } else {
        System.out.print(" aparece en las posiciones ");
      }
      while (temp > 0) {
        if ((digito == (temp % 10)) && (veces > 0)){
          System.out.print(posicion);
          veces--;
        } else {
          temp = temp / 10;
        }
        posicion++;
      }
    }

    System.out.println(".");

  }
}
