package LAMBDAEXP;

interface Lambda_With_NO_Return
{
	public int  cubeNumber(int a,int b,int c);
}

public class Cube {
	
	public static void main(String[] args) {
		
		Lambda_With_NO_Return ob;
		
		
		
      ob=(x,y,z)-> (x*y*z);
			
			System.out.println(ob.cubeNumber(5,5,5));
	}

}