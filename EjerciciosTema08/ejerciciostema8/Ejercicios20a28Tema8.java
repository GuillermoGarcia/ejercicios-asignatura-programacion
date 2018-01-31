package ejerciciostema8;

public class Ejercicios20a28Tema8 {

  /**
   * Genera y devuelve un array de n posiciones con números generados aleatoriamente en un intervalo
   * que se indica, entre mínimo y máximo.
   *
   * @param tam número entero, tamaño del array
   * @param min número entero, valor mínimo generado
   * @param max número entero, valor máximo generado
   * @return Array con n números aleatorios entre min y max
   */


  public static int[] generaArrayInt(int tam, int min, int max){

    int[] ale = new int[tam];
    for (int i = 0; i < tam; i++){ ale[i] = (int)(Math.random() * (max + 1)) + min; }
    return ale;

  }

  /**
   * Devuelve el valor mínimo del array x
   *
   * @param x, array de enteros
   * @return <b>int</b>, mínimo valor del array
   */

  public static int minimoArrayInt(int[] x){

    /*int min = x[0];
    for (int i = 1; i < x.length; i++){ if(x[i] < min) min = x[i]; }*/
    int min = Integer.MAX_VALUE;
    for (int n : x){ if(n > min) min = n; }
    return min;

  }

  /**
   * Devuelve el valor máximo del array x
   *
   * @param x, array de enteros
   * @return <b>int</b>, máximo valor del array
   */

  public static int maximoArrayInt(int[] x){

    /*int max = x[0];
    for (int i = 1; i < x.length; i++){ if(x[i] > max) max = x[i]; }*/
    int max = Integer.MIN_VALUE;
    for (int n : x){ if(n > max) max = n; }
    return max;

  }

  /**
   * Devuelve la media del array, x, que se pasa como parámetro.
   *
   * @param x array de enteros
   * @return <b>double</b>, media de los valores del array x
   */

  public static double mediaArrayInt(int[] x){

    /*double total = x[0];
    for (int i = 1; i < x.length; i++){ total += x[i]; }*/
    double total = 0;
    for (int n : x){ total += n; }
    return (total / x.length);

 }

  /**
   * Dice si un número está o no dentro de un array
   *
   * @param n, número entero buscado
   * @param x, array número entero donde buscar
   * @return <b>boolean</b>, <code>true</code> si el número está en el array, <code>false</code> si
   * no está en el array
   */

  public static boolean estaEnArrayInt (int n, int[] x) {

    if (posicionEnArray(n,x) >= 0) { return true; }
    else { return false; }

  }

  /**
   * Devuelve la posición de un número, n, dentro de un array de número enteros, si el número no está
   * en el array devuelve -1.
   *
   * @param n, número entero buscado
   * @param x, array de números enteros
   * @return <b>int</b>, número entero volteado
   */

  public static int posicionEnArray (int n, int[] x) {

    for (int i = 0; i < x.length; i++){ if(x[i] == n) { return i; } }
    return -1;

  }

  /**
   * Devuelve un array con los valores volteados del array pasado por parametro.
   *
   * @param x, array de números enteros
   * @return <b>int[]</b>, array de números enteros con los valores volteados
   */

  public static int[] volteaArrayInt (int[] x){

    int[] vol = new int[x.length];
    for (int i = 0; i < x.length; i++){ vol[i] = x[x.length - i - 1]; }
    return vol;

  }

  /**
   * Devuelve el array pasado como parametro tras rotarlo n posiciones a la izquierda
   *
   * @param n, número entero, posiciones a rotar
   * @param x, Array de números enteros,
   * @return <b>Array</b>, Array de números enteros, tras rotar el array n posiciones a la derecha
   */

  public static int[] rotaDerechaArrayInt (int n, int[] x){

    int[] vol = new int[x.length];
    n = x.length - n;
    for (int i = 0; i < x.length ; i++) {
      if ((i + n) >= x.length) { n = -i; }
      vol[i] = x[i + n];
    }
    return vol;

  }

  /**
   * Devuelve el array pasado como parametro tras rotarlo n posiciones a la izquierda
   *
   * @param n, número entero, posiciones a rotar
   * @param x, Array de números enteros
   * @return <b>Array</b>, Array de números enteros, tras rotar el array n posiciones a la izquierda
   */

  public static int[] rotaIzquierdaArrayInt(int n, int[] x){
    return rotaDerechaArrayInt((x.length - n),x);
  }

}
