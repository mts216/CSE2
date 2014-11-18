// Mackenzie Snow
// November 18, 2014
// This program tests the efficiency of the random number generator by modeling a poker hand. First the hand is
// randomly generated, then that randomly generated hand is generated 10,000 times, that is then analyzed to see how
// many of each pair of numbers is generated which is important in poker. Anyway, it's cool.


import java.util.Random;
import java.util.Scanner;
public class PokerOdds {
    //main method, calling all other methods
    public static void main(String[] arg) {
            showHands();
            simulateOdds();
        }
        //takes a randomly generated hand and sorts it into rank and suit using the modulo function. Legit.
    public static void showHands() {
        int card = 0;
        int counterCards = 51;
        int[] deck;
        deck = new int[52];
        int[] hand;
        hand = new int[5];
        String clubs = " Clubs: ";
        String diamond = " Diamond: ";
        String hearts = " Hearts: ";
        String spades = " Spades: ";
        String cardValue = " ";

        makeDeck(deck);
        makeHand(hand);
        fillHand(deck, hand);


        for (int x = 0; x < hand.length; x++) {


            int modValue = hand[x] % 4;


            if (modValue == 0) {
                cardValue = cardRank(hand[x]);
                clubs = clubs + " " + cardValue;
            }

            if (modValue == 1) {

                cardValue = cardRank(hand[x]);
                hearts = hearts + " " + cardValue;
            }

            if (modValue == 2) {
                cardValue = cardRank(hand[x]);
                diamond = diamond + " " + cardValue;
            }
            if (modValue == 3) {
                cardValue = cardRank(hand[x]);
                spades = spades + " " + cardValue;
            }
        }

        System.out.println(clubs);
        System.out.println(diamond);
        System.out.println(spades);
        System.out.println(hearts);
        // You were so stoked about the random hand it generated that this lets you forever generate random hands. 
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
        String yes = myScanner.next();
        if (yes.equals("Y") || yes.equals("y")) {
            showHands();
        }

    }


    // This method makes the rank of the card. 
    public static String cardRank(int card) {

            int cardValue = card % 13;
            String cardNumber = " ";

            switch (cardValue) {
                case 0:
                    cardNumber = "A";
                    break;
                case 1:
                    cardNumber = "K";
                    break;
                case 2:
                    cardNumber = "Q";
                    break;
                case 3:
                    cardNumber = "J";
                    break;
                case 4:
                    cardNumber = "10";
                    break;
                case 5:
                    cardNumber = "9";
                    break;
                case 6:
                    cardNumber = "8";
                    break;
                case 7:
                    cardNumber = "7";
                    break;
                case 8:
                    cardNumber = "6";
                    break;
                case 9:
                    cardNumber = "5";
                    break;
                case 10:
                    cardNumber = "4";
                    break;
                case 11:
                    cardNumber = "3";
                    break;
                case 12:
                    cardNumber = "2";
                    break;
            }

            return cardNumber;

        }
        //This is the second half of the homework, see how well it works. Random generators are too cool.
    public static void simulateOdds() {
            int[] count;
            count = new int[14];
            for (int i = 0; i < 10000; i++) {
                int[] deck;
                deck = new int[52];
                int[] hand;
                hand = new int[5];
                makeDeck(deck);
                makeHand(hand);
                fillHand(deck, hand);
                int pair = pair(hand);
                if (pair == -1) {
                    count[13] ++;
                }
                else {
                    count[pair] ++;
                }

            }
            printArray(count);
        }
        // Yo I just calculated how many pairs are up in here.
    public static int pair(final int[] hand) {
            int answer = -1;
            int[] pairCount;
            pairCount = new int[13];

            for (int i = 0; i < hand.length; i++) {
                int temp = hand[i] % 13;
                pairCount[temp] ++;
            }
            boolean gotPair = false;
            for (int j = 0; j < pairCount.length; j++) {
                if (pairCount[j] == 2 && !gotPair) {
                    gotPair = true;
                    answer = j;
                }
                else if (gotPair && pairCount[j] == 2) {
                    gotPair = false;
                    answer = -1;
                    break;
                }
            }
            return answer;
        }
        //This is used to make the hand
    public static void subtract(int card, int counterCards, int[] deck) {
            for (int i = card; i < counterCards; i++) {
                deck[i] ++;
            }
        }
        //This fills the hand
    public static void fillHand(int[] deck, int[] hand) {
            int card = 0;
            int counterCards = 51;
            for (int k = 0; k < hand.length; k++) {
                card = (int)(Math.random() * counterCards);
                hand[k] = deck[card];
                deck[card] = deck[counterCards];
                deck[counterCards] = -1;
                counterCards--;
                subtract(card, counterCards, deck);
            }
        }
        //This makes the deck to pick a hand out of
    public static void makeDeck(int[] deck) {
            for (int i = 0; i < 52; i++) { //create a deck of 52 cards
                deck[i] = i + 1;
            }

        }
        // this makes a hand out of the deck
    public static void makeHand(int[] hand) {
            for (int j = 0; j < 5; j++) { //create a hand of 5 cards
                hand[j] = -1;
            }

        }
        // This prints the array and ties everything together with a pretty bow. 
    public static void printArray(int[] count) {
        String[] cards = {
            "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"
        };
        for (int i = 0; i < count.length - 1; i++) {
            System.out.println(cards[i] + "\t" + count[i]);
        }
        for (int i = 0; i < 20; i++) {
            System.out.print('-');
        }
        System.out.println("\nTotal not exactly one pair: " + count[13]);
    }


}
