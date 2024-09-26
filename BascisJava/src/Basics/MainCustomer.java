package Basics;

public class MainCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.out.println("Number of Objects Before Creating Objects ");
		Customer.printCountObj();
		Customer c1=new Customer();
		Customer c2=new Customer();
		 
		 System.out.println("Number of Objects After Creating Objects ");
		 //Customer.printCountObj();
		 Customer c3=new Customer();
		 Customer.printCountObj();
	}

}
