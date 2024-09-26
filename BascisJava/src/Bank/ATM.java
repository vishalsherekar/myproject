package Bank;

public class ATM {
	
	private int accountNumber;
    private String accountHolderName;
    private double accountBalance;

    public ATM(int accountNumber, String accountHolderName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void deposit(double amount) {
        this.accountBalance += amount;
    }

    
    
    public void withdraw(double amount) {
        if (this.accountBalance >= amount) {
            this.accountBalance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void transfer(double amount, ATM toAccount) {
        if (this.accountBalance >= amount) {
            this.accountBalance -= amount;
            toAccount.deposit(amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Account Holder Name: " + accountHolderName + ", Account Balance: " + accountBalance;
    }
}

