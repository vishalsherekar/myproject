package FILEIO;


	import java.io.FileOutputStream;  
	public class FileOutputStreamExample {  
	    public static void main(String args[]){    
	           try{    
	             FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
	             String s="Welcome to JAVA IO .";    
	             byte b[]=s.getBytes();//converting string into byte array    
	             fout.write(b);    
	             fout.close();    
	             System.out.println("success...");    
	            }catch(Exception e){System.out.println(e);}    
	      }    
	}  


