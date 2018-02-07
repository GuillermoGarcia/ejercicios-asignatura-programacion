/*
 * Solución Ejercicio 3 Tema 9 Clase Main
 *
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea, al menos,
 * tres métodos específicos de cada clase y redefne el/los método/s cuando sea necesario. Prueba las
 * clases creadas en un programa en el que se instancien objetos y se les apliquen métodos.
 *
 * @author Guillermo García
 */

public class Ejercicio03 {
  public static void main (String[] args){

    Gato misifu = new Gato(Sexo.MACHO,"Siames","Blanco",4,6,"Misifu");
    Perro perrito = new Perro(Sexo.MACHO,"Dogo","Manchas",4,8,"Perrito");
    Lagarto juancho = new Lagarto(Sexo.MACHO,"Camaleon","Verde");
    Canario piolin = new Canario(Sexo.HEMBRA,"Canario","Amarillo","Piolin");
    Pinguino patas = new Pinguino(Sexo.HEMBRA,"Piguino Real","Gris","patas");

    misifu.comer("Carne");
    perrito.comunicarse();
    juancho.comer("pescado");
    patas.volar();
    piolin.aterrizar();

  }
}
