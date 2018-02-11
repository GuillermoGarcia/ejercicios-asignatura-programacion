/*
 * Solución Ejercicio 3 Tema 9 Clase Gato
 *
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea, al menos,
 * tres métodos específicos de cada clase y redefne el/los método/s cuando sea necesario. Prueba las
 * clases creadas en un programa en el que se instancien objetos y se les apliquen métodos.
 *
 * @author Guillermo García
 */

public class Gato extends Mamifero {

  private String nombre; // nombre del Gato
  
  /*
   *  Constructor Gato
   *
   *  @return Gato, devuelve objeto de la clase Gato
   */
  public Gato (Sexo s, String r, String c, int p, int m, String n){
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
    System.out.println(this.nombre + ": ¡mmmmiiiiaaaaauuuuu!");
  }

  @Override
  public void comer(String c){
    if (c.toLowerCase().equals("pescado")){
      System.out.println("Mmmm comida buena.");
    } else {
      System.out.println("Comida mala.");
    }
  }
}
