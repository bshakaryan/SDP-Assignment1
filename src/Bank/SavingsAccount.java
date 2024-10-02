package Bank;

public class SavingsAccount extends Account {
    private final double RATING = 1.3;
    public SavingsAccount (double balance) {
        this.balance = balance;
    }
    void updateBalance(double amount) {
        balance += amount * RATING;
    }
    public double getBalance () {
        return balance;
    }
}
