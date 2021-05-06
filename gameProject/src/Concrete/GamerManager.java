package Concrete;

import Abstract.User;
import Abstract.UserCheckService;
import Abstract.UserManager;

public class GamerManager extends UserManager{
	
	public GamerManager(UserCheckService userCheck) {
		super(userCheck);
		
	}

	

}
