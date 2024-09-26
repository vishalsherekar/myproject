package Collection;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeMap t1= new TreeMap();
		
		t1.put(1, "aaa");
		t1.put(2, "rrrr");
		t1.put(3, "aaa");
		t1.put(4, "aaa");
		
		System.out.println(t1);
		
		t1.put(1, null);
		System.out.println(t1);
		
		t1.put(5, 3);
		System.out.println(t1);
		
		

	}

}
