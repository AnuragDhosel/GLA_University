package InheritanceProblem.Multilevel_Inheritance;


class BankAccount {
    int accountNumber;
    double balance;
    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void displayAccountType() { System.out.println("Generic Bank Account"); }
}

class SavingsAccount extends BankAccount {
    double interestRate;
    SavingsAccount(int acc, double bal, double rate) {
        super(acc, bal);
        this.interestRate = rate;
    }
    @Override
    void displayAccountType() { System.out.println("Savings Account"); }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    CheckingAccount(int acc, double bal, double limit) {
        super(acc, bal);
        this.withdrawalLimit = limit;
    }
    @Override
    void displayAccountType() { System.out.println("Checking Account"); }
}

class FixedDepositAccount extends BankAccount {
    int term;
    FixedDepositAccount(int acc, double bal, int term) {
        super(acc, bal);
        this.term = term;
    }
    @Override
    void displayAccountType() { System.out.println("Fixed Deposit Account"); }
}

public class BankAccounts {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount(101, 5000, 3.5);
        BankAccount acc2 = new CheckingAccount(102, 7000, 2000);
        BankAccount acc3 = new FixedDepositAccount(103, 10000, 12);

        acc1.displayAccountType();
        acc2.displayAccountType();
        acc3.displayAccountType();
    }
}
