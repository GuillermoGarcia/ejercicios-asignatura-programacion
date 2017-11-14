/*
 * Solución Ejercicio 10 Tema 6
 * 
 * Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. El carácter con
 * el que se pinta cada línea se elige de forma aleatoria entre uno de los siguientes: *, -, =, .,
 * |, @. Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.
 *  
 * @author Guillermo García
 */


import java.util.Scanner;

public class Ejercicio10 {
  public static void main (String[] args){

    
    //Scanner s = new Scanner(System.in);

    System.out.println("Vamos a pintar 10 líneas de longitud aleatoria y rellenos de caracteres "+
    " elegidos aleatoriamente.");

    int longitud = 0;
    int caracter = 0;
    String caracteres = "";

    for (int i = 1; i <= 10; i++ ){
      System.out.print("Linea " + i + ": ");
      longitud = (int)(Math.random()*39) + 1;
      caracter = (int)(Math.random()*5);
      switch (caracter) {
        case 0: caracteres = "*"; break;
        case 1: caracteres = "-"; break;
        case 2: caracteres = "="; break;
        case 3: caracteres = "."; break;
        case 4: caracteres = "|"; break;
        default: caracteres = "@";
      }
      for (int j = 1; j <= longitud; j++){
        System.out.print(caracteres);
      }
      System.out.println();
    }

  }
}
