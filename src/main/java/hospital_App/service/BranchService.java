package hospital_App.service;

import java.util.List;

import hospital_App.dao.BranchDao;
import hospital_App.dto.Branch;

public class BranchService {
	
	// Save Branches Method
	public Branch saveBranch(Branch branch) {
		BranchDao branchDao=new BranchDao();
		return branchDao.saveBranch(branch);
	}

	public Branch getBranchById(int id) {
		BranchDao branchDao=new BranchDao();
		return branchDao.getBranchById(id);
	}

	public Branch updateBranchById(int id, Branch branch) {
		BranchDao branchDao=new BranchDao();
		return branchDao.updateBranchById(id, branch);
	}

	public List<Branch> getAllBranchById() {
		BranchDao branchDao=new BranchDao();
		return branchDao.getAllBranchById();
	}

	public boolean deleteBranchById(int id) {
		BranchDao branchDao=new BranchDao();
		boolean b=branchDao.deleteBranchById(id);
		if(b==true) {
			return true;
		}
		else {
			return false;
		}
		 
	}
}
