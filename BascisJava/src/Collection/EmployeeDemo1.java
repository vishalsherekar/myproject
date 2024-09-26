package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeDemo1   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList l1=new ArrayList();
EmployeeDisplay ed=new EmployeeDisplay();
		
		l1.add(new Employee(102,"Vishal","Developer",2000));
		l1.add(new Employee(99,"Saurabh","Tester",12000));
		
		l1.add(new Employee(10,"Karishma","Java Developer",88000));
		l1.add(new Employee(76,"Neha","Web Developer",20000));
		
		l1.add(new Employee(121,"Priyanka","Front End Developer",14000));
		l1.add(new Employee(9,"Tanmoy","Data Analyst",100000));
		
		
		
		int choice = 3;
		Scanner sc = new Scanner(System.in);

		System.out.println("   your choice :");
		switch (choice) {
		case 1:
			Collections.sort(l1);
			ed.display(l1);
			break;
			
		case 2:
			EmployeeSelected es=new EmployeeSelected();
			es.selected(l1);
			Collections.sort(l1);
			ed.display(l1);
			break;
			
		case 3:
			int ch = 4;
			System.out.println(" please enter your choice :");
			switch (ch) {
			case 1:
				System.out.println("Sorted by EMPID :");
				EmpidCompare eid= new EmpidCompare();
				Collections.sort(l1,eid);
				ed.display(l1);
				break;
				
			case 2:
				System.out.println("Sorted by Employee name:");
				EmpNameCompare enc= new EmpNameCompare();
				Collections.sort(l1,enc);
				ed.display(l1);
				break;
				
			case 3:
				System.out.println("Sorted by Employee Designation:");
				EmpDesignationCompare end= new EmpDesignationCompare();
				Collections.sort(l1,end);
				ed.display(l1);
				break;
				
			case 4:
				System.out.println("Sorted by Salary :");
				SalaryCompare sal= new SalaryCompare();
				Collections.sort(l1,sal);
				ed.display(l1);
				break;
				
			default:
				System.out.println(" wrong data member choice : ");
				break;

			}
			break;
			
		default:
			System.out.println("Wrong choice");
			break;
		}

}

	
	
	

}
