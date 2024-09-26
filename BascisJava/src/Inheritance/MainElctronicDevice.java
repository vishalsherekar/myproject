package Inheritance;

public class MainElctronicDevice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LCDTV lcd=new LCDTV();
		
		System.out.println(lcd);
		 System.out.println("================================");
		LEDTV led=new LEDTV();
		System.out.println(led);
		
		
		LCDTV lcd1=new LCDTV("LCDTV",30000,38,"SAMSUNG","1080*980p");
		System.out.println(lcd1);
		
		LEDTV led1=new LEDTV("LEDTV",40000,42,"SONY","1080*980p");
		System.out.println(led1);

	}

}
