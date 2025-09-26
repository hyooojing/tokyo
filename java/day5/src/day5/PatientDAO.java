package day5;

import java.util.ArrayList;
import java.util.List;

public class PatientDAO {

	List<StudentDTO> studentList = new ArrayList<>();
	
	public void save(StudentDTO dto) {
		studentList.add(dto);
	}
	
	public List<StudentDTO> findAll() {
		return studentList;
	}
	
}
