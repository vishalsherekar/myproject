package THREADDEMO;

public class AccountSynchronized {
	int balance;
	 public AccountSynchronized() {
		 balance=5000;
		 
	 }
	 
	 public AccountSynchronized(int bal) {
		 balance =bal;
	 }
	 
	 

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String toString() {

		return "Balance  = "+balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountSynchronized a1=new AccountSynchronized(10000);
		Transaction t1=new Transaction("Ram",a1);
		Transaction t2=new Transaction("Shyam", a1);
		t1.start();
		t2.start();

	}

}

class Transaction extends Thread{
	
	AccountSynchronized as;
	 
	 
	public  Transaction(){
		 
	 }
	 
	 public Transaction(String name,AccountSynchronized a) {
			// TODO Auto-generated constructor stub
		 
		 super(name);
		 as=a;
		}
	 
	 public void withdraw(int bal) {
		 synchronized (as) {
			 int b=as.getBalance();
			 System.out.println("Befor withdraw balance="+b);
			 b=b-bal;
			 as.setBalance(b);
			 System.out.println("After withdraw balance="+b);
			
		}
		 
		 
	 }
	
	 
	 public void deposit(int bal) {
		 synchronized (as) {
			 int b=as.getBalance();
			 System.out.println("Befor Deposit balance="+b);
			 b=b+bal;
			 as.setBalance(b);
			 System.out.println("After Deposit balance="+b);
			 
			
		}
		 
	 }
	 
	 public void run() {
		 if(Thread.currentThread().getName().equals("Ram"))
			 withdraw(5000);
		 if(Thread.currentThread().getName().equals("Shyam"))
			 deposit(3000);
	 }
	
}

