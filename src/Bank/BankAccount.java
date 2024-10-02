package Bank;

public class BankAccount extends Account {
    public BankAccount (double balance) {
        this.balance = balance;
    }
    void updateBalance(double amount) {
        balance += amount;
    }
    public double getBalance () {
        return balance;
    }
}
