///////
// Mackenzie Snow
// December 2, 2014
// PokerHands.java
// In this program you are simulating a 5 card poker hand. The user creates a hand and then that
// hand is categorized by rank and returned. Pretty cool stuff if I do say so myself.

import java.util.*;
public class PokerHands {
    public final static String[] ranks = {
        "a", "k", "q", "j", "10", "9", "8", "7", "6", "5", "4", "3", "2"
    };
    public final static String[] suits = {
        "s", "c", "h", "d"
    };
    public static void main(String[] args) {

        String[][] cards = new String[2][5]; //dont forget to change this
        String[][] cardRepeat = new String[2][5];

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter 'y' or 'Y' to enter a(nother) hand: ");
        String in = myScanner.next();
        if (! in .equals("y") && ! in .equals("Y")) {
            System.exit(0);
        }
        basic: for (int i = 0; i < cards[0].length; i++) {
            String currentSuit = buildSuit(myScanner);
            String currentRank = buildHand(myScanner);
            //repeat(currentSuit, currentRank, cardRepeat, i, myScanner);

            for( int r=0; r<i; r++){
                if (cards[0][r].equals(currentSuit) && cards[1][r].equals(currentRank)) {
                    i--;
                    System.out.println("You already entered this card, try again.");
                    continue basic;
                }
            }
            cards[0][i] = currentSuit;
            cards[1][i] = currentRank;
        }
        int[] rankHand = new int[5];
        for (int i = 0; i < rankHand.length; i++) {
            rankHand[i] = searchRanks(cards[1][i]);
            //System.out.println(rankHand[i]);
        }
        int[] checkedRanks = lookUpRanks(rankHand);
        int[] check = matches(checkedRanks);
        categorizedHand(checkedRanks, check, cards[0]);

    }
    public static boolean got1Pair(int[] check) {

        if (check[2] == 1) {
            return true;
        }
        return false;
    }

    public static boolean twoPair(int[] check) {
        if (check[2] == 2) {
            return true;
        }
        return false;
    }

    public static boolean fullHouse(int[] check) {
        if (check[2] == 1 && check[3] == 1) {
            return true;
        }
        return false;
    }

    public static boolean fourOfAKInd(int[] check) {
        if (check[4] == 1) {
            return true;
        }
        return false;
    }

    public static boolean flush(String[] cards) {
        for (int i = 0; i < cards.length; i++) {
            if (!cards[0].equals( cards[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean straight(int[] checkedRanks, int[] check) {
        if (check[1] != 5) {
            return false;
        }
        for (int i = 0; i < checkedRanks.length; i++) {
            if (checkedRanks[i] == 1) {
                for (int j = i + 1; j < i + 5; j++) {
                    if (checkedRanks[j] != 1) {
                        return false;
                    }
                }
                return true;
            }

        }
        System.out.println("error");
        return false;
    }
    
    public static void categorizedHand(int[] checkedRanks, int[] check, String[] cards){
        if(flush(cards) && straight(checkedRanks, check) && checkedRanks[0]==1){
            System.out.println("This is a royal flush.");
        }
        else if(flush(cards) && straight(checkedRanks, check)){
            System.out.println("This is a straigh flush.");
        }
        else if(fourOfAKInd(check)){
            System.out.println("This is four of a kind.");
        }
        else if (fullHouse(check)){
            System.out.println("This is a full house.");
        }
        else if(flush(cards)){
            System.out.println("This is a flush.");
            }
        else if(straight(checkedRanks, check)){
            System.out.println("This is a straight.");
        }
        else if(twoPair(check)){
            System.out.println("This is two pair.");
        }
        else if(got1Pair(check)){
            System.out.println("This has one pair.");
        }
        else{
            System.out.println("High card.");
        }
    }

    public static int[] lookUpRanks(int[] rankHand) {
        int[] checkedRanks = new int[13];
        for (int i = 0; i < rankHand.length; i++) {
            checkedRanks[rankHand[i]] ++;
        }
        return checkedRanks;
    }
    public static int[] matches(int[] checkedRanks) {
            int[] check = new int[5];
            for (int i = 0; i < check.length; i++) {
                for (int j = 0; j < checkedRanks.length; j++) {
                    if (checkedRanks[j] == i) {
                        check[i] ++;
                    }
                }
            }
            return check;
        }
        /*  public static void repeat(String suit, String rank, String[][] cardRepeat, int counter, Scanner myScanner) {
                  int gotSuit = Arrays.binarySearch(cardRepeat[0], suit);
                  int gotRank = Arrays.binarySearch(cardRepeat[1], rank);
                  System.out.print("ok");
                  if (gotSuit == gotRank && gotRank != -1 && gotSuit != -1) {
                      System.out.print("Yo, you repeated that card, try again.");
                      suit = buildSuit(myScanner);
                      rank = buildHand(myScanner);
                      repeat(suit, rank, cardRepeat, counter, myScanner);
                      return;
                  }
                  System.out.print("test");
                  cardRepeat[0][counter] = suit;
                  cardRepeat[1][counter] = rank;
                  return;

              }
              */
        // Builds the hand
    public static String buildSuit(Scanner myScanner) {

        System.out.print("Enter the suit: 'c', 'd', 'h', or 's'-: ");
        String suit = myScanner.next();
        while (!suit.equals("c") && !suit.equals("d") && !suit.equals("h") && !suit.equals("s")) {
            System.out.println("You did not enter a valid response.");
            suit = myScanner.next();
        }
        return suit;
    }

    // Builds the hand
    public static String buildHand(Scanner myScanner) {

        System.out.print("Enter one of 'a', 'k', 'q', '10',... '2'- ");
        String cardNumber = myScanner.next();
        while (searchRanks(cardNumber) == -1) {
            System.out.println("You did not enter a valid response.");
            cardNumber = myScanner.next();
        }
        return cardNumber;
    }

    public static int searchSuit(String current) {
        for (int i = 0; i < suits.length; i++) {
            if (current.equals(suits[i])) {
                return i;
            }
        }
        return -1;
    }
    public static int searchRanks(String current) {
        //System.out.println("Current: " + current);
        for (int i = 0; i < ranks.length; i++) {
            //System.out.println("rank[i]: " + ranks[i]);
            if (ranks[i].equals(current)) {
                return i;
            }
        }
        return -1;
    }


}