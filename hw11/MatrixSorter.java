/////
// Mackenzie Snow
// December 3, 2014
// MatrixSorter
// In this program we are given slabs of a random 3d array. We are asked to sort it by columns and rows and to return the
// sorted matrix. 


public class MatrixSorter {
    public static void main(String arg[]) {
        int mat3d[][][];
        mat3d = buildMat3d();
        show(mat3d);
        System.out.println("The smallest entry in the 3D matrix is " +
            findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]);
        show(mat3d);
    }

// find the min of the array
    public static int findMin(int[][][] mat3d) {
        int min = mat3d[0][0][0];

        for (int i = 0; i < mat3d.length; i++) {
            for (int j = 0; j < mat3d[i].length; j++) {
                for (int k = 0; k < mat3d[i][j].length; k++) {
                    if (min > mat3d[i][j][k]) {
                        min = mat3d[i][j][k];
                    }

                }
            }
        }

        return min;

    }

// sort the array
    public static void sort(int[][] mat3d) {
        for (int i = 0; i < mat3d.length; i++) {
            sortRow(mat3d[i]); // need to make sure rows are sorted in order
        }
        sortColumns(mat3d);
    }
//sort the rows
    public static int[] sortRow(int[] oneDimension) {

        int min = oneDimension[0];
        for (int h = 0; h < oneDimension.length; h++) {
            min = findMinAndRange(oneDimension, h, oneDimension.length);
            swap(oneDimension, h, min);
        }
        return oneDimension;
    }
// find the min in the range
    public static int findMinAndRange(int[] oneDimension, int min, int max) {
        int man = oneDimension[min];
        int out = min;
        for (int j = min; j < max; j++) {
            if (man > oneDimension[j]) {
                man = oneDimension[j];
                out = j;
            }
        }
        return out;
    }
// swap sort the rows in the  array
    public static void swap(int[] oneDimension, int num1, int num2) {
        int temp = oneDimension[num1];
        oneDimension[num1] = oneDimension[num2];
        oneDimension[num2] = temp;

    }
// swap sort the columns
    public static void swapColumns(int[][] twoDimension, int array1, int array2) {
        int[] temp = twoDimension[array1];
        twoDimension[array1] = twoDimension[array2];
        twoDimension[array2] = temp;

    }
// sort the columns
    public static void sortColumns(int[][] twoDimension) {
        int min = twoDimension[0][0];
        for (int h = 0; h < twoDimension.length; h++) {
            min = findMinAndRange(twoDimension, h, twoDimension.length);
            swapColumns(twoDimension, h, min);
        }
    }
// min and range of columns
    public static int findMinAndRange(int[][] twoDimension, int min, int max) {
        int man = twoDimension[min][0];
        int out = min;
        for (int j = min; j < max; j++) {
            if (man > twoDimension[j][0]) {
                man = twoDimension[j][0];
                out = j;
            }
        }
        return out;

    }

// print out the array
    public static void show(int[][][] mat3d) {
        for (int i = 0; i < mat3d.length; i++) {
            for (int j = 0; j < mat3d[i].length; j++) {
                for (int k = 0; k < mat3d[i][j].length; k++) {
                    System.out.print(mat3d[i][j][k] + " ");
                }
                System.out.println("");
            }
            System.out.println();

        }
    }
// build the array
    public static int[][][] buildMat3d() {
        int[][][] mat3d = new int[3][][];
        for (int i = 0; i < mat3d.length; i++) {
            int length = 3 + 2 * i;
            mat3d[i] = new int[length][];
            for (int c = 0; c < mat3d[i].length; c++) {
                int width = i + c + 1;
                mat3d[i][c] = new int[width];
                for (int j = 0; j < mat3d[i][c].length; j++) {
                    mat3d[i][c][j] = (int)(Math.random() * 100);
                }
            }
        }
        return mat3d;
    }



}