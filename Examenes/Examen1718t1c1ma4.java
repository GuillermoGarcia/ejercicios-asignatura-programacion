/*
 * Solución Ejercicio 4 Control 1 Trimestre 1
 *
 * El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8 (todos los que
 * encuentre). Realiza un programa que muestre un número antes y después de haber sido comido por
 * el gusano. Si el animalito no se ha comido ningún dígito, el programa debe indicarlo.
 *
 * @author Guillermo García Fernández
 * @Fecha 8-11-17
 * @Modelo Único
 */

import java.util.Scanner;

public class Examen1718t1c1ma4 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un números entero positivo (mayor que 0): ");
    int numero = s.nextInt();

    int longitud = 0; // Longitud del número original
    int longitudFinal = 0; // Longitud del número tras ser comido
    int resultado =  0; // Donde guardaremos el resultado final
    int temp = numero; // Variable auxiliar que inicializamos con el valor entrado por el usuario
    int aux = 0; // Variable auxiliar

    // Giramos el número
    while (temp > 0){
      aux = (aux * 10) + (temp % 10);
      temp = temp / 10;
      longitud++;
    }

    temp = aux; // Tenemos el número del reves

    // Volvermos a girar el número quitando, esta vez, los 0's y 8's
    while (temp > 0){
      aux = temp % 10;
      if ((aux != 0) && (aux != 8 )) {
        resultado = (resultado * 10) + aux;
        longitudFinal++;
      }
      temp = temp / 10;
    }

    /*
     * Si la longitud del número original es igual al número tras ser comido, es que no se ha
     * comido ningún número
     **/
     
    if (longitud == longitudFinal){ 
      System.out.println("El gusano numérico se ha quedado con hambre ya que no se ha comido" +
      " ningún número.");
    } else {
      if (resultado == 0) { // Si el resultado es 0 es que se los ha comido todos
        System.out.println("El gusano numérico se ha puesto las botas ya que se ha comido el número "
        + numero + " por completo y no ha dejado nada.");
      } else { // Si el resultado es mayor de 0 es que se ha comido unos cuantos
        System.out.println("Después de haber sido comido por el gusano numérico el número " + numero
        + " se ha quedado en " + resultado);
      }
  }
    
  }
}
