
public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setName("Arman Gökdemir");
		student.setEmail("armangokdemir@gokde1.com");
		student.setID(1);
		
		Student student1 = new Student();
		student1.setName("Anil Cetinkaya");
		student1.setEmail("anilcetinkaya@ruhi.com");
		student1.setID(2);
		
		Instructor instructor2 = new Instructor();
		instructor2.setName("Ruhi Kiral");
		instructor2.setEmail("ruhikiral@kiral.com");
		instructor2.setSalary(15000);
		instructor2.setID(2);
		
		Instructor instructor = new Instructor();
		instructor.setEmail("hasanyildiz@yildiz.com");
		instructor.setName("Hasan Yildiz");
		instructor.setSalary(100000);
		instructor.setID(1);
		
		Course course = new Course("Java Programlamaya Giris","2 haftada Java ile programlamaya giris dersimize katilin!");
		Course course1 = new Course("C# ile Sektorun Yukseklerine! ","detay");
		
		
		Admin admin = new Admin(new InstructorManager());
		Admin admin2 = new Admin(new StudentManager());
		
		admin.AddCourse( instructor, course);
		admin.AddUser("Kerem Akbil", "keremakbil@akbil.com", 3, 12000);
		admin.RemoveUser(instructor2);
		admin.AddCourse(instructor, course1);
		admin.AddCourse(instructor2, course1);
		
		admin2.AddCourse(student, course);
		admin2.AddCourse(student1, course);
		admin2.AddCourse(student1, course1);
		admin2.AddUser("Barkin Cetbin", "barkincetbin@hazirlik.com", 3);
		admin2.RemoveUser(student);
		
		
		admin.ShowUser(instructor);
		
		admin.ShowUser(student1);
	}

}
