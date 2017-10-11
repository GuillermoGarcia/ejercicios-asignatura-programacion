/*
 * Solución Ejercicio 12 Tema 4
 * 
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 * que se imparten en el curso. Cada pregunta acertada sumará un punto. El
 * programa mostrará al final la calificación obtenida. Pásale el minicuestionario
 * a tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
 * en las diferentes asignaturas del curso.
 * 
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio12 {
  public static void main (String[] args){
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Responde al siguiente miniexamen tipo test.");
    System.out.println("1. .");
    System.out.println("Opcion A: ");
    System.out.println("Opcion B: ");
    System.out.println("Opcion C: ");
    System.out.println("Opcion D: ");
    System.out.println();
    System.out.print("Respuesta: ");

    String respuestaUno = s.next().toUpperCase();  
    int total = 0;

    if (respuestaUno.equals("A")) { total++;}


    System.out.printf("Has respondido un total de %d respuestas correctas.\n", total);
  }
}
