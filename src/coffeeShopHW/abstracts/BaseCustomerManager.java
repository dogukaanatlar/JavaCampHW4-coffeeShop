package coffeeShopHW.abstracts;

import coffeeShopHW.entities.Customer;

public abstract class BaseCustomerManager implements CustomerServices {

	@Override
	public void save(Customer customer) {
		System.out.println("Veri taban�na kaydedildi : " + customer.getFirstName());
		
	}

}
