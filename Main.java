package Tubes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Customer");
            System.out.println("2. Add Account");
            System.out.println("3. View Customer Accounts");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.next();
                    System.out.print("Enter customer ID: ");
                    int customerId = scanner.nextInt();
                    bank.addCustomer(new Customer(name, customerId));
                    break;

                case 2:
                    System.out.print("Enter customer ID: ");
                    customerId = scanner.nextInt();
                    Customer customer = bank.getCustomer(customerId);
                    if (customer == null) {
                        System.out.println("Customer not found.");
                        break;
                    }
                    System.out.println("1. Savings Account");
                    System.out.println("2. Checking Account");
                    System.out.print("Choose account type: ");
                    int accountType = scanner.nextInt();
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.next();
                    System.out.print("Enter initial balance: ");
                    double balance = scanner.nextDouble();
                    if (accountType == 1) {
                        System.out.print("Enter interest rate: ");
                        double interestRate = scanner.nextDouble();
                        customer.addAccount(new SavingsAccount(accountNumber, balance, interestRate));
                    } else if (accountType == 2) {
                        System.out.print("Enter overdraft limit: ");
                        double overdraftLimit = scanner.nextDouble();
                        customer.addAccount(new CheckingAccount(accountNumber, balance, overdraftLimit));
                    } else {
                        System.out.println("Invalid account type.");
                    }
                    break;

                case 3:
                    System.out.print("Enter customer ID: ");
                    customerId = scanner.nextInt();
                    customer = bank.getCustomer(customerId);
                    if (customer != null) {
                        System.out.println(customer.getAccountSummary());
                    } else {
                        System.out.println("Customer not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
