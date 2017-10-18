/*
 * Solución Ejercicio 15 Tema 5
 * 
 * Escribe un programa que dados dos números, uno real (base) y un entero
 * positivo (exponente), saque por pantalla todas las potencias con base el
 * numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
 * se deberán mostrar 2^1 , 2^2 , 2^3 , 2^4 y 2^5 .
 *  
 * @author Guillermo García
 */
 
import java.util.Scanner;

public class Ejercicio15 {
  public static void main (String[] args){
    
    Scanner s = new Scanner(System.in);

    System.out.print("Vamos a calcular un número elevado a una potencia, "
    +"introduzca\nBase: ");
    int base = s.nextInt();
    System.out.print("Potencia: ");
    int potencia = s.nextInt();
    long total = 1;

    for (int i = 1;i <= potencia;i++) {
      total = total * base;
      System.out.printf("%d^%d(%d elevado a %d) es igual a %d.\n", base, i, base, i, total);
    }

  }
}
