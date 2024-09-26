package Interfaces;

public class Ball implements Movable, Bouncable {

	@Override
	public void bounce() {
		// TODO Auto-generated method stub
		
	System.out.println(" Ball is Bouncing");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Moving Ball");
	}

}
