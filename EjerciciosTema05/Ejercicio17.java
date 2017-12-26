/*
 * Solución Ejercicio 17 Tema 5
 * 
 * Realiza un programa que sume los 100 números siguientes a un número entero
 * y positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
 *  
 * @author Guillermo García
 */
 
import java.util.Scanner;

public class Ejercicio17 {
  public static void main (String[] args){
    
    Scanner s = new Scanner(System.in);

    int numero = 0;
    int temp = 0;

    do {
      System.out.print("Por favor, introduzca un número entero positivo: ");
      numero = s.nextInt();
      System.out.println();
    } while (numero < 0);

    numero++;

    for (int i = numero; i < (numero+100) ; i++ ) {
      temp += i;
    }
    
    System.out.printf("Los cien números a partir del %d suman %d.\n", numero, temp);

  }
}
