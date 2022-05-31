package hospital_App.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hospital_App.dto.Item;

public class ItemDao implements ItemInterfaceDao{
	//Save Item Details
	public Item saveItem(Item item) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(item);
		entityTransaction.commit();
		return item;
	}

	public double calculateCost(double price, int quantity) {
		double sum=0;
		sum=sum+price*quantity;
		System.out.println("Amount of item: "+sum);
		return sum;
	}
}
