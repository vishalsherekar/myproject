package Collection;

import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args){

	    // create linkedlist
	    LinkedList animals = new LinkedList();

	    // Add elements to LinkedList
	    animals.add("Dog");
	    animals.add("Cat");
	    animals.add("Cow");
	    System.out.println(" LinkedList: " + animals);
	   
	    animals.add(1, "Horse");
	    System.out.println("LinkedList: " + animals);
	    
	    String str = (String) animals.get(1);
	    System.out.println("Element at index 1: " + str);
	    
	    animals.set(3, "Kotlin");
	    System.out.println("Updated LinkedList: " + animals);
	    
	 // remove elements from index 1
	    String str1 = (String) animals.remove(1);
	    System.out.println("Removed Element: " + str1);
	    
	    System.out.println("Updated LinkedList: " + animals);
	    System.out.println("Updated LinkedList: " + animals.contains(animals));

	    
}
}
