/*
 * Solución Ejercicio 20 Tema 5
 *
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio20 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    int altura = 0;
    int base = 0;
    String c = "";

    do {
      System.out.print("¿De que altura desea la pirámide?: ");
      altura = s.nextInt();
    } while (altura <= 0);

    System.out.print("¿Con que caracter desea rellenar la pirámide?: ");
    c = s.next();


    base = (altura*2)-1;

    for (int i = 1; i <= altura; i++) {
      System.out.print(i+" ");
      if(i == 1){
        for (int j=1; j <= (altura-1); j++){
          System.out.print(" ");
        }
        System.out.print(c);
      } else if (i == altura){
        for (int j = 1; j <= base; j++ ){
          System.out.print(c);
        }
      } else {
        int temp = (i*2)-1;
        for (int j = 1; j <= ((base-temp)/2); j++ ){
          System.out.print(" ");
        }
        System.out.print(c);
        for (int j = 1; j <= temp-2; j++ ){
          System.out.print(" ");
        }
        System.out.print(c);
      }
      System.out.println();
    }
  }
}
