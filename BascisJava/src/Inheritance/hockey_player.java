package Inheritance;

class hockey_player extends Player {
	String type;

	hockey_player(String n, String t, int a) {
		super(n, a);
		type = t;
	}

	 public String toString()
		{
			return super.toString()+" "+type;
		}
}