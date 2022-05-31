package hospital_App.controller;

import hospital_App.service.PersonService;

public class DeletePersonDetail {

	public static void main(String[] args) {
		PersonService personService=new PersonService();
		personService.deletePersonById(2);
	}

}
