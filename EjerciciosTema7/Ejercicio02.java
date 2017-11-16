/*
 * Solución Ejercicio 2 Tema 7
 * 
 * Define un simbolo de 10 caracteres con nombre simbolo y asigna valores a los elementos según la
 * tabla que se muestra a continuación. Muestra el contenido de todos los elementos del simbolo. ¿Qué
 * sucede con los valores de los elementos que no han sido inicializados?
 *  
 * @author Guillermo García
 */

public class Ejercicio02 {
  public static void main (String[] args){

    char[] simbolo = new char[10];

    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[8] = '+';
    simbolo[9] = 'Q';

    for (int i = 0; i <= 9; i++){
      System.out.print(simbolo[i] + ".");
    }
  }
}
