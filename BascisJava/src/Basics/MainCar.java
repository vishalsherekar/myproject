package Basics;

public class MainCar {

	public static void main(String[] args) {
		
		Car c1=new Car();
		c1.printDetails();
		
		Car c2=new Car();
		c2.setMake("Ford");
		c2.setModel("Figo");
		c2.setYear(2001);
		c2.printDetails();

	}

}
