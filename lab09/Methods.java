// Mackenzie Snow
// October 23, 2014
// This program is designed to practice methods
// Methods are like real adult people coding techniques because you can just call them however many times you want
// which is super awesome and really handy and you can call methods within methods.
// A fun fact about methods is you can also call the same method within a method and that's called recursion which is dangerous but beautiful.

import java.util.*;
public class Methods {
    public static void main(String[] arg) {
        Scanner myScanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter three ints: ");

        a = getInt(myScanner);
        b = getInt(myScanner);
        c = getInt(myScanner);
        System.out.println("The larger of " + a + " and " + b + " is " + larger(a, b));
        System.out.println("The larger of " + a + ", " + b + ", and " + c + " is " + c);
        System.out.println("It is " + ascending(a, b, c) + " that " + a + ", " + b + ", and " + c + " are in ascending order");
    }
    public static int getInt(Scanner myScanner) { // this method inputs a scanner and outputs an int
        while (!myScanner.hasNextInt()) {
            System.out.println("You did not enter an int, try again: ");
            myScanner.next();
        }
        return myScanner.nextInt();
    }
    public static int larger(int a, int b) { // this method inputs two integers and outputs an integer
        if (a > b) {
            return a;
        }
        return b;
    }
    public static boolean ascending(int a, int b, int c) { // this method takes in three ints and returns a boolean
        int largest = larger(a, larger(b, c));
        int smallest = smaller(a, smaller(b, c));
        if (b < a || c < b) {
            return false;
        }
        return true;
    }
    public static int smaller(int a, int b) { // this method inputs two ints and outputs one
        if (a < b) {
            return a;
        }
        return b;


    }
}
