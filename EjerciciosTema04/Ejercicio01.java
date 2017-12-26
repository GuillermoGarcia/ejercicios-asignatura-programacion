/*
 * Solución Ejercicio 1 Tema 4
 * 
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 * 
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio01 {
  public static void main (String[] args){
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("¿De que día de la semana desea saber la asignatura a primera hora? ");
    String dia = s.nextLine();
    String asignatura = "";
    int error = 0;
    
    dia = dia.substring(0,1).toUpperCase() + dia.substring(1).toLowerCase();
    
    switch(dia){
      case "Lunes": asignatura = "Programación"; error = 0; break;
      case "Martes": asignatura = "Sistemas Informaticos"; error = 0; break;
      case "Miércoles": 
      case "Miercoles": asignatura = "Programación"; error = 0; break;
      case "Jueves": asignatura = "Entornos de Datos"; error = 0; break;
      case "Viernes": asignatura = "Sistemas Informaticos"; error = 0; break;
      default: error = 1; asignatura = "Ha introducido algo que no es un día, o bien, un día no hábil.";
    }
    
    if (error == 1){
      System.out.println(asignatura);
    }else {
      System.out.printf("Los %s a primera hora tenemos clase de %s.\n", dia,
     asignatura);
    }
  }  
}
