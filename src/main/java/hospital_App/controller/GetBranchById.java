package hospital_App.controller;

import hospital_App.dto.Branch;
import hospital_App.service.BranchService;

public class GetBranchById {

	public static void main(String[] args) {
		BranchService branchService=new BranchService();
		Branch branch=branchService.getBranchById(1);
		
		System.out.println(branch.getBranchId());
		System.out.println(branch.getName());
		System.out.println(branch.getEmail());
		System.out.println(branch.getPhone());
		System.out.println(branch.getNoOfStaff());
	}

}
