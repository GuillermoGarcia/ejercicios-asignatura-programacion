/*
 * Solución Ejercicio 9 Tema 4
 * 
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo
 * ax^2 + bx + c = 0).
 * 
 * @author Guillermo García
 */

import java.lang.Double;
import java.util.Scanner;

public class Ejercicio09 {
  public static void main (String[] args){
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Para resolver la ecuación de segundo grado ax² + bx + c,"+
    " por favor, introduzca los valores de 'a', 'b' y 'c' separados por espacio: ");
    double valorA = s.nextDouble();  
    double valorB = s.nextDouble();
    double valorC = s.nextDouble();
        
    if (valorA == 0){
      System.out.print("Si el valor de 'a' es 0 la ecuación no se puede resolver." +
      "Por favor, vuelva a introducir el valor de 'a': ");
      valorA = s.nextDouble();
    }    
    
    double resultadoRaizCuadrada = Math.sqrt((valorB*valorB)-4.0*valorA*valorC);
    
    if (Double.isNaN(resultadoRaizCuadrada)){
      System.out.println("No es posible resolver la ecuación con los valores facilitados.");
    } else {
      double resultadoSuma = (resultadoRaizCuadrada-valorB)/(2.0*valorA);
      double resultadoResta = (0.0-resultadoRaizCuadrada-valorB)/(2.0*valorA);
      System.out.printf("El valor de x en la ecuación de segundo grado "+
      "%.4fx²+%.4fx+%.4f=0 es x=%.4f y x=%.4f. \n", valorA, valorB, valorC,
      resultadoSuma, resultadoResta);
    }
  }
}
