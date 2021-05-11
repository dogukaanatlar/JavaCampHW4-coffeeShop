package coffeeShopHW;

import coffeeShopHW.abstracts.BaseCustomerManager;
import coffeeShopHW.abstracts.CustomerCheckService;
import coffeeShopHW.adapters.MernisServicesAdapter;
import coffeeShopHW.concretes.CustomerCheckManager;
import coffeeShopHW.concretes.StarbucksCustomerManager;
import coffeeShopHW.entities.Customer;

public class Main {
	
	public static void main(String[] args) {
		
		//BaseCustomerManager customermanager = new StarbucksCustomerManager(new CustomerCheckManager());
		BaseCustomerManager customermanager = new StarbucksCustomerManager(new MernisServicesAdapter());
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setDateOfBirth(1993);
		customer.setFirstName("Dogukaan");
		customer.setLastName("Atlar");
		customer.setNationalityId(12345678910L);
		
		customermanager.save(customer);
		
	}

}
