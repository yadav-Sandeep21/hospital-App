package hospital_App.controller;

import hospital_App.dto.Encounter;
import hospital_App.dto.MedOrder;
import hospital_App.service.EncounterService;
import hospital_App.service.MedOrderService;

public class TestSaveMedOrder {

	public static void main(String[] args) {
		MedOrder medOrder1=new MedOrder();
		medOrder1.setCost(0);
		medOrder1.setDescription("Hey, You are not well, You should take some rest!");
		
		EncounterService encounterService=new EncounterService();
		Encounter encounter=encounterService.getEncounterByPersonId(1);
		
		System.out.println(encounter);
		medOrder1.setEncounter(encounter);
		
		MedOrderService medOrderService=new MedOrderService();
		medOrderService.saveMedOrder(medOrder1);
	}

}
