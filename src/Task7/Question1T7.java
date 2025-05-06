package Task7;

import java.util.Scanner;

public class Question1T7 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = Sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = Sc.nextInt();
		
		try {
			int result = num1/num2;
			System.out.println("Result: " + result);
		}
		catch (ArithmeticException e) {  
            System.out.println("Error: Division by zero is not allowed."); 
        }
		}
		

	}


