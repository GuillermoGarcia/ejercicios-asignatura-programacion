/**
 * Resolución de Ejercicio 5 de Tema 2
 * 
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se
 * quiere convertir deberá estar almacenada en una variable.
 * 
 * @author Guillermo García Fernández
**/

public class Ejercicio05 {
  public static void main(String[] args) {

    int pesetas = 748302;

    System.out.printf("%d pesetas son %.2f €\n", pesetas,
    ((float)pesetas / (float)166.386));
  }
}
