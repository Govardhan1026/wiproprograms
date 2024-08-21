package wiproprograms;

public class bankacc {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor to initialize the attributes
    public bankacc(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: $" + amount);
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to display the balance of the account
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        // Creating an instance of BankAccount
        bankacc myAccount = new bankacc("************", "nani", 15000.00);

        // Displaying initial balance
        myAccount.displayBalance();

        // Depositing money
        myAccount.deposit(1500.00);

        // Withdrawing money
        myAccount.withdraw(1200.00);

        // Displaying updated balance
        myAccount.displayBalance();
    }
}