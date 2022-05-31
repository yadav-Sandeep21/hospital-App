package hospital_App.controller;

import hospital_App.service.EncounterService;

public class GetAllEncounterByPersonId {

	public static void main(String[] args) {
		EncounterService encounterService=new EncounterService();
		encounterService.getAllEncounterByPersonId(1);
	}

}
