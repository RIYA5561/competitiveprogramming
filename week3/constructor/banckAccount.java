 package Constructor_Level_1;
// Create a banckAccount class with:
//	 accountNumber (public).
//	 accountHolder (protected).
//	 balance (private).
//	 Write methods to:
//	 Access and modify balance using public methods.
//	 Create a subclass SavingsAccount to demonstrate access to accountNumber and accountHolder.

class banckAccount {
	public long accountNumber;
	protected String accountHolder;
	private double balance;
	public banckAccount(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
	 public double getBalance() {
	        return balance;
	    }

	   
	    public void setBalance(double balance) {
	        if (balance >= 0) { 
	            this.balance = balance;
	        } else {
	            System.out.println("Balance cannot be negative!");
	        }
	    }

	    public void displayAccountDetails() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Balance: " + balance);
	    }
}
class SavingsAccount extends banckAccount {
    private double interestRate; 

    public SavingsAccount(long accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsDetails() {
        System.out.println("Savings Account Number : " + accountNumber);

      
        System.out.println("Savings Account Holder : " + accountHolder);

      
        System.out.println("Balance " + getBalance());

        System.out.println("Interest Rate: " + interestRate + "%");
    }
    
}
public class BankAccount{
	public static void main(String[] args) {
        banckAccount account1 = new banckAccount(123456, "Rudra Gupta", 1000.0);
        account1.displayAccountDetails();

        System.out.println();

        SavingsAccount savings1 = new SavingsAccount(789012, "A", 5000.0, 4.5);
        savings1.displaySavingsDetails();

        
        savings1.setBalance(5500.0);
        savings1.displaySavingsDetails();
    }
}
