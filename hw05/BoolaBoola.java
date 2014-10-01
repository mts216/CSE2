/////////////////////////////////////////
// Mackenzie Snow
// September 26, 2014
// Hw 05
// Randomly assign combinations of boolean functions then has the user state the result of the expression.

import java.util.*;
public class BoolaBoola{
    //static boolean answerOne;
    public static void main(String [] args){
        Scanner myScanner= new Scanner(System.in);
        
        //Assign random booleans
        Random var1= new Random();
        boolean answer1 = var1.nextBoolean();
        
        Random var2= new Random();
        boolean answer2 = var2.nextBoolean();
        
        Random var3 = new Random();
        boolean answer3 = var3.nextBoolean();
        
        //Assign random operators
        String[] r= {"&&" , "||"};
        Random ran = new Random();
        String rRan1 = r[ran.nextInt(r.length)];
        String rRan2 = r[ran.nextInt(r.length)];
        
        //Print out expression
        System.out.print("Does " + answer1 + " " + rRan1 + " " + answer2 + " " + rRan2 + " " + answer3 + " have the value true(T/t) or false(F/f)?: ");
        
        //Put user input into variable to evaluate
        String answer= myScanner.nextLine();
        
        //Declare and initialize variables
        boolean answer1_2T= false;
        boolean answer2_2F= false;
        boolean answer2_2T= false;
    
        //Combinations for the first 2 booleans and first operator if it's true    
        if (answer1==true && answer2==true && rRan1.equals("||")){
            answer1_2T=true;
            }
            else if (answer1==true && answer2==false && rRan1.equals("||")){
                answer1_2T=true;
            }
            else if (answer1==false && answer2== true && rRan1.equals("||")){
                answer1_2T=true;
            }
            else if (answer1==true && answer2==true && rRan1.equals("&&")){
                answer1_2T=true;
            }
    
        if (answer1_2T==true && answer3==true && rRan2.equals("||")){
            answer2_2T=true;
            }
            else if (answer1_2T==true && answer3==false && rRan2.equals("||")){
                answer2_2T=true;
            }
            else if (answer1_2T==false && answer3== true && rRan2.equals("||")){
                answer2_2T=true;
            }
            else if (answer1_2T==true && answer3==true && rRan2.equals("&&")){
                answer2_2T=true;
            }
        
        switch (answer){
            case "F":
            case "f":
                if(answer2_2T==false){
                System.out.println("You go Glenn Coco");
                }
                else{
                    System.out.println("LOL, good hustle. But still no.");
                }
            break;
            case "T":
            case "t":
                if(answer2_2T==true){
                System.out.println("Righty-O");
                }
                else{
                    System.out.println("LOL, nope.");
                }
            break;  
            default:
            System.out.println("True. Or. False. It said it in the prompt.");
            break;
        }
    }
}