/////////////////////////////////////////////
// Mackenzie Snow
// September 26, 2014
// Hw 05
// The user enters input about what kind of burger they want and their
// toppings.

import java.util.Scanner;
public class BurgerKing{
    public static void main(String [] args){
        Scanner myScanner= new Scanner(System.in);
        System.out.print("Enter a letter to indicate choice of \n Burger (B or b) \n Soda (S or s) \n Fries (F or f): ");
        String firstChoice= myScanner.next();
        
        switch (firstChoice){
        case "B":
        case "b":
            System.out.print("Enter A or a\"all the fixins\" \n C or c for cheese \n N or n for none of the above: ");
            
            String burger=myScanner.next();
            switch(burger){
                
            case "A":
            case "a":
                System.out.println("You ordered a burger with \"all the fixins\", go you.");
                break;
            case "C":
            case "c":
                System.out.println("You ordered a burger with cheese, don't fart.");
                break;
            case "N":
            case "n":
                System.out.println("You ordered a burger with nothing on it, boring");
                break;
                
            default:
            System.out.println("You did not enter a letter in the range, try again");
            break;
            
            }
            break;
            
        case "S":
        case "s":
            System.out.print("Do you want Pepsi (P or p), \n Coke (C or c), \n Sprite (s or S), \n or Mountain Dew (M or m): ");
            
            String type =myScanner.next();
            switch (type){
                
            case "P":
            case "p":
                System.out.println("You ordered a Pepsi");
                break;
            case "S":
            case "s":
                System.out.println("You ordered a Sprite");
                break;
            case "C":
            case "c":
                System.out.println("You ordered a Coke, go you");
                break;
            case "M":
            case "m":
                System.out.println("You ordered a Mountain Dew, you will probably have a heart attack.");
                break;
                
            default:
            System.out.println("You did not enter a letter in the range, try again");
            break;
            
            }
        break;
            
        case "F":
        case "f":
            System.out.print("Do you want a large or small order of fries (L,l,S, or s): ");
            
            String size= myScanner.next();
            switch (size){
            
            case "L":
            case "l":
                System.out.println("You ordered a large order of fries, yum");
                break;
            case "S":
            case "s":
                System.out.println("You ordered a small order of fries, okay");
                break;
                
            default:
            System.out.println("You did not enter a letter in the range, try again");
            break;    
            }
            
        break;
        
        default:
            System.out.println("You did not enter a letter in the range, try again");
            break;
        }    
            
    }
        
}
