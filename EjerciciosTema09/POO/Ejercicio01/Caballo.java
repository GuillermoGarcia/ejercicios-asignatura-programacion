/*
 * Solución Ejercicio 1 Tema 9 Clase Caballo
 * 
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando instancias y
 * aplicándole algunos métodos.
 *  
 * @author Guillermo García
 */

public class Caballo {
  // atributos /////////////////////////////
  private String color;
  private String raza;
  private String sexo;
  private int edad;
  private double peso;


  // métodos ///////////////////////////////

  // constructor
  Caballo (String s) {
    this.sexo = s;
  }
  
  // getter
  public String getSexo() {
    return this.sexo;
  }
  
  /*
  * Hace que el caballo galope
  */
  public void galopa() {
    System.out.println("Galopando Como el Viento.");
  }
  
  /*
  * Hace que el caballo relinche
  */
  public void relincha() {
    System.out.println("¡Iiiiih!");
  }
  
  /*
  * Hace que el caballo coma.
  * A los caballos les gusta la avena, zanahoria, manzana si le damos otra comida
  * la rechazará.
  *  
  * @param comida la comida que se le ofrece al gato
  */
  public void come(String comida) {
    if ((comida.equals("avena")) || (comida.equals("zanahoria")) || (comida.equals("manzana"))) {
      System.out.println("Hmmmm, gracias.");
    } else {
      System.out.println("Lo siento, no me gusta esa comida.");
    }
  }

}
