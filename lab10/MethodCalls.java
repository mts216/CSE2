///
// Mackenzie Snow
// lab10
// In this program we are taking a large program and breaking it up into separate methods. 
// Methods are like loaves and fishes because they just keep multiplying no matter how small your starting code was.

public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
       /* c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    */
    }
    
    public static int addDigit(int number, int digit){ // See this is the method
        String c=" ";
        String use=Integer.toString(number);
        String guess=Integer.toString(digit);
        c = guess+use;
        System.out.println(c);
        c=Integer.parseInt(c);
        return c;

    }
    
  //  public static String Join(){
    
   // }
} 
