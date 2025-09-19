package hw;

import java.util.List;

public class PatientService {

	private PatientDAO dao;
	
	public PatientService(PatientDAO dao) {
		this.dao = dao;
	}
	
	public List<PatientDTO> getAllAnimals() {
		return dao.findAll();
	}
	
	public void addAnimal(String id, String p_name, String a_name, int age, int phone) {
		PatientDTO dto = new PatientDTO(id, p_name, a_name, age, phone);
		dao.save(dto);
	}
}
