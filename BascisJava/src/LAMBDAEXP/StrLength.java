package LAMBDAEXP;

interface Lambda_With_NO_String
{
	public int  strLength(String s);
}
public class StrLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lambda_With_NO_String sl;
		
		//String str="HelloWorld";
		sl=(str) -> str.length();
		
		System.out.println(sl.strLength("Vishal Sherekar"));

	}

}
