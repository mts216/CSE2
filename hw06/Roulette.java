////////////////////////////////////////////////////////////////////////////////
// Mackenzie Snow
// October 10, 2014
// The purpose of this program is to as for user input on a roulette number they bet on.
// then the "roulette wheel" is spun 100 times. If the wheel lands on the users number 3 or more
// times the user wins that number*36 dollars. If it lands on it less than three then the user has 
// lost money. This is run 1000 times to gather data on whether or not betting one 1 number 100
// times is actually a viable gambling option to win money.

import java.util.Scanner;
public class Roulette{
    public static void main(String [] args){
        Scanner myScanner= new Scanner(System.in);
        System.out.print("Enter an integer between 1-36: ");
        
        int counter1=0;
        int counter=0;
        int cash=0;
        int money=0;
        int win = 0;
        int zeroCount=0;
        int cashCount=0;
        int total=0;
        
            if(!(myScanner.hasNextInt())){
                System.out.println("You have not entered an integer, try again."); ////Checking to make sure an integer was inputted
                return;
            }
        int number=myScanner.nextInt(); 
        if(number  < 0 || number >= 36){
            System.out.println("Your number is negative or out of range, like omg."); //Checking if the number is in the correct range
            return;
        }
             
            for (counter1=0; counter1<1000; counter1++){
                cash = 0;
                for (counter=0; counter<100; counter++){ //for loop to generate 100 random roulette numbers
                int roulette=(int) (Math.random()*38); //generating the random roulette number
                        
                        switch(roulette){
                        case 37:
                           // System.out.println("Roulette: 00");
                            break;
                        default:
                            //System.out.println("Roulette: " + roulette);
                            break;
                        }
                        if(number==roulette){ //Calculating how many times the guess was generated
                            cash += 36;
                            win++;
                        }
                }
                total+=cash-100;
                
                if(win>=3){
                    System.out.println("You won "+ cash + " dollars."); //Calculating the amount of money won
                }
                else{
                    System.out.println("You lost money, please call 1-800-522-4700 for a gambling problem.");
                }
                 
                 if (cash==0){
                     zeroCount++;
                 }
                 if(cash>100){
                     cashCount++;
                 }
            }
             System.out.println("You lost everything "+ zeroCount +" times");
             System.out.println("You made a profit "+cashCount+" times");
             System.out.println("Your total earning were $"+total);

        }
        }
    
   