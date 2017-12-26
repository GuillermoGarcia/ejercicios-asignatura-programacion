/*
 * Solución Ejercicio 13 Tema 7
 *
 * Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios
 * comprendidos entre 0 y 500 (ambos incluidos). A continuación el programa mostrará el array y
 * preguntará si el usuario quiere destacar el máximo o el mínimo. Seguidamente se volverá a mostrar
 * el array escribiendo el número destacado entre dobles asteriscos.
 *  
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio13 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    int[] numeros = new int[100];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;

    System.out.println("Voy a generar " + numeros.length + " número aleatorios: ");
    for (int i = 0; i <= (numeros.length - 1); i++) { // Guardamos en un array los números generados
      numeros[i] = (int)(Math.random() * 501);
      if (numeros[i] > maximo) { maximo = numeros[i]; }
      if (numeros[i] < minimo) { minimo = numeros[i]; }
    }

    System.out.print("\n Los números que se han generado son: ");

    for (int i = 0; i <= (numeros.length - 2); i++){
      System.out.print(numeros[i] + ", ");
    }
    System.out.println(numeros[numeros.length - 1] + ".\n");

    int destacado;
    do {
      System.out.print("¿Qué número desea destacar el minimo(1) o el maximo(2)? ");
      destacado = s.nextInt();
      for (int i = 0; i <= (numeros.length - 2); i++){
        if ((destacado == 1) && (numeros[i] == minimo)){
          System.out.print("**" + numeros[i] + "**, ");
        } else if ((destacado == 2) && (numeros[i] == maximo)){
          System.out.print("**" + numeros[i] + "**, ");
        } else {
          System.out.print(numeros[i] + ", ");
        }
      }
      if ((destacado == 1) && (numeros[numeros.length - 1] == minimo)){
        System.out.print("**" + numeros[numeros.length - 1] + "**.\n");
      } else if ((destacado == 2) && (numeros[numeros.length - 1] == maximo)){
        System.out.print("**" + numeros[numeros.length - 1] + "**.\n");
      } else {
        System.out.println(numeros[numeros.length - 1] + ".\n");
      }
      System.out.print("¿Desea destacar otro número? No(0), Si(1) ");
      destacado = s.nextInt();
    } while (destacado > 0);
  }
}
