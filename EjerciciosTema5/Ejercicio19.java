/*
 * Solución Ejercicio 19 Tema 5
 * 
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por teclado. El
 * carácter con el que se pinta la pirámide también se debe pedir por teclado.
 *  
 * @author Guillermo García
 */
 
import java.util.Scanner;

public class Ejercicio19 {
  public static void main (String[] args){
    
    Scanner s = new Scanner(System.in);

    int n1 = 0;
    int n2 = 0;

    do {
      System.out.print("Por favor, introduzca dos número enteros positivos y distintos: ");
      n1 = s.nextInt();
      n2 = s.nextInt();
    } while (n1 == n2);

    if (n1 > n2) {
      int temp = n1;
      n1 = n2;
      n2 = temp;
    }

    System.out.printf("Los numeros comprendidos entre el %d y el %d, con salto de 7, son", n1, n2);
    
    for (int i = n1; i <= n2 ; i += 7 ) {
      if (i == n1){
        System.out.printf(" %s", i);
      } else {
        System.out.printf(", %s", i);
      }
    }

    System.out.println(".");

  }
}
