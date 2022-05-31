package hospital_App.dao;

import java.util.List;

import hospital_App.dto.Encounter;

public interface EncounterInterfaceDao {
	public abstract Encounter createEncounter(Encounter encounter);
	public abstract Encounter getEncounterByPersonId(int personId);
	public abstract List<Encounter> getAllEncounterByPersonId(int personId);
	public abstract Encounter updateEncounterStatus(int encounterId, Encounter encounter);
}
