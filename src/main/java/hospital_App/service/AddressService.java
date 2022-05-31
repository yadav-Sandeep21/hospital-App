package hospital_App.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hospital_App.dao.AddressDao;
import hospital_App.dto.Address;

public class AddressService {
	AddressDao addressDao=new AddressDao();
	//Save Address
	public Address saveAddress(Address address) {	
		return addressDao.saveAddress(address);
	}

	public Address getAddressById(int id) {
		return addressDao.getAddressById(id);
	}

	public Address updateAddressById(int id, Address address) {
		return null;
	}
}
