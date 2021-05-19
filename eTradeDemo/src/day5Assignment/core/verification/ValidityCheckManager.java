package day5Assignment.core.verification;

import day5Assignment.core.abstracts.ValidityCheck;
import day5Assignment.entities.abstracts.User;

public class ValidityCheckManager implements ValidityCheck {
	MailVerificationManager mailVerify = new MailVerificationManager();
	@Override
	public  boolean isAllFieldsFilled(User user) {
		if(user.getFirstName().length()<=0 || user.getLastName().length()<=0 || user.getMail().length()<=0 || user.getPassword().length()<=0) {
			return false;
			
		}
		return true;
	}

	@Override
	public  boolean isFirstNameValid(User user) {
		// TODO Auto-generated method stub
		return (user.getFirstName().length())<=2;
	}

	@Override
	public  boolean isLastNameValid(User user) {
		// TODO Auto-generated method stub
		return user.getLastName().length()<=2;
	}

	@Override
	public  boolean isPasswordValid(User user) {
		// TODO Auto-generated method stub
		return user.getPassword().length()<6;
	}

	@Override
	public  boolean isMailValid(User user) {
		EmailCheckService mailChecker=new EmailCheckService(user);
		return mailChecker.checkMail();
	}

	@Override
	public  boolean isPersonValid(User user) {
		boolean isValid=true;
		if(!this.isMailValid(user)) {
			System.out.println("dogru bir mail adresi giriniz.");
			isValid=false;
		}
		if(this.isPasswordValid(user)) {
			System.out.println("parolaniz en az 6 karakterden olusmalidir.");
			isValid=false;
		}
		
		if(this.isFirstNameValid(user)) {
			System.out.println("Isminiz en az 3 harften olusmalidir..");
			isValid=false;
		}
		if(this.isLastNameValid(user)) {
			System.out.println("Soyisminiz en az 3 harften olusmalidir.");
			isValid=false;
		}
		
		return isValid;
	}

	

}
