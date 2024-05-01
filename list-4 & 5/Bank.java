class Account {
    private double balance;

    public Account() {
        balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs." + amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            throw new InsufficientFundsException("Not Enough Funds");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class Bank {
    public static void main(String[] args) {
        Account acc = new Account();

        acc.deposit(5000);

        try {
            acc.withdraw(2000);
            acc.withdraw(1500);
            acc.withdraw(3500);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Balance: Rs." + acc.getBalance());
    }
}
