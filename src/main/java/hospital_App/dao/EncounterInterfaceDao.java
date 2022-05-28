package hospital_App.dao;

import java.util.List;

import hospital_App.dto.Encounter;

public interface EncounterInterfaceDao {
	public abstract Encounter createEncounter(int branchId, int personId, Encounter encounter);
	public abstract List<Encounter> getAllEncounterByPersonId(int personId);
	public abstract Encounter updateEncounterStatus(int encounterId, Encounter encounter);
}
