/*
 * Solución Ejercicio 6 Tema 9 Clase Tiempo
 *
 * Crea la clase Tiempo con los métodos suma y resta . Los objetos de la clase Tiempo son intervalos
 * de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20, 30) donde los parámetros que se le
 * pasan al constructor son las horas, los minutos y los segundos respectivamente. Crea el método
 * toString para ver los intervalos de tiempo de la forma 10h 35m 5s . Si se suman por ejemplo 30m
 * 40s y 35m 20s el resultado debería ser 1h 6m 0s . Realiza un programa de prueba para comprobar
 * que la clase funciona bien.
 *
 * @author Guillermo García
 */

public class Tiempo {

  private int horas; // Número de horas
  private int minutos; // Número de minutos
  private int segundos; // Número de segundos

  /*
   *  Constructor Tiempo
   *
   *  @param h, entero positivo, valor de horas
   *  @param m, entero positivo, valor de minutos
   *  @param s, entero positivo, valor de segundos
   *
   *  @return Tiempo, devuelve objeto de la clase tiempo
   */
  public Tiempo (int h, int m, int s){
    this.horas = h;
    this.minutos = m;
    this.segundos = s;
  }

  public int getHoras(){
    return this.horas;
  }

  public int getMinutos(){
    return this.minutos;
  }

  public int getSegundos(){
    return this.segundos;
  }

  /*
   *  Devuelve el Tiempo de sumar el de este objeto con el del objeto t
   *
   * @param t, Tiempo, tiempo a sumar al actual objeto
   *
   * @return <b>Tiempo</b>, suma del tiempo t con el objeto actual
   * 
   */
  public Tiempo suma(Tiempo t){

    int s = this.segundos + t.getSegundos();
    int m = this.minutos;
    int h = this.horas;
    if (s > 59){
      s -= 60;
      m++;
    }
    m += t.getMinutos();
    if (m > 59){
      m -= 60;
      h++;
    }    
    h += t.getHoras();
    return new Tiempo(h, m, s);

  }

  /*
   *  Devuelve el Tiempo de restar aeste objeto el del objeto t
   *
   * @param t, Tiempo, tiempo a restar al actual objeto
   *
   * @return <b>Tiempo</b>, resta del tiempo t al objeto actual
   * 
   */
  public Tiempo resta(Tiempo t){

    if (this.horas < t.getHoras()){
      System.out.println("No puedo quitar mas del tiempo que tenemos.");
      return new Tiempo(0, 0, 0);
    } else {

      int s = this.segundos;
      int m = this.minutos;
      int h = this.horas - t.getHoras();

      if (m < t.getMinutos()){
        h--;
        m = t.getMinutos() - m;
      } else {
        m -= t.getMinutos();
      }
      if (s < t.getSegundos()){
        m--;
        s = t.getSegundos() - s;
      } else {
        s -= t.getSegundos();
      }

      return new Tiempo(h, m, s);
    }
  }
  public String toString(){
    return this.horas + "h " + this.minutos + "m " + this.segundos + "s";
  }

}
