/*
 * Solución Ejercicio 12 Tema 6
 * 
 * Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el código
 * ascii entre el 32 y el 126. Puedes hacer casting con (char) para convertir un entero en un
 * carácter.
 *  
 * @author Guillermo García
 */


import java.util.Scanner;

public class Ejercicio12 {
  public static void main (String[] args){

    
    //Scanner s = new Scanner(System.in);

    System.out.println("¡¡MATRIX!!.");

    int sob = 0;

    for (int i = 1; i <= 20000; i++ ){
      //System.out.print("Nota " + i + ": ");
      char azar = (char)((int)(Math.random()*94) + 32);
      System.out.print(azar);
/*      switch (azar) {
        case 0: System.out.print("Suspenso"); sus++; break;
        case 1: System.out.print("Suficiente"); suf++; break;
        case 2: System.out.print("Bien"); bie++; break;
        case 3: System.out.print("Notable"); not++; break;
        default: System.out.print("Sobresaliente"); sob++;
      }
      System.out.println();*/
    }
    /*System.out.println("Han salido " + sus + " Suspensos, " + su + " Suficientes, " + bie +
    " Bien, " + not + " Notables, " + sob + " Sobresalientes.");*/
  }
}
