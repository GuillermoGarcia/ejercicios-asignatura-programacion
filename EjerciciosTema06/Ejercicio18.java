/*
 * Solución Ejercicio 18 Tema 6
 * 
 * Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren sustituir el color
 * blanco por colores más alegres. Realiza un programa que genere de forma aleatoria una secuencia
 * de tres colores aleatorios (uno para cada dormitorio) de tal forma que no se repita ninguno. Los
 * colores entre los que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo,
 * violeta y naranja.
 *  
 * @author Guillermo García
 */


import java.util.Scanner;

public class Ejercicio18 {
  public static void main (String[] args){

    
    //Scanner s = new Scanner(System.in);

    int primero = -1; // Inicializamos la variable a -1
    int segundo = -1; // Inicializamos la variable a -1
    int tercero = -1; // Inicializamos la variable a -1
    int color = 0;

    System.out.print("Sinestesio y Casilda van a pintar ");

    do {
      
      color = (int)(Math.random() * 6);
      if (primero < 0) {
        primero = color;
        System.out.print("el primer ");
      } else if (segundo < 0) {
        while (color == primero) {
          color = (int)(Math.random() * 6);

        }
        segundo = color;
        System.out.print("el segundo ");
      } else {
        while ((color == primero) || (color == segundo)) {
          color = (int)(Math.random() * 6);
        }
        tercero = color;
        System.out.print(" y el tercero ");
      }
      System.out.print("dormitorio de color ");
      switch (color){
        case 1: System.out.print("rojo"); break;
        case 2: System.out.print("azul"); break;
        case 3: System.out.print("verde"); break;
        case 4: System.out.print("amarillo"); break;
        case 5: System.out.print("violeta"); break;
        default: System.out.print("naranja");
      }
      if (segundo < 0) { System.out.print(", "); }
      
    } while (tercero < 0);

    System.out.println(".");

  }
}
