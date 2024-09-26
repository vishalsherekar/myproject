package THREADDEMO;

public class Demo1 extends Thread {

	public void run() {
		// TODO Auto-generated method stub

		try {
			for (int i = 1; i < 10; i++) {
				if (currentThread().getName().equals("Vishal")) {
					System.out.println("HI...." + getName());
					Thread.sleep(2000);
				}
				if (currentThread().getName().equals("Sherekar")) {
					System.out.println("Bye...." + getName());
					Thread.sleep(2000);
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo1 d1 = new Demo1();
		d1.setName("Vishal");
		d1.start();

		Demo1 d2 = new Demo1();
		d2.setName("Sherekar");
		d2.start();
	}

}
