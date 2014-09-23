//////////////////////////////////////////////
// Mackenzie Snow
// September 21, 2014
// CSEII
// This program takes input from the user in the form of a 6 digit number then prints out the
// semester and year of the class.

import java.util.Scanner;

public class CourseNumber{
    
    public static void main(String [ ] args){
        
        Scanner myScanner= new Scanner(System.in);
        System.out.print("Enter a six digit number giving the course semester: ");
        double Course= myScanner.nextDouble();
        int course=0;
        
       
       if (Course==(int)Course){
           course=(int)Course;
           
        }else {
           System.out.print("The number you entered is not an integer, goodbye.");
           System.exit(1);
       } 
       
       if (course>186509&&course<201441){
           if ((course%10)==0&&(course%100)<50){
                int semester = (course%100)/10;
                if(semester==1){
                    System.out.println("The course was offered in the Spring semester of "+course/100);
                }
                else if(semester==2){
                    System.out.println("The course was offered in the Summer 1 semester of " +course/100);
                }
                else if(semester==3){
                    System.out.println("The course was offered in the Summer 2 semester of " +course/100);
                }
                else{
                    System.out.println("The course was offered in the Fall semester of " +course/100);
                }
           }
           else{
               System.out.println(course+" is not a legitimate semester");
           }
       }
        else{
            System.out.println(course + " falls outside the given range");
        }
                  
       }
    }