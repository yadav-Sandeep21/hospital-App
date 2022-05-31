package hospital_App.controller;


import hospital_App.dto.Hospital;
import hospital_App.service.HospitalSevice;

public class TestSaveHospitalApp {

	public static void main(String[] args) {
		HospitalSevice hospitalService=new HospitalSevice();
		
		Hospital hospital=new Hospital();
		hospital.setName("Fortis");
		hospital.setGstNo("efC234DFGHJK");
		
		hospitalService.saveHospital(hospital);
	}

}
