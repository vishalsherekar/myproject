package Exception;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int i=100/0;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}
		
		System.out.println("est of code...");
	}

}
