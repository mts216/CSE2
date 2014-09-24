/////////////////////////////////////////////////////
// Mackenzie Snow
// September 22, 2014
// CSE II
// This program prompts the user for input as the time in seconds and then prints out the time
// in conventional form.

import java.util.*;

public class TimePadding{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the time in seconds: ");
        int seconds = myScanner.nextInt();
        if(seconds>86400||seconds<0){
            System.out.println("Number entered exceedsis not in the range of seconds in a day.");
            System.exit(1);
        }
        int hours=0;
        int minutes=0;
        int secs=0;
        
        //Calculations
        secs = seconds%60;
        minutes = seconds/60;
        hours = minutes/60;
        minutes = minutes%60;
        if(hours>12){
            hours = hours - 12;
        }
        //no zeros
        if(minutes>9&&secs>9)
            System.out.printf("%2d:%2d:%2d\t\n", hours, minutes, secs);
        //one zero    
        else if(minutes<10&&secs>9){
            System.out.printf("%2d:0%1d:%2d\t\n", hours, minutes, secs);
        }
        //two zeros
        else{
            System.out.printf("%2d:0%1d:0%1d\t\n", hours, minutes, secs);
        }
    }
}