package hospital_App.dao;

import hospital_App.dto.Observation;

public interface ObservationInterfaceDao {
	public abstract Observation saveObservation(Observation observation);
	public abstract boolean updateObservationById(int id, Observation observation);
	public abstract Observation getObservationById(int id);
}
