/*
 * Solución Ejercicio 2 Control 1 Trimestre 2 
 *
 * Realiza una función que tome como parámetro un array de cadenas de caracteres y que devuelva otro
 * array con los mismos valores habiendo eliminado las posibles repeticiones. Se distinguen
 * mayúsculas de minúsculas, por tanto "hola" es distinto de "Hola". Por ejemplo, si el array a
 * contiene los valores {"casa", "coche", "sol", "mesa", "mesa", "coche", "ordenador", "sol",
 * "CASA"}, la sentencia sinRepetir(a) devolvería el array {"casa", "coche", "sol", "mesa",
 * "ordenador", "CASA"}. Se debe entregar tanto el código de la función como el código de prueba
 * que la usa. La cabecera de la función es la siguiente:
 * 
 * public static String[] sinRepetir(String[] s)
 *
 * @author Guillermo García Fernández
 * @Fecha 19-02-18
 * @Modelo Único
 */


public class Ex08ggf3 {
  public static void main (String[] args){

    String[] a = {"casa", "coche", "sol", "mesa", "mesa", "coche", "tripa", "ordenador", "sol", "CASA", "CASA", "mesa"};

    System.out.println("Array Original: ");
    pintar(a);

    String[] sr = sinRepetir(a);

    System.out.println("\nArray sin palabras repetidas: ");
    pintar(sr);

  }

  /*
   * Devuelve un array unidimensional con los valores no repetidos del array pasado como parametro.
   *
   * @param int[] s array unidimensional con los valores
   *
   * @return int[], array unidimensional con los valores no repetidos
   *
   */
  public static String[] sinRepetir(String[] s) {
    String[] sr = new String[1];
    sr[0] = s[0];
    for (int i = 1; i < s.length; i++){
      if (noEsta(sr, s[i])){
        sr = insertarUltimaPosicion(sr, s[i]);
      }
    }
    return sr;
  }

  /*
   * Inserta un nuevo valor al final de un array unidimensional
   *
   * @param String[] a, array donde insertar el nuevo valor
   * @param String p, valor a insertar en el array
   *
   * @return String[], array con el nuevo valor como último elemento
   * 
   */
  public static String[] insertarUltimaPosicion(String a[], String p){

    String[] temp = new String[a.length + 1];
    for (int i = 0; i < a.length; i++){
      temp[i] = a[i];
    }
    temp[a.length] = p;
    return temp;

  }


  /*
   * Comprueba si un String está o no en un array pasado como parametro.
   *
   * @param String[] a, array donde están todos los valores
   * @param String p, valor a comprobar si está en el array
   *
   * @return: boolean, <b>True</b>, si el String p está en el array a, <b>False</b> si el String p
   * no está en el array a
   * 
   */
  public static boolean noEsta(String a[], String p){

    boolean esta = false;
    int i = 0;
    while ((i < a.length) && (!esta)) {
      esta = a[i].equals(p);
      i++;
    }
    return !esta;

  }

  /*
   * Pinta por pantalla un array unidimensional
   *
   * @param String[][], array a pintar por pantalla
   * 
   */
  public static void pintar (String[] x){

    System.out.print(x[0]);
    for (int i = 1; i < x.length; i++){
      System.out.print(", " + x[i]);
    }
    System.out.println(".");

  }
}
