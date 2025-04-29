package Task4;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first number:" );
		int num1 = sc.nextInt();
		System.out.println("Enter the second number:" );
		int num2 = sc.nextInt();
		
		int temp = num1;
		num1 = num2;
		num2 = temp;	
		
		System.out.println("The Swapped values are:" );
		System.out.println("The first number is " + num1);
		System.out.println("The Second number is " + num2);

	}

}
