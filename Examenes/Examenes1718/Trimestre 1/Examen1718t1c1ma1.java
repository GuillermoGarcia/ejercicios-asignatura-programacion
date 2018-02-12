/*
 * Solución Ejercicio 1 Control 1 Trimestre 1 
 *
 * Realiza un programa que calcule el máximo, el mínimo y la media de una serie de números enteros
 * positivos introducidos por teclado. El programa terminará cuando el usuario introduzca un número
 * primo. Este último número no se tendrá en cuenta en los cálculos. El programa debe indicar también
 * cuántos números ha introducido el usuario (sin contar el primo que sirve para salir).
 *
 * @author Guillermo García Fernández
 * @Fecha 8-11-17
 * @Modelo Único
 */

import java.util.Scanner;

public class Examen1718t1c1ma1 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    System.out.println("Para este ejercicio le vamos a pedir números enteros positivos hasta que " +
    "introduzca un primo.");

    boolean esPrimo = true; // Asumimos inicialmente que el número es primo
    int numero = 0;

    /* Inicializamos la variable al valor más pequeño posible, valdría poner -999999999 */
    int maximo = Integer.MIN_VALUE;
    /* Inicializamos la variable al valor más grande posible, valdría poner 999999999 */
    int minimo = Integer.MAX_VALUE;
    int suma = 0; // Variable para guardar la suma de todos los números
    int cantidad = 0; // Variable para guardar la cantidad de números introducidos

    do {

      System.out.print("Introduzca un número entero positivo: ");
      numero = s.nextInt();

      int divisor = 2;
      long tope = Math.round(Math.sqrt(numero)); // Calculamos el tope para el divisor
      
      esPrimo = true; // Reinicializamos la variable de si es primo

      // Mientras no lleguemos al tope y los modulos no sean 0 el numero sigue siendo primo
      while ((esPrimo) && (divisor <= tope)) {
        if ((numero % divisor) != 0) {
          divisor++;
        } else {
          esPrimo = false;
        }
      }
      
      // Solo si no es primo usamos el número
      if (!esPrimo){
        suma += numero;
        cantidad++;
        if (numero > maximo) { maximo = numero; }
        if (numero < minimo) { minimo = numero; }
      }

    } while (!esPrimo);

    float media = (float)suma / cantidad; // Calculamos la media

    if (cantidad > 0) {
      if (cantidad == 1) {
        System.out.println("\nHas introducido " + cantidad + " número no primo.");
      } else {
        System.out.println("\nHas introducido " + cantidad + " números no primos.");
      }
      System.out.println("Máximo: " + maximo);
      System.out.println("Mínimo: " + minimo);
      System.out.printf("Media: %.2f\n", media);
    } else {
      System.out.println("Si el primer número que introduce es un número primo pocos calculos" +
      " podré hacer.");
    }
    

  }
}
