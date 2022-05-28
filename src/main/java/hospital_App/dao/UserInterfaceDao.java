package hospital_App.dao;

import java.util.List;

import hospital_App.dto.User;

public interface UserInterfaceDao {
	public abstract User saveUser(User user);
	public abstract User getUserById(int id);
	public abstract User validateUser(String email, String password);
	public abstract User updateUserById(int id, User user);
	public abstract List<User> getAllUser();
	public abstract List<User> getAllUserByRole();
	public abstract boolean deleteUserById(int id);
}
