package Basics;

public class Car {
	String make;
	
	String model;
	int year;
	
	
	//Default Constructor
	public Car() {
		// TODO Auto-generated constructor stub
	}

	
	//Parametrized construtor
	public Car(String make, String model, int year) {
		
		this.make = make;
		this.model = model;
		this.year = year;
	}

	
	
	

	
	//Getter And Setter Methods
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	//Display the details of car
	public void printDetails() {
		
		System.out.println("MAke : "+make+"\nModel : "+model+"\nYear : "+year);
		
	}
	
	

}
