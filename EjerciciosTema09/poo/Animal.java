/*
 * Solución Ejercicio 3 Tema 9 Clase Animal
 *
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea, al menos,
 * tres métodos específicos de cada clase y redefne el/los método/s cuando sea necesario. Prueba las
 * clases creadas en un programa en el que se instancien objetos y se les apliquen métodos.
 *
 * @author Guillermo García
 */

public abstract class Animal {

  private Sexo sexo; // Sexo del Animal
  private String raza; // Raza del Animal

  /*
   *  Constructor Animal
   *
   *  @return Tiempo, devuelve objeto de la clase tiempo
   */
  public Animal (Sexo s, String r){
    this.sexo = s;
    this.raza = r;
  }

  public Sexo getSexo() {
    return this.sexo;
  }

  public String getRaza() {
    return this.raza;
  }

  @Override
  public String toString() {
    return "Sexo: " + this.sexo + "\n" + "Raza: " + this.raza + "\n";
  }

  public void duerme() {
    System.out.println("Zzzzzzz");
  }

  public void comer(String c){
    System.out.println("Mmmm comida buena.");
  }

}
