package Entity;

import java.util.Date;

import Abstract.User;

public class Gamer extends User {

	public Gamer(int id, String firstName, String lastName, Date dateOfBirth, String nationalityId,
			String authorizationLevel, String mail,String nickname) {
		super(id, firstName, lastName, dateOfBirth, nationalityId, authorizationLevel, mail, nickname);
		
	}
	

}
