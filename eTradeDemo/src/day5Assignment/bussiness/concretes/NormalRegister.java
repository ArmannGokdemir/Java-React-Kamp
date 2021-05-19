package day5Assignment.bussiness.concretes;

import day5Assignment.core.abstracts.RegisterService;
import day5Assignment.core.abstracts.ValidityCheck;
import day5Assignment.core.abstracts.VerificationService;
import day5Assignment.core.concretes.MailManager;
import day5Assignment.core.verification.DistinctMailService;
import day5Assignment.core.verification.ValidityCheckManager;
import day5Assignment.dataAccess.abstracts.UserDao;
import day5Assignment.dataAccess.concretes.HibernateCustomerDao;
import day5Assignment.entities.abstracts.User;

public class NormalRegister implements RegisterService {

	private UserDao userDao;
	private ValidityCheck validator;
	private DistinctMailService isDistinct=new DistinctMailService();
	private VerificationService verifyUser;
	
	

	
	

public NormalRegister(UserDao userDao, ValidityCheck validator,VerificationService verifyUser) {
		
		this.userDao = userDao;
		this.validator = validator;
		this.verifyUser=verifyUser;
	}

@Override
public void register(String mail, String password, String firstName, String lastName) {
	User user=new User(password,firstName,lastName,mail);
	
	if(validator.isPersonValid(user) && isDistinct.isMailDistinct(user.getMail(),userDao.listUsers()) && verifyUser.isVerificated(user) ) {
		userDao.add(user);
		MailManager.sendMail(user, "Kaydiniz basariyla tamamlandi."+user.getFirstName()+" "+user.getLastName());
		
		
	
	}
}

	@Override
	public void login(String mail, String password) {
		User user =new User();
	user = userDao.getLogin(mail);
		if(user.getPassword()!=password) {
			System.out.println("Yanlis sifre girdiniz");
		}
		else
			System.out.println("Basariyla giris yapildi.");
	}

}
