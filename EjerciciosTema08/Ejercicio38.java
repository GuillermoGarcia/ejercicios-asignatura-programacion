/*
 * Solución Ejercicio 38 Tema 8
 *
 * Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga lo que se
 * especifica en los comentarios (puedes incluirla en tu propia biblioteca de rutinas):
 *
 * public int[] filtraCapicuas(int x[])
 *
 * Devuelve un array con todos los números capicúa que se encuentren en otro array que se pasa como
 * parámetro. Obviamente el tamaño del array que se devuelve será menor o igual al que se pasa como
 * parámetro. Utiliza esta función en un programa para comprobar que funcionan bien. Para que el
 * ejercicio resulte más fácil, las repeticiones de números capicúa se conservan; es decir, si en el
 * array x el número 505 se repite 3 veces, en el array devuelto también estará repetido 3 veces. Si
 * no existe ningún número capicúa en x, se devuelve un array con el número -1 como único elemento.
 *
 * @author: Guillermo García
 *
 */

import java.util.Scanner;
import ejerciciostema8.Ejercicios1a14Tema8;
import ejerciciostema8.Ejercicios20a28Tema8;

public class Ejercicio38 {

  public static void main (String[] args) {

    int[] a = Ejercicios20a28Tema8.generaArrayInt(100,0,1000);

    System.out.println("Se ha creado el siguiente array de 100 números enteros aleatorios:");
    pintar(a);

    int[] b = filtraCapicuas(a);

    System.out.println("\n\nSe han encontrado los siguientes números capícuas dentro del anterior array: ");
    pintar(b);

  }

  public static int[] filtraCapicuas(int x[]){

    int[] temp = new int[0];
    for (int i = 0; i < x.length; i++){
      if (Ejercicios1a14Tema8.esCapicua(x[i])){
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
