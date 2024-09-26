package FILEIO;

import java.io.Serializable;

public class Employee  implements Serializable{

	int Eid; 
	String name; 
	  int salary;
	 /**
	 * @param id
	 * @param name
	 * @param salary
	 */
	 public Employee(){
		 Eid=102;
		 name="Vishal";
		 salary=25000;
		 
	 }
	public Employee(int Eid, String name, int salary) {
		
		this.Eid = Eid;
		this.name = name;
		this.salary = salary;
	}
	public String toString() {
		return "Emp [id=" + Eid + ", name=" + name + ", salary=" + salary + "]"; 
	}
	
}
