import java.util.*;
import java.io.*;
public class Courses {
	
	Courses(String name,String date,String details){
		this.name=name;
		this.date=date;
		this.details=details;
		courses.add(this);
	}
	
	String name;
	String date;
	String details;
	public Vector<Students> studentsVector=new Vector();
	public Vector<Instructors> instructorVector=new Vector();
	public Vector<Courses> courses=new Vector();
	

}
