package day5Assignment;

import java.util.ArrayList;
import java.util.List;

import day5Assignment.bussiness.abstracts.UserService;
import day5Assignment.bussiness.concretes.NormalRegister;
import day5Assignment.bussiness.concretes.UserManager;
import day5Assignment.core.concretes.GoogleManagerAdapter;
import day5Assignment.core.verification.MailVerificationManager;
import day5Assignment.core.verification.ValidityCheckManager;
import day5Assignment.dataAccess.concretes.HibernateCustomerDao;
import day5Assignment.entities.abstracts.User;

public class Main {

	public static void main(String[] args) {
		UserService userManager = new UserManager(new GoogleManagerAdapter());
		UserService userManager2 = new UserManager(new NormalRegister(new HibernateCustomerDao(),new ValidityCheckManager(),new MailVerificationManager()));
		userManager.register("armanngokde@outlook.com", "12345678", "Arman", "Gokdemir");
		userManager2.register("armangokde@gmail.com", "12345678", "Arman", "Gokdemir");
		userManager2.register("armangokde@gmail.com", "12345678", "Arman", "Gokdemir");//Ayni mail ile kayit
		userManager2.register("armanngokde.@gmail.com.", "12345678", "Arman", "Gokdemir");// Hatali mail girisi
		userManager2.register("armangokde.@gmail.com", "123", "Arman", "Gokdemir");// Hatali sifre + hatali mail girisi
		userManager2.login("armangokde@gmail.com", "123"); 
		userManager2.login("armangokde@gmail.com", "12345678"); 
	}

}
