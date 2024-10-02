package Bank;

public class TransactionService implements DepositMoney, WithdrawMoney {
    private Account account;
    public TransactionService (Account account) {
        this.account = account;
    }
    @Override
    public void depositMoney(double amount) {
        if (amount > 0) {
            account.updateBalance(amount);
        }
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount <= account.getBalance()) {
            account.updateBalance(-amount);
        }
        else {
            System.out.println("Not enough money");
        }
    }
}
