/*
 * Solución Ejercicio 3 Tema 6
 * 
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de 40 cartas:
 * 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 *  
 * @author Guillermo García
 */

public class Ejercicio03 {
  public static void main (String[] args){

    int carta = (int)(Math.random()*9)+1;;
    if (carta == 1){
      System.out.print("As");
    } else if (carta > 6){
      switch (carta){
        case 7: System.out.print("Sota"); break;
        case 8: System.out.print("Caballo"); break;
        case 9: System.out.print("Rey"); break;
      }
    } else {
      System.out.print(carta);
    }

    switch ((int)(Math.random()*4)+1) {
      case 1: System.out.println(" de Bastos."); break;
      case 2: System.out.println(" de Espadas."); break;
      case 3: System.out.println(" de Oros."); break;
      default: System.out.println(" de Copas.");
    }

  }
}
