
public  class User {
	private  int sayac=0;
	Course a = new Course();
	private  int id;
	private String name;
	private String email;
	private Course[] courses=new Course[2];

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
	public Course[] getCourses() {
		return courses;
	
	}
	public void setCourses(Course courses) {
			this.courses[sayac] = courses;
		sayac++;
	}
	public int getId() {
		return id;
	}
	public void setID(int id) {
		this.id=id;
		
	}
}
