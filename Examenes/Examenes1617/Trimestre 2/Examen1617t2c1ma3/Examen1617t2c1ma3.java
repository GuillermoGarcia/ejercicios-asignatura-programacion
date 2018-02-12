/*
 * Solución Examen 16/17 Trimestre 2 Control 1 Modelo A Ejercicio 3
 * 
 * Nos han encargado realizar un programa de gestión de tareas. El primer paso será crear la clase
 * que servirá como base para operar con las tareas. Crea la clase Tarea. Sobre cada tarea se debe
 * conocer su descripción, su prioridad y su duración estimada en minutos. Además a cada tarea se le
 * asignará un número a modo de código que empezará por el 1 y se irá incrementando en uno a medida
 * que se vayan creando tareas. El siguiente trozo de código que va dentro del "main" genera la
 * salida que semuestra a continuación. Se debe crear tanto la clase Tarea como el programa de
 * prueba completo.
 *  
 * @author Guillermo García
 */


public class Examen1617t2c1ma3 {
  public static void main (String[] args){

    Tarea a = new Tarea("Cambiar bombilla del pasillo", "media", 10);
    Tarea b = new Tarea("Renovar DNI", "alta", 120);
    Tarea c = new Tarea("Comprar galletas", "baja", 20);
    a.hacer();
    c.hacer();
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.print(Tarea.getTiempoEmpleado());
    System.out.println(" minutos empleados en tareas");
    System.out.print(Tarea.getTiempoPendiente());
    System.out.println(" minutos pendientes para tareas");

  }

}
