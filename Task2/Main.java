package GenTask.Task2;
import java.util.Scanner;

class Account {
    private double balance;

    // No-argument constructor
    public Account() {
        // Default balance set to 0
        balance = 0.0;
    }

    // Parameterized constructor
    public Account(double initialBalance) {
        // Set the balance to the initial balance provided
        balance = initialBalance;
    }

    // Method to deposit amount to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    // Method to withdraw amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount. Withdrawal failed.");
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an account with no arguments constructor
        Account account1 = new Account();
        account1.displayBalance(); // Display initial balance

        // Creating an account with initial balance
        System.out.print("Enter initial balance for account 2: $");
        double initialBalance = scanner.nextDouble();
        Account account2 = new Account(initialBalance);
        account2.displayBalance(); // Display initial balance

        // Deposit to account 1
        System.out.print("Enter amount to deposit into account 1: $");
        double depositAmount = scanner.nextDouble();
        account1.deposit(depositAmount);

        // Withdraw from account 2
        System.out.print("Enter amount to withdraw from account 2: $");
        double withdrawAmount = scanner.nextDouble();
        account2.withdraw(withdrawAmount);

        scanner.close();
    }
}

