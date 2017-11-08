/*
 * Solución Ejercicio 3 Control 1 Trimestre 1
 *
 * Una empresa de cartelería nos ha encargado un programa para realizar uno de sus diseños. Debido a
 * los últimos acontecimientos que han tenido lugar en Cataluña, han recibido muchos pedidos del
 * cartel que muestra el número 155. Realiza un programa que pinte el número 155 mediante asteriscos.
 * Al usuario se le pedirán dos datos, la altura del cartel y el número de espacios que habrá entre
 * los números. La altura mínima es 5. La anchura de los números siempre es la misma. La parte
 * superior de los cincos también es siempre igual. La parte inferior del 5 sí que varía en función
 * de la altura.
 *
 * @author Guillermo García Fernández
 * @Fecha 8-11-17
 * @Modelo Único
 */

import java.util.Scanner;

public class Examen1718t1c1ma3 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca la altura de los números (mínimo 5): ");
    int altura = s.nextInt();

    System.out.print("Introduzca la cantidad de espacios entre los números (mínimo 1): ");
    int separacion = s.nextInt();

    for (int i = 1; i <= altura; i++){ // Para toda la altura 
      System.out.print("*"); // * del 1

      for (int j = 1; j <= separacion; j++){ // Separacion entre el 1 y el primer 5
        System.out.print(" ");
      }
      
      if ((i == 1) || (i == 3) || i == altura) { // La 1ª, la 3ª y la última fila son iguales
        System.out.print("****");
      } else if (i == 2) {                     // La parte superior siempre tiene una fila 
        System.out.print("*   ");
      } else {                                // La parte inferior crece dependiendo de la altura
        System.out.print("   *");
      } 

      for (int j = 1; j <= separacion; j++){ // Separacion entre el primer y el segundo 5
        System.out.print(" ");
      }

      if ((i == 1) || (i == 3) || i == altura) { // La 1ª, la 3ª y la última fila son iguales
        System.out.print("****");
      } else if (i == 2){                      // La parte superior siempre tiene una fila
        System.out.print("*   ");
      } else {                                // La parte inferior crece dependiendo de la altura
        System.out.print("   *");
      }

      System.out.println(); // Salto final de cada fila
    }

  }
}
