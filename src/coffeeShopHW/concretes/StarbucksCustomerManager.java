package coffeeShopHW.concretes;

import coffeeShopHW.abstracts.BaseCustomerManager;
import coffeeShopHW.abstracts.CustomerCheckService;
import coffeeShopHW.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService checkService;

	public StarbucksCustomerManager(CustomerCheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public void save(Customer customer) {
		if(checkService.CheckIfRealPerson(customer)) {
			super.save(customer); //kosul saglanýrsa baseCustomManager'daki save metodu calisir
			//System.out.println("Kaydedildi " + customer.getFirstName());
		}else {
			System.out.println("Not a valid person.");
		}
		
		
	}

}
