package hospital_App.controller;

import hospital_App.service.BranchService;

public class DeleteBranchById {

	public static void main(String[] args) {
		BranchService branchService=new BranchService();
		branchService.deleteBranchById(1);
	}

}
