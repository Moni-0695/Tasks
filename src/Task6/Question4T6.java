package Task6;

import java.util.Scanner;

public class Question4T6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);        
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter starting balance: ");
        double balance = sc.nextDouble();        
        Account acc = new Account(name, balance);
        
        System.out.print("Enter amount to deposit: ");
        double dep = sc.nextDouble();
        acc.deposit(dep);
        
        System.out.print("Enter amount to withdraw: ");
        double wd = sc.nextDouble();
        acc.withdraw(wd);
        
        acc.checkBalance();

	}

}
