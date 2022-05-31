package hospital_App.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hospital_App.dto.Address;

public class AddressDao implements AddressInterfaceDao {

	// Save Address details in Address Database Table by using branchId
	public Address saveAddress(Address address) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(address);
		entityTransaction.commit();
		return address;
	}
	//Get the address details from the Address database table Using id
	public Address getAddressById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find(Address.class, id);
	}
	//Update the record from database table.
	public Address updateAddressById(int id, Address address) {
		return null;
	}
}
