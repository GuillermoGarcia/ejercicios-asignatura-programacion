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

    int altura = 0;
    int base = 0;
    String c = "";

    do {
      System.out.print("¿De que altura desea la pirámide?: ");
      altura = s.nextInt();
    } while (altura <= 0);

    System.out.print("¿Con que caracter desea rellenar la pirámide?: ");
    c = s.next();
    
    base = altura-1;
    base = (base*2);

    for (int i = 1; i <= altura; i++) {
      if(i == 1){
        for (int j=1; j <= (base/2); j++){
          System.out.print(" ");
        }
        System.out.print(c);
      } else {
        int temp = (i*2)+1;
        for (int j=1; j <= (temp/2); j++ ){
          System.out.print(" ");
        }          
        for (int j=1; j <= temp; j++ ){
          System.out.print(c);
        }
      }
      System.out.println();
    }
  }
}
