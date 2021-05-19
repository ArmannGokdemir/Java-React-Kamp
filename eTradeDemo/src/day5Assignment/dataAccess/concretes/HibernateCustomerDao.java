package day5Assignment.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import day5Assignment.dataAccess.abstracts.UserDao;
import day5Assignment.entities.abstracts.User;
import day5Assignment.entities.concretes.Customer;
import day5Assignment.entities.concretes.UsersList;

public class HibernateCustomerDao implements UserDao {
	ArrayList<User> usersList=new ArrayList<User>();
	
	@Override
	public User getLogin(String mail) {
		//mail ile password eslestirerek login deniyoruz.
		
		User user2 = null;
		for(User user : usersList) {
			if(user.getMail()==mail ) {
				user2=user;
				break;
			}
			
		}
		// maili eslesen kullaniciyi dondurdum.
		return user2;
	}

	@Override
	public void register(String mail, String password, String firstName, String lastName) {
		//Kayit gerceklestirme
		User user = new User(password,firstName,lastName,mail);
		usersList.add(user);
		
		
	}
	@Override
	public   List<User> listUsers(){
		return usersList;
	}

	@Override
	public void add(User user) {
		this.usersList.add(user);
		
	}

	

}
