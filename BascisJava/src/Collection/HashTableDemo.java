package Collection;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable h1=new Hashtable();
		
		 h1.put(1, "Viashal");
		 h1.put(2, "AAA");
		 h1.put(3, "BBB");
		// h1.put(null, "4444");
		 System.out.println(h1);

		// h1.put(8, null);
		 System.out.println(h1);


		 h1.put(4, "CCC");
		 h1.put(1, "shal");
		 System.out.println(h1);

		 h1.remove(5);
		 
		 System.out.println(h1);
	}


}
