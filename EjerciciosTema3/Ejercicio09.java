/* 
 * Resolución Ejercicio 9 Tema 3
 * 
 * Escribe un programa que calcule el volumen de un cono según la fórmula V =
1/3 πr2h
 *
 * @author Guillermo García
 */ 

import java.util.Scanner;

public class Ejercicio09 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    double pi;
    double volumen;
    
    System.out.println("Por favor, facilite el radio del cono:");
    double radio = s.nextDouble();
    
    System.out.println("Por favor, facilite la altura del cono:");
    double altura = s.nextDouble();

    pi = 3.141592;
    volumen = ((pi*radio*radio*altura)/3.0);
    

    System.out.printf("El volumen de un cono de radio %.4f y altura %.4f es de %.4f",
    radio, altura, volumen);
    
  }  
}
