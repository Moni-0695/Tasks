package Task6;

public class Account {
	String name;
    double balance;

    // 1. No-argument 
    Account() {
        name = "Unknown";
        balance = 0.0;
    }

    // 2. two arguments
    Account(String n, double b) {
        name = n;
        balance = b;
    }
    
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }   
    
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Not enough balance!");
        }
    } 
    
    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}
