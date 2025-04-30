package Task6;

import java.util.Scanner;

public class Question1T6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        Person person = new Person(name, age);

        // Print the values using getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
	}

}
