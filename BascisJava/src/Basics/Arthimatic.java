package Basics;

public class Arthimatic {
	
	public void multiplication(int a, int b) {
		
		System.out.println("Multiplication of 2 int :"+(a*b));
		
	}
	
public void multiplication(float a, float b) {
		
		System.out.println("Multiplication of 2 float :"+(a*b));
		
	}

public void multiplication(double a, double b) {
	
	System.out.println("Multiplication of 2 double :"+(a*b));
	
}

public void multiplication(int a, float b, double c) {
	
	System.out.println("Multiplication of  int and flaot value :"+(a*b*c));
	
}

public void multiplication(float a, double b) {
	
	System.out.println("Multiplication of 2 flaot and double value :"+(a*b));
	
}

public void multiplication(int a, double b) {
	
	System.out.println("Multiplication of 2 int :"+(a*b));
	
}

public static void main(String args[])
{
	Arthimatic a1 =new Arthimatic();
	a1.multiplication(2, 2);
	a1.multiplication(10.2f, 23.4f);
	a1.multiplication(12.22, 22.3);
}

}
