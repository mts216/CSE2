//
// Mackenzie Snow
// Cyclometer Java Program
// In this program we are starting to use java to do arithmetic. We are also starting to define variables
// and to play with those variables. We are also concatinating(sp) strings and variables. Coolio.

public class Cyclometer{
    
    public static void main(String [] args){
        
        double secsTrip1=480; //Seconds for trip 1
        double secsTrip2=3220; //Seconds for trip 2
        double countsTrip1=1561; //Rotations for trip 1
        double countsTrip2=9037; //Rotations for trip 2
        double wheelDiameter=27.0;
        double PI=3.14159;
        double feetPerMile=5280; 
        double inchesPerFoot=12; 
        double secondsPerMinute=60; 
        double distanceTrip1=0.0; 
        double distanceTrip2=0.0;
        double totalDistance=0.0;
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    }
}