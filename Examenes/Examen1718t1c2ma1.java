/*
 * Solución Ejercicio 1 Examen
 *
 * Realiza un programa que genere 20 números aleatorios entre 2 y 100. A continuación, el programa
 * deberá mostrar un listado con todos los números primos encontrados. Si no existiera ningún primo,
 * el programa deberá mostrar el mensaje “No se ha encontrado ningún número primo.”
 *
 * @author Guillermo García Fernández
 * @Fecha 4-12-17
 * @Modelo Único
 */



public class Examen1718t1c2ma1 {
  public static void main (String[] args){

    int[] numeros = new int[20];
    boolean noHayPrimo = true;

    System.out.println("Vamos a generar 20 números aleatorios entre 2 y 100.");

    // Generamos los numeros aleatorios que guardamos en el array
    for (int i = 0; i <= (numeros.length-1); i++) {
      numeros[i] = (int)(Math.random() * 99) + 2;
    }

    // Recorremos el array para mostrar todos los números generados
    System.out.println("Los números que han sido generados son: ");
    for (int numero : numeros){
      System.out.print(numero + " ");
    }

    // Volvemos a recorrer el array para mostrar los números primos
    
    for (int numero : numeros){
      boolean esPrimo = true;
      int divisor = 2;

      do {
        if ((numero % divisor) == 0){
          esPrimo = false;
        }
        divisor++;
      } while ((esPrimo) && (divisor <= Math.sqrt(numero)));
      if (esPrimo) {
        if (noHayPrimo){
          System.out.print("\nNúmeros primos encontrados: ");
          noHayPrimo = false;
        }
        System.out.print(numero + " ");
      }
    }
    if (noHayPrimo) {
      System.out.print("\nNo se ha encontrado ningún número primo.");
    }
    System.out.println();
  }
}
