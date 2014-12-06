//////////////////////////////////////////////////////////////////////////////////
// Mackenzie Snow
// September 24, 2014
// Switch Statements
// Switch statements are pretty cool because you can just have a poop ton of cases and the code just does it.
// Things to remember with our friends the switch. Break after every case unless you want every case to run.
// Also be careful about which thing you want to switch on, and remember to do a default statement.
// Alright off you go!

import java.util.Scanner;
public class RandomGames{
    public static void main(String [] args){
        Scanner myScanner= new Scanner(System.in);
        System.out.print("Enter R or r for roulette, C or c for craps, P or p for pick a card: ");
        String game= myScanner.nextLine();
        
        switch(game){ //Switching on user input
            case "R": //Roulette
            case "r":  
                
                int roulette=(int) (Math.random()*38);
                
                switch(roulette){
                case 37:
                    System.out.println("Roulette: 00");
                    break;
                default:
                    System.out.println("Roulette: " + roulette);
                    break;
                }
                break;
            case "C": //craps
            case"c":
                int die1= (int)(Math.random()*6)+1;
                int die2=(int)(Math.random()*6)+1;
                int sum= die1+die2;
                System.out.println(die1+" + " + die2 +" = "+sum);
            break;
              
            
            case "P": //cards
            case"p":
                int suit=(int)(Math.random()*4)+1;
                int nCard=(int)(Math.random()*13)+1;
                switch(nCard){
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:    
                        switch(suit){
                        case 1:
                            System.out.println(nCard+" of hearts");
                            break;
                        case 2:
                            System.out.println(nCard+" of spades");
                            break;
                        case 3:
                            System.out.println(nCard+" of clubs");
                            break;
                        case 4:
                            System.out.println(nCard+" of diamonds");
                            break;
                        }
                    break;       
                    case 14:
                        switch(suit){
                        case 1:
                            System.out.println("Ace of hearts");
                            break;
                        case 2:
                            System.out.println("Ace of spades");
                            break;
                        case 3:
                            System.out.println("Ace of clubs");
                            break;
                        case 4:
                            System.out.println("Ace of diamonds");
                            break;
                        }
                     break;       
                    case 11:
                        switch(suit){
                        case 1:
                            System.out.println("Jack of hearts");
                            break;
                        case 2:
                            System.out.println("Jack of spades");
                            break;
                        case 3:
                            System.out.println("Jack of clubs");
                            break;
                        case 4:
                            System.out.println("Jack of diamonds");
                            break;
                        }
                   break;
                    case 12:
                        switch(suit){
                        case 1:
                            System.out.println("Queen of hearts");
                            break;
                        case 2:
                            System.out.println("Queen of spades");
                            break;
                        case 3:
                            System.out.println("Queen of clubs");
                            break;
                        case 4:
                            System.out.println("Queen of diamonds");
                            break;
                       
                        }
                break;
                case 13:
                    switch(suit){
                        case 1:
                            System.out.println("King of hearts");
                            break;
                        case 2:
                            System.out.println("King of spades");
                            break;
                        case 3:
                            System.out.println("King of clubs");
                            break;
                        case 4:
                            System.out.println("King of diamonds");
                            break;
                    
                             }
                }
                break;
            default:
            System.out.println("Letter not in the range");
            break;
        }
        //You just played some games

}
}