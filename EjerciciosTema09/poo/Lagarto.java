/*
 * Solución Ejercicio 3 Tema 9 Clase Lagarto
 *
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea, al menos,
 * tres métodos específicos de cada clase y redefne el/los método/s cuando sea necesario. Prueba las
 * clases creadas en un programa en el que se instancien objetos y se les apliquen métodos.
 *
 * @author Guillermo García
 */

public class Lagarto extends Animal {

  private String color; // Color del Lagarto

  /*
   *  Constructor Lagarto
   *
   *  @return Lagarto, devuelve objeto de la clase Lagarto
   */
  public Lagarto (Sexo s, String r, String c){
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
    System.out.println("¡ssssshhhhsssss!");
  }

  @Override
  public void comer(String c){
    if (c.toLowerCase().equals("carne")){
      System.out.println("Mmmm comida buena.");
    } else {
      System.out.println("Comida mala.");
    }
  }

}
