package Task5;

import java.util.Scanner;

public class Question1T5 {

	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in); 

	        System.out.println("Enter a word: ");
	        String original = sc.nextLine(); 
	        boolean isPalindrome = true;

	        for (int i = 0; i < original.length() / 2; i++) {
	            char startChar = original.charAt(i);
	            char endChar = original.charAt(original.length() - 1 - i);

	       if (startChar != endChar)  {
	    	   isPalindrome = false;
	       }
	           
	        }
	        
	        if (isPalindrome) {
	            System.out.println(original + " is a palindrome.");
	        } else {
	            System.out.println(original + " is not a palindrome.");
	        }

		}

}
