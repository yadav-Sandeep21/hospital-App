package hospital_App.dao;

import java.util.List;

import hospital_App.dto.Person;

public interface PersonInterfaceDao {
	public abstract Person savePerson(Person person);
	public abstract Person getPersonById(int id);
	public abstract boolean updatePersonById(int id, Person person);
	public abstract List<Person> getAllPerson();
	public abstract Person deletePersonById(int id);
}
