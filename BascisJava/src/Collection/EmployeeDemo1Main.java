package Collection;

import java.util.ArrayList;

public class EmployeeDemo1Main {
	
	int empId;
	String empName; 
	   String designation; 
	   int salary;
	
	   
	   public EmployeeDemo1Main() {
		   this.empId = 101;
			this.empName = "Vishal Sherekar";
			this.designation = "Developer";
			this.salary = 25000; 
	   }
	public EmployeeDemo1Main(int empId, String empName, String designation, int salary) {
		//super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.salary = salary;
	} 
	public String toString() {
		return empId+""+empName+""+designation+""+salary;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("1");
		
		EmployeeDemo1Main d1=new EmployeeDemo1Main(102, "Vishal", "Developer", 10000);
		ArrayList l1=new ArrayList();
		//System.out.println("1");
		EmployeeDemo1Main d2=new EmployeeDemo1Main(103, "Vishal", "Developer", 10000);
		EmployeeDemo1Main d3=new EmployeeDemo1Main(104, "Vishal", "Developer", 10000);
		//System.out.println("1");
		l1.add(d1);
		l1.add(d2);
		l1.add(d3);
		
		//System.out.println("1");
		
		for(Object x:l1) {
			//System.out.println("1");
			System.out.println(x);
		}

	}

}

