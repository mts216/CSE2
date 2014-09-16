////////////////////////////////
//Mackenzie Snow
//September 13, 2014
//This program takes user input and computes the crude estimate of
// the input number cubed.

//sets up the scanner
import java.util.Scanner;
//creates the class
public class Root{
    //main method
    public static void main(String[ ] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter a double, and I print its cube root:");
        double x=myScanner.nextDouble();
        
        //Variables Initialized
        double guess;
        double cubeRoot;
        double multiplied;
        
        //Calculations
        guess=x/3.0;
        guess=(2*guess*guess*guess+x)/(3*guess*guess);
        guess=(2*guess*guess*guess+x)/(3*guess*guess);
        guess=(2*guess*guess*guess+x)/(3*guess*guess);
        guess=(2*guess*guess*guess+x)/(3*guess*guess);
        guess=(2*guess*guess*guess+x)/(3*guess*guess);
        multiplied=guess*guess*guess;
        
        //Print out results
        System.out.println(guess);
        System.out.println("The cube root is "+guess+":"+guess+"*"+guess+"*"+guess);
        System.out.println("="+multiplied);
        
        
    }
}