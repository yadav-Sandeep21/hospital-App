package hospital_App.controller;

import java.util.List;

import hospital_App.dto.User;
import hospital_App.service.UserService;

public class GetAllUser {

	public static void main(String[] args) {
		UserService userservices = new UserService();

		List<User> users = userservices.getAllUser();
		for (User user : users) {
			System.out.println("ID is " + user.getUid());
			System.out.println("Name is " + user.getName());
			System.out.println("Email is " + user.getEmail());
			System.out.println("Phone is " + user.getPhone());
			System.out.println("Role is: " + user.getRole());
			System.out.println("Password is " + user.getPassword());
		}
	}

}
