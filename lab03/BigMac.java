//
//Mackenzie Snow
//lab 3
// In this lab we are learning how to take input from a user, manipulate it, and then output
// what they want. This is pretty cool because most codes utilize user input. Yup.

import java.util.Scanner;
public class BigMac {
    			  // main method required for every Java program
   			  public static void main(String[] args) {
   			      
   			      Scanner myScanner;
   			      myScanner = new Scanner( System.in );
   			      System.out.print(
                "Enter the number of Big Macs(an integer > 0): ");
                 int nBigMacs = myScanner.nextInt();
                 
                  System.out.print("Enter the cost per Big Mac as"+ " a double (in the form xx.xx): " );
                double bigMac$ = myScanner.nextDouble();
                	System.out.print(
                    "Enter the percent tax as a whole number (xx): ");
                double taxRate = myScanner.nextDouble();
                taxRate/=100; 
                  double cost$;
                int dollars,  
                      dimes, pennies; 
                          
                cost$ = nBigMacs*bigMac$*(1+taxRate);
                //get the whole amount, dropping decimal fraction
                dollars=(int)cost$;
                
                dimes=(int)(cost$*10)%10;
                pennies=(int)(cost$*100)%10;
                System.out.println("The total cost of " +nBigMacs
                 +" BigMacs, at $"+bigMac$ +" per bigMac, with a" +  
                 " sales tax of "+ (int)(taxRate*100) + "%, is $" +dollars+'.'+dimes+pennies);

                  



         		  }  //end of main method   
  } //end of class
