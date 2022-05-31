package hospital_App.service;

import java.util.List;

import hospital_App.dao.UserDao;
import hospital_App.dto.User;

public class UserService {
	// Save User Method
	public User saveUser(User user) {
		UserDao userDao = new UserDao();
		return userDao.saveUser(user);
	}

	public User getUserById(int id) {
		UserDao userDao = new UserDao();
		return userDao.getUserById(id);
	}

	public User validateUser(String email, String password) {
		UserDao userDao = new UserDao();
		return userDao.validateUser(email, password);
	}

	public User updateUserById(int id, User user) {
		UserDao userDao = new UserDao();
		return userDao.updateUserById(id, user);
	}

	public List<User> getAllUser() {
		UserDao userdao = new UserDao();
		return userdao.getAllUser();
	}

	public List<User> getAllUserByRole(String role) {
		UserDao userDao = new UserDao();
		return userDao.getAllUserByRole(role);
	}

	public boolean deleteUserById(int id) {
		UserDao userdao = new UserDao();
		return userdao.deleteUserById(id);
	}
}
