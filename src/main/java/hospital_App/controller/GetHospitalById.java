package hospital_App.controller;

import hospital_App.dto.Hospital;
import hospital_App.service.HospitalSevice;

public class GetHospitalById {

	public static void main(String[] args) {
		HospitalSevice hospitalSevice=new HospitalSevice();
		Hospital hospital=hospitalSevice.getByHospitalId(1);

		System.out.println(hospital.getHospitalId());
		System.out.println(hospital.getGstNo());
		System.out.println(hospital.getName());
	}

}
