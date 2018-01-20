/*
 * Solución Ejercicio 36 Tema 8
 *
 * Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga lo que se
 * especifica en los comentarios (puedes incluirla en tu propia biblioteca de rutinas):
 *
 * public static int[] filtraPrimos(int x[])
 *
 * Devuelve un array con todos los números primos que se encuentren en otro array que se pasa como
 * parámetro. Obviamente el tamaño del array que se devuelve será menor o igual al que se pasa como
 * parámetro
 *
 * @author: Guillermo García
 *
 */

import java.util.Scanner;
import ejerciciostema8.Ejercicios1a14Tema8;
import ejerciciostema8.Ejercicios20a28Tema8;

public class Ejercicio36 {

  public static void main (String[] args) {

    int[] a = Ejercicios20a28Tema8.generaArrayInt(100,0,1000);
    int[] b;

    System.out.println("Se ha creado el siguiente array de 100 números enteros aleatorios:");
    pintar(a);

    b = filtraPrimos(a);

    System.out.println("\n\nSe han encontrado los siguientes primos dentro del anterior array: ");
    pintar(b);

  }

  public static int[] filtraPrimos(int x[]){

    int[] temp = new int[0];
    for (int i = 0; i < x.length; i++){
      if (Ejercicios1a14Tema8.esPrimo(x[i])){
        temp = insertarUltimaPosicion(temp,x[i]);
      }
    }

    return temp;

  }

  /*
   * Devuelve un array de una posición mayor que el array pasado como parametro y cuyo valor es el
   * número pasado por parametro
   *
   * @param int x[], array donde vamos a insertar el número
   * @param int n, número que vamos a insertar en la última posición del array
   * @return <b>Array</b>, con el número n añadido al final del array
   *
   */

  public static int[] insertarUltimaPosicion(int x[], int n){

    int[] temp = new int[x.length + 1];
    for (int i = 0; i < x.length; i++){
      temp[i] = x[i];
    }
    temp[x.length] = n;
    return temp;

  }

  public static void pintar (int[] x){

    System.out.print(x[0]);
    for (int i = 1; i < x.length; i++){
      System.out.print(", " + x[i]);
    }
    System.out.println(".");

  }

}

