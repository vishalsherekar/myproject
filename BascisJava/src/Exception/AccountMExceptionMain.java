package Exception;

public class AccountMExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a1=new Account(10000);
		
		try {
			a1.withdraw(30000);
		} catch (InsufficientBalance e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//e.getMessage();
		}
	}

}
