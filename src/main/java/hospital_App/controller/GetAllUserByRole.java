package hospital_App.controller;

import hospital_App.service.UserService;

public class GetAllUserByRole {

	public static void main(String[] args) {
		UserService userService=new UserService();
		userService.getAllUserByRole("Doctor");
	}

}
