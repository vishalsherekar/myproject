package Inheritance;

public class TV  extends ElectronicDevice{
	
	private int size;
	private String company;
	
	public TV() {
		// TODO Auto-generated constructor stub
		super();
		size=32;
		company="LG";
	}
	

	public TV( String name, int price,int s,String c)
	{
		super(name ,price);
		size=s;
		company=c;
	}
	
	 public String toString()
		{
			return super.toString()+" "+size+" "+company;
		}

}
