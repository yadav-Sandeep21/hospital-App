package hospital_App.controller;

import java.util.List;

import hospital_App.dto.Branch;
import hospital_App.service.BranchService;

public class GetAllBranches {

	public static void main(String[] args) {
		BranchService branchService=new BranchService();
		List<Branch> branchs=branchService.getAllBranchById();
		
		for(Branch branch : branchs) {
			System.out.println("Branch Id is: "+branch.getBranchId());
			System.out.println("Name is: "+branch.getName());
			System.out.println("Email is: "+branch.getPhone());
			System.out.println("Phone Number is: "+branch.getPhone());
			System.out.println("No of Staff: "+branch.getNoOfStaff());
		}
	}

}
