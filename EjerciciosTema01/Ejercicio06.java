/**
 * Muestra por pantalla una piramide de base 9 asteriscos
 * Ejercicio 6 Tema 1
 * @author Guillermo Garcia 
**/

public class Ejercicio06 { // Clase principal
  public static void main(String[] args) {
    String a = "\033[5m*\033[0m"; // Asterisco
    String ab = "\033[1m*\033[0m"; // Asterisco Negrita
    
    System.out.printf("    %s    \n",ab);
    System.out.printf("   %s%s%s   \n",ab,a,ab);
    System.out.printf("  %s%s%s%s%s  \n",ab,a,a,a,ab);
    System.out.printf(" %s%s%s%s%s%s%s \n",ab,a,a,a,a,a,ab);
    System.out.printf("%s%s%s%s%s%s%s%s%s\n",ab,ab,ab,ab,ab,ab,ab,ab,ab);
    System.out.println();
  }
}
