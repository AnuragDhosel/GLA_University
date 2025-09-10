package Class_work;

// Create a class Account with instance variables: accountHolder, balance. Use default values. Print them without setting any values.
class Account {
    String accountHolder;
    double balance;

    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}
public class Q9 {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.displayDetails();
    }
}
