package FILEIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmpSeriliazable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		File f= new File("D:\\emp1.txt");
		if(!f.exists()){
            f.createNewFile();
         }
		
		
			FileOutputStream fout=new FileOutputStream(f,true);
			//ObjectOutputStream os=new ObjectOutputStream(fout);
			ObjectOutputStream os2 = new ObjectOutputStream(fout); 
	            	//s2.writeStreamHeader();
	            	
			
	        Employee e1=new Employee(108,"Vishal",10000);
			Employee e3=new Employee();
			os2.writeObject(e1);
			os2.writeObject(e3);
			
			os2.close();
			//fout.close();
			
			
			FileInputStream fis=new FileInputStream("D:\\emp1.txt");
			ObjectInputStream oi=new ObjectInputStream(fis);
			
			
			  Employee e2=(Employee) oi.readObject();
			  
			  oi.close();
			  
			  System.out.println(e2);
			 
			

	}
	

}
