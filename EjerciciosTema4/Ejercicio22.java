/*
 * Solución Ejercicio 22 Tema 4
 *
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y una hora (horas y
 * minutos), calcule cuántos minutos faltan para el fin de semana. Se considerará que el fin de
 * semana comienza el viernes a las 15:00h. Se da por hecho que el usuario introducirá un día y hora
 * correctos, anterior al viernes a las 15:00h.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio22 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    System.out.print("¿Qué día de la semana es? ");
    String dia = s.next();

    System.out.print("¿Qué hora es? ");
    String horas = s.next();
    int hora = Integer.parseInt(horas.substring(0,2));
    int minutos = Integer.parseInt(horas.substring(3,5));

    int minutosFaltantes = 930 - (hora*60) - minutos;

    switch(dia.toUpperCase()){
      case "LUNES": minutosFaltantes += 5760; break;
      case "MARTES": minutosFaltantes += 4320; break;
      case "MIERCOLES": minutosFaltantes += 2880; break;
      case "JUEVES": minutosFaltantes += 1440; break;
    }
    System.out.printf("Hasta el Viernes a las 15:30 faltan %d minutos.\n",minutosFaltantes);
  }
}
