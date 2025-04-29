package Task4;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);	
	System.out.println ("Enter four integers (a,b,c,d):");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = sc.nextInt();
	if ((a+b) > (c+d)){
		System.out.println ("The sum of a and b is greater than d and c.");
			}
	else{
		System.out.println ("The sum of a and b is not greater than d and c.");
	}
	}

}
