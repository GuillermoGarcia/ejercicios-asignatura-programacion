/*
 * Solución Ejercicio 15 Tema 4
 *
 * Escribe un programa que pinte una pirámide rellena con un carácter
 * introducido por teclado que podrá ser una letra, un número o un símbolo
 * como *, +,-, $, &, etc. El programa debe permitir al usuario mediante
 * un menú elegir si el vértice de la pirámide está apuntando hacia
 * arriba, hacia abajo, hacia la izquierda o hacia la derecha.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio15 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    System.out.print("Vamos a pintar una piramide, ¿que caracter desea usar para rellenarla? ");
    String charRelleno = s.next();

    System.out.println("¿Hacia donde desea el vertice de la piramide?");
    System.out.println("1) Vertice Arriba.");
    System.out.println("2) Vertice Abajo.");
    System.out.println("3) Vertice en la Derecha.");
    System.out.println("4) Vertice en la Izquierda.");
    System.out.print("Opción(1 a 4): ");

    int vertice = s.nextInt();

    if ((vertice<1) || (vertice>4)){
      System.out.print("Solo hay 4 opción del 1 al 4: ");
      vertice = s.nextInt();
    }

    System.out.println();
    System.out.println();

    switch(vertice){
      case 1: System.out.printf("%5s\n",charRelleno);
              System.out.printf("%4s%s%s\n",charRelleno, charRelleno, charRelleno);
              System.out.printf("%3s%s%s%s%s\n",charRelleno, charRelleno, charRelleno, charRelleno,
              charRelleno);
              System.out.printf(" %s%s%s%s%s%s%s\n",charRelleno, charRelleno, charRelleno,
              charRelleno, charRelleno, charRelleno, charRelleno);
              System.out.printf("%s%s%s%s%s%s%s%s%s\n",charRelleno, charRelleno, charRelleno,
              charRelleno, charRelleno, charRelleno, charRelleno, charRelleno, charRelleno);
              break;
      case 2: System.out.printf("%s%s%s%s%s%s%s%s%s\n",charRelleno, charRelleno, charRelleno,
              charRelleno, charRelleno, charRelleno, charRelleno, charRelleno, charRelleno);
              System.out.printf(" %s%s%s%s%s%s%s\n",charRelleno, charRelleno, charRelleno,
              charRelleno, charRelleno, charRelleno, charRelleno);
              System.out.printf("%3s%s%s%s%s\n",charRelleno, charRelleno, charRelleno, charRelleno,
              charRelleno);
              System.out.printf("%4s%s%s\n",charRelleno, charRelleno, charRelleno);
              System.out.printf("%5s\n",charRelleno);
              break;
      case 3: System.out.printf("%s\n",charRelleno);
              System.out.printf("%s%s\n",charRelleno, charRelleno);
              System.out.printf("%s%s%s\n",charRelleno, charRelleno, charRelleno);
              System.out.printf("%s%s%s%s\n",charRelleno, charRelleno, charRelleno, charRelleno);
              System.out.printf("%s%s%s%s%s\n",charRelleno, charRelleno, charRelleno, charRelleno,
              charRelleno);
              System.out.printf("%s%s%s%s\n",charRelleno, charRelleno, charRelleno, charRelleno);
              System.out.printf("%s%s%s\n",charRelleno, charRelleno, charRelleno);
              System.out.printf("%s%s\n",charRelleno, charRelleno);
              System.out.printf("%s\n",charRelleno, charRelleno);
              break;
      case 4: System.out.printf("%5s\n",charRelleno);
              System.out.printf("%4s%s\n",charRelleno, charRelleno);
              System.out.printf("%3s%s%s\n",charRelleno, charRelleno, charRelleno);
              System.out.printf("%2s%s%s%s\n",charRelleno, charRelleno, charRelleno, charRelleno);
              System.out.printf("%s%s%s%s%s\n",charRelleno, charRelleno, charRelleno, charRelleno,
              charRelleno);
              System.out.printf("%2s%s%s%s\n",charRelleno, charRelleno, charRelleno, charRelleno);
              System.out.printf("%3s%s%s\n",charRelleno, charRelleno, charRelleno);
              System.out.printf("%4s%s\n",charRelleno, charRelleno);
              System.out.printf("%5s\n",charRelleno, charRelleno);
break;
    }
  }
}
