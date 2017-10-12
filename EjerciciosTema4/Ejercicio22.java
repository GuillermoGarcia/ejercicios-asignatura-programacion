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

    System.out.print("Introduzca la nota del primero Examen: ");
    int primerExamen = s.nextInt();

    System.out.print("Introduzca la nota del segundo Examen: ");
    int segundoExamen = s.nextInt();
    double media = (double)(primerExamen+segundoExamen)/2.0;

    if (media<5){
      System.out.println("¿Que calificación se ha obtenido en el Examen de Recuperación?");
      System.out.println("1) Apto.");
      System.out.println("2) No Apto.");
      System.out.print("Calificación: ");
      int apto = s.nextInt();
      if (apto == 1){
        media = 5.0;
      }
    }
    System.out.printf("La calificación media del alumno es de %.2f.\n",media);
  }
}
