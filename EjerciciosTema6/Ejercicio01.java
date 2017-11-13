/*
 * Solución Ejercicio 1 Tema 6
 * 
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma total
 * (los puntos que suman entre los tres dados).
 *  
 * @author Guillermo García
 */

public class Ejercicio01 {
  public static void main (String[] args){

    int suma = 0;
    
    for (int i=1;i<=3;i++){
      int dado = (int)(Math.random()*5)+1;
      switch(i){
        case 2: System.out.print("El segundo dado ha salido "); break;
        case 3: System.out.print("El tercer dado ha salido "); break;
        default: System.out.print("El primer dado ha salido ");
      }
      System.out.println(dado + ".");
      suma += dado;
    }
    System.out.println("La suma total de los dados es " + suma + ".");
  }
}
