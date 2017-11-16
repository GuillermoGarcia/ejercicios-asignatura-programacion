/*
 * Solución Ejercicio 2 Tema 7
 * 
 * Define un num de 10 caracteres con nombre simbolo y asigna valores a los elementos según la
 * tabla que se muestra a continuación. Muestra el contenido de todos los elementos del num. ¿Qué
 * sucede con los valores de los elementos que no han sido inicializados?
 *  
 * @author Guillermo García
 */

public class Ejercicio01 {
  public static void main (String[] args){

    int[] num = new int[12];

    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;

    for (int i = 0; i <= 11; i++){
      System.out.print(num[i] + " ");
    }
  }
}
