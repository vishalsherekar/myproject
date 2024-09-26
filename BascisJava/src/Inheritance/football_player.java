package Inheritance;

class football_player extends Player {
	String type;

	football_player(String n, String t, int a) {
		super(n, a);
		type = t;
	}

	 public String toString()
		{
			return super.toString()+" "+type;
		}
}
	