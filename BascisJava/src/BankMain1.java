import Bank.ATM;

public class BankMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Finance.Account fa=new Finance.Account("98765","Vishal Sherekat", 20000);
		
		
		
		
		
		fa.deposit(500.00);
		fa.withdraw(200.00);

		System.out.println(fa.toString());
		
		
		Bank.ATM ba=new Bank.ATM(54321, "Vishal Sherekar", 6000);
		
		ba.withdraw(5000);
		ba.deposit(20000);
		
		System.out.println(ba.toString());
		
		
	}

}
