/*
 * Solución Ejercicio 8 Tema 4
 * 
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente).
 * 
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio08 {
  public static void main (String[] args){
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime las tres notas, separadas por espacios, de la que"+
    " vamos a calcular la media: ");
    double notaPrimera = s.nextDouble();
    double notaSegunda = s.nextDouble();
    double notaTercera = s.nextDouble();
    String notaBoletin = "";
        
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
    
    if (media < 5) {
      notaBoletin = "¡Insuficiente!";
    } else if (media < 6){
      notaBoletin = "¡Suficiente!";
    } else if (media < 7){
      notaBoletin = "¡Bien!";
    } else if (media < 9){
      notaBoletin = "¡Notable!";
    } else {
      notaBoletin = "¡Sobresaliente!";
    }
    System.out.printf("La media de las notas %.2f, %.2f, %.2f es de %.4f.\n"+
    "En el boletin tendrá una nota de %s.\n", notaPrimera, notaSegunda,
    notaTercera, media, notaBoletin);
    
  }  
}
