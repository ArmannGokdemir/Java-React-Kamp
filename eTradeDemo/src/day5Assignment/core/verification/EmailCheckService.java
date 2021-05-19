package day5Assignment.core.verification;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import day5Assignment.core.abstracts.Core;
import day5Assignment.entities.abstracts.User;

public class EmailCheckService implements Core{
	User user=new User();
	public EmailCheckService(User user) {
		this.user=user;
	}
	public Boolean checkMail() {
		
		String regex = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(user.getMail());
		 return matcher.matches();
		
	}
	
}
