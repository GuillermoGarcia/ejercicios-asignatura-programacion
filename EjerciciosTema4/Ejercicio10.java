/*
 * Solución Ejercicio 10 Tema 4
 * 
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
 * nacimiento.
 * 
 * @author Guillermo García
 */

import java.util.Scanner;

public class Ejercicio10 {
  public static void main (String[] args){
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("¿Que día nacistes (1-31)? ");
    int dia = s.nextInt();  
    System.out.print("¿Que mes nacistes (con letras)? ");
    String mes = s.next();
    String horoscopo = "";
    int error = 0;
    
    mes = mes.substring(0,1).toUpperCase() + mes.substring(1);
    
    switch(mes){
      case "Enero": if(dia <= 19){ horoscopo = "Capricornio"; }
                    else { horoscopo = "Acuario"; } break;
      case "Febrero": if(dia <= 18){ horoscopo = "Acuario"; }
                      else { horoscopo = "Piscis"; } break;
      case "Marzo": if(dia <= 20){ horoscopo = "Piscis"; }
                    else { horoscopo = "Aries"; } break;
      case "Abril": if(dia <= 20){ horoscopo = "Aries"; }
                    else { horoscopo = "Tauro"; } break;
      case "Mayo": if(dia <= 20){ horoscopo = "Tauro"; }
                    else { horoscopo = "Géminis"; } break;
      case "Junio": if(dia <= 20){ horoscopo = "Géminis"; }
                    else { horoscopo = "Cáncer"; } break;
      case "Julio": if(dia <= 20){ horoscopo = "Cáncer"; }
                    else { horoscopo = "Leo"; } break;
      case "Agosto": if(dia <= 21){ horoscopo = "Leo"; }
                     else { horoscopo = "Virgo"; } break;
      case "Septiembre": if(dia <= 22){ horoscopo = "Virgo"; }
                         else { horoscopo = "Libra"; } break;
      case "Octubre": if(dia <= 22){ horoscopo = "Libra"; }
                      else { horoscopo = "Escorpio"; } break;
      case "Noviembre": if(dia <= 22){ horoscopo = "Escorpio"; }
                        else { horoscopo = "Sagitario"; } break;
      case "Dicimebre": if(dia <= 20){ horoscopo = "Sagitario"; }
                        else { horoscopo = "Capricornio"; } break;
      default: error=1;
    }
    
    if (error == 1){
      System.out.println("¡Felicidades! No tienes horoscopo. Seguro has metido"+
      " una fecha incorrecta, compruébala la proxima vez.");
    } else {
      System.out.printf("Tu horoscopo es %s al nacer el %d de %s.\n", horoscopo, dia, mes);
    }
  }
}
