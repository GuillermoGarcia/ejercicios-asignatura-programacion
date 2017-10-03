/*
 * Resolución Ejercicio 4 Tema 3
 * 
 * Escribe un programa que sume, reste, multiplique y divida dos números 
 * introducidos por teclado.
 * 
 * 
 * @author Guillermo García
 * 
 */
import java.util.Scanner;

public class Ejercicio04 {
  public static void main (String args[]){
   
   Scanner s = new Scanner(System.in); 
   
   System.out.println("Por favor, introduzca los números con los que operar.");
   
   double n1 = s.nextDouble();
   double n2 = s.nextDouble();
   
   System.out.printf("Los Resultados de las operaciones con los números %f y %f son:\n",n1,n2);
   System.out.printf("Suma: %f\n",(n1+n2));
   System.out.printf("Resta: %f\n",(n1-n2));
   System.out.printf("Multiplicación: %f\n",(n1*n2));
   System.out.printf("División: %f\n",(n1/n2));
   
  }
}
