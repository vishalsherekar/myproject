package Exception;

public class Account {
	int accno;
	String ownername;
	double balance;


	public Account(int i) {
		// TODO Auto-generated constructor stub
		
		this.balance=i;
	}


	void withdraw(int wamount ) throws InsufficientBalance{
		
		 System.out.println("Current Balance: "+balance);
		 
		 
		
		 if(balance-wamount<1000){
		 throw new InsufficientBalance("Insufficient balance in account.....");
		 }
		 else
		 System.out.println("Transaction Successfully Completed...............");
		 
		 double rembal=balance-wamount;
		 
		 
		 System.out.println("Withdrawal Amount :"+wamount);
		 System.out.println("After transaction current balance :"+rembal);
		 
		 

}
}
