package day5;

import java.util.List;

public class StudentService {

	private PatientDAO dao;
	
	public StudentService(PatientDAO dao) {
		this.dao = dao;
	}
	
	public List<StudentDTO> getAllStudent() {
		return dao.findAll();
	}
	
	public void addStudent(String name, int id, String major, int age) {
		StudentDTO dto = new StudentDTO(name ,id, major, age);
		dao.save(dto);
	}
}
