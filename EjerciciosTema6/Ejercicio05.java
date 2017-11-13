/*
 * Solución Ejercicio 5 Tema 6
 * 
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios.
 * Muestra también el máximo, el mínimo y la media de esos números.
 *  
 * @author Guillermo García
 */

public class Ejercicio05 {
  public static void main (String[] args){

    int suma = 0;
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;

    System.out.print("De los 50 números: ");
    for (int i = 1; i <= 50; i++) {
      int numero = (int)(Math.random()*100) + 100;

      suma += numero; // Vamos guardando la suma para la media

      if (numero > maximo) { maximo = numero; }
      if (numero < minimo) { minimo = numero; }

      System.out.print(numero + ", ");

    }
    System.out.println("el máximo ha sido el " + maximo + ", el mínimo ha sido el " + minimo +
    " y la media ha sido " + ((double)suma / 50) + ".");

  }
}
