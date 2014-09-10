//
//Mackenzie Snow
//hw02-Arithmetic
//9-06-14
//This program calculates the cost of Walmart items and their combined sales tax
//and prints it to the screen with only 2 decimal points
//
public class Arithmetic{
    public static void main(String[] args){
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair
        double socksCost$=2.58;
        //Nuumber of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        //Initializing the Variables
        double totalSockCost$=0.0;
        double totalSocksTax=0.0;
        double totalGlassCost$=0.0;
        double totalGlassTax=0.0;
        double totalEnvelopeCost$=0.0;
        double totalEnvelopeTax=0.0;
        double totalCOPbeforetax=0.0;
        double totalCOPaftertax=0.0;
        double totalSalesTax=0.0;
        
        //Computing the calculations
        totalSockCost$=(nSocks*socksCost$);
        totalSocksTax=(totalSockCost$*taxPercent);
        totalGlassCost$=(nGlasses*glassCost$);
        totalGlassTax=(totalGlassCost$*taxPercent);
        totalEnvelopeCost$=(nEnvelopes*envelopeCost$);
        totalEnvelopeTax=(totalEnvelopeCost$*taxPercent);
        totalSalesTax=(totalSocksTax+totalGlassTax+totalEnvelopeTax);
        totalCOPbeforetax=((totalSockCost$+totalGlassCost$+totalEnvelopeCost$));
        totalCOPaftertax=((totalSockCost$+totalSocksTax)+(totalGlassCost$+totalGlassTax)+(totalEnvelopeCost$+totalEnvelopeTax));
        
       
        //Print out the answers with 2 decimal places
        System.out.printf("The total cost of socks is $%2.2f  %n", totalSockCost$);
        System.out.printf("The total cost of glass is $%2.2f %n", totalGlassCost$);
        System.out.printf("The total cost of envelopes is $%2.2f %n",totalEnvelopeCost$);
        System.out.printf("The total sales tax on the purchase is $%2.2f %n", totalSalesTax);
        System.out.printf("The purchase total after tax is $%2.2f %n", totalCOPaftertax);
        
        
    }
}