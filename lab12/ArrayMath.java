///////////////////////////////////////////////////////////
// Mackenzie Snow
// November 13, 2014
// Array Math

public class ArrayMath {
  public static void main(String[] arg) {
    double x[] = {
        2.3, 3, 4, -2.1, 82, 23
      },
      y[] = {
        2.3, 3, 4, -2.1, 82, 23
      },
      z[] = {
        2.3, 13, 14
      },
      w[] = {
        2.3, 13, 14, 12
      },
      v[],
      u[] = {
        2.3, 12, 14
      };

    v = addArrays(x, y);
    System.out.println(display(x) + " \n  + " + display(y) + "\n   = " + display(v));

    System.out.println(display(x) + " \n  + " + display(z) + "\n   = " + display(addArrays(x, z)));

    System.out.println("It is " + equals(x, y) + " that " + display(x) + " == " + display(y));

    System.out.println("It is " + equals(z, w) + " that " + display(z) + " == " + display(w));

    System.out.println("It is " + equals(u, z) + " that " + display(u) + " == " + display(z));

  }

  public static String display(double[] x) {
    String out = "{";
    for (int j = 0; j < x.length; j++) {
      if (j > 0) {
        out += ", ";
      }
      out += x[j];
    }
    return out + "}";
  }

  public static boolean equals(double[] x, double[] y) {

    boolean answer = false;
    if (x.length != y.length) {
      return answer;
    }
    
    for(int j=0; j<x.length; j++){
      if(x[j]!=y[j]){
        return answer;
      }

    }
    answer=true;
    return answer;

  }

  public static double[] addArrays(double[] x, double[] y) {
    if (equals(x, y) == true) {
      double[] sum = new double[x.length];
      double add = 0;
      for (int i = 0; i < x.length; i++) {
        double tempX = x[i];
        double tempY = y[i];
        add = tempX + tempY;
        sum[i] = add;
      }
      return sum;
    }

      if(x.length>y.length){
        double[] sum2 = new double[x.length];
        for(int r=0; r<x.length; r++){
          if(r<y.length){
            sum2[r]=x[r]+y[r];
          }
          else{
            sum2[r]=x[r];
          }
        }
        return sum2;
      }
    

      else{
        double[] sum2 = new double[y.length];
        for(int r=0; r<y.length; r++){
          if(r<x.length){
            sum2[r]=x[r]+y[r];
          }
          else{
            sum2[r]=y[r];
          }
        }
        return sum2;
      }

  }
  
}
