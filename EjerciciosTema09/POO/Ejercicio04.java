/*
 * Solución Ejercicio 4 Tema 9 Clase Main
 *
 * Crea la clase Fracción . Los atributos serán numerador y denominador . Y algunos de los métodos
 * pueden ser invierte, simplifica, multiplica, divide, etc....
 *
 *
 *
 * @author Guillermo García
 */

public class Ejercicio04 {
  public static void main (String[] args){

    Fraccion f1 = new Fraccion ((int)((Math.random() * 9) + 1),(int)((Math.random() * 9) + 1));
    System.out.println("Se ha creado la fracción " + f1);

    Fraccion f2 = new Fraccion ((int)((Math.random() * 9) + 1),(int)((Math.random() * 9) + 1));
    System.out.println("Se ha creado la fracción " + f2);

    System.out.println(f1 + " + " + f2 + " = " + f1.suma(f2));
    System.out.println(f1 + " - " + f2 + " = " + f1.resta(f2));
    System.out.println(f1 + " * " + f2 + " = " + f1.multiplica(f2));
    System.out.println(f1 + " / " + f2 + " = " + f1.divide(f2));
    System.out.println("La fracción " + f1 + " invertida es " + f1.invierte());

  }
}
