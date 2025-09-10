package Constructors_InstanceVsClass_Variables_And_AccessModifiers.Level2;

// Problem3_BankAccount.java
class BankAccount {
    public String accountNumber;     // Public
    protected String accountHolder;  // Protected
    private double balance;          // Private

    BankAccount(String accNo, String holder, double bal) {
        accountNumber = accNo;
        accountHolder = holder;
        balance = bal;
    }

    // Public methods for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double bal) {
        balance = bal;
    }

    public void display() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + balance);
    }
}

// Subclass to access public & protected members
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accNo, String holder, double bal, double rate) {
        super(accNo, holder, bal);
        interestRate = rate;
    }

    public void showDetails() {
        // Accessing accountNumber (public) and accountHolder (protected)
        System.out.println("Savings Account: " + accountNumber + " by " + accountHolder + " with interest " + interestRate + "%");
    }
}
public class Problem3_BankAccount {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("ACC123", "John Doe", 5000, 3.5);
        sa.display();
        sa.showDetails();

        sa.setBalance(6000); // Updating balance using public method
        System.out.println("Updated Balance: " + sa.getBalance());
    }
}
