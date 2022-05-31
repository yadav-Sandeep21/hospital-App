package hospital_App.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_App.dto.User;

public class UserDao implements UserInterfaceDao {

	// Save User Method
	public User saveUser(User user) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}

	public User getUserById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		User user = entityManager.find(User.class, id);

		if (user != null) {
			System.out.println("Id is " + user.getUid());
			System.out.println("Name is " + user.getName());
			System.out.println("Email is " + user.getEmail());
			System.out.println("Phone is " + user.getPhone());
			System.out.println("Role is " + user.getRole());
			System.out.println("Password is " + user.getPassword());
		} else {
			System.out.println("User detail not found");
		}

		return null;
	}

	public User validateUser(String email, String password) {
		EntityManagerFactory emfFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager emManager = emfFactory.createEntityManager();

		String sql = "SELECT u FROM User u WHERE u.email=?1 AND u.password=?2";

		Query query = emManager.createQuery(sql);
		query.setParameter(1, email);
		query.setParameter(2, password);

		List<User> users = query.getResultList();
		if (users.size() > 0) {
			for (User user : users) {
				System.out.println("Id is: " + user.getUid());
				System.out.println("Name is: " + user.getName());
				System.out.println("Email is: " + user.getEmail());
				System.out.println("Phone is: " + user.getPhone());
				System.out.println("Role is: " + user.getRole());
				System.out.println("Password is: " + user.getPassword());
			}
		} else {
			System.out.println("Invalid email & password");
		}

		return null;
	}

	public User updateUserById(int id, User user) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.merge(user);
		entityTransaction.commit();
		return user;
	}

	public List<User> getAllUser() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "SELECT u FROM User u";
		Query query = entityManager.createQuery(sql);

		return query.getResultList();
	}

	public List<User> getAllUserByRole(String role) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "SELECT u FROM User u WHERE u.role=?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, role);
		List<User> users = query.getResultList();

		if (users.size() > 0) {
			for (User user : users) {
				System.out.println("Id is: " + user.getUid());
				System.out.println("Name is: " + user.getName());
				System.out.println("Email is: " + user.getEmail());
				System.out.println("Phone is: " + user.getPhone());
				System.out.println("Role is: " + user.getRole());
				System.out.println("Password is: " + user.getPassword());
			}
		} else {
			System.out.println("It's Invalid role.");
		}

		return null;
	}

	public boolean deleteUserById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		User user = entityManager.find(User.class, id);

		if (user != null) {
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
			System.out.println("User deleting id is!:" + id);
			return true;
		} else {
			System.out.println("No user found for delete!");
		}
		return false;
	}
}
