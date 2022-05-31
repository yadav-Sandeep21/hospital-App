package hospital_App.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hospital_App.dto.Item;
import hospital_App.dto.MedOrder;

public class MedOrderDao implements MedOrderInterfaceDao{

	//Saving MedOrder Details in Med Order database table.
	public MedOrder saveMedOrder(MedOrder medOrder) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(medOrder);
		entityTransaction.commit();
		return medOrder;
	}
	//Total bill from item details.
	public double totalBill(List<Item> items, MedOrder medOrder) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		double sum=0;
		for(Item item : items) {
			entityTransaction.begin();
			
			sum=sum+item.getCost()*item.getQuantity();
			medOrder.setCost(sum);
			
			entityManager.merge(medOrder);
			entityTransaction.commit();
		}
		return sum;
	}
	//MedOrder details saving in MedOrder database table.
	public MedOrder medOrderById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find(MedOrder.class, id);
	}
}
