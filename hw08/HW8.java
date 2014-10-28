//////////////////////////////////////////////////////////////////
// Mackenzie Snow
// October 24, 2014
// In this program we are overloading methods in order to force the user to enter the correct input

import java.util.*;
public class HW8 {
    public static void main(String[] arg) {
        char input;
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
        input = getInput(myScanner, "Cc");
        System.out.println("You entered '" + input + "'");
        System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
        input = getInput(myScanner, "yYnN", 5); //give up after 5 attempts
        if (input != ' ') {
            System.out.println("You entered '" + input + "'");
        }

        input = getInput(myScanner, "Choose a digit.", "0123456789");
        System.out.println("You entered '" + input + "'");
    }
    public static char getInput(Scanner myScanner, String strang) {
        char temp = helpLength(myScanner);
        while (!strang.contains(Character.toString(temp))) {
            System.out.println("You did not enter a correct letter");
            System.exit(0);
        }
        return temp;
    }
    public static char helpLength(Scanner myScanner) {
        String myStrang = myScanner.next();
        while (myStrang.length() != 1) {
            System.out.println("You did not enter an input with correct length. ");
            System.exit(0);
        }
        return myStrang.charAt(0);
    }
    public static char getInput(Scanner myScanner, String abc, int count) {

        //compare myScanner with abc to make sure that the user did input yYnN
        //if they did input properly, return myScanner
        int j = 0;
        char retEmpty = ' ';
        char userInput = myScanner.next().charAt(0);
        if (userInput == abc.charAt(0) || userInput == abc.charAt(1) || userInput == abc.charAt(2) || userInput == abc.charAt(3)) {
            return userInput;
        }
        else {
            int x = 0;


            while (!(userInput == abc.charAt(0) || userInput == abc.charAt(1) || userInput == abc.charAt(2) || userInput == abc.charAt(3))) {
                System.out.println("you did not enter proper term, try again: ");
                userInput = myScanner.next().charAt(0);
                x++;

                if (x == count) {

                    System.out.println("You failed after 5 tries");
                    return retEmpty;
                }
            }
            return userInput;
        }
    }

    public static char getInput(Scanner myScanner, String prompt, String num) {
        
        System.out.println(prompt);
        char temp=helpLength(myScanner);
        String userInput = myScanner.next();
        if (!num.contains(Character.toString(temp)) || !num.contains(Character.toString(temp))) {
            System.out.println("You did not enter an acceptable character.");
            System.exit(0);
        }
        return userInput.charAt(0);
    }
}