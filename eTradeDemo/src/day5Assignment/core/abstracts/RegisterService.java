package day5Assignment.core.abstracts;

import day5Assignment.entities.abstracts.User;

public interface RegisterService {
	void register(String mail,String password,String firstName,String lastName);
	void login(String mail,String password);

}
