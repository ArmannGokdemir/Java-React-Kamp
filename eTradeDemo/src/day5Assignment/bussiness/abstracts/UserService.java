package day5Assignment.bussiness.abstracts;

import day5Assignment.entities.abstracts.User;

public interface UserService {
	void register(String mail,String password,String firstName,String lastName);
	void login(String mail,String password);
	

}
