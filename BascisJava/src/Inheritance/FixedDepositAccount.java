package Inheritance;

public class FixedDepositAccount extends Account {
	 int amount;
	 int duration;
	 
	 public FixedDepositAccount() {
		// TODO Auto-generated constructor stub
		 super();
		 amount=10000;
		 duration=5;
	}
	 
	 public FixedDepositAccount(int accountNumber,String name,int amount,int duration) {
		 super(accountNumber,name);
		 this.amount=amount;
		 this.duration=duration;
	 }

	 public String toString() {
			return super.toString()+" "+amount+" "+duration;
			
		}
}
