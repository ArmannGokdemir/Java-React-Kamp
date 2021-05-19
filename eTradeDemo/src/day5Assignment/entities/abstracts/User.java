package day5Assignment.entities.abstracts;

public  class User implements Entity{
	private static int id;
	private String password;
	private String firstName;
	private String lastName;
	private String mail;
	
	public User() {
		
	}
	
	public User( String password, String firstName, String lastName, String mail) {
		super();
		this.id+=1;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mail = mail;
	}

	public int getId() {
		return id;
	}

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

}
