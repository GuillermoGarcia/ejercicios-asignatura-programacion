/*
 * Solución Ejercicio 2 Control 1 Trimestre 1
 * 
 * La tienda online BanderaDeEspaña.es vende banderas personalizadas de la máxima calidad y nos ha
 * pedido hacer un configurador que calcule el precio según el alto y el ancho. El precio base de
 * una bandera es de un céntimo de euro el centímetro cuadrado. Si la queremos con un escudo
 * bordado, el precio se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío son
 * 3.25 €. El IVA ya está incluido en todas las tarifas.
 * 
 *
 * @author Guillermo García Fernández
 * @Fecha 8-11-17
 * @Modelo Único
 */

import java.util.Scanner;

public class Examen1718t1c1ma2 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca la altura de la bandera en cm: ");
    int altura = s.nextInt();
    System.out.print("Introduzca la anchura de la bandera en cm: ");
    int anchura = s.nextInt();
    System.out.print("¿Quiere escudo bordado? (s/n): ");
    String escudo = s.next();

    double gastosEnvio = 3.25; // Los gastos de envio son siempre los mismos

    int tamano = altura * anchura; // Tamaño de la bandera en cm2
    double precioBandera = (double)tamano / 100; // Precio de la bandera a 1 centimo de € el cm2

    double precioEscudo = 0;

    // Bordar un escudo cuesta 2.50€
    if (escudo.equals("s")){
      precioEscudo = 2.5;
      escudo = "Con escudo";
    } else {
      escudo = "Sin escudo";
    }

    String espacios = ""; // Variable para cuadrar los espacios según el tamaño de la bandera
    int temp = tamano;
    int longitud =0;

    while (temp > 0){// Calculamos la longitud del tamaño de la bandera
      temp = temp / 10;
      longitud++;
    }
    // Creamos los espacios para las filas Escudo, Gastos de Envío y Total
    for (int i = 1; i <= longitud; i++ ){
      espacios += " ";
    }

    double total = precioBandera + precioEscudo + gastosEnvio; /* Precio Final */

    /* Esta parte de codigo no es necesaria para la resolución del ejercicio solo es para dejarlo
     * mejor visualmente
     **/
     
    // Para Escudo y Gastos de Envío necesitamos espacios extras por la longitud del precio Total 
    temp = (int)total;
    longitud = 0;
    String extra = "";

    // Calculamos la longitud del precio Total
    while (temp > 0){
      temp = temp / 10;
      longitud++;
    }
    /* Ponemos espacios para Escudo, Gastos de Envío y Total */
    for (int i = 1; i < longitud; i++ ){
      extra += " ";
    }

    // Fin del código no necesario para la resolución del ejercicio
    
    System.out.println("\n\nGracias por su compra. El desglose de su compra es:");
    System.out.printf("Bandera de %d cm2: %.2f €\n",tamano, precioBandera);
    System.out.printf("%s:%s%s      %.2f €\n",escudo, espacios, extra, precioEscudo);
    System.out.printf("Gastos de envío:%s%s %.2f €\n", espacios, extra, gastosEnvio);
    System.out.printf("Total:%s           %.2f €\n", espacios, total);
  }
}
