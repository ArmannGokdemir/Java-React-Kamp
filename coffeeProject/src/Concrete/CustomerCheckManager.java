package Concrete;

import Abstract.IPersonCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerCheckManager implements IPersonCheckService {

	@Override // bu da fake checker
	public Boolean CheckIfRealPerson(Customer customer) {
		return true;
	}
	
	

}
