package Basics;

public class VarArguments {
	
	

	static void average(String str, int... a)
    {
        System.out.println("String: " + str);
       
 
        int sum=0;
        
        for (int i : a) {
        	sum+=i;
        }
        
        double average = sum / a.length;
        
        System.out.println();
            
 
        System.out.println("The average is: " + average);
      
	

}
}
