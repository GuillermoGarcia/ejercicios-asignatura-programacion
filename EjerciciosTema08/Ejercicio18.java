/*
 * Escribe un programa que pase de decimal a binario.
 * 
 * @author: Guillermo García
 */

import ejerciciostema8.Ejercicios1a14Tema8;


public class Ejercicio18 {
  
  public static void main (String[] args) {

    int numero = 454457;

    System.out.println("El numero " + numero + " en binario es " + DecimalABinario(numero) + ".\n");

  }

  public static long DecimalABinario(int numero){

    if (numero > 1) {
      return (DecimalABinario(numero / 2) * 10) + ((long)numero % 2);
    } else {
      return 1;
    }
  }
}

