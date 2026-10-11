package labsheet4;
class BankAccount {
    private double balance;

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class Q7 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(5000);
        account.displayBalance();
    }
}
