/*
 * Solución Ejercicio 2 Tema 9 Clase Vehiculo
 *
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de la primera. Para
 * la clase Vehiculo, crea los atributos de clase vehiculosCreados y kilometrosTotales, así como el
 * atributo de instancia kilometrosRecorridos. Crea también algún método específico para cada una de
 * las subclases. Prueba las clases creadas mediante un programa con un menú como el que se muestra
 * a continuación:
 * 
 * @author Guillermo García
 */

public abstract class Vehiculo {

  private static int vehiculosCreados = 0; // Atributo de Clase Nº Vehículos Creados
  private static int kilometrosTotales = 0; // Atributo de Clase Kilometros Totales Recorridos

  public static int getVehiculosCreados() {
    return Vehiculo.vehiculosCreados;
  }

  public static int getKilometrosTotales() {
    return Vehiculo.kilometrosTotales;
  }

  private int kilometrosRecorridos; // Kilometros Totales Recorridos por cada vehículo

  public Vehiculo(int n){
    Vehiculo.vehiculosCreados++;
    this.kilometrosRecorridos = n;
  }

  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }

  /*
   * Incrementa los kilometros recorridos por un vehículo así como el total de todos los vehículos
   *
   * @param n número de kilometros recorridos
   * 
   */
  public void recorrerKilometros(int n) {
    this.kilometrosRecorridos += n;
    kilometrosTotales += n;
  }
}
