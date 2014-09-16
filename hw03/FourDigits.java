////////////////////////////////
//Mackenzie Snow
//September 13, 2014
//This program prompts the user for input then displays the 
//four numbers to the right of the decimal point.

//sets up the scanner
import java.util.Scanner;
//creates the class
public class FourDigits{
    //main method
    public static void main(String[ ] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter a double and I display the four digits to the right of the decimal point:");
        double number=myScanner.nextDouble();
        
        int Copy=(int)(number); //cast to an int
        double result; //declare the result as a variable
        result=number-Copy; //calculations
        result*=10000;
        int number2=(int)(result); //recast the number
        
        System.out.printf("The four digits are:"+number2+"%n");
        
    }
    
}    
        
        