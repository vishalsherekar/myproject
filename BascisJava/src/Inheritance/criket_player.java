package Inheritance;

class criket_player extends Player {
	String type;

	criket_player(String n, String t, int a) {
		super(n, a);
		type = t;
	}

	public criket_player() {
		// TODO Auto-generated constructor stub
		super();
		type="Batsman";
	}

	/*
	 * public void show() { super.show(); System.out.println("Player type : " +
	 * type); }
	 */
	
	 public String toString()
		{
			return super.toString()+" "+type;
		}
}
