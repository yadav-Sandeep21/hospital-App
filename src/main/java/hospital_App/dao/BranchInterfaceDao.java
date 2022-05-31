package hospital_App.dao;

import java.util.List;

import hospital_App.dto.Branch;

public interface BranchInterfaceDao {
	public abstract Branch saveBranch(Branch branche);
	public abstract Branch getBranchById(int id);
	public abstract Branch updateBranchById(int id, Branch branch);
	public abstract List<Branch> getAllBranchById();
	public abstract boolean deleteBranchById(int id);
}
