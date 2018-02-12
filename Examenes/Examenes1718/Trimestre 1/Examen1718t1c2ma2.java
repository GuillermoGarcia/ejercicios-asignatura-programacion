/*
 * Solución Ejercicio 2 Examen
 *
 * Realiza un programa que muestre la previsión del tiempo para mañana en Málaga. Las temperaturas
 * máxima y mínima se deben generar de forma aleatoria entre los intervalos máximos y mínimos
 * absolutos medidos en las últimas décadas para cada estación. La probabilidad de que esté soleado
 * o nublado en cada estación se proporciona a continuación. Obviamente, la temperatura mínima
 * deberá ser menor o igual que la temperatura máxima.
 *
 * @author Guillermo García Fernández
 * @Fecha 4-12-17
 * @Modelo
 */

import java.util.Scanner;

public class Examen1718t1c2ma2 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    System.out.println("1. Primavera");
    System.out.println("2. Verano");
    System.out.println("3. Otoño");
    System.out.println("4. Invierno");
    System.out.print("Seleccione la estación del año (1-4): ");
    int opcion = s.nextInt();

    /* Guardamos los valores del tiempo en arrays siendo el valor de la posición 0 para primavera
     * 1 para verano, 2 para otoño y 3 para invierno
     */
    int[] temperaturaMinima = {15, 25, 20, 0};
    int[] temperaturaMaxima = {20, 45, 30, 25};
    int[] probabilidadSoleado = {6, 8, 4, 2};

    // Dependiendo de la estación introducida por el usuario generamos los valores aleatorios.
    int rango = temperaturaMaxima[opcion - 1] - temperaturaMinima[opcion - 1] + 1;
    int temperaturaUno = (int)(Math.random() * rango) + temperaturaMinima[opcion - 1];
    int temperaturaDos = (int)(Math.random() * rango) + temperaturaMinima[opcion - 1];
    int soleado =  (int)(Math.random() * 11); // Sera un numero entre 0 y 10 para el % de soleado

    System.out.println("\n\nPrevisión del tiempo para mañana");
    System.out.println("________________________________\n");
    if (temperaturaUno >= temperaturaDos){
      System.out.printf("Temperatura mínima: %dºC%n",temperaturaDos);
      System.out.printf("Temperatura máxima: %dºC%n",temperaturaUno);
    } else {
      System.out.printf("Temperatura mínima: %dºC%n",temperaturaUno);
      System.out.printf("Temperatura máxima: %dºC%n",temperaturaDos);
    }
    if (soleado > probabilidadSoleado[opcion - 1]){
      System.out.println("Nublado.");
    } else {
      System.out.println("Soleado.");
    }
  }
}
