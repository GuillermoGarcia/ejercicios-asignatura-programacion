/*
 * Solución Ejercicio 3 Examen
 *
 * Escribe un programa que rellene un array de 15 elementos con números enteros comprendidos entre 0
 * y 500 (ambos incluidos). A continuación, se mostrará el array “cincuerizado”, según el siguiente
 * criterio: si el número que hay en una posición del array es múltiplo de 5, se deja igual, y si no,
 * se cambia por el siguiente múltiplo de 5 que exista a partir de él. Utiliza dos arrays, uno para
 * contener los números originales y otro para guardar el resultado.
 *
 * @author Guillermo García Fernández
 * @Fecha 4-12-17
 * @Modelo Único
 */


public class Examen1718t1c2ma3 {
  public static void main (String[] args){
    int[] numeros = new int[15];
    int[] cincuerizado = new int[numeros.length];

    System.out.println("Vamos a generar 15 números aleatorios entre 0 y 500.");

    // Generamos los numeros aleatorios que guardamos en el array
    for (int i = 0; i <= (numeros.length-1); i++) {
      numeros[i] = (int)(Math.random() * 501);
    }

    // Recorremos el array cincuerizando, si es necesario, los números
    for (int i = 0; i <= (numeros.length-1); i++) {
      if ((numeros[i] % 5) == 0) {
        cincuerizado[i] = numeros[i];
      } else {
        cincuerizado[i] = numeros[i] - (numeros[i] % 5) + 5;
      }
    }
    System.out.println("Array Original:");
    for (int numero : numeros) {
      System.out.print(numero + " ");
    }

    System.out.println("\nArray cincuerizado:");
    for (int numero : cincuerizado) {
      System.out.print(numero + " ");
    }

  }
}
