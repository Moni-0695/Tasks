package Task7;

import java.util.Scanner;

public class ValidAgeQ3 {
	
	public void validAge () throws InvalidAgeExceptionQ3 {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		
		if (age<18) {			
			throw new InvalidAgeExceptionQ3("Age must be 18 or above to proceed.");
		}
		else {
			System.out.println("You are eligible. Age entered: " + age);
		}

	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		ValidAgeQ3 obj = new ValidAgeQ3();
		try {
			obj.validAge();
		} catch (InvalidAgeExceptionQ3 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error: InvalidAgeException caught!");
		}
	}

}
