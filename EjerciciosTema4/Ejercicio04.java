/*
 * Solución Ejercicio 4 Tema 4
 * 
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
 * euros la hora.
 * 
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio04 {
  public static void main (String[] args){
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca el número de horas trabajadas(Entero) esta semana: ");
    int horasTrabajadas = s.nextInt();
    int salario = 0;
        
    if (horasTrabajadas<0){
      System.out.print("¿De verdad un número negativo? ¿Le debes dinero a la " +
      "empresa? Por favor, introduce el número de horas trabajadas esta semana: ");
      horasTrabajadas = s.nextInt();
    }    
    
    if (horasTrabajadas>40) {
      salario = (40 * 12) + ((horasTrabajadas-40)*16);
    } else {
      salario = horasTrabajadas * 12;
    }
      
    System.out.printf("Esta semana has trabajado %d horas y has ganado %d €.\n",
    horasTrabajadas,salario);
    
  }  
}
