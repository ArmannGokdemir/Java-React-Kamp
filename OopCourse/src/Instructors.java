
public class Instructors {
	
	Instructors(String name,String details,String mail){
		this.id = id++;
		this.name=name;
		this.details=details;
		this.mail=mail;
		
		
	}
	
	
	static int id=0;
	String name;
	String mail;
	String details;
	Courses[] courses;

}
