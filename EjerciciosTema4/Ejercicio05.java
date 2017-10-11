/*
 * Solución Ejercicio 5 Tema 4
 * 
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax +
 * b = 0).
 * 
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio05 {
  public static void main (String[] args){
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Para resolver la ecuación de primer grado ax +b, por favor"+
    ", introduzca los valores de a y b separados por espacio: ");
    double valorA = s.nextDouble();  
    double valorB = s.nextDouble();
        
    if (valorA == 0){
      System.out.print("Si el valor de A es 0 la ecuación no se puede resolver." +
      "Por favor, vuelva a introducir el valor de a: ");
      valorA = s.nextInt();
    }    
    
    System.out.printf("El valor de x en la ecuación %.4fx+%.4f=0 es x=%.4f. \n", valorA,
    valorB, (0-(valorB/valorA)));
    
  }  
}
