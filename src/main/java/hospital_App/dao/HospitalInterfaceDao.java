package hospital_App.dao;

import java.util.List;

import hospital_App.dto.Branch;
import hospital_App.dto.Hospital;

public interface HospitalInterfaceDao {
	public abstract Hospital saveHospital(Hospital hospital);
	public abstract List<Hospital> getAllHospital();
	public abstract Hospital getByHospitalId(int id);
}
