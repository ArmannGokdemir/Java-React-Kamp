
public class InstructorManager extends UserManager {
	public void AddCourse(User user,Course course) {
		user.setCourses(course);
		System.out.println(user.getName()+" adli Egitmen basariyla "+course.getName() +" kursuna eklendi.");
	}
	
	public void RemoveUser(User user) {
		System.out.println(user.getName()+" adli egitmen sistemden silindi.");
	}
	
	
	
	public void AddUser(String name,String mail,int id,double salary) {
		Instructor instructor =new Instructor();
		instructor.setID(id);
		instructor.setEmail(mail);
		instructor.setName(name);
		instructor.setSalary(salary);
		
		System.out.println(instructor.getName()+" adli egitmen basariyla sisteme eklendi");
		
	}

}
