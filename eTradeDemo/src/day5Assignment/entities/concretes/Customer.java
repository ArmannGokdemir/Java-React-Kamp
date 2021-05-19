package day5Assignment.entities.concretes;

import day5Assignment.entities.abstracts.Entity;
import day5Assignment.entities.abstracts.User;

public class Customer extends User implements Entity{

	public Customer(String password, String firstName, String lastName, String mail) {
		super(password, firstName, lastName, mail);
		
	}

}
