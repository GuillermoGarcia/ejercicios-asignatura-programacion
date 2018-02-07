/*
 * Solución Ejercicio 2 Tema 9 Clase Bicicleta
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

public class Bicicleta extends Vehiculo {

  public Bicicleta(int n){
    super(n);
  }

  /*
   * Usa la bicicleta un número de kilometros que se le pide al usuario
   */
  public void usarBicicleta() {
    System.out.print("¿Cuantos kilometros andas con esta bicicleta? ");
    Scanner s = new Scanner(System.in);
    super.recorrerKilometros(s.nextInt());
  }

  public void hacerCaballito(){
    System.out.println("    ~~O");
    System.out.println("  -  /\\,");
    System.out.println(" -  -|~(*)");
    System.out.println("-  (*)");
    System.out.println("^^^___________");
  }
}
