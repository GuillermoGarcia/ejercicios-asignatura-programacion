/*
 * Solución Ejercicio 2 Tema 9 Clase Main
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


public class Ejercicio02 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);
    int opc = 0;
    Bicicleta orbea = new Bicicleta(0);
    Coche ibiza = new Coche(0);

    while (opc != 8){
      System.out.println("\nVEHICULOS");
      System.out.println("=========");
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.println("Elige una opción (1-8): ");

      opc = s.nextInt();

      switch(opc){
        case 1: orbea.usarBicicleta();
                break;
        case 2: orbea.hacerCaballito();
                break;
        case 3: ibiza.usarCoche();
                break;
        case 4: ibiza.quemarRueda();
                break;
        case 5: System.out.println("Hemos hecho un total de " + orbea.getKilometrosRecorridos() +
                " kilometros con la bicicleta.");
                break;
        case 6: System.out.println("Hemos hecho un total de " + ibiza.getKilometrosRecorridos() +
                " kilometros con el coche.");
                break;
        case 7: System.out.println("Hemos hecho un total de " + orbea.getKilometrosTotales() +
                " con todos los vehículos.");
                break;
        default: System.out.println("Gracias por usar nuestros vehículos.");
      }
    }
  }
}
