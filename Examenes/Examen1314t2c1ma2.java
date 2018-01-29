/*
 * Solución Ejercicio 2 Examen Trimestre 2 Control 1 Modelo A Año 2013
 *
 * Escribe un programa que muestre por pantalla un array de 10 números enteros generados al azar
 * entre 0 y 100. A continuación, el programa debe pedir un número al usuario. Se debe comprobar que
 * el número introducido por teclado se encuentra dentro del array, en caso contrario se mostrará un
 * mensaje por pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
 * correctamente. A continuación, el programa rotará el array hacia la derecha las veces que haga
 * falta hasta que el número introducido quede situado en la posición 0 del array. Por último, se
 * mostrará el array rotado por pantalla.
 *
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Examen1314t2c1ma2 {
  public static void main (String[] args){


    Scanner s = new Scanner(System.in);
    int[] x = new int[10];
    int num;
    boolean estaEnArray = false;

    for (int i = 0; i < x.length; i++){
      x[i] = (int)(Math.random() * 101);
    }
    
    System.out.println("Array 10 posiciones con números generados aleatoriamente entre 0 y 100: ");

    for (int n : x) {      
      System.out.print(n + ", ");
    }
    System.out.println();

    System.out.print("¿Que número del array desea tener en la primera posición?: ");
    do {
      num = s.nextInt();
      for (int n : x) {      
        if (n == num) { estaEnArray = true;}
      }
    } while (!estaEnArray);

    while (x[0] != num){
      int temp = x[0];
      for (int i = 1; i < (x.length - 1); i++){
        x[i-1] = x[i];
      }
      x[x.length - 1] = temp;
    }
    System.out.println("El Array rotado para que el número " + num + " este en la primera posición: ");

    for (int n : x) {      
      System.out.print(n + ", ");
    }
    System.out.println();

  }
}
