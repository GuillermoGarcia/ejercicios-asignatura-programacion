public class FichaDomino {

  private int[] valores = new int[2];

  public FichaDomino(int n1, int n2){

    this.valores[0] = n1;
    this.valores[1] = n2;

  }

  /*
   * Devuelve una Ficha de Domino con los valores invertidos de la Ficha original
   *
   * @return: FichaDomino, Ficha de Domino con los valores invertidos
   */
  public FichaDomino voltea(){

    return new FichaDomino(this.valores[1], this.valores[0]);

  }

  /*
   *
   * Devuelve el valor Izquierdo de la ficha
   *
   * @return: int, valor izquierdo de la ficha
   *
   */
  public int getValorIzquierdo(){

    return this.valores[0];

  }

  /*
   *
   * Devuelve el valor Derecho de la ficha
   *
   * @return: int, valor derecho de la ficha
   *
   */
  public int getValorDerecho(){

    return this.valores[1];

  }

  /*
   *
   * Devuelve si la ficha pasada como paramatro encaja con esta ficha o no.
   *
   * @param FichaDomino, ficha a comprobar si encaja.
   *
   * @return: boolean, <b>True</b>, si las dos fichas encajan, <b>False</b> si las dos fichas no
   * encajan
   *
   */
  public boolean encaja(FichaDomino f){

    FichaDomino v = this.voltea();
    FichaDomino fv = f.voltea();
    return ((this.valores[0] == f.getValorDerecho()) ||
            (this.valores[1] == f.getValorIzquierdo()) ||
            (this.valores[0] == fv.getValorDerecho()) ||
            (this.valores[1] == fv.getValorIzquierdo()) ||
            (v.getValorIzquierdo() == f.getValorDerecho()) ||
            (v.getValorDerecho() == f.getValorIzquierdo()) || 
            (v.getValorIzquierdo() == fv.getValorDerecho()) ||
            (v.getValorDerecho() == fv.getValorIzquierdo())
           );

  }

  @Override
  public String toString(){

    String result = "[";
    if (this.valores[0] == 0) {
      result += " ";
    } else {
      result += this.valores[0];
    }
    result += "|";
    if (this.valores[1] == 0) {
      result += " ";
    } else {
      result += this.valores[1];
    }
    result += "]";
    return result;

  }
}
