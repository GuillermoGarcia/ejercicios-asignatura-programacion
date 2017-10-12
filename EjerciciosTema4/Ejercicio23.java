/*
 * Solución Ejercicio 23 Tema 4
 *
 * Escribe un programa que calcule el precio final de un producto según su base imponible (precio
 * antes de impuestos), el tipo de IVA aplicado (general, reducido o superreducido) y el código
 * promocional. Los tipos de IVA general, reducido y superreducido son del 21%, 10% y 4%
 * respectivamente. Los códigos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 * respectivamente que no se aplica promoción, el precio se reduce a la mitad, se descuentan 5 euros
 * o se descuenta el 5%. El ejercicio se da por bueno si se muestran los valores correctos, aunque
 * los números no estén tabulados.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio23 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca la base Imponible: ");
    double baseImponible = s.nextDouble();
    double total = 0.0;

    System.out.print("Introduzca el tipo de IVA aplicable (general, reducido o superreducido): ");
    String ivaAplicable = s.next();
    System.out.print("Introduzca el código promocial a aplicar (nopro, mitad, menos5 o 5porc): ");
    String promo = s.next();

    System.out.printf("Base Imponible         %9.2f\n",baseImponible);

    switch(ivaAplicable.toUpperCase()){
      case "REDUCIDO": System.out.printf("IVA 10%        %9.2f\n", baseImponible*0.1);
                       total = baseImponible*1.1; break;
      case "SUPERREDUCIDO": System.out.printf("IVA (4%)          %9.2f\n", baseImponible*0.04);
                            total = baseImponible*1.04; break;
      default: System.out.printf("IVA (21%)         %9.2f\n", baseImponible*0.21);
                       total = baseImponible*1.21; break;
    }

    System.out.printf("Precio con IVA         %9.2f\n",total);

    switch(promo.toUpperCase()){
      case "MITAD": System.out.printf("Cód. Promo (mitad)     -%9.2f\n",total/2);
                    total=total/2; break;
      case "MENOS5": System.out.println("Cód. Promo (menos5)     -5.00");
                     total=total-5; break;
      case "5PORC": System.out.printf("Cód. Promo (5porc)     -%9.2f\n",total*0.05);
                     total=total*0.95; break;
      default: System.out.println("Cód. Promo (nopro)     -0.00");
    }
    System.out.printf("TOTAL                  -%9.2f\n",total);
  }
}
