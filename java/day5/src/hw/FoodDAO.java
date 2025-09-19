package hw;

import java.util.ArrayList;
import java.util.List;

public class FoodDAO {
	List<FoodDTO> foodList = new ArrayList<>();
	
	public void save(FoodDTO dto) {
		foodList.add(dto);
	}
	
	public List<FoodDTO> findAll() {
		return foodList;
	}
}
