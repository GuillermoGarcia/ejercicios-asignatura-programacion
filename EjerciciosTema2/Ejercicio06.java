/**
 * Resolución de Ejercicio 6 de Tema 2
 * 
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible (precio sin IVA). La base imponible estará almacenada en una
 * variable.
 *
 * @author Guillermo García Fernández
**/

public class Ejercicio06 {
  public static void main(String[] args) {

    int baseImponible = 345;

    System.out.println("Siendo la base imponible " + baseImponible + " el IVA es "
     + ((float)baseImponible * (float)0.21) + " para un total de "
     + ((float)baseImponible * (float)1.21));
  }
}
