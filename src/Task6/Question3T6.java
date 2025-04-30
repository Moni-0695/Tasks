package Task6;

import java.util.Scanner;

public class Question3T6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);        
        System.out.println("Enter radius for the Circle: ");
        
        double radius = sc.nextDouble();        
        Circle circle = new Circle(radius);        
        
        System.out.println("Circle Radius: " + circle.getRadius());
        System.out.printf("Circumference: %.2f\n", circle.calculateCircumference());
	}

}
