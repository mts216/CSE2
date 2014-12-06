////////////////////////////////////////////////////////////////////////////////
// Mackenzie Snow
// October 10, 2014
// In this program we are starting to look at loops and all of their beautiful loopiness. 
// This prints out a pretty pattern of stars!

import java.util.Scanner;
public class LoopTheLoop{
    public static void main(String [] args){
        Scanner myScanner= new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 15: ");
        
        int counter=0;
        int nStars=myScanner.nextInt();
        String starS="";
        String star= new String("");
        
        while(counter<nStars){ //while loop yeah!
            System.out.print("*");
            counter++;
        }
        counter=0;
        while (counter<=nStars){ //Another while loop yeah!
            System.out.println(star);
            star=star+"*";
            counter++;
        }
    }
}
// worth it right?