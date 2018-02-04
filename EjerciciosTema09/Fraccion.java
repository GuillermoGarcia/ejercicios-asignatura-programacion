/*
 * Solución Ejercicio 4 Tema 9 Clase Fracción
 *
 * Crea la clase Fracción . Los atributos serán numerador y denominador . Y algunos de los métodos
 * pueden ser invierte, simplifica, multiplica, divide, etc....
 *
 *
 *
 * @author Guillermo García
 */

public class Fraccion {

  private int numerador;
  private int denominador;

  /*
  *  Constructor Fraccion
  *
  *  @param n, entero, valor del numerador
  *  @param d, entero, valor del denominador
  *
  *  @return Fraccion, devuelve una fracción con numerador, n, y denominador, d.
  */
  public Fraccion (int n, int d){
    this.numerador = n;
    this.denominador = d;
  }

  public int getNumerador(){
    return this.numerador;
  }

  public int getDenominador(){
    return this.denominador;
  }

  public void setNumerador(int n){
    this.numerador = n;
  }

  public void setDenominador(int d){
    this.denominador = d;
  }

  public Fraccion duplica(){
    return new Fraccion (this.numerador, this.denominador);
  }

  public void invierte (){
    int aux = this.getNumerador();
    this.numerador = this.denominador;
    this.denominador = aux;
  }

  public void simplifica(){
    boolean noSimplifica = false;
    int num = 2;
    while (!noSimplifica){
      if (((this.numerador % num) == 0) && ((this.denominador % num) == 0)) {
        this.numerador /= num;
        this.denominador /= num;
      } else {
        num++;
      }
      if ((this.numerador > num) || (this.denominador > num)) {
        noSimplifica = true;
      }
    }
  }

  public void multiplica(int n){
    this.numerador *= n;
    this.simplifica();
  }

  public void divide(int n){
    this.denominador *= n;
    this.simplifica();
  }

  public void multiplica(Fraccion f){
    this.multiplica(f.getNumerador());
    this.divide(f.getDenominador());
    this.simplifica();
  }

  public void divide(Fraccion f){
    this.multiplica(f.getDenominador());
    this.divide(f.getNumerador());
    this.simplifica();
  }

  public void suma(int n){
    this.numerador += (n * this.denominador);
    this.simplifica();
  }

  public void resta(int n){
    this.numerador -= (n * this.denominador);
    this.simplifica();
  }

  public void suma(Fraccion f){
    this.numerador = (this.numerador * f.getDenominador()) + (this.denominador * f.getNumerador());
    this.denominador *= f.getDenominador();
    this.simplifica();
  }

  public void resta(Fraccion f){
    this.numerador = (this.numerador * f.getDenominador()) - (this.denominador * f.getNumerador());
    this.denominador *= f.getDenominador();
    this.simplifica();
  }

  public String toString(){
    if (this.denominador > 1) {
      return this.numerador + "/" + this.denominador;
    } else {
      return this.numerador + "";
    }
  }

}
