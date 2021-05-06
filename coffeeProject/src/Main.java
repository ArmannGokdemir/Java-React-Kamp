
import java.util.GregorianCalendar;
import java.time.ZoneId;
import java.util.Date;
import Abstract.ICustomerService;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import Adapters.MernisServiceAdapter;

public class Main {

	public static void main(String[] args) {
		ICustomerService customerService = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerService.Save(new Customer(1,"Arman","Gökdemir",(Date) new GregorianCalendar(1999, 02 , 17).getTime(),"00000000000"));
		

	}

}
