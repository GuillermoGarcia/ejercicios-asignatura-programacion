/*
 * Solución Ejercicio 2 Tema 9 Clase Coche
 *
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de la primera. Para
 * la clase Vehiculo, crea los atributos de clase vehiculosCreados y kilometrosTotales, así como el
 * atributo de instancia kilometrosRecorridos. Crea también algún método específico para cada una de
 * las subclases. Prueba las clases creadas mediante un programa con un menú como el que se muestra
 * a continuación:
 * 
 * @author Guillermo García
 */

import java.util.Scanner;

public class Coche extends Vehiculo {

  public Coche(int n){
    super(n);
  }

  /*
   * Usa el coche un número de kilometros que se le pide al usuario
   */
  public void usarCoche() {
    System.out.print("¿Cuantos kilometros andas con este coche? ");
    Scanner s = new Scanner(System.in);
    super.recorrerKilometros(s.nextInt());
  }

  public void quemarRueda(){
    System.out.println("           .      ..");
    System.out.println("   __..---/______//-----.        ((  )");
    System.out.println(" .\".--.```|    - /.--.  =:    ( VROOM! ))  ");
    System.out.println("(.: {} :__L______: {} :__; __--( __- -_= ) ");
    System.out.println("   *--*           *--*");
  }
}
