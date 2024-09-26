package Inheritance;

public class BankMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sa=new SavingAccount();
		System.out.println(sa);
		
		FixedDepositAccount fd= new FixedDepositAccount();
		System.out.println(fd);
		
		SavingAccount sa1=new SavingAccount(12020,"Amey","currentacc",20000);
		System.out.println(sa1);
		
		FixedDepositAccount fd1= new FixedDepositAccount(120120,"Amey",20000,6);
		System.out.println(fd1);

	}

}
