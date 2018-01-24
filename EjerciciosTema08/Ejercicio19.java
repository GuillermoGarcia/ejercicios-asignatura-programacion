/*
 * Une y amplía los dos programas anteriores de tal forma que se permita convertir un número entre
 * cualquiera de las siguientes bases: decimal, binario, hexadecimal y octal.
 *
 * @author: Guillermo García
 */

import ejerciciostema8.Ejercicios1a14Tema8;


public class Ejercicio19 {

  public static void main (String[] args) {

    int numero = 55;

    System.out.println("El numero Binario " + DecimalABinario(numero) + " en Decimal es " +
    BinarioADecimal(DecimalABinario(numero)) + ".\n");
    System.out.println("El numero Octal " + DecimalAOctal(numero) + " en Decimal es " +
    OctalADecimal(DecimalAOctal(numero)) + ".\n");
    System.out.println("El numero Hexadecimal " + DecimalAHexadecimal(numero) + " en Decimal es " +
    HexadecimalADecimal(DecimalAHexadecimal(numero)) + ".\n");

  }

  public static long DecimalABinario(int numero){

    if (numero > 1) {
      return (DecimalABinario(numero / 2) * 10) + ((long)numero % 2);
    } else {
      return (long)numero;
    }

  }

  public static long DecimalAOctal(int numero){

    if (numero > 7) {
      return (DecimalAOctal(numero / 8) * 10) + ((long)numero % 8);
    } else {
      return numero;
    }

  }

  public static String DecimalAHexadecimal(int numero){

    String hex = "";
    if (numero > 15){
      switch (numero % 16){
        case 10: hex = "A"; break;
        case 11: hex = "B"; break;
        case 12: hex = "C"; break;
        case 13: hex = "D"; break;
        case 14: hex = "E"; break;
        case 15: hex = "F"; break;
        default: hex = "" + (numero % 16);
      }
      return DecimalAHexadecimal(numero / 16) + hex;
    } else {
      switch (numero % 16){
        case 10: hex = "A"; break;
        case 11: hex = "B"; break;
        case 12: hex = "C"; break;
        case 13: hex = "D"; break;
        case 14: hex = "E"; break;
        case 15: hex = "F"; break;
        default: hex = "" + (numero);
      }
      return hex;
    }

  }

  public static long BinarioADecimal(long numero){

    int longitud = Ejercicios1a14Tema8.digitos(numero) - 1;
    int decimal = 0;
    for (int i = 0; i <= longitud; i++) {
      decimal += (Ejercicios1a14Tema8.digitoN(numero,longitud - i) * Ejercicios1a14Tema8.potencia(2,i));
    }
    return decimal;

  }

  public static long OctalADecimal(long numero){

    int longitud = Ejercicios1a14Tema8.digitos(numero) - 1;
    int octal = 0;
    for (int i = 0; i <= longitud; i++) {
      octal += (Ejercicios1a14Tema8.digitoN(numero,longitud - i) * Ejercicios1a14Tema8.potencia(8,i));
    }
    return octal;

  }

  public static long HexadecimalADecimal(String hex){

    int longitud = hex.length();
    long decimal = 0;
    for (int i = longitud; i > 0 ; i--) {
      long base = Ejercicios1a14Tema8.potencia(16,longitud - i);
      switch(hex.substring(i - 1,i)) {
        case "A": decimal += (base * 10); break;
        case "B": decimal += (base * 11); break;
        case "C": decimal += (base * 12); break;
        case "D": decimal += (base * 13); break;
        case "E": decimal += (base * 14); break;
        case "F": decimal += (base * 15); break;
        default: decimal += (base * Integer.parseInt(hex.substring(i - 1,i)));
      }
    }
    return decimal;

  }

}

