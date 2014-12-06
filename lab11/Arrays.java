////////////////////////////////////////////////////////
// Mackenzie Snow
// Friday November 14, 2014
// Arrays
// Get siked for arrays because these things will absolutely blow your mind.
// In this program the user inputs ten ints which are stored in an array. Then that array passes through a couple methods
// which picks out the highest and lowest ints and then prints out the original array and the array with every int switched.

import java.util.Scanner;
public class Arrays{
    public static void main(String [] args){
        Scanner myScanner= new Scanner(System.in);
        int[] newArray;
        newArray= new int[10];
        
        System.out.print("Enter ten ints: ");
        for(int j=0; j<10; j++){
            newArray[j]= myScanner.nextInt();
        }
        

           int max= getMaxValue(newArray);
           System.out.println("The highest entry is "+ max);
           
           int low= getMinValue(newArray);
           System.out.println("The lowest entry is " + low);
           
           int[] secondArray;
           secondArray= new int[10];
           
           int s=0; 
           for(int f=0; f<10; f++){
               s+=newArray[f];
           }
           System.out.println("The sum is "+s);
           
           
           for (int k=0; k<10; k++){
               secondArray[9-k]=newArray[k];

           }
           
           for(int p=0; p<10; p++){
               System.out.println(newArray[p]+" " + secondArray[p]);
           }
        
    }
    
    public static int getMaxValue(int[] newArray){
        int maxValue= newArray[0];
        for(int i=1; i< newArray.length; i++){
            if(newArray[i] > maxValue){
                maxValue= newArray[i];
            }
        }
        return maxValue;
    }
    
    public static int getMinValue(int[] newArray){
        int minValue= newArray[0];
        for(int i=1; i<newArray.length; i++){
            if(newArray[i] < minValue){
                minValue=newArray[i];
            }
        }
        return minValue;
    }
}