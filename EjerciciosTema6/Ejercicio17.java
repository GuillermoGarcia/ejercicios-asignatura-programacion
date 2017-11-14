/*
 * Solución Ejercicio 17 Tema 6
 * 
 * Realiza un programa que pinte por pantalla una pecera con un pececito dentro. Se debe pedir al
 * usuario el ancho y el alto de la pecera, que como mínimo serán de 4 unidades. No hay que
 * comprobar que los datos se introducen correctamente; podemos suponer que el usuario los introduce
 * bien. Dentro de la pecera hay que colocar de forma aleatoria un pececito, que puede estar situado
 * en cualquiera de las posiciones que quedan en el hueco que forma el rectángulo.
 *  
 * @author Guillermo García
 */


import java.util.Scanner;

public class Ejercicio17 {
  public static void main (String[] args){

    
    Scanner s = new Scanner(System.in);

    System.out.print("¿Cúal va a ser la altura de la pecera? ");
    int altura = s.nextInt();
    System.out.print("¿Cúal va a ser la anchura de la pecera? ");
    int anchura = s.nextInt();

    int pezAltura = (int)(Math.random() * (altura - 2)) + 1;
    int pezAnchura = (int)(Math.random() * (anchura - 2)) + 1;

    System.out.println();

    for (int i = 0; i < altura; i++) {

      for (int j = 0; j < anchura; j++) {

        if ((i == 0) || (i == (altura - 1))) {
          System.out.print("*");
        } else if ((j == 0) || (j == (anchura - 1))) {
          System.out.print("*");
        } else if ((i == pezAltura) && (j == pezAnchura)){
          System.out.print("&");
        } else {
          System.out.print(" ");
        }
        System.out.print(" ");
      }
      
      System.out.println();
      
    }

  }
}
