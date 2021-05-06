package Abstract;

import java.util.Date;
import java.util.Vector;

import Adapter.MernisServiceAdapter;
import gameProject.mainSystem;

public abstract class UserManager implements UserService {
	UserCheckService userCheck;
	public UserManager(UserCheckService userCheck) {
		this.userCheck=userCheck;
	}
	
	@Override
	public void register(User user) {
		if(userCheck.checkIfRealPerson(user)) {
			mainSystem.setUsers(user);
			System.out.println("Kullanici ana sisteme eklendi "+user.getFirstName());
		}
		else {
			System.out.println("Gecersiz bilgiler girdiniz.");
		}
		
	}

	@Override
	public void update(User user, String nickname, String mail) {
		user.setNickname(nickname);
		user.setMail(mail);
		System.out.println("bilgiler basariyla degistirildi.");
		
	}

	@Override
	public void delete(User user) {
		Vector<User> vector= mainSystem.getUsers();
		vector.remove(user);
		System.out.println("Kullanici sistemden silindi ");
		
	}

}
