import Bank.ATM;
import Finance.Account;

public class BankMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Account fa=new Account("98765","Vishal Sherekat", 20000);
		
		
		
		
		
		fa.deposit(500.00);
		fa.withdraw(200.00);

		System.out.println(fa.toString());
		
		
		ATM ba=new ATM(54321, "Vishal Sherekar", 6000);
		
		ba.withdraw(5000);
		ba.deposit(20000);
		
		System.out.println(ba.toString());
	}

}
