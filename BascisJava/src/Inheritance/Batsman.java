package Inheritance;

public class Batsman extends criket_player {
	int runs;
	  public Batsman() {
		// TODO Auto-generated constructor stub
		  super();
		  runs=100;
	}

	Batsman(String n, String t, int a,int r) {
		super(n, t, a);
		// TODO Auto-generated constructor stub
		runs=r;
	}
	
	 public String toString()
		{
			return super.toString()+" "+runs;
		}

}
