/*
 * Solución Ejercicio 24 Tema 4
 *
 * Escribe un programa que genere la nómina (bien desglosada) de un empleado según las siguientes
 * condiciones:
 * • Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto),
 *   los días que ha estado de viaje visitando clientes durante el mes y su estado civil
 *   (1 - Soltero, 2 - Casado).
 * • El sueldo base según el cargo es de 950, 1200 y 1600 euros según si se trata de un prog.
 *   junior, un prog. senior o un jefe de proyecto respectivamente.
 * • Por cada día de viaje visitando clientes se pagan 30 euros extra en concepto de dietas. Al
 *   sueldo neto hay que restarle el IRPF, que será de un 25% en caso de estar soltero y un 20% en
 *   caso de estar casado.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio24 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    System.out.println("De los siguiente cargos:");
    System.out.println("1 - Programador Junior");
    System.out.println("2 - Programador Senior");
    System.out.println("3 - Jefe de Proyecto");
    System.out.print("¿Cual es el cargo del Empleado? (1 - 3): ");
    int cargo = s.nextInt();
    System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
    int diasViaje = s.nextInt();
    System.out.println("De los siguientes estado civil:");
    System.out.println("1 - Soltero");
    System.out.println("2 - Casado");
    System.out.print("¿Que estado civil tiene el empleado?: ");
    int estadoCivil = s.nextInt();

    double sueldo = 0;
    double dietas = (double)diasViaje*30;
    double retencion = 0;

    System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");

    switch(cargo){
      case 1: sueldo = 950; break;
      case 2: sueldo = 1200; break;
      case 3: sueldo = 1600; break;
    }

    System.out.printf("█ Sueldo Base              %4.2f █\n",sueldo);

    switch (diasViaje) {
      case 0: System.out.printf("█ Dietas ( Ningún viaje )  %4.2f █\n",dietas); break;
      case 1: System.out.printf("█ Dietas ( 1 viaje )        %4.2f █\n",dietas); break;
      default: System.out.printf("█ Dietas ( %d viajes )       %4.2f █\n",diasViaje, dietas);
    }

    System.out.println("█■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■█");
    sueldo += dietas;
    System.out.printf("█ Sueldo Bruto             %4.2f █\n",sueldo);

    if (estadoCivil == 1) {
      retencion = sueldo * 0.25;
      System.out.printf("█ Retención IRPF (25%s)     %4.2f █\n", "%", retencion);
    } else {
      retencion = sueldo * 0.2;
      System.out.printf("█ Retención IRPF (20%s)      %4.2f █\n", "%", retencion);
    }
    sueldo = sueldo-retencion;
    System.out.println("█■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■█");
    System.out.printf("█ Sueldo Neto              %4.2f █\n", sueldo);
    System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");

  }
}
