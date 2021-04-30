
public class UserManager {
	
	public void AddCourse(User user,Course course) {
		System.out.println("Kurs eklenemedi");

	}
	
	public void RemoveUser(User user) {
		System.out.println("Silme islemi basarisiz.");
	}
	
	public void AddUser(String name,String mail,int id) {
		System.out.println("Kullanici eklenemedi");
		
	}
	
	public void AddUser(String name,String mail,int id,double salary) {
		System.out.println("Kullanici eklenemedi");
	}
	public void ShowUser(User user) {
		System.out.println("Kullanici ismi "+user.getName());
		System.out.println("Mail "+user.getEmail());
		System.out.println("Kurslari");
		for(Course course : user.getCourses()) {
			System.out.println("Kurs ismi : "+course.getName());
		}
		
		
		
	}
}
