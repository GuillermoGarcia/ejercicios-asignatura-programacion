/*
 * Solución Ejercicio 8 Tema 5
 * 
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 *  
 * @author Guillermo García
 */
 
import java.util.Scanner;

public class Ejercicio08 {
  public static void main (String[] args){
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("¿De que número quiere la tabla de multiplicar? ");
    int tabla = s.nextInt();
    
    for (int i=0;i<=10;i++) {
      System.out.printf("%2d x %2d = %2d\n", tabla, i, (tabla*i));
    }
    
  }
}
