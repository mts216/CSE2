// Mackenzie Snow
// October 17, 2014
// This code replaces certain types of loops with other types of loops.
// it's like loop inception up in here. Hold on tight.


import java.util.Scanner;
public class MoreLoops{
    public static void main(String[] arg){
	Scanner scan=new Scanner(System.in);
	int n=0;

	System.out.print("Enter an int- ");
	if(!scan.hasNextInt()){
	do{
	    scan.next(); //get rid of the junk entered by user
	    System.out.print("You did not enter an int; try again- ");
	}while(!scan.hasNextInt());
	}
	//COMMENT OUT THE ABOVE 5 LINES AND REPLACE THE CODE WITH A 
	//DO-WHILE LOOP
        n=scan.nextInt();
        int j=0;
        int k=0;
    
	while (j<n && j<40){
	    k=0;
	    while(k<j+1){
		System.out.print('*');
		k++;
	    }
	    System.out.println();
	    j++;
	}
	//COMMENT OUT THE ABOVE SIX LINES OF CODE AND REPLACE WITH 
	//WHILE STATEMENTS
      
//	int k=0;

	while(k<1){
	    System.out.println("k="+k);
	    k++;
	}
        //COMMENT OUT THE ABOVE FIVE LINES AND REPLACE THE CODE
	//WITH A WHILE LOOP

        for(int count=0; count<10; count++){
            if(n==1 || n==2){
               System.out.print("Case 2 "); 
            }
            else if(n>5 || n<1){
                System.out.println(n + " is > 5 or <1");
            }
            else if(n==4 || n==5){
                System.out.println("Case 4");
	            System.out.println("Case 5");
            }
	 /*   switch(n){
	    default: System.out.println(n + " is > 5 or <1");
		break;
	    case 1: 
	    case 2:  
		continue;
	    case 3: break;
	    case 4: System.out.println("Case 4");
	    case 5: System.out.println("Case 5");
		break;
	    } */

	}
	//COMMENT OUT THE ABOVE 16 LINES AND REWRITE THE CODE UING
	// ONLY FOR LOOPS AND IF STATEMENS. BEFORE DOING SO, TRY
	//RUNNING THE CODE WITH VARIOUS INPUTTED VALUES, E.G., 
	//   -5, 1, 20, 5, ETC.
	//IF YOU GET AN INFINITE LOOP, YOU CAN STOP IT BY 
	//SIMULTANEOUSLY PRESSING THE CTRL KEY AND THE C KEY
    }
}