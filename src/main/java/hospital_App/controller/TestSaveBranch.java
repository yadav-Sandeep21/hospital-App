package hospital_App.controller;

import java.util.ArrayList;
import java.util.List;

import hospital_App.dto.Branch;
import hospital_App.dto.Hospital;
import hospital_App.service.BranchService;
import hospital_App.service.HospitalSevice;

public class TestSaveBranch {

	public static void main(String[] args) {
		
		
		Branch branch1=new Branch();
		branch1.setName("Fortis Bangalore");
		branch1.setEmail("fortis@gmail.com");
		branch1.setPhone(9456789l);
		branch1.setNoOfStaff(20);
		
		HospitalSevice hospitalSevice=new HospitalSevice();
		Hospital hospital=hospitalSevice.getByHospitalId(2);
		System.out.println(hospital);
		branch1.setHospital(hospital);
		
		BranchService branchService=new BranchService();
		branchService.saveBranch(branch1);
		
		
	}

}
