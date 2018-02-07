/*
 * Solución Ejercicio 6 Tema 9 Clase Main
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

public class Ejercicio06 {
  public static void main (String[] args){

    Tiempo t1 = new Tiempo ((int)((Math.random() * 13)), (int)((Math.random() * 61)),
      (int)((Math.random() * 61)));
    System.out.println("Se ha creado el tiempo " + t1);

    Tiempo t2 = new Tiempo ((int)((Math.random() * 13)), (int)((Math.random() * 61)),
      (int)((Math.random() * 61)));
    System.out.println("Se ha creado el tiempo " + t2);

    System.out.println(t1 + " + " + t2 + " = " + t1.suma(t2));
    System.out.println(t1 + " - " + t2 + " = " + t1.resta(t2));

  }
}
