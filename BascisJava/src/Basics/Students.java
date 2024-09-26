package Basics;

public class Students {
	
	int rollno;
	String name;
	float percentage;

	////Default Constructor
	public Students() {
		// TODO Auto-generated constructor stub
	}

	//Parametrized Constructor
	public Students(int rollno, String name, float percentage) {
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
	}

	
	
	//getter and setter methods
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	
	
	public void printDetails() {
		System.out.println("Roll No : "+rollno+"\nNAME : "+name+"\nPercentage : "+percentage);
	}
	
	

}
