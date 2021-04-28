
public class RegisterToCourse {
	public void RegisterToCourse(Courses course,Students student) {
		course.studentsVector.add(student);
		System.out.println("Kursa kaydiniz tamamlanmistir.");
	}
	
	public void AddInstructor(Courses course,Instructors instructor) {
		course.instructorVector.add(instructor);
		System.out.println("Egitmen basariyla eklendi.");
	}
	
	

}
