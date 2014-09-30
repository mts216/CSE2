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
        String answer1_2F="0";
        String answer1_2T="0";
        String answer2_2F="0";
        String answer2_2T="0";
        
        //Combinations for the first 2 booleans and first operator if it's false
        if (answer1==false && answer2==false && rRan1.equals("&&")){
             answer1_2F = "false";
            }
            else if (answer1==true && answer2==false && rRan1.equals("&&")) {
                 answer1_2F="false";
            }
            else if (answer1==false && answer2==true && rRan1.equals("&&")) {
                answer1_2F="false";
            }
            else if (answer1==false && answer2==false && rRan1.equals("||")){
                answer1_2F="false";
            }
    System.out.println(answer1_2F);
    
        //Cobinations for the first 2 booleans and first operator if it's true    
        if (answer1==true && answer2==true && rRan1.equals("||")){
            answer1_2T="true";
            }
            else if (answer1==true && answer2==false && rRan1.equals("||")){
                answer1_2T="true";
            }
            else if (answer1==false && answer2== true && rRan1.equals("||")){
                answer1_2T="true";
            }
            else if (answer1==true && answer2==true && rRan1.equals("&&")){
                answer1_2T="true";
            }
    System.out.println(answer1_2T);
    
        Oper
    
        //Combinations using the answer from above and evaulating it using the second operator and third boolean if it's false
        if (answer1_2F.equals(false) && rRan2.equals("&&") && answer3==false){
            answer2_2F="false";
        }
            else if (answer1_2F.equals(false) && rRan2.equals("&&") && answer3==true){
                answer2_2F="false";
            }
            else if (answer1_2T.equals(true) && rRan2.equals("&&") && answer3==false){
                answer2_2F="false";
            }
            else if (answer1_2F.equals(false) && rRan2.equals("||") && answer3==false){
                answer2_2F="false";
            }
    System.out.println(answer2_2F);
    
        //Combinations using the answer from above and evaluating it using the second operator and third boolean if it's true
        if (answer1_2T.equals(true) && rRan2.equals("||") && answer3==true){
            answer2_2T="true";
        }    
            else if (answer1_2T.equals(true) && rRan2.equals("||") && answer3==false){
                answer2_2T="true";
            }
            else if (answer1_2F.equals(false) && rRan2.equals("||") && answer3==true){
                answer2_2T="true";
            }
            else if (answer1_2T.equals(true) && rRan2.equals("&&") && answer3==true){
                answer2_2T="true";
            }
    System.out.println(answer2_2T);
    
        //Printing the result if the answer to the expression is false    
        if (answer2_2F.equals(false)){  
            System.out.print(answer2_2F);
        switch (answer){
            case "F":
            case "f":
                System.out.println("Correct, you go Glenn Coco");
                break;
            case "T":
            case "t":
                System.out.println("Try again.");
                break;
        }
        }
       
        //Printing the result if the answer to the expression is true
        else if (answer2_2T.equals(true)){
            System.out.print(answer2_2T);
        switch (answer){   
            case "F":
            case "f":
                System.out.println("Try again!");
                break;
            case "T":
            case "t":
                System.out.println("Correct, you go Glenn Coco!");
                break;
        }        
        }   
    }
}