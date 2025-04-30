package Task5;

import java.util.Scanner;

public class Question1T5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);        
        System.out.println("Enter a word: ");
        String input = sc.nextLine();        
        String reversed = "";
        
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }       
        if (input.equalsIgnoreCase(reversed)) {        	
            System.out.println("The word is a palindrome.");
        } 
        else {        	
            System.out.println("The word is not a palindrome.");
        }

		}
}
