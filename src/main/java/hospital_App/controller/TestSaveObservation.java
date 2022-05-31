package hospital_App.controller;

import java.time.LocalDateTime;

import hospital_App.dto.Encounter;
import hospital_App.dto.Observation;
import hospital_App.service.EncounterService;
import hospital_App.service.ObservationService;

public class TestSaveObservation {

	public static void main(String[] args) {
		Observation observation1=new Observation();
		observation1.setDate(LocalDateTime.now());
		observation1.setTime(LocalDateTime.now());
		observation1.setDescription("u are well!");
		
		EncounterService encounterService=new EncounterService();
		Encounter encounter=encounterService.getEncounterByPersonId(1);
		System.out.println(encounter);
		observation1.setEncounter(encounter);
		
		ObservationService observationService=new ObservationService();
		observationService.saveObservation(observation1);
	}

}
