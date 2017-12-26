/*
 * Solución Ejercicio 6 Tema 4
 * 
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
 * una altura h. Aplica la fórmula t = √(2h/g) siendo g = 9.81m/s^2 * 
 * 
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio06 {
  public static void main (String[] args){
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Desde que altura desea dejar caer el objeto (metros): ");
    double altura = s.nextDouble();
        
    if (altura <= 0){
      System.out.print("Dejarlo caer desde el suelo o el subsuelo no es posible."+
      "La altura debe ser mayor de 0: ");
      altura = s.nextDouble();
    }
    double tiempo = Math.sqrt((2.0*altura)/9.81);
    
    System.out.printf("El objeto tardara en caer %.4f segundos desde una altura de %.2f", 
    tiempo, altura);
    
  }  
}
