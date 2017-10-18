/*
 * Solución Ejercicio 13 Tema 5
 * 
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos.
 *  
 * @author Guillermo García
 */
 
import java.util.Scanner;

public class Ejercicio13 {
  public static void main (String[] args){
    
    Scanner s = new Scanner(System.in);
    
    int pos = 0;
    int neg = 0;

    
    System.out.println("Se le va a solicitar diez números, tras ello le diremos"
    +" cuantos son positivos y cuantos negativos.\n");

    for (int i = 1;i <= 10;i++) {
      System.out.printf("Número %2d: ", i);
      if(s.nextDouble() >= 0) {
        pos++;
      } else {
        neg++;
      }
    }
    System.out.printf("De los 10 números introducidos, %d son positivos y %d"+
    " son negativos.\n", pos, neg);
  }
}
