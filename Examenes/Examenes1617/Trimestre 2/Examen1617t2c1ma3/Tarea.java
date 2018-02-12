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


public class Tarea {

  private static int codigoAI = 0;
  private static long tiempoEmpleado = 0;
  private static long tiempoPendiente = 0;

  public static void setCodigoAI(int n){
    Tarea.codigoAI = n;
  }

  public static void setTiempoEmpleado(long t){
    Tarea.tiempoEmpleado = t;
  }

  public static void setTiempoPendiente(long t){
    Tarea.tiempoPendiente = t;
  }

  public static int getCodigoAI(){
    return Tarea.codigoAI;
  }

  public static long getTiempoEmpleado(){
    return Tarea.tiempoEmpleado;
  }

  public static long getTiempoPendiente(){
    return Tarea.tiempoPendiente;
  }

  static int usarCodigo(){
    Tarea.setCodigoAI(Tarea.getCodigoAI() + 1);
    return Tarea.getCodigoAI();
  }

  private int codigo;
  private String descripcion;
  private String prioridad;
  private int duracion;
  private int estado; // Estado de la Tarea 0 = Pendiente, 1 = Hecha.
  
  public Tarea (String descripcion, String prioridad, int duracion){
    this.codigo = Tarea.usarCodigo();
    this.descripcion = descripcion;
    this.prioridad = prioridad;
    this.duracion = duracion;
    this.estado = 0;
    Tarea.setTiempoPendiente(Tarea.getTiempoPendiente() + (long)duracion);
  }

  public void hacer(){
    this.estado = 1;
    Tarea.setTiempoEmpleado(Tarea.getTiempoEmpleado() + (long)this.duracion);
    Tarea.setTiempoPendiente(Tarea.getTiempoPendiente() - (long)this.duracion);
  }

  @Override
  public String toString(){
    return "Tarea" + this.codigo + ": " + this.descripcion + ", prioridad " + this.prioridad + ". "
    + ((this.estado == 0)?"Pendiente.":"Hecha.");
  }

}
