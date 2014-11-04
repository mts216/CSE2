/////////////////////////////////////////////////////////////////
// Mackenzie Snow
// November 3, 2014
// In this program the user enters an int which is run through different methods to check for an int, and in the range. 
// Then it prints out NumberStack but using submethods to do so.

import java.util.*;
public class BlockedAgain {
    public static void main(String[] s) {
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt();
        allBlocks(m);
    }

    //Subproblem A
    public static int getInt() {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer between 1 and 9: ");
            int userInput = checkRange(myScanner);
            return userInput;

        }
        //Checks for an int
    public static int checkInt(Scanner myScanner) {
            while (!myScanner.hasNextInt()) {
                System.out.println("You did not enter an int, try again: ");
                myScanner.next();
            }
            int userInput = myScanner.nextInt();
            return userInput;
        }
        //Checks for an int in the correct range
    public static int checkRange(Scanner myScanner) {
            int userRange = checkInt(myScanner);
            while (userRange > 9 || userRange < 1) {
                System.out.println("You did not enter a number in the range, try again: ");
                userRange = checkInt(myScanner);
            }

            return userRange;
        }
        //SubProblem B
    public static void allBlocks(int x) {
            for (int number = 0; number < x; number++) {
                block(number);
            }
        }
        //Prints the block of numbers
    public static void block(int number) {
            for (int j = 0; j <= number; j++) {
                for (int spaces = 9 - number; spaces > 0; spaces--) {
                    System.out.print(" ");
                }
                for (int i = 2 * number + 1; i > 0; i--) {
                    System.out.print(number + 1);
                }
                System.out.println();
            }
            line(number);

        }
        //prints the spacing and dashes
    public static void line(int number) {
        for (int spaces = 9 - number; spaces > 0; spaces--) {
            System.out.print(" ");
        }
        for (int dash = 2 * number + 1; dash > 0; dash--) {
            System.out.print("-");
        }
        System.out.println();
    }
} //closes class