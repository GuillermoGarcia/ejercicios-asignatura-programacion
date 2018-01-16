package ejerciciostema8;

public class Ejercicios29a34Tema8 {

  /**
   * Genera un array de tamaño n x m con números aleatorios cuyo intervalo (mínimo y máximo) se
   * indica como parámetro.
   *
   * @param n número entero, filas del array
   * @param m número entero, columnas del array
   * @param min número entero, mínimo valor posible en el array
   * @param max número entero, máximo valor posible en el array
   * @return <b>Array</b>, array de n filas x m columnas de números enteros generados aleatoriamente
   */


  public static int[][] generaArrayBiInt(int n, int m, int min, int max){

    int[][] x = new int[n][m];
    for (int i = 0; i < n; i++){
      x[i] = Ejercicios20a28Tema8.generaArrayInt(m, min, max);
    }
    return x;

  }

  /**
   * Devuelve la fila i-ésima del array que se pasa como parámetro.
   *
   * @param x, Array bidimensional de números enteros
   * @param i, número entero, número de la fila a devolver
   * @return <b>Array</b>, array unidimensional con la fila i-ésima del array x.
   */

  public static int[] filaDeArrayBiInt(int x[][], int i){
    return x[i];
  }

  /**
   * Devuelve la columna j-ésima del array que se pasa como parámetro.
   *
   * @param x, Array bidimensional de números enteros
   * @param j, número entero, número de la columna a devolver
   * @return <b>Array</b>, array unidimensional con la columna j-ésima del array x.
   */

  public static int[] columnaDeArrayBiInt(int[][] x, int j){

    int[] col = new int[x.length];
    for (int i = 0; i < x.length; i++ ) { col[i] = x[i][j]; }
    return col;

  }


  /**
   * Devuelve la fila y la columna (en un array con dos elementos) de la primera ocurrencia de un
   * número dentro de un array bidimensional. Si el número no se encuentra en el array, la función
   * devuelve el array {-1, -1}.
   *
   * @param x, Array bidimensional de números enteros
   * @param n, número entero, número a buscar en el array
   * @return <b>Array</b>, array bidimensional con la fila y la columna donde está el número buscado
   * dentro del array x.
   */

  public static int[][] coordenadasEnArrayBiInt(int[][] x, int n){

    int[][] p = {{-1,-1}};
    int i = 0;
    do {
      p[0][1] = Ejercicios20a28Tema8.posicionEnArray(n,columnaDeArrayBiInt(x,i));
      if (p[0][1] > -1) { p[0][0] = i; }
      i++;
    }while ((p[0][0] == -1) && (i < x.length));
    return p;

  }

  /**
   * Dice si un número es o no punto de silla, es decir, mínimo en su fila y máximo en su columna
   *
   * @param x, Array bidimensional de números enteros
   * @param i, número entero, posición i del número a comprobar si es punto de silla
   * @param j, número entero, posición j del número a comprobar si es punto de silla
   * @return <b>boolean</b>, <code>true</true> si es un punto de silla, <code>false</code> si no es
   * un número de silla.
   */

  public static boolean esPuntoDeSilla(int[][] x, int i, int j){

    return ((x[i][j] == Ejercicios20a28Tema8.maximoArrayInt(columnaDeArrayBiInt(x,j))) &&
    (x[i][j] == Ejercicios20a28Tema8.minimoArrayInt(filaDeArrayBiInt(x,i))));

 }

  /**
   * Devuelve un array que contiene una de las diagonales del array bidimensional que se pasa como
   * parámetro. Se pasan como parámetros fila, columna y dirección. La fila y la columna determinan
   * el número que marcará las dos posibles diagonales dentro del array. La dirección es una cadena
   * de caracteres que puede ser "nose" o "neso". La cadena "nose" indica que se elige la diagonal
   * que va del noroeste hacia el sureste, mientras que la cadena "neso" indica que se elige la
   * diagonal que va del noreste hacia el suroeste.
   *
   * @param x, Array de números enteros
   * @param f, número entero, fila por donde debe pasar la diagonal
   * @param c, número entero, columna por donde debe pasar la diagonal
   * @param d, Cadena de caracteres, con los valores 'nose'(noroeste-sureste)
   * o 'neso' (noreste-suroeste)
   * @return <b>Array</b>, array unidimensional con la diagonal que pasa por la fila y la columna
   * dadas y con la dirección dada.
   */

  public static int[] diagonal(int[][] x, int f, int c, String d){

    //int londia = (int)Math.floor(Math.sqrt(Math.pow(x.length, 2) + Math.pow(x[0].length,2))) + 1;
    int[] dg;
    if (x.length > x[0].length) {
      dg = new int[x[0].length];
    } else {
      dg = new int[x.length];
    }
    int londia = 0;

    for (int i = 0; i < x.length; i++){
      for (int j = 0; j < x[0].length; j++){
        if (((c - j) == (f - i) && (d.equals("nose"))) ||
           ((c - j) == (i - f) && (d.equals("neso")))) {
          dg[londia] = x[i][j];
          londia++;
        }
      }
    }

    int[] diagonal = new int[londia];
    for (int i = 0; i < londia; i++){
      diagonal[i] = dg[i];
    }

    return diagonal;

  }



}
