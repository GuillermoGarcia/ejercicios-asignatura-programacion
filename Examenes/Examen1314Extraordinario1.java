/*
 * Solución Ejercicio 1 Examen Extraordinario 2013 2014
 *
 * Realiza un programa que pinte la letra T por pantalla hecha con asteriscos. El programa pedirá la
 * altura. El palo horizontal de la T tendrá una longitud de la mitad (división entera entre 2) de
 * la altura más uno.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Examen1314Extraordinario1 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);
    int altura = 0;

    do {
      System.out.print("\033[1mPor favor, Introduzca la altura de la T:\033[0m ");
      altura = s.nextInt();
      if (altura <= 2) {
        System.out.println("La altura debe ser un numero entero positivo mayor o igual a 2.");
      }
    } while (altura <= 2);


    
    for (int i = 1; i <= altura; i++){ // Altura de la T
      if (i == 1){ // Primera fila
        for (int j = 1; j <= ((altura / 2) + 1); j++){ 
          System.out.print("*");
        }
        System.out.println();
      } else { // Resto de filas
        for (int j = ((altura / 2) - 1); j >= 1; j--){
          System.out.print(" ");
        }
        System.out.println("*");
      }
    }

  }
}
