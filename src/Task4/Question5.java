package Task4;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
	    System.out.print("Enter the prime number: ");
	    int num = sc.nextInt();
	    int count = 0; 

	    if (num <= 1){
	      System.out.println(num + " is not a prime number.");
	    } 
	    else {
	      for (int i = 2; i <= num / 2; i++) {
	        if (num % i == 0) {
	          count++;  
	          break;
	          }
	      }
	        if (count == 0){
	        System.out.println(num + " is a prime number.");
	      } else{
	    	System.out.println(num + " is not a prime number.");
	      }
	    } 
	  }
	}
