package coffeeShopHW.concretes;

import coffeeShopHW.abstracts.CustomerCheckService;
import coffeeShopHW.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}
	
}
