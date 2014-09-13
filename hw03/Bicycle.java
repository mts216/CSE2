///////
//Mackenzie Snow
//Septmber 13, 2014
//This program takes input from the user about time traveled
//then prints out the distance traveled and the average miles per hour


//sets up the scanner
import java.util.Scanner;
//creates the class
public class Bicycle{
    //main method
    public static void main(String[ ] args) {
        Scanner myScanner;
        myScanner = new Scanner( System.in);
        
        System.out.print("Enter the number of seconds as an integer:");
        int nSeconds=myScanner.nextInt();
        
        System.out.print("Enter the number of counts on the cyclometer as an integer:");
        int nCounts=myScanner.nextInt();
        
        double wheelDiameter=27;
        double secondsPerMinute=60;
        double PI=3.14159;
        double feetPerMile=5280; 
        double inchesPerFoot=12;
        double distance;
        double minutes;
        double avgMPH;
        
        //Initializing the variables
        distance=0.0;
        minutes=0.0;
        avgMPH=0.0;
        
        //Calculations
        distance=nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        minutes=nSeconds/secondsPerMinute;
        avgMPH=distance/(minutes/60);
        
        //Print Answers
        System.out.printf("The distance was %2.2f miles and took %2.2f minutes %n", distance, minutes);
        System.out.printf("the average MPH was %2.2f %n", avgMPH);
        
        
    }
}