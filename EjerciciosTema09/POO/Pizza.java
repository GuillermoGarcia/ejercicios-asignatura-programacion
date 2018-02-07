/*
 * Solución Ejercicio 5 Tema 9 Clase Pizza
 *
 * Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza se necesita saber el
 * tamaño - mediana o familiar - el tipo - margarita, cuatro quesos o funghi - y su estado - pedida
 * o servida. La clase debe almacenar información sobre el número total de pizzas que se han pedido
 * y que se han servido. Siempre que se crea una pizza nueva, su estado es “pedida”.
 *
 * @author Guillermo García
 */

public class Pizza {

  private static int totalPedidas = 0;
  private static int totalServidas = 0;

  /*
   * Devuelve el número de Pizzas Pedidas
   *
   * @return <b>int</b>, número de pizzas pedidas
   *
   */
  public static int getTotalPedidas(){
    return totalPedidas;
  }

  /*
   * Devuelve el número de Pizzas Servidas
   *
   * @return <b>int</b>, número de pizzas servidas
   *
   */
  public static int getTotalServidas(){
    return totalServidas;
  }

  private int tamano; // Tamaño de la Pizza 0=Mediana, 1=Familiar
  private int tipo; // Tipo de la Pizza 0=Margarita, 1=Cuatro Quesos, 2=Funghi
  private int estado; // Estado de la Pizza 0=Pedida, 1=Servida

  /*
   *  Constructor Pizza
   *
   *  @param n, entero, valor del numerador
   *  @param d, entero, valor del denominador
   *
   *  @return Fraccion, devuelve una fracción con numerador, n, y denominador, d.
   */
  public Pizza (String tip, String tam){
    switch(tip){
      case "cuatro quesos": this.tipo = 1; break;
      case "funghi": this.tipo = 2; break;
      case "margarita": this.tipo = 0; break;
      default: System.out.println("No existe este tipo de Pizza.");
    }
    switch(tam){
      case "mediana": this.tamano = 0; break;
      case "familiar": this.tamano = 1; break;
      default: System.out.println("No tenemos ese tamaño de Pizza.");
    }
    this.estado = 0;
    totalPedidas++;
  }

  /*
   *  Pasa el estado de una Pizza a Servida
   */
  public void sirve(){
    if (this.estado == 1){
      System.out.println("Esta pizza ya ha sido servida.");
    } else {
      this.estado = 1;
      totalServidas++;
    }
  }

  public String toString(){
    String p = "pizza";
    switch (this.tipo){
      case 1: p += " Cuatro Quesos"; break;
      case 2: p += " Funghi"; break;
      default: p += " Margarita";
    }
    if (this.tamano > 0) {
      p += " familiar,";
    } else {
      p += " mediana,";
    }
    if (this.estado > 0) {
      p += " servida";
    } else {
      p += " pedida";
    }
    return p;
  }

}
