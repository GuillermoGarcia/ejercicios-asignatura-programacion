/*
 * Solución Ejercicio 18 Tema 5
 * 
 * Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos
 * por teclado y validados como distintos, el programa debe empezar por el menor de los enteros
 * introducidos e ir incrementando de 7 en 7.
 *  
 * @author Guillermo García
 */
 
import java.util.Scanner;

public class Ejercicio18 {
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
