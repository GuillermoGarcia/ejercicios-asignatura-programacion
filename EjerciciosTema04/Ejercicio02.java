/*
 * Solución Ejercicio 2 Tema 4
 * 
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
 * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos
 * de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta
 * las horas, los minutos no se deben introducir por teclado.
 * 
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio02 {
  public static void main (String[] args){
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("¿Que hora es(hh:mm)? ");
    String horaEntrada = s.next();
    String respuesta = "";
    
    if (horaEntrada.length() != 5) {
        respuesta = "El formato de la hora no es correcto, tiene que ser hh:mm";
    } else {    
      int hora = Integer.parseInt(horaEntrada.substring(0,2));
      int minutos = Integer.parseInt(horaEntrada.substring(3,5));
    
      if ((hora >= 6) && (hora < 12)){
        respuesta = "Buenos Días.";
      } else if ((hora >= 12) && (hora < 20)){
        respuesta = "Buenos Tardes.";
      } else if ((hora >= 20) && (hora < 6)){
        respuesta = "Buenos Noches.";
      } else {
        respuesta = "El formato de la hora no es correcto, tiene que ser hh:mm";
      }
    }
    
    System.out.printf("%s\n",respuesta);
  }
}
