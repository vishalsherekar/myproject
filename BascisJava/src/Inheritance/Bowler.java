package Inheritance;

public class Bowler extends criket_player {
	
	int wicket;
	public Bowler() {
		// TODO Auto-generated constructor stub
		super();
		wicket=20;
	}

	Bowler(String n, String t, int a,int b) {
		super(n, t, a);
		// TODO Auto-generated constructor stub
		wicket=b;
	}
	
	 public String toString()
		{
			return super.toString()+" "+wicket;
		}

}
