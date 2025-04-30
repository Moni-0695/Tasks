package Task5;

import java.util.Scanner;

public class Question4T5 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
          System.out.print("Enter number of rows: ");
	      int n = sc.nextInt();

	      int middle = n / 2;
	        for (int i = 0; i <= middle; i++) {
	     
	            for (int j = 0; j < i; j++) {
	                System.out.print(" ");
	            }

	            System.out.print("*");

	            int spaceBetween = (middle - i) * 2;
	            for (int j = 0; j < spaceBetween; j++) {
	                System.out.print(" ");
	            }

	            if (i != middle) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }

	        // Bottom
	        for (int i = middle - 1; i >= 0; i--) {
	        	for (int j = 0; j < i; j++) {
	        		
	                System.out.print(" ");
	            }
	        	
	            System.out.print("*"); 
	            
	            int spaceBetween = (middle - i) * 2;
	            for (int j = 0; j < spaceBetween; j++) {
	            	
	                System.out.print(" ");
	            }
	            System.out.print("*");
	            
	            System.out.println();
	        }
	}
}


