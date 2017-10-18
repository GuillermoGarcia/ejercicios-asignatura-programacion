/*
 * Solución Ejercicio 16 Tema 5
 * 
 * Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 * unidad.
 *  
 * @author Guillermo García
 */
 
import java.util.Scanner;

public class Ejercicio16 {
  public static void main (String[] args){
    
    Scanner s = new Scanner(System.in);

    System.out.print("¿Qué número desea comprobar si es primo? ");
    int numero = s.nextInt();
    boolean esPrimo = true;
    int divisor = 2;
    String primo = " es primo.";

    while ((esPrimo) && (divisor < numero)) {
      if ((numero % divisor) != 0) {
        divisor++;
      } else {
        esPrimo = false;
        primo = " no es primo ya que es al menos divisible por " + divisor + ".";
      }
    }
    
    System.out.printf("El número %d%s\n", numero, primo);

  }
}
