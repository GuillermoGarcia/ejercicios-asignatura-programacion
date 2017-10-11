/*
 * Solución Ejercicio 3 Tema 4
 * 
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
 *  nombre del día de la semana.
 * 
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio03 {
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
