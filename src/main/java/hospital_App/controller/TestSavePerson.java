package hospital_App.controller;

import hospital_App.dto.Encounter;
import hospital_App.dto.Person;
import hospital_App.service.EncounterService;
import hospital_App.service.PersonService;

public class TestSavePerson {

	public static void main(String[] args) {
		Person person=new Person();
		person.setName("Neeraj");
		person.setAge(24);
		person.setPhone(945277899);
		person.setEmail("neeraj@1234");
		person.setBloodGroup("AB+");
		person.setDob("21st Sept");
		
//		EncounterService encounterService=new EncounterService();
//		Encounter encounter=encounterService.get
		
		PersonService personService=new PersonService();
		personService.savePerson(person);
	}

}
