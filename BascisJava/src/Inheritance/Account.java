package Inheritance;

public class Account {
    private int accountNumber;
    private String name;
    
    public Account() {
    	accountNumber=12345;
    	name="VISHAL SHEREKAR";
    	
    }

    public Account(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

   public String toString() {
	   return accountNumber+" "+name;
   }

    
}