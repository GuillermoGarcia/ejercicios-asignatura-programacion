/**
 * Muestra por pantalla el horario de 1º DAM con Colores
 *
 * @author Guillermo Garcia 
 */

public class Ejercicio05 { // Clase principal
  public static void main(String[] args) {
    String pro = "  \033[1;31mPRO\033[0m  "; // Asignatura Programación 2 espacios
    String pro2 = "  \033[1;31mPRO\033[0m   "; // Asignatura Programación 2 y 3 espacios
    String pro3 = "    \033[1;31mPRO\033[0m    "; // Asignatura Programación 4 espacios
    String sinf = "  \033[1;5;32mSINF\033[0m  "; // Asignatura Sistemas Informatico
    String bbdd = "  \033[1;34mBBDD\033[0m "; // Asisnatura Base de Datos 2 y 1 espacios
    String bbdd2 = "    \033[1;34mBBDD\033[0m   "; // Asisnatura Base de Datos 4 y 3 espacios
    String ed = "   \033[1;94mED\033[0m   "; // Asignatura Entorno de Desarrollo
    String lm = "   \033[1;96mLM\033[0m   "; // Asignatura Lenguajes de Marca
    String fol = "  \033[1;30;107mFOL\033[0m   "; // Asignatura Formación y Orientación Laboral
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
