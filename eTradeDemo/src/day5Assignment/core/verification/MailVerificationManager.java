package day5Assignment.core.verification;

import day5Assignment.core.abstracts.VerificationService;
import day5Assignment.entities.abstracts.User;

public class MailVerificationManager implements VerificationService {

	@Override
	public  boolean isVerificated(User user) {
		System.out.println("Hesabiniz  basariyla dogrulandi.");
		return true;
	}

}
