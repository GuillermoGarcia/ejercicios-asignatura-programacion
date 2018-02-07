/*
 * Solución Ejercicio 3 Tema 9 Clase Perro
 *
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea, al menos,
 * tres métodos específicos de cada clase y redefne el/los método/s cuando sea necesario. Prueba las
 * clases creadas en un programa en el que se instancien objetos y se les apliquen métodos.
 *
 * @author Guillermo García
 */

public class Perro extends Mamifero {

  private String nombre; // nombre del Perro
  
  /*
   *  Constructor Perro
   *
   *  @return Perro, devuelve objeto de la clase Perro
   */
  public Perro(Sexo s, String r, String c, int p, int m, String n){
    super(s, r, c, p, m);
    this.nombre = n;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String n) {
    this.nombre = n;
  }

  @Override
  public String toString() {
    return "Nombre: " + this.nombre + "\n" + super.toString();
  }

  public void comunicarse() {
    System.out.println(this.nombre + ": ¡Grrrrr Gua Gua Gua Grrrrrr!");
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
