package THREADDEMO;

public class DemoJoin extends Thread {

	public void run() {
		// TODO Auto-generated method stub

		for(int i=1;i<6;i++)
		{
			try {
			if (currentThread().getName().equals("Vishal")) {
				System.out.println("HI...." + getName());
				Thread.sleep(500);
			}
			if (currentThread().getName().equals("Sherekar")) {
				System.out.println("Bye...." + getName());
				Thread.sleep(500);
			}
			if (currentThread().getName().equals("NO WAY....")) {
				System.out.println("Go to hell...." + getName());
				Thread.sleep(500);
			}
			}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoJoin d1 = new DemoJoin();
		d1.setName("Vishal");
		d1.start();
		try {
			d1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		DemoJoin d2 = new DemoJoin();
		d2.setName("Sherekar");
		d2.start();
		try {
			d2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		DemoJoin d3 = new DemoJoin();
		d3.setName("NO WAY....");
		d3.start();
		try {
			d3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}