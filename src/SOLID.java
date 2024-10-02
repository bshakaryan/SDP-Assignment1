import Bank.BankAccount;
import Bank.SavingsAccount;
import Bank.TransactionService;

public class SOLID {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(145000);
        SavingsAccount savingsAccount = new SavingsAccount(150000);
        TransactionService transBank = new TransactionService(bankAccount);
        TransactionService transSavings = new TransactionService(savingsAccount);
        transBank.withdrawMoney(50000);
        transSavings.depositMoney(50000);
        System.out.println("Bank Account: " + bankAccount.getBalance());
        System.out.println("Savings Account: " + savingsAccount.getBalance());
    }
}
