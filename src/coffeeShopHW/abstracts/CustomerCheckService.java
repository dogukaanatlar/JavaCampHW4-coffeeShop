package coffeeShopHW.abstracts;

import coffeeShopHW.entities.Customer;

public interface CustomerCheckService {
	boolean CheckIfRealPerson(Customer customer);
}
