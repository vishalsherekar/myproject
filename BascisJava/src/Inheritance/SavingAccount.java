package Inheritance;

public class SavingAccount  extends Account{
	String type;
	int balance;
	public SavingAccount() {
		// TODO Auto-generated constructor stub
		super();
		type="SAving Account";
		balance=10000;
	}
	public SavingAccount(int accountNumber,String name,String type,int balance) {
		super(accountNumber,name);
		this.type=type;
		this.balance=balance;
	}
	
	public String toString() {
		return super.toString()+" "+type+" "+balance;
		
	}

}
