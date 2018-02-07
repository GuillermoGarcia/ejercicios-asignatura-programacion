/*
 * Solución Ejercicio 3 Tema 9 Clase Mamifero
 *
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea, al menos,
 * tres métodos específicos de cada clase y redefne el/los método/s cuando sea necesario. Prueba las
 * clases creadas en un programa en el que se instancien objetos y se les apliquen métodos.
 *
 * @author Guillermo García
 */

public class Mamifero extends Animal {

  private String color; // Color del Mamífero
  private int numeroPiernas; // Número de Piernas/Patas del Mamífero
  private int numeroMamas; // Número de Mamas del Mamífero

  /*
   *  Constructor Mamifero
   *
   *  @return Mamifero, devuelve objeto de la clase Mamifero
   */
  public Mamifero (Sexo s, String r, String c, int p, int m){
    super(s, r);
    this.color = c;
    this.numeroPiernas = p;
    this.numeroMamas = m;
  }

  public String getColor() {
    return this.color;
  }

  public int getNumeroPiernas() {
    return this.numeroPiernas;
  }

  public int getNumeroMamas() {
    return this.numeroMamas;
  }

  public void setColor(String c) {
    this.color = c;
  }

  public void setNumeroPiernas(int n) {
    this.numeroPiernas = n;
  }

  public void setNumeroMamas(int n) {
    this.numeroMamas = n;
  }

  @Override
  public String toString() {
    return "Color: " + this.color + "\n" + "Nº Piernas: " + this.numeroPiernas + "\n" + "Nº Mamas: "
    + this.numeroMamas + "\n" + super.toString();
  }

}
