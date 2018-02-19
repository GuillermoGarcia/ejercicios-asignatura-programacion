/*
 * Solución Ejercicio 2 Control 1 Trimestre 2 
 *
 * Implementa una función con nombre corteza que sea capaz de extraer la capa exterior de un array
 * bidimensional. Esta capa se extrae en forma de array de una dimensión. La extracción de números
 * comienza en la esquina superior izquierda y continúa en el sentido de las agujas del reloj. Se
 * debe entregar tanto el código de la función como el código de prueba que la usa. La cabecera de
 * la función es la siguiente:
 *
 * public static int[] corteza(int[][] n)
 *
 * @author Guillermo García Fernández
 * @Fecha 19-02-18
 * @Modelo Único
 */


public class Ex08ggf4 {
  public static void main (String[] args){

    int[][] prueba = new int[4][5];

    for (int i = 0; i < prueba.length; i++){
      for (int j = 0; j < prueba[0].length; j++){
        prueba[i][j] = (int)(Math.random() * 90) + 10;
      }
    }

    System.out.println("Array Bidimensional Original: ");
    pintar(prueba);

    System.out.println();
    int[] c = corteza(prueba);

    System.out.println("\nArray Unidimensional con la Corteza: ");
    pintar(c);

  }

  /*
   * Devuelve un array unidimensional con la corteza, capa exterior de un array bidimensional, 
   * contruido desde la esquina superior izquierda en el sentido del reloj.
   *
   * @param int[][] array bidimensional del que vamos a obtener la corteza
   *
   * @return int[], array unidimensional con la corteza
   *
   */
  public static int[] corteza(int[][] n) {

    int[] c = new int[1];    
    c[0] = n[0][0];

    for (int i = 1; i < n[0].length; i++){
      c = insertarUltimaPosicion(c, n[0][i]);
    }

    for (int i = 1; i < n.length; i++){
      c = insertarUltimaPosicion(c, n[i][n[0].length - 1]);
    }

    for (int i = n[0].length - 2; i >= 0; i--){
      c = insertarUltimaPosicion(c, n[n.length - 1][i]);
    }
    
    for (int i = n.length - 2; i >= 1; i--){
      c = insertarUltimaPosicion(c, n[i][0]);
    }

    return c;

  }

  /*
   * Pinta por pantalla un array unidimensional
   *
   * @param int[], array a pintar por pantalla
   * 
   */
  public static void pintar (int[] x){

    System.out.print(x[0]);
    for (int i = 1; i < x.length; i++){
      System.out.print(" " + x[i]);
    }
    System.out.println();

  }

  /*
   * Pinta por pantalla un array bidimensional
   *
   * @param int[][], array a pintar por pantalla
   * 
   */
  public static void pintar (int[][] x){

    for (int i = 0; i < x.length; i++){
      pintar(x[i]);
    }

  }
  
  /*
   * Inserta un nuevo valor al final de un array unidimensional
   *
   * @param int[] x, array donde insertar el nuevo valor
   * @param int n, valor a insertar en el array
   *
   * @return int[], array con el nuevo valor como último elemento
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
  
}
