
/*
 * Solución Ejercicio 2 Tema 9 Arrays
 *
 * Cambia el programa anterior de tal forma que los datos de los gatos se introduzcan directamente
 * en el código de la forma gatito[2].setColor(“marrón”) o bien mediante el constructor, de la forma
 * gatito[3] = new Gato(“Garfield”, “naranja”, “macho”) . Muestra a continuación los datos de todos
 * los gatos utilizando un bucle.
 *
 * @author Guillermo García
 */


public class Ejercicio02 {
  public static void main (String[] args){

    Gato[] gatos = new Gato[4];

    gatos[0] = new Gato(Sexo.MACHO, "Siames", "", 4, 8, "Lotte");
    gatos[1] = new Gato(Sexo.HEMBRA, "Persa", "Blanco", 4, 6, "");
    gatos[2] = new Gato(Sexo.MACHO, "Bengala", "Naranja", 0, 8, "Misifu");
    gatos[3] = new Gato(Sexo.HEMBRA, "Abisinio", "Manchas", 4, 0, "Nefertiti");
    gatos[0].setColor("Marron");
    gatos[1].setNombre("Daisy");
    gatos[2].setNumeroPiernas(4);
    gatos[3].setNumeroMamas(6);
    System.out.println("\n\n\n");
    for (int i = 0; i < 4; i++){
      System.out.println(gatos[i]);
    }
  }
}
