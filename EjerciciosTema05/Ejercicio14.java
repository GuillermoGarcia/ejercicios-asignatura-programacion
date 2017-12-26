/*
 * Solución Ejercicio 14 Tema 5
 * 
 * Escribe un programa que pida una base y un exponente (entero positivo) y
 * que calcule la potencia.
 *  
 * @author Guillermo García
 */
 
import java.util.Scanner;

public class Ejercicio14 {
  public static void main (String[] args){
    
    Scanner s = new Scanner(System.in);

    System.out.print("Vamos a calcular un número elevado a una potencia, "
    +"introduzca\nBase: ");
    int base = s.nextInt();
    System.out.print("Potencia: ");
    int potencia = s.nextInt();
    int total = 1;

    for (int i = 1;i <= potencia;i++) {
      total = total * base;      
    }
    System.out.printf("%d elevado a %d es igual a %d.\n", base, potencia, total);

  }
}
