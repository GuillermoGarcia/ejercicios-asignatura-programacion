/*
 * Solución Ejercicio 12 Tema 5
 * 
 * Escribe un programa que muestre los n primeros términos de la serie de
 * Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
 * y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
 * los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n
 * se debe introducir por teclado.
 *  
 * @author Guillermo García
 */
 
import java.util.Scanner;

public class Ejercicio12 {
  public static void main (String[] args){
    
    Scanner s = new Scanner(System.in);

    
    System.out.print("Introduzca el número de términos que desea conocer de la serie de Fibonacci: ");
    int n = s.nextInt();
    int temp1 = 1;
    int temp2 = 0;
    
    System.out.printf("La serie Fibonacci con %d terminos es: 0, 1", n);
    if (n>2){ n = n-3; }    
    
    for (int i = 0;i <= n;i++) {
      int nuevo = temp1 + temp2;
      System.out.printf(", %d", nuevo);
      temp2 = temp1;
      temp1 = nuevo;
    }
    System.out.println();
  }
}
