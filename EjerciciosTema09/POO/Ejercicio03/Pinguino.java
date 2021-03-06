/*
 * Solución Ejercicio 3 Tema 9 Clase Pinguino
 *
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea, al menos,
 * tres métodos específicos de cada clase y redefne el/los método/s cuando sea necesario. Prueba las
 * clases creadas en un programa en el que se instancien objetos y se les apliquen métodos.
 *
 * @author Guillermo García
 */

public class Pinguino extends Ave {

  private String nombre; // Nombre del Pinguino

  /*
   *  Constructor Canario
   *
   *  @return Ave, devuelve objeto de la clase ave
   */
  public Pinguino (Sexo s, String r, String c, String n){
    super(s, r, c);
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

  public void volar() {
    System.out.println(this.nombre+ ": ¡Houston, tenemos un problema! ¡No se volaaaar!");
  }

  public void aterrizar(){
    System.out.println(this.nombre+ ": ¡Nunca abandone la tierra!");
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
