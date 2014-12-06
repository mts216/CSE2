import java.util.*;
public class testOnePractice {
    public static void main(String[] args) {



            /*int[] A= new int[] {1, 2, 3, 4};
            int[] B= new int[4];

            System.out.println(Arrays.toString(A));

            for (int i=0; i<4; i++){
                B[i]=A[A.length-1];
            }
            System.out.println(Arrays.toString(B));

            for(int p=0; p<4; p++){
                System.out.println(B[p]);
            } */

            double[] in = new double[] {1, 2, 3, 4};
            
            double[] in2 = new double[] {1, 2, 3, 4};
            
            System.out.println(dotProduct( in , in2));
            
        }
        /*  public static int[] expand(int[] in ) {
              int[] expandedArray;
              int count = 0;

              for (int i = 0; i < in .length; i++) {
                  count++;
              }
              System.out.println(Arrays.toString(in));
              count = count * 2;
              expandedArray = new int[count];

              for (int k = 0; k < expandedArray.length/2; k++) {
                  expandedArray[k] = in [k];
              }
              System.out.println(Arrays.toString(expandedArray));

              return expandedArray;
          } */

    public static double dotProduct(double[] in , double[] in2) {
        double limit= in2.length;
        double multiple = 0;

        if ( in.length != limit) {
            System.out.println("Error");
            return 0;
        }

        else {
            for (int i = 0; i < limit; i++) {
                multiple += in [i] * in2[i];
            }
            return multiple;
        }
    }
}
