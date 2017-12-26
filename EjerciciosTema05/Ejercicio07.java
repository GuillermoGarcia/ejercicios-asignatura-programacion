/*
 * Solución Ejercicio 7 Tema 5
 * 
 * Realiza el control de acceso a una caja fuerte. La combinación será un número
 * de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 *  
 * @author Guillermo García
 */
 
import java.util.Scanner;

public class Ejercicio07 {
  public static void main (String[] args){
    
    Scanner s = new Scanner(System.in);
    
    int combinacion = 8374;
    int numeroIntentos = 4;
    int intento;
    
    do{
      System.out.print("Por favor, introduzca la combinación: ");
      intento = s.nextInt();
      if (intento == combinacion){
        System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
        numeroIntentos = 0;
      } else {
        System.out.println("Lo siento, esa no es la combinación.");
        if (numeroIntentos > 1){
          System.out.println("Puede intentarlo de nuevo.");
        } else {
          System.out.println("Ya no puede intentarlo de nuevo.");
        }
        numeroIntentos--;
      }
    }while (numeroIntentos > 0);
    
  }
}
