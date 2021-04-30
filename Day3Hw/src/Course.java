
public class Course {
	
	private String name;
	private String details;
	private Instructor[] instructor;
	private Student[] student;
	
	public Course() {}
	
	public Course(String name, String details) {
		super();
		this.name = name;
		this.details = details;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Instructor[] getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor[] instructor) {
		this.instructor = instructor;
	}

	public Student[] getStudent() {
		return student;
	}

	public void setStudent(Student[] student) {
		this.student = student;
	}
	

}
