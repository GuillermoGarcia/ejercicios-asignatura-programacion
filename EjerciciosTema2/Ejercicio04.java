/**
 * Resolución de Ejercicio 4 de Tema 2
 * 
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere 
 * convertir deberá estar almacenada en una variable.
 * 
 * @author Guillermo García Fernández
**/

public class Ejercicio04 {
  public static void main(String[] args) {

    int euros = 368;

    System.out.println(euros + " € son " + (int)((float)euros * (float)166.386) + " pesetas");
  }
}
