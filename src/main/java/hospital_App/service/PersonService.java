package hospital_App.service;

import java.util.List;

import hospital_App.dao.PersonDao;
import hospital_App.dto.Person;

public class PersonService {
	//Save Person Details
	public Person savePerson(Person person) {
		PersonDao personDao=new PersonDao();
		return personDao.savePerson(person);
	}

	public Person getPersonById(int id) {
		PersonDao personDao=new PersonDao();
		return personDao.getPersonById(id);
	}

	public boolean updatePersonById(int id, Person person) {
		return false;
	}

	public List<Person> getAllPerson() {
		PersonDao personDao=new PersonDao();
		return personDao.getAllPerson();
	}

	public Person deletePersonById(int id) {
		PersonDao personDao=new PersonDao();
		return personDao.deletePersonById(id);
	}
}
