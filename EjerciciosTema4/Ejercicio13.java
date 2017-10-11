/*
 * Solución Ejercicio 13 Tema 4
 * 
 * Escribe un programa que ordene tres números enteros introducidos por teclado.
 * 
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio13 {
  public static void main (String[] args){
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduzca los tres número enteros, separados"
    +" por espacio, que vamos a ordenar: ");
    int numeroUno = s.nextInt();
    int numeroDos = s.nextInt();
    int numeroTres = s.nextInt();

    System.out.print("Los números enteros ordenados de menor a mayor serían");

    if ((numeroUno <= numeroDos) && (numeroUno <= numeroTres)) {
        System.out.printf(" %d,",numeroUno);
        if (numeroDos <= numeroTres) {
          System.out.printf(" %d, %d",numeroDos, numeroTres);
        } else {
          System.out.printf(" %d, %d",numeroTres, numeroDos);
        }
    } else if ((numeroUno >= numeroDos) && (numeroDos <= numeroTres)) {
        System.out.printf(" %d,",numeroDos);
        if (numeroUno <= numeroTres){
          System.out.printf(" %d, %d",numeroUno, numeroTres);
        } else {
          System.out.printf(" %d, %d",numeroTres, numeroUno);
        }
    } else {
        System.out.printf(" %d, %d, %d",numeroTres, numeroDos, numeroUno);
    }
    System.out.println();
  }
}
