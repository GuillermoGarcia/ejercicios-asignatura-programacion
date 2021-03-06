package ejerciciostema8;

public class Ejercicios1a14Tema8 {
  
  /**
   * Comprueba si un número entero es capicúa. Un número es capicúa si se lee igual de izquierda
   * a derecha que de derecha a izquierda
   * 
   * @param x número entero 
   * @return <code>true</code>, si es capicúa ó <code>false</code>, si no es capicúa
   */
  
  
  public static boolean esCapicua(int x){
    
    return x == voltea(x);
    
  }
  
  /**
   * Comprueba si un número es primo o no. Un número es primo si solo es divisible entre el uno y si mismo.
   * 
   * @param x número entero
   * @return <b>boolean</b>, <code>true</code> si el número es primo o <code>false</code> si el número no es primo
   */
  
  public static boolean esPrimo(int x){

    if (x == 1) {
      return true;
    } else {
      boolean esPrimo = true;
      long divisor = Math.round(Math.sqrt(x));;
      do {
        esPrimo = !((x % divisor) == 0);
        divisor--;
      } while ((esPrimo) && (divisor >= 2));
      return esPrimo;
    }

  }
  
  /**
   * Devuelve el primer primo mayor a un número dado.
   * 
   * @param x, número entero
   * @return <b>int</b>, número entero primo mayor que 'x'
   */
  
  public static int siguientePrimo(int x){
    
    while (!esPrimo(++x)){ }
    return x;
  }
  
  /**
   * Devuelve la potencia resultado de elevar la base 'b' al exponente 'e'
   * 
   * @param b número entero, base que se va a elevar a la potencia 'e'
   * @param e número entero positivo, potencia a la que elevar la base 'b'
   * @return <b>long</b>, con la potencia de 'b' elevado a 'e'
   */
  
  public static int potencia(int b, int e){

    int total = 1;
    for (int i = 1; i <= e; i++){
      total *= b;
    }
    return (int)total;

 }
  
  /**
   * Devuelve la longitud o cantidad de digitos de un número entero
   * 
   * @param x, número entero
   * @return <b>int</b>, longitud o cantidad de digitos del número 'x'
   */
  
  public static int digitos (long x){
    
    int longitud = 0;
    do{
      x/= 10;
      longitud++;
    } while (x > 0);
    return longitud;

  }

  public static int digitos (int x){
    return digitos((long)x);
  }
  
  /**
   * Devuelve el número volteado, o sea, leido de derecha a izquierda
   * 
   * @param x, número entero
   * @return <b>int</b>, número entero volteado
   */
  
  public static long voltea (long x) {

    int longitud = digitos(x) - 1;
    long volteado = 0;
    
    for (int i = longitud; i >= 0; i--){
      volteado = (volteado*10) + digitoN(x,i);
    }
    return volteado;

  }

  public static int voltea (int x) {
    return (int)voltea((long)x);
  }
  
  /**
   * Devuelve el dígito que está en la posición n de un número entero. Se empieza contando por el 0
   * y de izquierda a derecha. Si la posición está fuera del rango devuelve -1.
   * 
   * @param x, número entero
   * @param n, número entero, posición buscada
   * @return <b>int</b>, digito, número entero, que está en la posición 'n' del número 'x'
   */
  
  public static int digitoN (long x, int n){

    if (n > digitos(x)) {
      return -1;
    } else {
      int fin = digitos(x) - n - 1;
      for (int i = 0; i < fin; i++){
        x /= 10;
      }
      return (int)(x % 10);
    }

  }

  public static int digitoN (int x, int n){
    return digitoN((long)x,n);
  }

  /**
   * Devuelve la primera aparición del digito 'd' dentro del número 'x', leido de izquierda a derecha
   * 
   * @param x, número entero
   * @param d, número entero, digito a buscar
   * @return <b>int</b>, número entero, posición del digito 'd' dentro del número 'x'
   */

  public static int posicionDeDigito (long x, int d){

    for (int i = 0; i <= digitos(x); i++ ){
      if (digitoN(x,i) == d) {
        return i;
      } 
    }
    return -1;

  }

  public static int posicionDeDigito (int x, int d){
    return posicionDeDigito((long)x,d);
  }

  /**
   * Devuelve el resultado de quitarle 'n' digitos por detrás (derecha) al número 'x'
   * 
   * @param x, número largo entero
   * @param n, número entero, cantidad de digitos a quitar
   * @return <b>long</b>, número largo entero tras quitar 'n' digitos por detras al número 'x'
   */
  
  public static long quitaPorDetras(long x, int n){
    return (x / potencia(10,n));
  }


  /**
   * Devuelve el resultado de quitarle 'n' digitos por detrás (derecha) al número 'x'
   * 
   * @param x, número entero
   * @param n, número entero, cantidad de digitos a quitar
   * @return <b>int</b>, número entero tras quitar 'n' digitos por detras al número 'x'
   */
  
  public static int quitaPorDetras(int x, int n){
    return (x / potencia(10,n));
  }
  
  /**
   * Devuelve el resultado de quitarle 'n' digitos por delante (izquierda) al número 'x'
   * 
   * @param x, número largo entero
   * @param n, número entero, cantidad de digitos a quitar
   * @return <b>long</b>, número largo entero tras quitar 'n' digitos por delante al número 'x'
   */

  public static long quitaPorDelante(long x, int n){
    return voltea(quitaPorDetras(voltea(x),n));
  }

  /**
   * Devuelve el resultado de quitarle 'n' digitos por delante (izquierda) al número 'x'
   * 
   * @param x, número entero
   * @param n, número entero, cantidad de digitos a quitar
   * @return <b>int</b>, número entero tras quitar 'n' digitos por delante al número 'x'
   */

  public static int quitaPorDelante(int x, int n){
    return voltea(quitaPorDetras(voltea(x),n));
  }

  /**
   * Devuelve el resultado de añadirle el digito 'd' por detrás (derecha) al número 'x'
   * 
   * @param x, número largo entero
   * @param d, número entero, digito a añadir
   * @return <b>long</b>, número largo entero tras añadir el digito 'd' por detrás al número 'x'
   */

  public static long pegaPorDetras(long x, int d){
    return (x * 10) + d;
  }

  /**
   * Devuelve el resultado de añadirle el digito 'd' por detrás (derecha) al número 'x'
   * 
   * @param x, número entero
   * @param d, número entero, digito a añadir
   * @return <b>int</b>, número entero tras añadir el digito 'd' por detrás al número 'x'
   */

  public static int pegaPorDetras(int x, int d){
    return (x * 10) + d;
  }
  
  /**
   * Devuelve el resultado de añadirle el digito 'd' por delante (izquierda) al número 'x'
   * 
   * @param x, número largo entero
   * @param d, número entero, digito a añadir
   * @return <b>long</b>, número largo entero tras añadir el digito 'd' por delante al número 'x'
   */
  
  public static long pegaPorDelante(long x, int d){

    /*int longitud = digitos(x);
    return (d * potencia(10,longitud)) + x ;*/
    return juntaNumeros((long)d,x);

  }

  /**
   * Devuelve el resultado de añadirle el digito 'd' por delante (izquierda) al número 'x'
   * 
   * @param x, número entero
   * @param d, número entero, digito a añadir
   * @return <b>int</b>, número entero tras añadir el digito 'd' por delante al número 'x'
   */
  
  public static int pegaPorDelante(int x, int d){

    /*int longitud = digitos(x);
    return (d * potencia(10,longitud)) + x ;*/
    return (int)juntaNumeros(d,x);

  }
  
  /**
   * Devuelve una subcadena del número 'x', entre la posición 'pi' y la 'pf'
   * 
   * @param x, número entero
   * @param pi, número entero, posición inicial
   * @param pf, número entero, posición final
   * @return <b>int</b>, número entero, subcadena del número 'x', entre la posición 'pi' y la 'pf'
   */
  
  public static int trozoDeNumero(int x, int pi, int pf){
    
    int trozo = 0;

    if (pf >= digitos(x)) pf = digitos(x) - 1;
    for (int i = pf; i >= pi; i--){
      trozo = pegaPorDetras(trozo, digitoN(x,i));
    }
    return trozo;
    
  }

  /**
   * Devuelve un número entero obtenido tras concatenar 'x con 'y'
   * 
   * @param x, número entero
   * @param y, número entero
   * @return <b>int</b>, número entero obtenido tras concatenar 'x con 'y'
   */
  
  public static long juntaNumeros(int x, int y){
    return ((long)x * potencia(10,digitos(y))) + y;
  }

  public static long juntaNumeros(long x, long y){
    return (x * potencia(10,digitos(y))) + y;
  }
  
}
