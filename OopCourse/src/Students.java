
public class Students {
	static int id1;
	Students(String name,String mail){
		
		this.name=name;
		this.mail=mail;
		id1++;
		this.id=id1+1;
		
	}
	
	int id;
	String name;
	String mail;
	Courses[] courses;
	

}
