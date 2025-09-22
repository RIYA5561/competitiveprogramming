// Loanable Interface
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

// Abstract Class BankAccount
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Encapsulation: Getters & Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Abstract Method
    public abstract double calculateInterest();

    // Concrete Method
    public void getAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
        System.out.println("---------------------------");
    }
}

// SavingsAccount Class
class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate = 0.04; // 4% annual interest

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan request of " + amount + " received for Savings Account: " + getHolderName());
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000;
    }
}

// CurrentAccount Class
class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate = 0.02; // 2% annual interest

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan request of " + amount + " received for Current Account: " + getHolderName());
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000;
    }
}

// Main Class
public class BankingSystem {
    // Polymorphic Method
    public static void processAccount(BankAccount acc) {
        acc.getAccountDetails();
    }

    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SAV123", "Riya", 8000);
        BankAccount current = new CurrentAccount("CUR456", "Amit", 15000);

        // Polymorphism in action
        processAccount(savings);
        processAccount(current);

        // Loan eligibility check
        SavingsAccount sAcc = (SavingsAccount) savings;
        sAcc.applyForLoan(20000);
        System.out.println("Eligible for loan? " + sAcc.calculateLoanEligibility());

        CurrentAccount cAcc = (CurrentAccount) current;
        cAcc.applyForLoan(50000);
        System.out.println("Eligible for loan? " + cAcc.calculateLoanEligibility());
    }
}
