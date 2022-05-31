package hospital_App.controller;

import hospital_App.dto.User;
import hospital_App.service.UserService;

public class UpdateUserByIdUser {

	public static void main(String[] args) {
		User user=new User();
		user.setName("Sandeep");
		user.setEmail("sand@gmail.com");
		
		UserService userService=new UserService();
		userService.updateUserById(1, user);
	}

}
