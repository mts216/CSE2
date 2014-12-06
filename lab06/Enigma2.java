//
// Mackenzie Snow
// Enigma2
// This code is all about debugging codes. Which would be really cool if you knew what the expected
// output was supposed to be. But then again that's half the fun.


import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40;
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 * The java.lang exception happens when the stack is overdrawn because of excessive recursion.
 * In this code the issue is that you cannot divide by zero.
 * By removing the division be zero, the code runs as expected.
 * The java.lang exception is super helpful in detecting logic errors. 
 * You go java.lang exception error.
 */

