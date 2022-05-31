package hospital_App.controller;

import hospital_App.dto.Observation;
import hospital_App.service.ObservationService;

public class GetObservationById {

	public static void main(String[] args) {
		ObservationService observationService=new ObservationService();
		Observation observation=observationService.getObservationById(1);
		
		System.out.println(observation.getObservationId());
		System.out.println(observation.getDate());
		System.out.println(observation.getTime());
		System.out.println(observation.getDescription());
	}

}
