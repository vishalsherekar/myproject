package Basics;

public class Employee {
	private  int empId;
	private String name;
	private float salary;
	private static int id;
	
	/*
	 * static { id++; }
	 */
	
	
	public Employee(){
		id++;
		empId=id;
		name="Vishal";
		salary=2345.45f;
		
	}
	
	public Employee(String n,float sal) {
		
		id++;
		empId=id;
		name=n;
		salary=sal;
		
	}
	
	/*
	 * public static void showId() { System.out.println("Employee ID : "+ ++empId);
	 * }
	 */
	public void printDetails() {
		System.out.println("EmpID : "+empId+"\nEmployee NAme : "+name+"\nSalary : "+salary);
	}
	
	

}
