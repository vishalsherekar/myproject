package Inheritance;

public class LEDTV extends TV {
	
	 String resolution;
	 
	 public LEDTV() {
		// TODO Auto-generated constructor stub
		 
		 resolution="480*480";
	}
	 public LEDTV(String name,int price,int size,String company,String r) {
		 super(name, price, size, company);
		 resolution=r;
	 }
	 
	 public String toString()
		{
			return super.toString()+" "+resolution;
		}

}
