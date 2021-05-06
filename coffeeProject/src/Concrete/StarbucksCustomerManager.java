package Concrete;

import Abstract.CustomerManager;
import Abstract.ICustomerService;
import Abstract.IPersonCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends CustomerManager {
	public IPersonCheckService personCheckService;
	
	public StarbucksCustomerManager(IPersonCheckService personCheckService) {
		this.personCheckService=personCheckService;
	}
	
	@Override
	public void Save(Customer customer) {
		if(personCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Kullanici kaydedildi");
			
		}
		else{
			Exception exception =new Exception("Not a valid Person");
			System.out.println(exception.getMessage());
			
			
			
			
		}
	 
		
	}
	
	
	
}
