package hospital_App.service;

import java.util.List;

import hospital_App.dao.HospitalDao;
import hospital_App.dto.Hospital;

public class HospitalSevice {
	HospitalDao hospitalDao=new HospitalDao();

	public Hospital saveHospital(Hospital hospital) {
		return hospitalDao.saveHospital(hospital);
	}

	public List<Hospital> getAllHospital() {
		return hospitalDao.getAllHospital();
	}

	public Hospital getByHospitalId(int id) {
		return hospitalDao.getByHospitalId(id);
	}
}
