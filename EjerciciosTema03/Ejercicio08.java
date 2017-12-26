/* 
 * Resolución Ejercicio 8 Tema 3
 * 
 * Escribe un programa que calcule el salario semanal de un empleado en base
 * a las horas trabajadas, a razón de 12 euros la hora.
 *
 * @author Guillermo García
 */ 

import java.util.Scanner;

public class Ejercicio08 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Por favor, facilite las horas trabajadas en la semana:");
    int horasSemana = s.nextInt();
    
    System.out.println("El salario semanal es de " + (horasSemana*12) +
     " por trabajar " + horasSemana + " horas durante la semana.");
    
  }  
}
