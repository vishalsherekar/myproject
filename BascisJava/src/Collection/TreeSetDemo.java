package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet t1=new TreeSet();
		
		t1.add(1);
		t1.add(2);
		t1.add(3);
		t1.add(3);
		t1.add(4);
		t1.add(5);
		//t1.add(null);
		//t1.add("Vishal");
		
		Iterator<Integer> it=t1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
