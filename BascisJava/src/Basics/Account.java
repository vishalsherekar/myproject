package Basics;

public class Account {


	private int accNo;
	private String name;
	private double balance;
	
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public void initData() {
		accNo=23145;
		name="Vishal";
		balance=12345;
		
	}
	
	
	public void display() {
		System.out.println("Account Number :"+accNo+"\n"+"Name :"+name+"\n"+"Balance :"+balance);
	}
	
}
