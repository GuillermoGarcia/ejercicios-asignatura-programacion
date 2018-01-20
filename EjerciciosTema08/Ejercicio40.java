/*
 * Solución Ejercicio 38 Tema 8
 *
 * Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga lo que se
 * especifica en los comentarios (puedes incluirla en tu propia biblioteca de rutinas):
 *
 * public int[] filtraCon7(int x[])
 *
 * Devuelve un array con todos los números que contienen el 7 (por ej. 7, 27, 782) que se encuentren
 * en otro array que se pasa como parámetro. El tamaño del array que se devuelve será menor o igual
 * al que se pasa como parámetro.
 * Utiliza esta función en un programa para comprobar que funcionan bien. Para que el ejercicio
 * resulte más fácil, las repeticiones de números que contienen 7 se conservan; es decir, si en el
 * array x el número 875 se repite 3 veces, en el array devuelto también estará repetido 3 veces. Si
 * no existe ningún número que contiene 7 en el array x, se devuelve un array con el número -1 como
 * único elemento.
 *
 * @author: Guillermo García
 *
 */

import java.util.Scanner;
import ejerciciostema8.Ejercicios1a14Tema8;
import ejerciciostema8.Ejercicios20a28Tema8;

public class Ejercicio40 {

  public static void main (String[] args) {

    int[] a = Ejercicios20a28Tema8.generaArrayInt(100,0,1000);

    System.out.println("Se ha creado el siguiente array de 100 números enteros aleatorios:");
    pintar(a);

    int[] b = filtraCon7(a);

    System.out.println("\n\nSe han encontrado los siguientes números, que incluyen un 7, dentro del"
    + " anterior array: ");
    pintar(b);

  }

  public static int[] filtraCon7(int x[]){

    int[] temp = new int[0];
    boolean con7 = false;
    for (int i = 0; i < x.length; i++){
      int n = x[i];
      for (int j = 0; j < Ejercicios1a14Tema8.digitos(x[i]); j++){
        if ((n % 10) == 7){
          con7 = true;
        }
        n /= 10;
      }
      if (con7){
        temp = insertarUltimaPosicion(temp,x[i]);
        con7 = false;
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
