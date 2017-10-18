/*
 * Solución Ejercicio 10 Tema 5
 * 
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 *  
 * @author Guillermo García
 */
 
import java.util.Scanner;

public class Ejercicio10 {
  public static void main (String[] args){
    
    Scanner s = new Scanner(System.in);
    
    int contador = 0;
    double total = 0;
    double entrada = 0;
    
    System.out.println("Introduzca los números positivos para calcular la media, para finalizar introduzca un número negativo.");
    do {
      System.out.print("Nuevo dato: ");
      entrada = s.nextDouble();
      if (entrada >= 0){
        total += entrada;
        contador++;
      }      
    } while (entrada >=0);
    
    System.out.printf("La media de los %d introducidos es %.4f.\n", contador, (total / contador));
  }
}
