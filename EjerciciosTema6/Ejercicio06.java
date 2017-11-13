/*
 * Solución Ejercicio 6 Tema 6
 * 
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y
 * tiene para ello 5 oportunidades. Después de cada intento fallido, el programa dirá cuántas
 * oportunidades quedan y si el número introducido es menor o mayor que el número secreto.
 *  
 * @author Guillermo García
 */


import java.util.Scanner;

public class Ejercicio06 {
  public static void main (String[] args){

    int azar = (int)(Math.random()*101);
    Scanner s = new Scanner(System.in);
    int oportunidades = 5;
    int prueba = 0;

    do {
      System.out.print("¿En que número estoy pensando?: ");
      prueba = s.nextInt();

      if (azar != prueba) {
        oportunidades--;
        if (oportunidades == 0) {
          System.out.println("Has agotado todas las oportunidades. El número era el " + azar + ".");
        } else {
          System.out.print("No estoy pensando en ese número sino en uno ");
          if (azar > prueba) {
            System.out.println("mayor.");
          } else {
            System.out.println("menor.");
          }
          System.out.println("Te quedan " + oportunidades + " oportunidades. Prueba otra vez.");
        }
      } else {
        System.out.println("¡FELICIDADES!, efectivamente era ese número.");
      }


    } while ((azar != prueba) && (oportunidades > 0));

  }
}
