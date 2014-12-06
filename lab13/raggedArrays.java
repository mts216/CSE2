//////
// Mackenzie Snow
// December 1, 2014

import java.util.*;
public class raggedArrays {
    public static void main(String[] arg) {


        int cols, rows;
        rows = 5; 
        int[][] randomArray = new int [rows][];

        for (int i = 0; i < 5; i++) {
            int randomLength = (i*3)+5;
            randomArray[i] = new int[randomLength];
            
        }
        for (int j = 0; j < 5; j++) {
            for(int x = 0; x < randomArray[j].length; x++){
            
            randomArray[j][x] = (int)(Math.random() * 39);
            System.out.print(randomArray[j][x] + " ");
            }
            System.out.println("");
        }
        
        for(int s = 0; s<5; s++){
            Arrays.sort(randomArray[s]);
        }
        System.out.println("The sorted array:");
        for (int y = 0; y < 5; y++) {
            for(int z = 0; z < randomArray[y].length; z++){
            
            System.out.print(randomArray[y][z] + " ");
            }
            System.out.println("");
        }
        
    }
}
