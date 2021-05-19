package day5Assignment.bussiness.concretes;

import java.util.ArrayList;
import java.util.List;

import day5Assignment.bussiness.abstracts.UserService;
import day5Assignment.core.abstracts.RegisterService;
import day5Assignment.core.abstracts.ValidityCheck;
import day5Assignment.core.concretes.MailManager;
import day5Assignment.core.verification.DistinctMailService;
import day5Assignment.dataAccess.abstracts.UserDao;
import day5Assignment.dataAccess.concretes.HibernateCustomerDao;
import day5Assignment.entities.abstracts.User;

public class UserManager implements UserService{
		
		private RegisterService registerService;
		
		
		public UserManager(RegisterService register) {
			
			this.registerService=register;
					
		}
		
		
	
	@Override
	public void register(String mail, String password, String firstName, String lastName) {
		registerService.register(mail, password, firstName, lastName);
		
	}

	

	@Override
	public void login(String mail, String password) {
		registerService.login(mail, password);
		
	}
	
	
	
}
