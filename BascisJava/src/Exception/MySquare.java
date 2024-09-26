package Exception;

import java.util.*;
public class MySquare{
    public static void main(String args[]){
        int num;
        int number;

        
        System.out.print("Input a number.");
        num = 6;
           number = num * num;
        System.out.println("Square: " + number);
		/*
		 * try{
		 * 
		 * if( num <0){
		 * 
		 * 
		 * throw new InputMismatchException("Only Positive Numbers!"); } }catch
		 * (InputMismatchException e){
		 * 
		 * }
		 */
        
        try {
			if (number > 0) {
				 
			    System.out.println(number + " is positive.");
      
			  } else if (number < 0) {
      
			    System.out.println(number + " is negative.");
      
			  }
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}