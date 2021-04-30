
public class StudentManager extends UserManager{
	
	public void AddCourse(User user,Course course) {
		user.setCourses(course);
		System.out.println(user.getName()+" adli ogrencinin "+course.getName() +" Kursuna kaydi basariyla tamamlandi.");
	}
	
	public void RemoveUser(User user) {
		System.out.println(user.getName()+" adli ogrenci sistemden silindi.");
	}
	
	public void AddUser(String name,String mail,int id) {
		Student student = new Student();
		student.setName(name);
		student.setEmail(mail);
		student.setID(id);
		System.out.println(student.getName()+" adli ogrenci sisteme eklendi.");
		
		
	}
	
	
}
