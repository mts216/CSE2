/////////////////////////////////////////////////
// Mackenzie Snow
// September 17, 2014
// Lab 04 
// Uses user input to calculate the cost of burgers and fries
// Whoah hey this is another code that has to do with hamburgers, now i'm getting hungry.
// This is pretty advanced because we are using user input and if/else statements to provide more options with less coding.


import java.util.Scanner;

public class BigMacAgain{
    
    public static void main(String [ ] args){
       
         //Declaring the variables
        double costBigMac= 2.22;
        double costFries= 2.15;
        double costTotalBM;
        double costMeal;
        
        // Initializing the variables
        costTotalBM=0.0;
        costMeal=0.0;
       
        
        Scanner myScanner;
        myScanner = new Scanner( System.in );
    
        // BigMac loop
        System.out.print("Enter the number of Big Macs: ");
  //      int nBigMacs= myScanner.nextInt();
        
            //int nBigMacs=0;
          if (myScanner.hasNextInt()){
            int  nBigMacs=myScanner.nextInt();
                  
             //Calculations
            costTotalBM=costBigMac*nBigMacs;
            costMeal= costTotalBM+costFries;
           
            System.out.printf("You ordered %2d Big Macs for a cost of %2d x 2.22= %2.2f %n",nBigMacs,nBigMacs,costTotalBM);
        
                //Fries loop
                System.out.print("Do you want an order of fries (Y/y/N/n)? ");
                char yesNo= myScanner.next().charAt(0);
                
                if (yesNo=='Y'||yesNo=='y'){
                
                System.out.printf("You ordered fries at a cost of $2.15 %n");
                
                System.out.printf("The total cost of the meal is $%2.2f %n", costMeal);
                }
                else if(yesNo=='N'||yesNo=='n'){
                    System.out.printf("The total cost of the meal is $%2.2f %n", costTotalBM);
                
                }
                
                else{
                    System.out.printf("You did not enter one of 'Y', 'y', 'N', 'n', goodbye %n");
                    return;
            }
          }
        else{
            System.out.printf("You did not enter an int, goodbye %n");
            return;
            
        }
        
  
        }
        
    }
