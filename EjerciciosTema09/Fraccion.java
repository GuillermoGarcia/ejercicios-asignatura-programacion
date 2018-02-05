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

  public Fraccion invierte (){
    return new Fraccion (this.denominador,this.numerador);
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

  public Fraccion multiplica(int n){
    return new Fraccion(this.numerador * n,this.denominador);
  }

  public Fraccion divide(int n){
    return new Fraccion(this.numerador,this.denominador * n);
  }

  public Fraccion multiplica(Fraccion f){
    return new Fraccion(this.numerador * f.getNumerador(),this.denominador * f.getDenominador());
  }

  public Fraccion divide(Fraccion f){
    return this.multiplica(f.invierte());
  }

  public Fraccion suma(int n){
    return new Fraccion(this.numerador + (n * this.denominador),this.denominador);
  }

  public Fraccion resta(int n){
    return new Fraccion(this.numerador - (n * this.denominador),this.denominador);
  }

  public Fraccion suma(Fraccion f){
    return new Fraccion((this.numerador * f.getDenominador()) + (this.denominador * f.getNumerador())
    ,this.denominador * f.getDenominador());
  }

  public Fraccion resta(Fraccion f){
    return new Fraccion((this.numerador * f.getDenominador()) - (this.denominador * f.getNumerador())
    ,this.denominador * f.getDenominador());
  }

  public String toString(){
    if (this.denominador > 1) {
      return this.numerador + "/" + this.denominador;
    } else {
      return this.numerador + "";
    }
  }

}
