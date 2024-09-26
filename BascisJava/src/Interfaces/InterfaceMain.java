package Interfaces;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bouncable b=new Ball();
		Movable m1=new Ball();
		Movable c=new Car();
		
		b.bounce();
		m1.move();
		
		c.move();

	}

}
