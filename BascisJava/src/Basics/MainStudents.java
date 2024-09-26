package Basics;

public class MainStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Students s1=new Students();
		s1.printDetails();
		
		Students s2=new Students();
		s2.setRollno(44);
		s2.setName("Vishal Sherekar");
		s2.setPercentage(88.52f);
		
		s2.printDetails();
	}

}
