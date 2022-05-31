package hospital_App.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_App.dto.Branch;

public class BranchDao implements BranchInterfaceDao {

	//Save Branch table details in Branch table database.
	public Branch saveBranch(Branch branch) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(branch);
		entityTransaction.commit();
		System.out.println("Branches Added!");
		return branch;
	}
	//Get the Branch record from the Branch table databse by using Id.
	public Branch getBranchById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find(Branch.class, id);
	}
	//Updating the records in database. 
	public Branch updateBranchById(int id, Branch branch) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.merge(branch);
		entityTransaction.commit();
		return branch;
	}
	//Get all the details from Branch table by using Id.
	public List<Branch> getAllBranchById() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String sql="SELECT b FROM Branch b";
		Query query=entityManager.createQuery(sql);
		return query.getResultList();
	}
	//Deleting the database record from table by using Id.
	public boolean deleteBranchById(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Branch branch=entityManager.find(Branch.class, id);
		if(branch!=null) {
			entityTransaction.begin();
			entityManager.remove(branch);
			entityTransaction.commit();
			System.out.println("Branch deleting id is!:"+id);
			return true;
		}
		else
		{
			System.out.println("No Branch found for delete!");
			return false;
		}
		
	}

}
