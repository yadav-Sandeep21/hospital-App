package hospital_App.controller;

import hospital_App.dto.Address;
import hospital_App.service.AddressService;

public class GetAddressById {

	public static void main(String[] args) {
		AddressService addressService=new AddressService();
		Address address=addressService.getAddressById(1);
		
		System.out.println(address.getAddressId());
		System.out.println(address.getCity());
		System.out.println(address.getStreet());
		System.out.println(address.getState());
		System.out.println(address.getCountry());
		System.out.println(address.getPincode());

		
	}

}
