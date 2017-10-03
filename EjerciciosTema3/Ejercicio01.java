/* 
 * Resolución Ejercicio 1 Tema 3
 * 
 * Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación.
 * 
 * @author Guillermo García
 */ 

import java.util.Scanner;

public class Ejercicio01 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Por favor, instroduza dos números separados por espacios.");
    
    int n1 = s.nextInt();
    int n2 = s.nextInt();
    
    System.out.printf("La multiplicación de %d y %d es %d\n",n1,n2,(n1*n2));
    
  }  
}
