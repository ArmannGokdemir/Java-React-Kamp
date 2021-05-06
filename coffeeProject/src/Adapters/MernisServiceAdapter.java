package Adapters;

import java.rmi.RemoteException;
import java.time.ZoneId;

import Abstract.ICustomerService;
import Abstract.IPersonCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IPersonCheckService {

	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
		 KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		 Boolean CheckIfRealPerson = false;
		 try {
			CheckIfRealPerson=kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId())  , customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CheckIfRealPerson;
	}

}
