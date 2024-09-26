package Basics;

public class Student {
	private int rollno;
	private String name;
	private float per;
	
	
	public void initStudent()
	{
		rollno=12;
		name="Vishal";
		per=70.33f;
	}
	
	public void display()
	{
		System.out.println(rollno+" "+name+" "+per);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Student s1=new Student();
 s1.initStudent();
 s1.display();
	}

}
