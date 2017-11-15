/*
 * Solución Ejercicio 22 Tema 6
 * 
 * Realiza un programa que pinte por pantalla una serpiente con un “serpenteo” aleatorio. La cabeza
 * se representará con el carácter @ y se debe colocar exactamente en la posición 13 (con 12
 * espacios delante). A partir de ahí, el cuerpo irá serpenteando de la siguiente manera: se
 * generará de forma aleatoria un valor entre tres posibles que hará que el siguiente carácter se
 * coloque una posición a la izquierda del anterior, alineado con el anterior o una posición a la
 * derecha del anterior. La longitud de la serpiente se pedirá por teclado y se supone que el
 * usuario introducirá un dato correcto.
 *  
 * @author Guillermo García
 */


import java.util.Scanner;

public class Ejercicio22 {
  public static void main (String[] args){

    
    Scanner s = new Scanner(System.in);

    System.out.println("Vamos a pintar una serpenteante serpiente: ");
    System.out.print("De que longitud quiere que sea la serpiente contando la cabeza: ");

    int longitud = s.nextInt();
    int espacios = 12; // Número de espacios inicial

    System.out.printf("%13s\n","@"); // Pintamos la cabeza

    for (int i = 2; i <= longitud; i++) {

      espacios += ((int)(Math.random() * 3) - 1); // Movemos la cola -1, 0 o 1

      for (int j = 1; j <= espacios; j++) {
        System.out.print(" "); // Pintamos las espacios
      }

      System.out.println("*"); // Pintamos la cola

    }

  }
}
