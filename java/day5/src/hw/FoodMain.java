package hw;

public class FoodMain {
	
	public static void main(String[] args) {
	
		FoodDAO dao = new FoodDAO();
		FoodService foodService = new FoodService(dao);
		FoodController controller = new FoodController(foodService);
		
		controller.run();
	}
}
