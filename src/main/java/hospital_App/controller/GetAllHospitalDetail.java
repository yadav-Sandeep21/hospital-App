package hospital_App.controller;

import java.util.List;

import hospital_App.dto.Hospital;
import hospital_App.service.HospitalSevice;

public class GetAllHospitalDetail {

	public static void main(String[] args) {
		HospitalSevice hospitalSevice=new HospitalSevice();
		List<Hospital> hospitals=hospitalSevice.getAllHospital();
		for(Hospital hospital : hospitals) {
			System.out.println("Id is: "+hospital.getHospitalId());
			System.out.println("Name is: "+hospital.getName());
			System.out.println("Gst Num: "+hospital.getGstNo());
		}
	}

}
