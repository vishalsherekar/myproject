package Basics;

public class Author {
	
	String name;
	String email;

	public Author() {
		// TODO Auto-generated constructor stub
	}

	
	public Author(String name, String email) {
		
		this.name = name;
		this.email = email;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public void printDetails() {
		System.out.println("NAME : "+name+"\n"+"EmailID : "+email);
	}

	
	
	
}
