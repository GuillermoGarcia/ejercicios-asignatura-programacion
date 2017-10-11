/*
 * Solución Ejercicio 3 Tema 4
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
    
    System.out.print("Introduzca un número del 1 al 7 para saber que día de la semana es: ");
    int numeroDia = s.nextInt();
    String dia = "";
    
    if (numeroDia>7){
      System.out.print("La semana solo tiene 7 días así que un número entre 1 al 7, última posibilidad: ");
      numeroDia = s.nextInt();
    }else if (numeroDia<1) {
      System.out.print("¿En serio un número negativo? Solo se acepta un número entre 1 al 7, última posibilidad: ");
      numeroDia = s.nextInt();
    }    
       
    switch(numeroDia){
      case 1: dia = "El primer día es Lunes"; break;
      case 2: dia = "El segundo día es Martes";  break;
      case 3: dia = "El tercer día es Miercoles";  break;
      case 4: dia = "El cuarto día es Jueves";  break;
      case 5: dia = "El quinto día es Viernes";  break;
      case 6: dia = "El sexto día es Sabado";  break;
      case 7: dia = "El septimo día es Domingo y dios descansó.";  break;
      default: dia = "La semana tiene 7 días.";
    }
    
    System.out.println(dia);
    
  }  
}
