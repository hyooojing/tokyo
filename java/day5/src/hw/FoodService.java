package hw;

import java.util.List;

public class FoodService {
	
	private FoodDAO dao;
	
	public FoodService(FoodDAO dao) {
		this.dao = dao;
	}
	
	public List<FoodDTO> getAllFoods() {
		return dao.findAll();
	}
	
	public void addFood(int num, String name, int cnt, String date) {
		FoodDTO dto = new FoodDTO(num, name, cnt, date);
		dao.save(dto);
	}
}
