/**
 * Resolución de Ejercicio 1 de Tema 2
 * 
 * Escribe un programa en el que se declaren las variables enteras x e y.
 * Asignales los valores 144 y 999 respectivamente. A continuación, muestra 
 * por pantalla el valor de cada variable, la suma, la resta, la división y
 *  la multiplicación.
 * 
 * @author Guillermo García Fernández
**/

public class Ejercicio01 {
  public static void main(String[] args) {

    int x = 144;
    int y = 999;

    System.out.println("La variable x tiene un valor de " + x);
    System.out.println("La variable y tiene un valor de " + y);
    System.out.println("La suma de las variables es " + (x + y));
    System.out.println("La resta de las variables es " + (x - y));
    System.out.println("La multiplicación de las variables es " + (x * y));   
    System.out.println("La división de las variables es " + ( (float)x / (float)y));   
  }
}
