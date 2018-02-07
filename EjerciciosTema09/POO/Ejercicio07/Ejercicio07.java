/*
 * Solución Ejercicio 7 Tema 9 Clase Main
 *
 * Queremos gestionar la venta de entradas (no numeradas) de Expocoches Campanillas que tiene 3
 * zonas, la sala principal con 1000 entradas disponibles, la zona de compra-venta con 200 entradas
 * disponibles y la zona vip con 25 entradas disponibles. Hay que controlar que existen entradas
 * antes de venderlas.
 *
 * @author Guillermo García
 */

import java.util.Scanner;


public class Ejercicio07 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);
    int opc = 0;
    Zona sp = new Zona(1000);
    Zona cv = new Zona(200);
    Zona vip = new Zona(25);



    while (opc != 3){
      System.out.println("\n1. Mostrar número de entradas libres");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      System.out.print("Opcion: ");

      opc = s.nextInt();

      switch(opc){
        case 1: System.out.println("\n\nHay sin vender: ");
                System.out.println(sp.getEntradasPorVender() + " entradas para la Sala Principal");
                System.out.println(cv.getEntradasPorVender() + " entradas para la zona de Compra-Venta");
                System.out.println(vip.getEntradasPorVender() + " entradas para la zona VIP.\n\n");
                break;
        case 2: System.out.println("\n¿De que zona desea comprar la/s entrada/s?");
                System.out.println("1. Sala Principal");
                System.out.println("2. Compra-Venta");
                System.out.println("3. Vip");
                System.out.print("Opcion: ");
                int zn = s.nextInt();

                System.out.print("\n¿Cuantas entradas desea comprar? ");
                int entradas = s.nextInt();
                
                switch (zn){
                  case 1: sp.vender(entradas); break;
                  case 2: cv.vender(entradas); break;
                  case 3: vip.vender(entradas); break;
                  default: System.out.print("Debe seleccionar una zona(1-3) correcta.");
                }
                break;

        default: System.out.println("Gracias por usar nuestro servicio de compra de entradas.");
      }
    }
  }
}
