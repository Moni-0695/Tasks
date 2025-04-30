package Task6;

import java.util.Scanner;

public class Question2T6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.println("Enter employee ID: ");
        int id = sc.nextInt();
        
        System.out.println("Enter first name: ");
        String firstName = sc.nextLine();

        System.out.println("Enter last name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter salary: ");
        int salary = sc.nextInt();
        
        Employee emp = new Employee(id, firstName, lastName, salary);        
        System.out.println("\nEmployee Details:");
        System.out.println(emp);
        
        System.out.println("\nEnter percentage to raise salary: ");
        int percent = sc.nextInt();
        emp.raiseSalary(percent);
        
        System.out.println("\nUpdated Employee Details:");
        System.out.println(emp);

	}

}
