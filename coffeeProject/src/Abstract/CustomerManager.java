package Abstract;

import Entities.Customer;

public abstract class CustomerManager implements ICustomerService {
	
	
	public void Save(Customer customer) {
		
		System.out.println("Dbye kayit tamamlandi"+ customer.getFirstName());
	}

}
