/**
 * Muestra por pantalla el horario de 1º DAM
 * Ejercicio 4 Tema 1
 * @author Guillermo Garcia 
**/

public class Ejercicio04 { // Clase principal
  public static void main(String[] args) {
    String pro = "  PRO  "; // Asignatura Programación 2 espacios
    String pro2 = "  PRO   "; // Asignatura Programación 2 y 3 espacios
    String pro3 = "    PRO    "; // Asignatura Programación 4 espacios
    String sinf = "  SINF  "; // Asignatura Sistemas Informatico
    String bbdd = "  BBDD "; // Asisnatura Base de Datos 2 y 1 espacios
    String bbdd2 = "    BBDD   "; // Asisnatura Base de Datos 4 y 3 espacios
    String ed = "   ED   "; // Asignatura Entorno de Desarrollo
    String lm = "   LM   "; // Asignatura Lenguajes de Marca
    String fol = "  FOL   "; // Asignatura Formación y Orientación Laboral
    System.out.println("┏━━━━━━━┳━━━━━━━━┳━━━━━━━━━━━┳━━━━━━━━┳━━━━━━━━┓");
    System.out.println("┃ Lunes ┃ Martes ┃ Miercoles ┃ Jueves ┃ Viernes┃");
    System.out.println("┣━━━━━━━╋━━━━━━━━╋━━━━━━━━━━━╋━━━━━━━━╋━━━━━━━━┫");
    System.out.printf("┃%7s┃%8s┃%11s┃%8s┃%-8s┃\n",pro, sinf, pro3,ed, sinf);
    System.out.println("┣━━━━━━━╋━━━━━━━━╋━━━━━━━━━━━╋━━━━━━━━╋━━━━━━━━┫");
    System.out.printf("┃%7s┃%8s┃%11s┃%8s┃%-8s┃\n",pro, sinf, pro3,ed, sinf);
    System.out.println("┣━━━━━━━╋━━━━━━━━╋━━━━━━━━━━━╋━━━━━━━━╋━━━━━━━━┫");
    System.out.printf("┃%7s┃%8s┃%11s┃%8s┃%-8s┃\n",pro, sinf, pro3,ed, sinf);
    System.out.println("┣━━━━━━━╋━━━━━━━━╋━━━━━━━━━━━╋━━━━━━━━╋━━━━━━━━┫");
    System.out.printf("┃%7s┃%8s┃%11s┃%8s┃%-8s┃\n",bbdd,lm, bbdd2,lm, fol);
    System.out.println("┣━━━━━━━╋━━━━━━━━╋━━━━━━━━━━━╋━━━━━━━━╋━━━━━━━━┫");
    System.out.printf("┃%7s┃%8s┃%11s┃%8s┃%-8s┃\n",bbdd, pro2, bbdd2,lm, fol);
    System.out.println("┣━━━━━━━╋━━━━━━━━╋━━━━━━━━━━━╋━━━━━━━━╋━━━━━━━━┫");
    System.out.printf("┃%7s┃%8s┃%11s┃%8s┃%-8s┃\n",bbdd, pro2, bbdd2,lm, fol);
    System.out.println("┗━━━━━━━┻━━━━━━━━┻━━━━━━━━━━━┻━━━━━━━━┻━━━━━━━━┛");
    System.out.println();
  }
}
