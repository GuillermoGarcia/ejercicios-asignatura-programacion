/*
 * Solución Ejercicio 2 Control 1 Trimestre 2 
 *
 * Utiliza la clase anterior para generar una secuencia de 8 fichas creadas de forma aleatoria, que
 * encajen bien y que estén bien colocadas según el juego del dominó. No hay que controlar que si se
 * repiten o no las fichas.
 *
 * @author Guillermo García Fernández
 * @Fecha 19-02-18
 * @Modelo Único
 */


public class Ex08ggf2 {
  public static void main (String[] args){

    FichaDomino f = new FichaDomino((int)(Math.random() * 7), (int)(Math.random() * 7));
    System.out.print(f);

    for (int i = 0; i < 7; i++) {
      f = new FichaDomino(f.getValorDerecho(), (int)(Math.random() * 7));
      System.out.print(f);
    }

  }
}
