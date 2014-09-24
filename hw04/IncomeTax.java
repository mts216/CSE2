///////////////////////////////////////////////
// Mackenzie Snow
// Septmber 19, 2014
// HW 04
// This program prompts user input of income then prints out the amount of tax on that income

import java.util.Scanner;

public class IncomeTax{
    
    public static void main(String [ ] args){
        
        Scanner myScanner;
        myScanner= new Scanner(System.in);
        System.out.print("Enter the income giving the number of thousands: ");
        double income=0;
        int Income=0;
        double tax=0;
        //Double cast number to an int and check
        income= myScanner.nextDouble();
        if(income == (int)income&&income>=0){
            Income = (int)income;
        }
        else{
            System.out.printf("You did not enter an int, goodbye %n");
            System.exit(1);
        }
        
        //Calculations
        if (Income<=20){
                tax=Income*.5;
                //System.out.printf("The tax rate on %8d is 5%, and the tax is %8.8f %n", Income, Tax20);
                System.out.println("The tax rate on $" + Income + ",000 is 5%, and the tax is $"+tax*1000);
            }
            
            else if (Income>20 && Income<=40){
                tax=Income*.7;
                System.out.println("The tax rate on " + Income + " is 7%, and the tax is $"+tax*1000);
                //System.out.printf("The tax rate on %8d is 7%, and the tax is %8.8f %n", Income, Tax40);
            }//elseif
            
            else if (Income>40 && Income<=78){
                tax=Income*.12;
                System.out.println("The tax rate on " + Income + " is 12%, and the tax is $"+tax*1000);
                //System.out.printf("The tax rate on %8d is 12%, and the tax is %8.8f %n", Income, tax);
            }
            
            else if(Income>78){
                tax=Income*.14;
                System.out.println("The tax rate on " + Income + " is 14%, and the tax is $"+tax*1000);
                //System.out.printf("The tax rate on &8d is 14%, and the tax is %8.8f %n", Income, tax);
            }
        }
}

