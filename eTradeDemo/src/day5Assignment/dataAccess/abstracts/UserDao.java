package day5Assignment.dataAccess.abstracts;

import java.util.List;

import day5Assignment.entities.abstracts.User;

public interface UserDao {
	void register(String mail,String password,String firstName,String lastName);
	User getLogin(String mail);
	List<User> listUsers();
	void add(User user);

	
	
}
