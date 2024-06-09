package Tubes;

import java.util.ArrayList;
import java.util.List;

// Kelas Customer merepresentasikan pelanggan bank
public class Customer {
    private String name;
    private int customerId;
    private List<Account> accounts;

    public Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public String getAccountSummary() {
        StringBuilder summary = new StringBuilder("Customer: " + name + ", ID: " + customerId + "\nAccounts:\n");
        for (Account account : accounts) {
            summary.append(account.getAccountInfo()).append("\n");
        }
        return summary.toString();
    }

    public int getCustomerId() {
        return customerId;
    }
}
