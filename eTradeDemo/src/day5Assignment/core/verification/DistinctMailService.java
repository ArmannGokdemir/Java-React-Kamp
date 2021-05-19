package day5Assignment.core.verification;

import java.util.List;

import day5Assignment.core.abstracts.Core;
import day5Assignment.entities.abstracts.User;

public class DistinctMailService implements Core {
	
	
	public boolean isMailDistinct(String mail,List<User> userList) {
		
		for(User user: userList) {
			
			if(user.getMail()== mail) {
				System.out.println("Bu mail adresi kullanimda.");
				return false;
			}
			
		}
		
		return true;
		
	}
	

}
