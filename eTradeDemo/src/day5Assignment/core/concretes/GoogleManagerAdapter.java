package day5Assignment.core.concretes;

import day5Assignment.core.abstracts.RegisterService;
import day5Assignment.google.GoogleManager;

public class GoogleManagerAdapter implements RegisterService {
	
	
	@Override
	public void register(String mail, String password, String firstName, String lastName) {
		GoogleManager googleMan=new GoogleManager();
		googleMan.register(mail);
	}

	@Override
	public void login(String mail, String password) {
		GoogleManager googleMan=new GoogleManager();
		googleMan.login(mail);
	}
	
}
