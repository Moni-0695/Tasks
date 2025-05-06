package Task7;

import java.util.Scanner;

public class Question2T7 {

	public static void main(String[] args) {
		// ArrayIndexOutOfBoundsException
		Scanner sc = new Scanner(System.in);
		int[] numbers = {10, 20, 30, 40};
		System.out.println("Enter the index to access in the array (0-3): ");
		int arrayIndex = sc.nextInt();
		
		
		try {            
			System.out.println("Value at index " + arrayIndex + ": " + numbers[arrayIndex]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // StringIndexOutOfBoundsException
		sc.nextLine();
        System.out.println("\nEnter a string: ");
        String userInput = sc.nextLine();
        System.out.print("Enter index to access character in the string: ");
        int stringIndex = sc.nextInt();
        
        try {
        	System.out.println("Character at index " + stringIndex + ": " + userInput.charAt(stringIndex));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }

	}

}
