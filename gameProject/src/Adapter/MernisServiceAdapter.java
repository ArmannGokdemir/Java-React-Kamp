package Adapter;

import java.rmi.RemoteException;
import java.time.ZoneId;
import java.util.Locale;

import Abstract.User;
import Abstract.UserCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService{
	Locale trLocale= new Locale("tr");
	@Override
	public Boolean checkIfRealPerson(User user) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		Boolean checkIfReal=false;
		try {
			
			checkIfReal= kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()), user.getFirstName().toUpperCase(trLocale), user.getLastName().toUpperCase(trLocale), user.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());
		} catch (Exception a) {
			
			System.out.println("e bu insan  degil");;
		}
		return checkIfReal;
	}

	
	

}
