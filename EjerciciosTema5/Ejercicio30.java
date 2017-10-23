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
    String priDia = "";
    int segundoDia = 0;
    String segDia = "";
    int primeraHora = 0;
    int segundaHora = 0;
    boolean correcto = false;

    System.out.println("\033[1mPor favor, Introduzca el primer día (Letras) y la hora(0-23).\033[0m");
    do {
      System.out.print("\033[4mDía:\033[0m ");
      priDia = s.next();
      correcto = false;
      switch (priDia.toUpperCase()){
        case "LUNES": primerDia = 1; priDia = "Lunes"; correcto = true; break;
        case "MARTES": primerDia = 2; priDia = "Martes"; correcto = true; break;
        case "MIÉRCOLES":
        case "MIERCOLES": primerDia = 3; priDia = "Miércoles"; correcto = true; break;
        case "JUEVES": primerDia = 4; priDia = "Jueves"; correcto = true; break;
        case "VIERNES": primerDia = 5; priDia = "Viernes"; correcto = true; break;
        case "SABADO": primerDia = 6; priDia = "Sabado"; correcto = true; break;
        case "DOMINGO": primerDia = 7; priDia = "Domingo"; correcto = true; break;
      }
      if (!correcto) { System.out.println("Día incorrecto, intentelo de nuevo."); }
    } while (!correcto);
    do {
      System.out.print("\033[4mHora:\033[0m ");
      primeraHora = s.nextInt();
      if ((primeraHora < 0) && (primeraHora > 23)) {
        System.out.println("Hora incorrecta (0 - 23), intentelo de nuevo.");
      }
    } while ((primeraHora < 0) && (primeraHora > 23));

    System.out.println("\033[1mPor favor, Introduzca el segundo día (Letras) y la hora(0-23).\033[0m");
    do {
      System.out.print("\033[4mDía:\033[0m ");
      segDia = s.next();
      correcto = false;
      switch (segDia.toUpperCase()){
        case "LUNES": segundoDia = 1; segDia = "Lunes"; correcto = true; break;
        case "MARTES": segundoDia = 2; segDia = "Martes"; correcto = true; break;
        case "MIÉRCOLES":
        case "MIERCOLES": segundoDia = 3; segDia = "Miércoles"; correcto = true; break;
        case "JUEVES": segundoDia = 4; segDia = "Jueves"; correcto = true; break;
        case "VIERNES": segundoDia = 5; segDia = "Viernes"; correcto = true; break;
        case "SABADO": segundoDia = 6; segDia = "Sabado"; correcto = true; break;
        case "DOMINGO": segundoDia = 7; segDia = "Domingo"; correcto = true; break;
      }
      if (!correcto) { System.out.println("Día incorrecto, intentelo de nuevo."); }
      else if (segundoDia < primerDia) {
        System.out.println("El segundo día no puede ser anterior al primero. Intentelo de nuevo.");
        correcto = false;
      }
    } while (!correcto);
    do {
      System.out.print("\033[4mHora:\033[0m ");
      segundaHora = s.nextInt();
      if ((segundaHora < 0) && (segundaHora > 23)) {
        System.out.println("Hora incorrecta (0 - 23), intentelo de nuevo.");
      }
    } while ((segundaHora < 0) && (segundaHora > 23));

    System.out.println("Entre las " + primeraHora + ":00h del " + priDia + " y las " + segundaHora
    + ":00h del " + segDia + " hay " + (((segundoDia - primerDia)*24) + (segundaHora - primeraHora))
    + " horas.");

    

  }
}
