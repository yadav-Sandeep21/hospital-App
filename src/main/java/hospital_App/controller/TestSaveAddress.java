package hospital_App.controller;

import hospital_App.dto.Address;
import hospital_App.dto.Branch;
import hospital_App.service.AddressService;
import hospital_App.service.BranchService;

public class TestSaveAddress {

	public static void main(String[] args) {
		
		Address address1=new Address();
		address1.setCity("Bangalore");
		address1.setStreet("19 D Coss");
		address1.setState("Karnataka");
		address1.setPincode(233001);
		address1.setCountry("India");
		
		BranchService branchService=new BranchService();
		Branch branch=branchService.getBranchById(1);
		System.out.println(branch);
		address1.setBranch(branch);
		
		AddressService addressService=new AddressService();
		addressService.saveAddress(address1);
	}

}
