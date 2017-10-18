/*
 * Solución Ejercicio 11 Tema 5
 * 
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 *  
 * @author Guillermo García
 */
 
import java.util.Scanner;

public class Ejercicio11 {
  public static void main (String[] args){
    
    Scanner s = new Scanner(System.in);

    
    System.out.print("Introduzca el número por el que vamos a comenzar: ");
    int inicio = s.nextInt();
    
    for (int i = inicio;i < (inicio + 5);i++) {
      System.out.printf("%9d%9d%9d\n", i, i*i, i*i*i);          
    }
  }
}
