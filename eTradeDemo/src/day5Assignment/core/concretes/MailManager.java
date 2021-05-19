package day5Assignment.core.concretes;

import day5Assignment.core.abstracts.Core;
import day5Assignment.entities.abstracts.User;

public class MailManager implements Core{
	public static void  sendMail(User user,String message) {
		System.out.println(message+" "+user.getMail());
	}

}
