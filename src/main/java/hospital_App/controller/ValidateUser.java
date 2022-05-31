package hospital_App.controller;

import hospital_App.service.UserService;

public class ValidateUser {

	public static void main(String[] args) {
		UserService userServices=new UserService();
		userServices.validateUser("meeraj@gmail.com", "neer123");
	}

}
