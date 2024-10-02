package Bank;

public abstract class Account {
    protected double balance;
    abstract void updateBalance(double amount);
    abstract double getBalance();
}
