package hospital_App.controller;

import hospital_App.service.UserService;

public class DeleteUserById {

	public static void main(String[] args) {
		UserService userservices=new UserService();
		userservices.deleteUserById(1);
	}

}
