// Mackenzie Snow
// October 11, 2014
// The purpose of this program is to compute the square root of a double using the bisection method.

import java.util.*;
public class Root{
    public static void main(String[] args){
        Scanner myScanner= new Scanner(System.in);
        System.out.print("Enter a double greater than zero: ");
        
        double high;
        double middle=0;
        double low=0;
        double square;
        String line = myScanner.next();
        if(!Character.isDigit(line.charAt(0))){ //Checks for correct input
            System.out.println("You did not enter correct input.");
            System.exit(0);
        }
        char ch = line.charAt(0);
        double input=Character.getNumericValue(ch);
        System.out.println(input);
        high=input+1;
        double cond = 0.0000001*high;
        
        while ((high-low)>cond){ //Bisection Method
            middle= (high+low)/2;
            square = middle*middle;
            if(square>input){
                high=middle;
            }
            else if (square<input){
                low = middle;
            }
            
        }
        System.out.println("The square root of " + input + " is: " + middle); //Print Statement
        
    }
}