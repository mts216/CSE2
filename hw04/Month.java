///////////////////////////////////////////////////////////////////
// Mackenzie Snow
// September 20,2014
// CSE II
// Month.java
// This program prompts the user to enter an integer for the month then prints
// out the number of days in that month. If the month is February the user is asked 
// to enter the year.

import java.util.Scanner;

public class Month{
    
    public static void main(String [ ] args){
        
        Scanner myScanner;
        myScanner= new Scanner(System.in);
        System.out.print("Enter an int giving the number of the month (1-12): ");
        double Month=0;
        int month=0;
        //Double cast int and check
        Month= myScanner.nextDouble();
        if(Month == (int)Month&&Month>0&&Month<13){
            month = (int)Month;
            } 
            else{
            System.out.printf("You did not enter an integer between 1-12 %n");
            System.exit(1);
            } 
            
            //Calculations
            if(month== 1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
               System.out.println("The month has 31 days");
            }//elseif
               
                
            else if(month==4 || month==6 || month==9 || month==11){
                System.out.println("The month has 30 days");
            }
                    
            //February leap year calculation            
            else if(month==2){
                System.out.print("Please enter the year as an integer");
               //if(myScanner.hasNextInt()){
                int year= myScanner.nextInt();
                if ((year % 4 == 0) && year % 100 != 0){
                    System.out.println(" The month has 29 days");
                }
                else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)){
                    System.out.println(" The month has 29 days");
                }
                else{
                    System.out.println( " The month has 28 days");
                }
                
            }    
       

    }
}  