/*
 * Resolución Ejercicio 12 Tema 3
 * 
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 * segundo examen un 60%.
 * 
 * @author Guillermo García
 */
 
 import java.util.Scanner;
 
 public class Ejercicio12 {
   public static void main (String args[]){
     
     Scanner s = new Scanner(System.in);
     
     System.out.print("Por favor, facilite la nota del primer examen: ");
     double notaPrimerExamen = s.nextDouble();

     System.out.print("Por favor, facilite la nota media deseada: ");
     double mediaDeseada = s.nextDouble();
     
     double notaSegundoExamen = (mediaDeseada-(notaPrimerExamen*0.4))/0.6;
     
     System.out.printf("Para obtener una nota media de %2.2f, haría falta sacar"+
     " un %2.2f en el segundo examen, tras sacar un %2.2f en el primer examen.\n",
     mediaDeseada, notaSegundoExamen, notaPrimerExamen);
     
   }
 }
