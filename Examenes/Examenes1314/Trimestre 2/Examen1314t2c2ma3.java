/*
 * Solución Ejercicio 3 Examen Trimestre 2 Control 2 Modelo A Curso 13-14
 *
 * Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga lo que se
 * especifica en los comentarios (puedes incluirla en tu propia biblioteca de rutinas):
 *
 * public static int[] extraePares(int x[]) // Devuelve un array con todos los números pares que se
 *                                          // encuentren en otro array que se pasa como parámetro.
 *                                          // Lógicamente el tamaño del array que se devuelve será
 *                                          // menor o igual al que se pasa como parámetro.
 *
 * @author Guillermo García
 */

public class Examen1314t2c2ma3 {
  public static void main (String[] args){

    int tamanoPrueba = 3;
    int[] prueba = new int[tamanoPrueba];

    for (int i = 0; i < prueba.length; i++){
      prueba[i] = (int)(Math.random() * 1001) + 100;
    }
    System.out.println("Dentro del array: ");
    pintar(prueba);

    System.out.println("Encontramos los siguientes pares: ");
    int[] pares = GestionArray.extraePares(prueba);
    if (pares[0] == -1){
      System.out.println("Ninguno.");
    } else {
      pintar(pares);
    }

  }

  public static void pintar (int[] x){

    System.out.print(x[0]);
    for (int i = 1; i < x.length; i++){
      System.out.print(", " + x[i]);
    }
    System.out.println(".");

  }

}
