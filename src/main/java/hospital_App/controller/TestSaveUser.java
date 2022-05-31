package hospital_App.controller;

import hospital_App.dto.User;
import hospital_App.service.UserService;

public class TestSaveUser {

	public static void main(String[] args) {
		User user1=new User();
		user1.setBranchId(1);
		user1.setName("Neeraj");
		user1.setEmail("neeraj@gmail.com");
		user1.setPhone(956723456);
		user1.setRole("Doctor");
		user1.setPassword("neer123");
		user1.setBranchId(21);
		
		UserService userService1=new UserService();
		userService1.saveUser(user1);
	}

}
