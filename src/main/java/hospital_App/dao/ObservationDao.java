package hospital_App.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hospital_App.dto.Observation;
import hospital_App.dto.Person;

public class ObservationDao implements ObservationInterfaceDao{

	//Save Observation Details
	public Observation saveObservation(Observation observation) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(observation);
		entityTransaction.commit();
		System.out.println("Observation Added!");
		return observation;
	}

	public boolean updateObservationById(int id, Observation observation) {
		return false;
	}

	public Observation getObservationById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find(Observation.class, id);
		
	}
}
