/*
 * Solución Ejercicio 19 Tema 6
 * 
 * Escribe un programa que muestre 50 números enteros aleatorios comprendidos entre el -100 y el 200
 * ambos incluidos y separados por espacios. Muestra luego el máximo de los pares el mínimo de los
 * impares y la media de todos los números generados.
 *  
 * @author Guillermo García
 */


import java.util.Scanner;

public class Ejercicio19 {
  public static void main (String[] args){

    
    //Scanner s = new Scanner(System.in);

    int maximoPar = Integer.MIN_VALUE; // Inicializamos al valor mas pequeño de Integer
    int minimoImpar = Integer.MAX_VALUE; // Inicializamos al valor mas grande de Integer
    int suma = 0; // Inicializamos la variable a 0


    System.out.print("Vamos a generar 50 números aleatorios entre -100 y 200.\nNúmeros: ");

    for (int i = 1; i <= 50; i++) {
      
      int numero = (int)(Math.random() * 301) - 100; // Generamos un numero aleatorio

      int mod = numero % 2; // Calculamos su modulo

      if ((mod == 0) && (numero > maximoPar)) { 
      // Si modulo es 0 y es más grande que el valor de maximoPar actualizamos maximoPar
        maximoPar = numero;
      } else if ((mod != 0) && (numero < minimoImpar)) {
      // Si modulo no es 0 y es más pequeño que el valor de minimoImpar actualizamos minimoImpar
        minimoImpar = numero;
      }
      
      suma += numero; // Suma de todos los números

      System.out.print(numero + " ");
    }

    System.out.println("\nEl número Par más grande ha sido el " + maximoPar + ", el número Impar mas"
    + " pequeño ha sido el " + minimoImpar + " y la media de los 50 números es "
    + ((double)suma / 50));
  }
}
