// Mackenzie Snow
// October 17, 2014
// This code runs a program that makes a tree out of the number inputted by the user.
// It does this using each type of loop.

import java.util.*;
public class NumberStack {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n = 0;
        System.out.print("Enter an integer between 1 and 9: ");

        while (!myScanner.hasNextInt()) {
            System.out.println("You did not enter an int. But good try");
            myScanner.next();
        }
        int temp = 0;
        temp = myScanner.nextInt();
        if(temp<10 && temp>0){
            n=temp;
        }
        else{
            System.out.println("Expecting a number between 1 and 9");
            myScanner.next();
        }
        //Prints out the number tree using for loops
        System.out.println("Using for loops:");
        for (int number = 0; number < n; number++) {
            for (int j = 0; j <= number; j++) {
                for (int spaces = 9 - number; spaces > 0; spaces--) {
                    System.out.print(" ");
                }
                for (int i = 2 * number + 1; i > 0; i--) {
                    System.out.print(number + 1);
                }
                System.out.println();
            }
            for (int spaces = 9 - number; spaces > 0; spaces--) {
                System.out.print(" ");
            }
            for (int dash = 2 * number + 1; dash > 0; dash--) {
                System.out.print("-");
            }
            System.out.println();
        }

        //Prints out the number tree using while loops
        System.out.println("Using while loops:");
        int number = 0;
        while (number < n) {
            int j = 0;
            while (j <= number) {
                int spaces = 9 - number;
                while (spaces > 0) {
                    System.out.print(" ");
                    spaces--;
                }
                int i = 2 * number + 1;
                while (i > 0) {
                    System.out.print(number + 1);
                    i--;
                }
                j++;
                System.out.println();
            }
            int spaces = 9 - number;
            while (spaces > 0) {
                System.out.print(" ");
                spaces--;
            }
            int dash = 2 * number + 1;
            while (dash > 0) {
                System.out.print("-");
                dash--;
            }
            System.out.println("");
            number++;
        }

        System.out.println("Using Do-While loops: ");
        number=0;

        do {
            int j = 0;
            do {
                int spaces = 9 - number;
                do {
                    System.out.print(" ");
                    spaces--;

                } while (spaces > 0);
                int i = 2 * number + 1;
                do {
                    System.out.print(number + 1);
                    i--;
                } while (i > 0);
                j++;
                System.out.println();
            } while (j <= number);

            int spaces = 9 - number;
            do {
                System.out.print(" ");
                spaces--;
            } while (spaces > 0);

            int dash = 2 * number + 1;
            do {
                System.out.print("-");
                dash--;

            } while (dash > 0);
            System.out.println("");
            number++;
        } while (number < n);
    }
}