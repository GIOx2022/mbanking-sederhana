package Tubes;

// Kelas abstrak Account yang menjadi dasar untuk jenis akun lainnya
public abstract class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract String getAccountInfo();
}
