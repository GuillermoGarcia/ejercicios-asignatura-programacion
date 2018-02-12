/*
 * Solución Ejercicio 1 Examen Trimestre 1 Control 1 Modelo B Año 2014
 *
 * Escribe un programa que calcule el sueldo bruto a percibir por un trabajador de la construcción
 * en un mes. El programa debe pedir el cargo desempeñado (un número del 1 al 3) y el número de
 * horas trabajadas. Los cargos existentes son peón, albañil y encargado de obra; con un sueldo base
 * de 1000, 1400 y 1700 euros al mes respectivamente. El sueldo base se cobra trabajando exactamente
 * 140 horas al mes. Si un empleado trabaja menos de 140 horas en un mes, cobra la parte proporcional
 * del sueldo. Si trabaja más de 140 horas, cada hora extra se paga al 2% del salario base, es decir
 * a 20, 28 o 34 euros según el cargo. Por ejemplo, un albañil que haya trabajado 150 horas ganaría
 * 1680 euros (1400 + 280). Un encargado de obra que haya trabajado 70 horas ganaría 850 euros.
 *
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Examen1415t1c1mb1 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);
    int cargo = 0;
    int horas = 0;
    int base = 0;
    float sueldo = 0;

    do {
      System.out.print("\033[1mPor favor, Introduzca el cargo desempeñado (1 a 3):\033[0m ");
      cargo = s.nextInt();
    } while ((cargo<1) && (cargo>3));

    do{
      System.out.print("\033[1mPor favor, Introduzca las horas trabajadas:\033[0m ");
      horas = s.nextInt();
    } while (horas < 0);

    System.out.print("El sueldo del trabajador es ");

    switch(cargo){
      case 1: base = 1000; break; 
      case 2: base = 1400; break;
      case 3: base = 1700; break;
    }

    if (horas > 140){
      int extra = (horas - 140)*2;
      sueldo = base + ((base * extra) / 100);
    } else {
      sueldo = ((float)(base * horas ) / 140);
    }
    
    System.out.printf("%.2f Euros\n", sueldo);

  }
}
