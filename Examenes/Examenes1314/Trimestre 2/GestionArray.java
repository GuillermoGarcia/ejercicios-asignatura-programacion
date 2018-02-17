public class GestionArray {

  private int[] valores = new int[2];


  public static int[] extraePares(int x[]){
    int pares[] = {-1};
    for (int i = 0; i < x.length; i++){
      if ((x[i] % 2) == 0){
        pares = insertarEnArray(pares, x[i]);
      }
    }
    return pares;
  }

  public static int [] insertarEnArray(int[] a, int n){

    int[] temp;
    if (a[0] == -1){
      temp = new int[1];
      temp[0] = n;
    } else {
      temp = new int[a.length + 1];
      for (int i = 0; i < a.length; i++){
        temp[i] = a[i];
      }
      temp[a.length] = n;
    }
    return temp;

  }
}
