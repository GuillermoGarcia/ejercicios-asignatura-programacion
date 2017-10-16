/*
 * Solución Ejercicio 9 Tema 5
 * 
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado.
 *  
 * @author Guillermo García
 */
 
import java.util.Scanner;

public class Ejercicio09 {
  public static void main (String[] args){
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduzca un número: ");
    int numero = s.nextInt();
    int temp = numero;
    int digitos = 0;
    
    do {
      temp = temp / 10;
      digitos++;
    }while (temp >= 0);
    
    System.out.printf("El número %d tiene %d dígitos.\n", numero, digitos);
  }
}
