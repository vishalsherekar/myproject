package Collection;

public class Employee implements Comparable{
	
		int empId;
		String empName; 
		   String designation; 
		   int salary;
		
		   
		   public Employee() {
			   this.empId = 101;
				this.empName = "Vishal Sherekar";
				this.designation = "Developer";
				this.salary = 25000; 
		   }
		public Employee(int empId, String empName, String designation, int salary) {
			//super();
			this.empId = empId;
			this.empName = empName;
			this.designation = designation;
			this.salary = salary;
		} 
		public String toString() {
			return empId+"     "+empName+"    "+designation+" "+salary;
			
		}
		
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			Employee s=(Employee)o;
		      if(this.empId>s.empId)
		         return 1;
		     else if(this.empId<s.empId)
		         return -1;
		     else
		         return 0;
		}

}
