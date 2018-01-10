/*
 * Escribe un programa que pase de binario a decimal.
 * 
 * @author: Guillermo García
 */

import ejerciciostema8.Ejercicios1a14Tema8;


public class Ejercicio17 {
  
  public static void main (String[] args) {

    long numero = 1100111001;

    System.out.println("El numero binario " + numero + " en decimal es " + BinarioADecimal(numero) + ".\n");

  }

  public static long BinarioADecimal(long numero){

    int longitud = Ejercicios1a14Tema8.digitos(numero) - 1;
    int decimal = 0;
    for (int i = 0; i <= longitud; i++) {
      decimal += (Ejercicios1a14Tema8.digitoN(numero,longitud - i) * Ejercicios1a14Tema8.potencia(2,i));
    }
    return decimal;
  }
}

