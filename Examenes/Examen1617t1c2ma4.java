/*
 * Solución Examen 16/17 Trimestre 1 Control 2 Modelo A Ejercicio 4
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

public class Examen1617t1c2ma4 {
  public static void main (String[] args){

    
    Scanner s = new Scanner(System.in);

    System.out.println("Vamos a crear un sendero serpenteante con obstaculos.");
    System.out.print("De que longitud quiere que sea el sendero en metros: ");

    int longitud = s.nextInt();
    int espacios = 12; // Número de espacios inicial
    int posObstaculo = -1; // Posición donde aparece el obstaculo

    for (int i = 1; i <= longitud; i++) {

      espacios += ((int)(Math.random() * 3) - 1); // Movemos el sendero

      for (int j = 1; j <= espacios; j++) {
        System.out.print(" "); // Pintamos las espacios
      }

      System.out.print("#"); // Pintamos el borde izquierdo del sendero

      int obstaculo = (int)(Math.random() * 2);
      if (obstaculo == 1) {
        obstaculo = (int)(Math.random() * 2);
        posObstaculo = (int)(Math.random() * 4);
      }
      for (int j = 0; j <= 3; j++) {
        if (posObstaculo == j) {
          switch (obstaculo ) {
            case 1: System.out.print("O"); break; // Pintamos una piedra en el sendero
            default: System.out.print("*"); // Pintamos una planta en el sendero
          }
        } else {
          System.out.print(" "); // Pintamos el sendero
        }
      }
      
      posObstaculo = -1; // Reinicializamos la posición del obstaculo      
      System.out.println("#"); // Pintamos el borde derecho del sendero
    }

  }
}
