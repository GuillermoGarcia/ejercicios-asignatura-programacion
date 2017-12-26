/*
 * Solución Ejercicio 7 Tema 4
 * 
 * Realiza un programa que calcule la media de tres notas.
 * 
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio07 {
  public static void main (String[] args){
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime las tres notas, separadas por espacios, de la que"+
    " vamos a calcular la media: ");
    double notaPrimera = s.nextDouble();
    double notaSegunda = s.nextDouble();
    double notaTercera = s.nextDouble();
        
    if (notaPrimera < 0) {
      System.out.print("No se permite una nota negativa, vuelva a introducir la"+
      "primera nota: ");
      notaPrimera = s.nextDouble();
    } else if (notaSegunda < 0) {
      System.out.print("No se permite una nota negativa, vuelva a introducir la"+
      "segunda nota: ");
      notaSegunda = s.nextDouble();
    } else if (notaTercera < 0) {
      System.out.print("No se permite una nota negativa, vuelva a introducir la"+
      "tercera nota: ");
      notaTercera = s.nextDouble();
    }
    double media = (notaPrimera+notaSegunda+notaTercera)/3;
    
    System.out.printf("La media de las notas %.2f, %.2f, %.2f es de %.4f\n", 
    notaPrimera, notaSegunda, notaTercera, media);
    
  }  
}
