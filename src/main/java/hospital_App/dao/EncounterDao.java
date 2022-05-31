package hospital_App.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_App.dto.Encounter;
import hospital_App.dto.User;

public class EncounterDao implements EncounterInterfaceDao{

	//Save Encounter Details
	public Encounter createEncounter(Encounter encounter) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(encounter);
		entityTransaction.commit();
		
		return encounter;
	}
    //Get All Encounter Person By Id
	public List<Encounter> getAllEncounterByPersonId(int personId) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "SELECT e FROM Encounter e WHERE e.personId=?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, personId);
		List<Encounter> encounters = query.getResultList();
		
		if (encounters.size() > 0) {
			for (Encounter encounter : encounters) {
				System.out.println("Encounter Id is: " + encounter.getEncounterId());
				System.out.println("Admit Data Time is: " + encounter.getAdmitDataTime());
				System.out.println("Discharge time is: " + encounter.getDischargeTime());
				System.out.println("Reason is: " + encounter.getReason());
			}
		} else {
			System.out.println("It's Invalid Id.");
		}
		return null;
	}

	public Encounter updateEncounterStatus(int encounterId, Encounter encounter) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		return null;
	}
	public Encounter getEncounterByPersonId(int personId) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find(Encounter.class, personId);
	}
}
