/*
 * Solución Ejercicio 21 Tema 4
 *
 * Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las dos notas
 * que ha sacado el alumno en los dos primeros controles. Si la media de los dos controles da un
 * número mayor o igual a 5, el alumno está aprobado y se mostrará la media. En caso de que la media
 * sea un número menor que 5, el alumno habrá tenido que hacer el examen de recuperación que se
 * califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál ha sido el resultado
 * de la recuperación? (apto/no apto). Si el resultado de la recuperación es apto, la nota será un
 * 5; en caso contrario, se mantiene la nota media anterior.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio21 {
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
