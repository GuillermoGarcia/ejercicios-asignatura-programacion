/*
 * Solución Ejercicio 11 Tema 4
 * 
 * Escribe un programa que dada una hora determinada (horas y minutos),
 * calcule los segundos que faltan para llegar a la medianoche.
 * 
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio11 {
  public static void main (String[] args){
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduzca la hora(hh mm, numeros enteros"+
    "separados por espacio): ");
    int hora = s.nextInt();  
    int minutos = s.nextInt();
    
    if ((hora < 0) || (hora > 24)) {
      System.out.print("Ha introducido la hora mal, solo admitimos valores"
      +" entre 0 y 24, vuelva a introducir la hora: ");
      hora = s.nextInt();  
    }
    if ((minutos < 0) || (minutos > 59)) {
      System.out.print("Ha introducido los minutos mal, solo admitimos valores"
      +" entre 0 y 59, vuelva a introducir los minutos: ");
      minutos = s.nextInt();  
    }
    
    int segundos = ((23-hora)*3600)+((60-minutos)*60);
    
    System.out.printf("Son las %d:%d quedan %d sgundos hasta la medianoche.\n",
    hora, minutos, segundos);
  }
}
