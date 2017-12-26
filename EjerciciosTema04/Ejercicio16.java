/*
 * Solución Ejercicio 16 Tema 4
 *
 * Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos está siendo
 * infiel. El programa irá haciendo preguntas que el usuario contestará con verdadero o falso.
 * Cada pregunta contestada como verdadero sumará 3 puntos. Las preguntas contestadas con falso no
 * suman puntos. Utiliza el fichero test_infidelidad.txt para obtener las preguntas y las
 * conclusiones del programa.
 *
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio16 {
  public static void main (String[] args){

    Scanner s = new Scanner(System.in);

    System.out.println("Vamos a empezar el cuestionario. Las respuestan validas son V (Verdadero) "
    +"o F (Falso). En el caso de que usar otro caracter que no sea V o F se considerara que la "
    +"respuesta es falsa.");

    int total = 0;
    String resp = "";


    System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo"
    +"aparente.");
    System.out.print("Respuesta: ");
    resp = s.next().toUpperCase();
    if (resp.equals("V")){ total = total + 3; }
    System.out.println("2. Ha aumentado sus gastos de vestuario.");
    System.out.print("Respuesta: ");
    resp = s.next().toUpperCase();
    if (resp.equals("V")){ total = total + 3; }
    System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti.");
    System.out.print("Respuesta: ");
    resp = s.next().toUpperCase();
    if (resp.equals("V")){ total = total + 3; }
    System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se "
    +"arregla el pelo y se asea con más frecuencia (si es mujer).");
    System.out.print("Respuesta: ");
    resp = s.next().toUpperCase();
    if (resp.equals("V")){ total = total + 3; }
    System.out.println("5. No te deja que mires la agenda de su teléfono móvil.");
    System.out.print("Respuesta: ");
    resp = s.next().toUpperCase();
    if (resp.equals("V")){ total = total + 3; }
    System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú "
    +"delante.");
    System.out.print("Respuesta: ");
    resp = s.next().toUpperCase();
    if (resp.equals("V")){ total = total + 3; }
    System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
    System.out.print("Respuesta: ");
    resp = s.next().toUpperCase();
    if (resp.equals("V")){ total = total + 3; }
    System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más "
    +"trabajo.");
    System.out.print("Respuesta: ");
    resp = s.next().toUpperCase();
    if (resp.equals("V")){ total = total + 3; }
    System.out.println("9. Has notado que últimamente se perfuma más.");
    System.out.print("Respuesta: ");
    resp = s.next().toUpperCase();
    if (resp.equals("V")){ total = total + 3; }
    System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
    System.out.print("Respuesta: ");
    resp = s.next().toUpperCase();
    if (resp.equals("V")){ total = total + 3; }


    if (total<11) {System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");}
    else if (total<23) {System.out.println("Quizás exista el peligro de otra persona en su vida o "
    +"en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");}
    else {System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance "
    +"con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está "
    +"pasando por su cabeza.");}
  }
}
