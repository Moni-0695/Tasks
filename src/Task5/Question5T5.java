package Task5;

import java.util.Scanner;

public class Question5T5 {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the mark: ");
       int mark = sc.nextInt();
       
       if (mark >100 || mark <0) {
    	  System.out.println("Invalid Input");
       }
       else {
    	   if (mark == 100) {
    		   System.out.println("Grade S");
    	   }
    	   else if (mark >=90) {
    		   System.out.println("Grade A");
    	   }
    	   else if (mark >= 80) {
    		   System.out.println("Grade B");
    	   }
    	   else if (mark >= 70) {
    		   System.out.println("Grade C");
    	   }
    	   else if (mark >= 60) {
    		   System.out.println("Grade D");
           }
    	   else if (mark >= 50) {
    		   System.out.println("Grade E");
	       }
    	   else {
               System.out.println("Grade F");

           }
        }
	}
}