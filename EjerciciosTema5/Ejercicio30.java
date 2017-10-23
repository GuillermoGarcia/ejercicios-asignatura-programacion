/*
 * Solución Ejercicio 30 Tema 5
 *
 * Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de la
 * semana. No se tendrán en cuenta los minutos ni los segundos. El día de la semana se puede pedir
 * como un número (del 1 al 7) o como una cadena (de “lunes” a “domingo”). Se debe comprobar que el
 * usuario introduce los datos correctamente y que el segundo día es posterior al primero.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio30 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    long factorial = 1;
    int primerDia = 0;
    int segundoDia = 0;
    int primeraHora = 0;
    boolean primero = true;

    System.out.println("\033[1mPor favor, Introduzca el primer día (Letras) y la hora.\033[0m");
    do {
      System.out.println("\033[4mDía: \033[0m");
      String dia = s.next();
      boolean correcto = false;
      switch (dia.toUpperCase()){
        case "LUNES": primerDia = 1; correcto = true; break;
        case "MARTES": primerDia = 2; correcto = true; break;
        case "MIÉRCOLES":
        case "MIERCOLES": primerDia = 3; correcto = true; break;
        case "JUEVES": primerDia = 4; correcto = true; break;
        case "VIERNES": primerDia = 5; correcto = true; break;
        case "SABADO": primerDia = 6; correcto = true; break;
        case "DOMINGO": primerDia = 7; correcto = true; break;
      }
      if (!correcto) { System.out.println("Día incorrecto, intentelo de nuevo."); }
    } while (!correcto);
    do {
      System.out.println("\033[4mHora: \033[0m");
      primeraHora = s.nextInt();
      if ((primeraHora > 0) && (primeraHora < 23)) { System.out.println("Día incorrecto, intentelo de nuevo."); }
    } while ((primeraHora > 0) && (primeraHora < 23));

    System.out.print("\033[1mPor favor, Introduzca la segunda hora: \033[0m");
    do {
      System.out.println("\033[4mDía: \033[0m");
      String dia = s.next();
      boolean correcto = false;
      switch (dia.toUpperCase()){
        case "LUNES": segundoDia = 1; correcto = true; break;
        case "MARTES": segundoDia = 2; correcto = true; break;
        case "MIÉRCOLES":
        case "MIERCOLES": segundoDia = 3; correcto = true; break;
        case "JUEVES": segundoDia = 4; correcto = true; break;
        case "VIERNES": segundoDia = 5; correcto = true; break;
        case "SABADO": segundoDia = 6; correcto = true; break;
        case "DOMINGO": segundoDia = 7; correcto = true; break;
      }
    } while (!correcto);
    System.out.println("\033[4mHora: \033[0m");
    int segundaHora = s.nextInt();

    System.out.print("Entre las " + primeraHora + ":00h del " + primerDia + " y las " + segundaHora
    + ":00h del " + segundoDia + " hay ");


  }
}
