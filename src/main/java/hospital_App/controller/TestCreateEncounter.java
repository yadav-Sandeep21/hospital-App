package hospital_App.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import hospital_App.dto.Branch;
import hospital_App.dto.Encounter;
import hospital_App.dto.Person;
import hospital_App.service.BranchService;
import hospital_App.service.EncounterService;
import hospital_App.service.PersonService;

public class TestCreateEncounter {

	public static void main(String[] args) {
		Encounter encounter1=new Encounter();
		encounter1.setAdmitDataTime(LocalDateTime.now());
		encounter1.setDischargeTime(LocalDateTime.now());
		encounter1.setReason("Fever");
		
		Encounter encounter2=new Encounter();
		encounter2.setAdmitDataTime(LocalDateTime.now());
		encounter2.setDischargeTime(LocalDateTime.now());
		encounter2.setReason("Bone Injury");
		
		Encounter encounter3=new Encounter();
		encounter3.setAdmitDataTime(LocalDateTime.now());
		encounter3.setDischargeTime(LocalDateTime.now());
		encounter3.setReason("Skin Problem");
		
		List<Encounter> encounters=new ArrayList<Encounter>();
		encounters.add(encounter1);
		encounters.add(encounter2);
		encounters.add(encounter3);
		
		PersonService personService=new PersonService();
		Person person=personService.getPersonById(1);
		System.out.println(person);
		person.setEncounter(encounters);
		encounter1.setPerson(person);
		encounter2.setPerson(person);
		encounter3.setPerson(person);
		
		
		BranchService branchService=new BranchService();
		Branch branch=branchService.getBranchById(1);
		System.out.println(branch);
		encounter1.setBranch(branch);
		encounter2.setBranch(branch);
		encounter3.setBranch(branch);
		
		EncounterService encounterService=new EncounterService();
		encounterService.createEncounter(encounter1);
		encounterService.createEncounter(encounter2);
		encounterService.createEncounter(encounter3);
	}

}
