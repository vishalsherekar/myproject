package Inheritance;

public class ElectronicDevice {
	  private String name;
	  private double price;
	  
	  public ElectronicDevice() {
		// TODO Auto-generated constructor stub
		  
		  name="TV";
		  price=25000;
	}

	  public ElectronicDevice(String name, double price) {
	    this.name = name;
	    this.price = price;
	  }

	 
	  
	  
	  public String toString()
		{
			return name+" "+price;
		}
	}
