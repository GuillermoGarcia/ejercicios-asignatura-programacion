/*
 * Solución Ejercicio 4 Examen
 *
 * El pequeño Roberto tenía como mascota un pececillo dentro de una pecera. Los Reyes Magos le han
 * traído un caballito de mar ($) y una caracola (@) para que le hagan compañía al pez. Realiza un
 * programa que pinte por pantalla la pecera con los tres animalitos acuáticos colocados dentro en
 * posiciones aleatorias. Por una cuestión de física elemental, ninguno de los animales puede
 * coincidir en la misma posición. Se debe pedir al usuario el ancho y el alto de la pecera, que
 * como mínimo serán de 4 unidades.
 *
 * @author Guillermo García Fernández
 * @Fecha 4-12-17
 * @Modelo
 */

import java.util.Scanner;

public class Examen1718t1c2ma4 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    System.out.print("¿Cúal va a ser la altura de la pecera? ");
    int altura = s.nextInt();
    System.out.print("¿Cúal va a ser la anchura de la pecera? ");
    int anchura = s.nextInt();

    int pezAltura = (int)(Math.random() * (altura - 2)) + 1;
    int pezAnchura = (int)(Math.random() * (anchura - 2)) + 1;
    int caballitoAltura = 0;
    int caballitoAnchura = 0;
    int caracolaAltura = 0;
    int caracolaAnchura = 0;

    do {
      caballitoAltura = (int)(Math.random() * (altura - 2)) + 1;
      caballitoAnchura = (int)(Math.random() * (anchura - 2)) + 1;
    } while ((caballitoAltura == pezAltura) && (caballitoAnchura == pezAnchura));

    do {
      caracolaAltura = (int)(Math.random() * (altura - 2)) + 1;
      caracolaAnchura = (int)(Math.random() * (anchura - 2)) + 1;
    } while (((caracolaAltura == pezAltura) && (caracolaAnchura == pezAnchura)) ||
            ((caracolaAltura == caballitoAltura) && (caracolaAnchura == caballitoAnchura)));


    System.out.println();

    for (int i = 0; i < altura; i++) {

      for (int j = 0; j < anchura; j++) {

        if ((i == 0) || (i == (altura - 1))) {
          System.out.print("*");
        } else if ((j == 0) || (j == (anchura - 1))) {
          System.out.print("*");
        } else if ((i == pezAltura) && (j == pezAnchura)){
          System.out.print("&");
        } else if ((i == caballitoAltura) && (j == caballitoAnchura)){
          System.out.print("$");
        } else if ((i == caracolaAltura) && (j == caracolaAnchura)){
          System.out.print("@");
        } else {
          System.out.print(" ");
        }
        System.out.print(" ");
      }
      
      System.out.println();
      
    }

  }
}
