
/*
 * Solución Ejercicio 1 Tema 9 Arrays
 *
 * Utiliza la clase Gato para crear un array de cuatro gatos e introduce los datos de cada uno de
 * ellos mediante un bucle. Muestra a continuación los datos de todos los gatos utilizando también
 * un bucle.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio01 {
  public static void main (String[] args){

    Gato[] gatos = new Gato[4];
    Scanner s = new Scanner(System.in);
    Sexo sexo;

    for (int i = 0; i < 4; i++){
      System.out.print("¿Sexo del gato?(Macho, Hembra): ");
      switch (s.next().toUpperCase()){
        case "HEMBRA": sexo = Sexo.HEMBRA; break;
        default: sexo = Sexo.MACHO;
      }
      System.out.print("¿Raza del gato?: ");
      String raza = s.next();
      System.out.print("¿Color del gato?: ");
      String color = s.next();
      System.out.print("¿Número de patas del gato?: ");
      int patas = s.nextInt();
      System.out.print("¿Número de mamas del gato?: ");
      int mamas = s.nextInt();
      System.out.print("¿Nombre del gato?: ");
      String nombre = s.next();
      gatos[i] = new Gato(sexo, raza, color, patas, mamas, nombre);
    }
    System.out.println("\n\n\n");
    for (int i = 0; i < 4; i++){
      System.out.println(gatos[i]);
    }
  }
}
