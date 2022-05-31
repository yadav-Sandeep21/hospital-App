package hospital_App.controller;

import java.util.List;

import hospital_App.dto.Hospital;
import hospital_App.dto.Person;
import hospital_App.service.PersonService;

public class GetAllPerson {

	public static void main(String[] args) {
		PersonService personService=new PersonService();
		List<Person> persons=personService.getAllPerson();
		for(Person person : persons) {
			System.out.println(person.getPersonId());
			System.out.println(person.getName());
			System.out.println(person.getEmail());
			System.out.println(person.getBloodGroup());
			System.out.println(person.getPhone());
			System.out.println(person.getAge());
			System.out.println(person.getDob());
		}
	}

}
