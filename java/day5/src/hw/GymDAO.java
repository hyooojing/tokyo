package hw;

import java.util.ArrayList;
import java.util.List;

public class GymDAO {
	List<GymDTO> gymList = new ArrayList<>();
	
	public void save(GymDTO dto) {
		gymList.add(dto);
	}
	
	public List<GymDTO> findAll() {
		return gymList;
	}
}
