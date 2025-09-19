package hw;

import java.util.List;

public class GymService {
	private GymDAO dao;
	
	public GymService(GymDAO dao) {
		this.dao = dao;
	}
	
	public List<GymDTO> getAll() {
		return dao.findAll();
	}
	
	public void addMember(String name, int num, int basic, int kcal) {
		GymDTO dto = new GymDTO(name, num, basic, kcal);
		dao.save(dto);
	}
}
