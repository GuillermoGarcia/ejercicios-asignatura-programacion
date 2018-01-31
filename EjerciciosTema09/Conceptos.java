/*
 * Solución Ejercicios de Conceptos Tema 9
 * 
 * 
 *  
 * @author Guillermo García
 */

public class Conceptos {
  public static void main (String[] args){


    /* Ejercicio 1 */
    System.out.println("P: ¿Cuáles serían los atributos de la clase PilotoDeFormula1? ¿Se te ocurren"
    + "algunas instancias de esta clase?");
    System.out.println("R: Atributos: nacionalidad, victoriasCarreras, campeonatosGanados, polesCampeonato, " +
    "puntosCampeonato, puestoFinalCampeonato.\n  Instancias: Fernando Alonso, Lewis Hamilton, " +
    "Sebastian Vettel, Daniel Ricciardo");

    /* Ejercicio 2 */
    System.out.println("P: A continuación tienes una lista en la que están mezcladas varias clases"
    + " con instancias de esas clases. Para ponerlo un poco más difícil, todos los elementos están "
    + "escritos en minúscula. Di cuáles son las clases, cuáles las instancias, a qué clase pertenece"
    + " cada una de estas instancias y cuál es la jerarquía entre las clases: paula, goofy, gardfiel,"
    + " perro, mineral, caballo, tom, silvestre, pirita, rocinante, milu, snoopy, gato, pluto, animal,"
    + " javier, bucefalo, pegaso, ayudante_de_santa_claus, cuarzo, laika, persona, pato_lucas.");
    System.out.println("R: Clases: Caballo, Animal, Mineral, Persona\nInstancias de Caballo: " +
    "rocinante, bucefalo, pegaso\nInstancias de Animal: gardfiel, perro, silvestre, milu, snoopy," +
    " gato, pluto, ayudante_de_santa_claus, laika\nInstancias de Mineral: pirita, cuarzo\n" +
    "Instancias de Persona: paula, goofy, tom, javier, pato_lucas");
    
    /* Ejercicio 3 */
    System.out.println("P: ¿Cuáles serían los atributos de la clase Vivienda? ¿Qué subclases se te "
    + "ocurren?");
    System.out.println("R: Atributos: numeroCatrasto, propietario, direccion, metrosCuadrados, " +
    "numeroHabitaciones, numeroPlantas...\nSubclases: Piso, CasaMata, Pareado, Atico...");

    /* Ejercicio 4 */
    System.out.println("P: Piensa en la liga de baloncesto, ¿qué 5 clases se te ocurren para " +
    "representar 5 elementos distintos que intervengan en la liga?");
    System.out.println("R: Clases: Equipo, Cancha, Arbitro, Partido, Liga");

    /* Ejercicio 5 */
    System.out.println("P: Haz una lista con los atributos que podría tener la clase caballo. A " +
    "continuación haz una lista con los posibles métodos (acciones asociadas a los caballos).");
    System.out.println("R: Atributos: nombre, peso, color, fechaNacimiento, raza, propietario...\n"
    + "Métodos: correrCarrera, cambiarPeso, cambiarPropietario, tenerHijo...");

    /* Ejercicio 6 */
    System.out.println("P: Lista los atributos de la clase Alumno ¿Sería nombre uno de los atributos"
    + " de la clase? Razona tu respuesta.");
    System.out.println("R: Es necesario el atributo nombre para el Alumno, ya que se usará para " +
    "rellenar los certificados necesarios o informar a los profesores del nombre de sus alumnos.");

    /* Ejercicio 7 */
    System.out.println("P: ¿Cuáles serían los atributos de la clase Ventana (de ordenador)? ¿cuáles"
    + " serían los métodos? Piensa en las propiedades y en el comportamiento de una ventana de " +
    "cualquier programa.");
    System.out.println("R: Atributos: tamano, posicionX, posicionY, titulo, \nMétodos: moverVentana"
    + ", cerrarVentana, maximizar, minimizar.");

  }
}
