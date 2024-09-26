package Basics;

public class Customer {
	
	private static int objcount;
	
	public Customer() {
		objcount++;
		
	}
	
	public static void printCountObj() {
		System.out.println("Number of Objects : "+objcount);   
	}

}
