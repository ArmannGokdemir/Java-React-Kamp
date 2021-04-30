
public class Admin {
	UserManager userMan;
	
	public Admin(UserManager userManager) {
		userMan=userManager;
	}
	public void AddCourse(User user,Course course) {
		userMan.AddCourse(user, course);
		
	}
	
	public void RemoveUser(User user) {
		userMan.RemoveUser(user);
	}
	
	public void AddUser(String name,String mail,int id) {
		userMan.AddUser(name, mail, id);
	}
	
	public void AddUser(String name,String mail,int id,double salary) {
		userMan.AddUser(name, mail, id, salary);
	}
	public void ShowUser(User user) {
		userMan.ShowUser(user);
	}

}
