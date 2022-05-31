package hospital_App.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import hospital_App.dao.EncounterDao;
import hospital_App.dto.Encounter;

public class EncounterService {
	// Create Encounter details
	public Encounter createEncounter(Encounter encounter) {
		EncounterDao encounterDao = new EncounterDao();
		return encounterDao.createEncounter(encounter);
	}
    //Get all encounter By person By id method
	public List<Encounter> getAllEncounterByPersonId(int personId) {
		EncounterDao encounterDao = new EncounterDao();
		return encounterDao.getAllEncounterByPersonId(personId);
	}

	public Encounter updateEncounterStatus(int encounterId, Encounter encounter) {
		return null;
	}

	public Encounter getEncounterByPersonId(int personId) {
		EncounterDao encounterDao = new EncounterDao();
		return encounterDao.getEncounterByPersonId(personId);
	}
}
