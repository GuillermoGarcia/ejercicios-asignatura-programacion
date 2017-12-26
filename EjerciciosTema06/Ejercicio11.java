/*
 * Solución Ejercicio 11 Tema 6
 * 
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de la forma:
 * suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número de suspensos,
 * el número de suficientes, el número de bienes, etc.
 *  
 * @author Guillermo García
 */


import java.util.Scanner;

public class Ejercicio11 {
  public static void main (String[] args){

    
    //Scanner s = new Scanner(System.in);

    System.out.println("Vamos crear 20 notas de forma aleatoria.");

    int sus = 0;
    int suf = 0;
    int bie = 0;
    int not = 0;
    int sob = 0;

    for (int i = 1; i <= 20; i++ ){
      System.out.print("Nota " + i + ": ");
      int nota = (int)(Math.random()*5);
      switch (nota) {
        case 0: System.out.print("Suspenso"); sus++; break;
        case 1: System.out.print("Suficiente"); suf++; break;
        case 2: System.out.print("Bien"); bie++; break;
        case 3: System.out.print("Notable"); not++; break;
        default: System.out.print("Sobresaliente"); sob++;
      }
      System.out.println();
    }
    System.out.println("Han salido " + sus + " Suspensos, " + suf + " Suficientes, " + bie +
    " Bien, " + not + " Notables, " + sob + " Sobresalientes.");
  }
}
