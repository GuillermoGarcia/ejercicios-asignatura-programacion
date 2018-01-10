/*
 * Pruebas para el paquete con los ejercicios 1 a 14 del Tema 8 * 
 *
 * 
 * @author: Guillermo García 
 */

import ejerciciostema8.Ejercicios1a14Tema8;

public class TestEjercicios1a14 {

  public static void main (String args[]) {

    int[] numeros = new int[16];

    int maximo = Integer.MAX_VALUE / 100;

    numeros[0] = (int)(Math.random() * maximo);
    numeros[1] = (int)(Math.random() * maximo);
    numeros[2] = (int)(Math.random() * 10);
    numeros[3] = (int)(Math.random() * 10);
    numeros[4] = Ejercicios1a14Tema8.siguientePrimo(numeros[1]);
    numeros[5] = (int)Ejercicios1a14Tema8.potencia(numeros[2],numeros[3]);
    numeros[6] = Ejercicios1a14Tema8.digitos(numeros[0]);
    numeros[7] = Ejercicios1a14Tema8.voltea(numeros[0]);
    numeros[8] = Ejercicios1a14Tema8.digitoN(numeros[1],numeros[2]);
    numeros[9] = (numeros[2]<=numeros[3])?Ejercicios1a14Tema8.posicionDeDigito(numeros[1],numeros[2])
                  :Ejercicios1a14Tema8.posicionDeDigito(numeros[1],numeros[3]);
    numeros[10] = (numeros[2]<=numeros[3])?Ejercicios1a14Tema8.quitaPorDetras(numeros[0],numeros[2])
                  :Ejercicios1a14Tema8.quitaPorDetras(numeros[0],numeros[3]);
    numeros[11] = (numeros[2]<=numeros[3])?Ejercicios1a14Tema8.quitaPorDelante(numeros[1],numeros[2])
                  :Ejercicios1a14Tema8.quitaPorDelante(numeros[1],numeros[3]);
    numeros[12] = (numeros[2]<=numeros[3])?Ejercicios1a14Tema8.pegaPorDetras(numeros[0],numeros[2])
                  :Ejercicios1a14Tema8.pegaPorDetras(numeros[0],numeros[3]);
    numeros[13] = (numeros[2]<=numeros[3])?Ejercicios1a14Tema8.pegaPorDelante(numeros[1],numeros[2])
                  :Ejercicios1a14Tema8.pegaPorDelante(numeros[1],numeros[3]);
    numeros[14] = (numeros[2]<=numeros[3])?
                  Ejercicios1a14Tema8.trozoDeNumero(numeros[0],numeros[2],numeros[3]):
                  Ejercicios1a14Tema8.trozoDeNumero(numeros[0],numeros[3],numeros[2]);
    numeros[15] = Ejercicios1a14Tema8.juntaNumeros(numeros[1],numeros[3]);
    String texto = "";

    System.out.println("\n\n\n");
    
    System.out.println(" Pruebas de las funciones de la clase Ejercicios1a14Tema8.\n\n");

    System.out.println("El número " + numeros[0] + ((Ejercicios1a14Tema8.esCapicua(numeros[0]))?" "
    :" no") + " es capicúa.\n");

    if (!Ejercicios1a14Tema8.esPrimo(numeros[1])) { texto = " no"; }
    System.out.println("El número " + numeros[1] + texto + " es primo.\n");
    texto = "";

    System.out.println("El número " + numeros[4] + " es el primer primo mayor al"
    + " número " + numeros[1] + ".\n");

    System.out.println(numeros[2] + " eleveado a " + numeros[3] + " es " + numeros[5] + ".\n");

    System.out.println(numeros[6] + " dígitos tiene el número " + numeros[0] + ".\n");

    System.out.println(numeros[7] + " es el número " + numeros[0] + " al revés.\n");

    System.out.println(numeros[8] + " es el dígito en la posición " + numeros[2] + " del número "
    + numeros[1] + ".\n");

    System.out.println((numeros[9] >= 0)?"En la posición " + numeros[9] + " del número " + numeros[1]
    + " está la " + "primera ocurrencia del dígito " + ((numeros[2]<=numeros[3])?numeros[2]:
    numeros[3]) + ".\n":"En el número " + numeros[1] + " no está el dígito " +
    ((numeros[2]<=numeros[3])?numeros[2]:numeros[3]) + ".\n");

    System.out.println(numeros[10] + " es el resultado de quitarle por detrás al número " +
    numeros[0] + " " + ((numeros[2]<=numeros[3])?numeros[2]:numeros[3]) + " dígitos.\n");

    System.out.println(numeros[11] + " es el resultado de quitarle por delante al número " +
    numeros[1] + " " + ((numeros[2]<=numeros[3])?numeros[2]:numeros[3]) + " dígitos.\n");

    System.out.println(numeros[12] + " es el resultado de pegarle por detrás al número " +
    numeros[0] + " el dígito " + ((numeros[2]<=numeros[3])?numeros[2]:numeros[3]) + ".\n");

    System.out.println(numeros[13] + " es el resultado de pegarle por delante al número " +
    numeros[1] + " el dígito " + ((numeros[2]<=numeros[3])?numeros[2]:numeros[3]) + ".\n");

    System.out.println(numeros[14] + " es la subcadena del número " +
    numeros[0] + " entre la posición " + ((numeros[2]<=numeros[3])?numeros[2]:numeros[3]) +
    " y la posición " + ((numeros[2]<=numeros[3])?numeros[3]:numeros[2]) + ".\n");

    System.out.println(numeros[15] + " es el resultado de juntar los números " + numeros[1] + " y "
    + numeros[3] + ".\n");

  }
}


