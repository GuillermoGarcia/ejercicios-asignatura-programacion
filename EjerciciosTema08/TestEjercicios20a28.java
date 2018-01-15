/*
 * Pruebas para el paquete con los ejercicios 1 a 14 del Tema 8 *
 *
 *
 * @author: Guillermo García
 */

import ejerciciostema8.Ejercicios20a28Tema8;

public class TestEjercicios20a28 {

  public static void main (String args[]) {

    int[] prueba = Ejercicios20a28Tema8.generaArrayInt(11,0,1000);
    int a = (int)(Math.random() * 1001);
    int r = (int)(Math.random() * 10) + 1;
    int l = (int)(Math.random() * 10) + 1;

    System.out.println("Se ha creado el siguiente array de 100 números enteros aleatorios:");
    pintar(prueba);

    System.out.println("El array dado la vuelta sería: ");
    pintar(Ejercicios20a28Tema8.volteaArrayInt(prueba));

    System.out.println("El array tras girarlo " + r + " posiciones a la derecha quedaría: ");
    pintar(Ejercicios20a28Tema8.rotaDerechaArrayInt(r,prueba));

    System.out.println("El array tras girarlo " + l + " posiciones a la izquierda quedaría: ");
    pintar(Ejercicios20a28Tema8.rotaIzquierdaArrayInt(l,prueba));


    System.out.println("El mínimo del array es: " + Ejercicios20a28Tema8.minimoArrayInt(prueba));
    System.out.println("El maximo del array es: " + Ejercicios20a28Tema8.maximoArrayInt(prueba));
    System.out.println("La media del array es: " + Ejercicios20a28Tema8.mediaArrayInt(prueba));
    int p = Ejercicios20a28Tema8.posicionEnArray(a,prueba);
    if (p >= 0) {
      System.out.println("El número " + a + " está en la posición " + p + " del array.");
    } else {
      System.out.println("El número " + a + " no está en el array.");
    }
    System.out.println("El número " + prueba[5] + " está en la posición " +
    Ejercicios20a28Tema8.posicionEnArray(prueba[5],prueba) + " del array.");



  }

  public static void pintar (int[] x){
    System.out.print(x[0]);
    for (int i = 1; i < x.length; i++){
      System.out.print(", " + x[i]);
    }
    System.out.println(".");
  }
}


