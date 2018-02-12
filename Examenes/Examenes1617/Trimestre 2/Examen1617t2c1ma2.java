/*
 * Solución Examen 16/17 Trimestre 2 Control 1 Modelo A Ejercicio 2
 * 
 * Realiza una función que tome como parámetro un número y que devuelva un array con los dígitos de
 * ese número separados en cada una de las celdas. Por ejemplo, convierteNumeroEnArray(1728)
 * devolvería un array de cuatro números enteros con el 1 en la posición 0, el 7 en la posición 1,
 * el 2 en la posición 2 y el 8 en la posición 3. La cabecera de la función es la siguiente:
 * public static int[] convierteNumeroEnArray(long n)
 * Verifica que la función es correcta mediante un programa de prueba.
 *  
 * @author Guillermo García
 */


import java.util.Scanner;

public class Examen1617t2c1ma2 {
  public static void main (String[] args){

    //Scanner s = new Scanner(System.in);
    long n = (long)(Math.random() * 99999999) + 10000000;
    int[] numeroEnArray = convierteNumeroEnArray(n);

    System.out.print("El número " + n + " dentro del array: ");

    for (int i = 0; i < numeroEnArray.length; i++) {
      System.out.print(numeroEnArray[i] + " ");
    }
  }

  public static int[] convierteNumeroEnArray(long n){

    if (n < 10) {
      int[] resto = new int[1];
      resto[0] = (int)n;
      return resto;
    } else {
      int[] resto = convierteNumeroEnArray(n / 10);
      int[] numeroArray = new int[resto.length + 1];
      for (int i = 0; i < resto.length; i++){
        numeroArray[i] = resto[i];
      }
      numeroArray[resto.length] = (int)(n % 10);
      return numeroArray;
    }
  }
}
