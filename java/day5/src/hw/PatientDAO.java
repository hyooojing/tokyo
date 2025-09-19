package hw;

import java.util.ArrayList;
import java.util.List;

public class PatientDAO {

	List<PatientDTO> patientList = new ArrayList<>();
	
	public void save(PatientDTO dto) {
		patientList.add(dto);
	}
	
	public List<PatientDTO> findAll() {
		return patientList;
	}
}
