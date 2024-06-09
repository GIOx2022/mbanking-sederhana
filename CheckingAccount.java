package Tubes;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String getAccountInfo() {
        return "Checking Account - Account Number: " + accountNumber + ", Balance: " + balance + ", Overdraft Limit: " + overdraftLimit;
    }
}
