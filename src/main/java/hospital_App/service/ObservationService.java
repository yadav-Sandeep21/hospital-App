package hospital_App.service;

import hospital_App.dao.ObservationDao;
import hospital_App.dto.Observation;

public class ObservationService {
	//Save Observtion details
	public Observation saveObservation(Observation observation) {
		ObservationDao observationDao=new ObservationDao();
		return observationDao.saveObservation(observation);
	}

	public boolean updateObservationById(int id, Observation observation) {
		return false;
	}

	public Observation getObservationById(int id) {
		ObservationDao observationDao=new ObservationDao();
		return observationDao.getObservationById(id);
	}
}
