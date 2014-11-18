// Mackenzie Snow
// November 16, 2014
// In this program the user is prompted to enter ten ints. If there are any duplicates 
// the program says there are, it also checks if there is exactly one duplicate.

import java.util.Scanner;
public class FindDuplicates {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int num[] = new int[10];
        String answer = "";
        do {
            System.out.print("Enter 10 ints- ");
            for (int j = 0; j < 10; j++) {
                num[j] = scan.nextInt();
            }
            String out = "The array ";
            out += listArray(num); //return a string of the form "{2, 3, -9}"   
            if (hasDups(num)) { // returns boolean statement if there is one or more duplicates
                out += "has ";
            }
            else {
                out += "does not have ";
            }
            out += "duplicates.";
            System.out.println(out);
            out = "The array ";
            out += listArray(num);
            if (exactlyOneDup(num)) { //returns boolean statement of one duplicate
                out += "has ";
            }
            else {
                out += "does not have ";
            }
            out += "exactly one duplicate.";
            System.out.println(out);
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer = scan.next();
        } while (answer.equals("Y") || answer.equals("y"));
    }

    public static String listArray(int num[]) {
            String out = "{";
            for (int j = 0; j < num.length; j++) {
                if (j > 0) {
                    out += ", ";
                }
                out += num[j];
            }
            out += "} ";
            return out;
        }
        // Checks if there are one or more duplicates in the array
    public static boolean hasDups(int num[]) {

            int counterDups = 0;
            boolean answer = true;
            for (int j = 0; j < num.length; j++) {
                for (int i = j + 1; i < 10; i++) {
                    if (num[j] == num[i]) {
                        counterDups++;
                    }
                }

            }

            if (counterDups > 0) {
                return true;
            }
            else {

                return false;
            }
        }
        // Checks if there is exactly one duplicate in the array
    public static boolean exactlyOneDup(int num[]) {
        boolean answer = true;
        int counterOneDup = 0;
        for (int j = 0; j < num.length; j++) {
            for (int i = j + 1; i < 10; i++) {
                if (num[j] == num[i]) {
                    counterOneDup++;
                }

            }
        }

        if (counterOneDup == 1) {
            return true;
        }
        else {
            return false;
        }
    }
}
