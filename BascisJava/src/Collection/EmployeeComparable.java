package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeComparable implements Comparable {

	
	int empId;
	String empName; 
	   String designation; 
	   int salary;
	
	   
	   public EmployeeComparable() {
		   this.empId = 101;
			this.empName = "Vishal Sherekar";
			this.designation = "Developer";
			this.salary = 25000; 
	   }
	public EmployeeComparable(int empId, String empName, String designation, int salary) {
		//super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.salary = salary;
	} 
	public String toString() {
		return empId +" "+ empName +" "+ designation +" "+ salary;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList l1=new ArrayList();
		
		l1.add(new EmployeeComparable(102, "Vishal", "Developer", 2000));
		l1.add(new EmployeeComparable(99, "lll", "Developer", 12000));
		
		l1.add(new EmployeeComparable(10, "eeeee", "Developer", 88000));
		l1.add(new EmployeeComparable(76, "yuyuyu", "Developer", 20000));
		
		l1.add(new EmployeeComparable(121, "ghgh", "Developer", 10000));
		l1.add(new EmployeeComparable(9, "ssd", "Developer", 10000));
		
		System.out.println("Before sorting ");
		for(Object x:l1) {
			//System.out.println("1");
			System.out.println(x);
		}
		
		System.out.println("+++++++++++++++++++++++++++");
		int eid=99;
		boolean flag=false;
		for(Object x:l1) {
			
			EmployeeComparable obj=(EmployeeComparable) x;
			if(obj.empId==eid) {
				flag=true;
				System.out.println("Employee Info :"+obj);
				break;
			}
			
		}
		if(flag==false) {
			System.out.println("Wromg Employee Info");
		}
		
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("After sorting ");
		
		Collections.sort(l1);
	    
	    
	    for(Object x:l1)
	    {
	    	System.out.println(x);
	    }
		
		
		
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		EmployeeComparable s=(EmployeeComparable)o;
	      if(this.empId>s.empId)
	         return 1;
	     else if(this.empId<s.empId)
	         return -1;
	     else
	         return 0;
	}
	
	
	


}
