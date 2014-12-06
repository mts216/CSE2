////////////////////////////////////////////////////////////////////////////////
// Mackenzie Snow
// Enigma1
// This code is all about debugging codes. Which would be really cool if you knew what the expected
// output was supposed to be. But then again that's half the fun.


/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a proportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    double x=((new Scanner(System.in)).nextDouble());
   System.out.println("You entered "+x+"%");
   //print out the proportion remaining for select percentages
   double proportion= 1.001-x/100;
   proportion=(int)(proportion*100)/100.0; //cast to an int with two digits after the decimal point
   if(proportion==0.93){  //when the user enters 7
      System.out.println("The proportion remaining is "+0.93);
   }
    else if(proportion==0.59){//when the user enters 41
      System.out.println("The proportion remaining is "+0.59);
    }
    else if(proportion==0.86){//when the user enters 14
      System.out.println("The proportion remaining is "+0.86);
    }
    else if(proportion==0.67){//when the user enters 33
      System.out.println("The proportion remaining is "+0.67);
    }
    else if(proportion==0.4){//when the user enters 60
      System.out.println("The proportion remaining is "+0.40);
    }
   }
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 * The main error was that the proportion in the if/else statements needed to be exactly two digits and the proportion 
 * as a double was more than two. So it needed to be cast into a double with only two digits after the decimal point.
 * There were also no brackets in the if and else if statements which also caused the code not to work as desired.
 * 
 */
