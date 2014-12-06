////////////////////////////////////////////////////////////////////
// Mackenzie Snow
// November 24, 2014
// Enigma0
// This code is all about debugging codes. Which would be really cool if you knew what the expected
// output was supposed to be. But then again that's half the fun.

/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
      int n=0;
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    if(scan.hasNextInt()){
      n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
      n=4;
      System.out.println("You entered "+n);
    }
    
    int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
              System.out.println("Again, you entered "+ n);
      default:
        System.out.println("To repeat, you entered " + n);
        break;
    }
  }
}

/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
 The main error in this program was the fact that "n" was only declared and initialized inside the if/else
 statements. This caused a compiler error because the compiler did not know what "n" was outside of the loop. I fixed this by 
 declaring and initializing "n" outside of the if/else statement and then just reassigned them when it was necessary.
 This gave the desired output.
 */
