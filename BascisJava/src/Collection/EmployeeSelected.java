package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSelected {
	
	public void selected(ArrayList l1){
		int eid=99;
		boolean flag=false;
		for(Object x:l1) {
			
			Employee obj=(Employee) x;
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
		
		
		//Collections.sort(l1);
	}
	
	

}
