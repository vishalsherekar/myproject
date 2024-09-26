package Inheritance;

public class Player {
	String name;
	int age;

	Player(String n, int a) {
		name = n;
		age = a;
	}

	public Player() {
		// TODO Auto-generated constructor stub
		name="Sachin";
		age=25;
	}

	
	  
	
	public String toString()
	{
		return name+" "+age;
	}
	
	public static void main(String args[]) {
		Bowler c1 = new Bowler();
		System.out.println(c1);
		Bowler c = new Bowler("Ameer", "criket", 25,12);
		System.out.println(c);
		Batsman b= new Batsman();
		System.out.println(b);
		Batsman b1= new Batsman("Rohit","Batsman",25,200);
		System.out.println(b1);
		football_player f = new football_player("arun", "foot ball", 25);
		System.out.println(f);
		
		hockey_player h = new hockey_player("Ram", "hockey", 25);
		System.out.println(h);
		
	}
}
