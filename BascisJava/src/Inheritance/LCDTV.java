package Inheritance;

public class LCDTV extends TV {
	
	String resolution;
	
	public LCDTV() {
		// TODO Auto-generated constructor stub
		super();
		resolution="720*480";
		
	}
	
	public LCDTV(String name,int price,int size,String company,String r) {
		
		super(name, price, size, company);
		resolution=r;
	}
	
	 public String toString()
		{
			return super.toString()+" "+resolution;
		}
	
	
	

}
