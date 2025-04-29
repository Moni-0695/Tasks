package Task4;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int a = sc.nextInt();
		
		if(a>=60){
		System.out.println("The Person is a Senior Citizen.");
		}
		else {
		System.out.println("The Person is not a Senior Citizen.");
		}
	}

}
