/*
 * Solución Ejercicio 3 Tema 9 Clase Ave
 *
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea, al menos,
 * tres métodos específicos de cada clase y redefne el/los método/s cuando sea necesario. Prueba las
 * clases creadas en un programa en el que se instancien objetos y se les apliquen métodos.
 *
 * @author Guillermo García
 */

public class Ave extends Animal {

  private String color; // Color del Ave

  /*
   *  Constructor Ave
   *
   *  @return Ave, devuelve objeto de la clase ave
   */
  public Ave (Sexo s, String r, String c){
    super(s, r);
    this.color = c;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String c) {
    this.color = c;
  }

  @Override
  public String toString() {    
    return "Color: " + this.color + "\n" + super.toString();
  }

  public void comunicarse() {
    System.out.println("¡Piirrriiiii PiPiPiPi Piiiirrrriii!");
  }

  @Override
  public void comer(String c){
    if (c.toLowerCase().equals("alpiste")){
      System.out.println("Mmmm comida buena.");
    } else {
      System.out.println("Comida mala.");
    }
  }

}
