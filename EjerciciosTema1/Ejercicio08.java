/**
 * Muestra por pantalla una piramide invertida y hueca de base 9 asteriscos
 *
 * @author Guillermo Garcia 
 */

public class Ejercicio08 { // Clase principal
  public static void main(String[] args) {
    String a = "\033[1m*\033[0m"; // Asterisco Negrita
    
    System.out.println("");
    System.out.printf("%s%s%s%s%s%s%s%s%s\n",a,a,a,a,a,a,a,a,a);
    System.out.printf(" %s     %s \n",a,a);
    System.out.printf("  %s   %s  \n",a,a);
    System.out.printf("   %s %s   \n",a,a);
    System.out.printf("    %s    \n",a);
    System.out.println();
  }
}
