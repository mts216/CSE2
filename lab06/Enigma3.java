//
// Mackenzie Snow
// Enigma3
// This code is all about debugging codes. Which would be really cool if you knew what the expected
// output was supposed to be. But then again that's half the fun.

/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String [] arg){
      System.out.println("Line: n k");
    int n=40,k=60;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
      System.out.println("15: " + n + " " + k);
         break;
      default: out+=40;
          n/=3;
          k-=7;
          System.out.println("20: " + n+ " " +k);
    }
    if(n*k%12< 12){
      n-=20;
      out+=n;
      System.out.println("25: " + n + " " + k);
    }
    if(n*n>k){
      n=42;
      out+=n+k;
      System.out.println("30: " + n + " " + k);
    }
    else {
      n=45;
      out+=n+k;
      System.out.println("35: " + n + " " + k);
    }
    switch(n+k){
      case 114: 
        n-=11;
        k-=3;
        System.out.println("41: " + n + " " + k);
        break;
      case 97:
        n-=14;
        k-=2;
        System.out.println("46: " + n + " " + k);
        break;
      case 98:
        n/=5;
        k/=9;
        System.out.println("51: " + n + " " + k);
        break;
      default:
        n-=3;
        k-=5;
        System.out.println("52: " + n + " " + k);
    }
     out+=1/n + 1/k;   
    System.out.println(out);
  }
}

/*
 * Error report:
 * I inserted print statements after each case where n or k was changed. I found that k
 * becomes zero between line 51 and 52 when k/=9 and then k-=5 which brings it to zero.
 * By adding a break in case 98 it will never run the default case and thus k will never 
 * equal zero. Boom.
 */
