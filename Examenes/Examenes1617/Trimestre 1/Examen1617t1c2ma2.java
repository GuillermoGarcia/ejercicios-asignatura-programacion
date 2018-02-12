/*
 * Solución Examen 16/17 Trimestre 1 Control 2 Modelo A Ejercicio 2
 * 
 * Realiza un programa que pinte un sendero aleatorio. Los bordes se pintan con el carácter #. La
 * anchura del sendero siempre es la misma, los dos caracteres del borde más cuatro caracteres en
 * medio, en total 6 caracteres (incluyendo espacios). A cada metro, el sendero puede continuar recto,
 * girar un carácter a la izquierda o girar un carácter a la derecha, por supuesto de forma aleatoria.
 * Porcada metro de sendero – representado por una línea – puede que haya un obstáculo o puede que no,
 * la probabilidad es del 50%. La posición del obstáculo es aleatoria y puede estar entre el primer
 * y el cuarto carácter dentro de la línea. En caso de existir un obstáculo en un metro de sendero
 * (en una línea), puede ser una planta (carácter *) o una piedra (carácter O), la probabilidad de
 * que salga uno u otro es la misma. Recuerda que nunca habrá más de un obstáculo por metro de
 * sendero, habrá uno o ninguno.
 *  
 * @author Guillermo García
 */


import java.util.Scanner;

public class Examen1617t1c2ma2 {
  public static void main (String[] args){

    //Scanner s = new Scanner(System.in);

    System.out.println("Vamos a crear diez número de forma aleatoria: ");

    for (int i = 1; i <= 10; i++) {
      System.out.print((((int)(Math.random() * 22) + 33) * 11) + " ");
    }

  }
}
