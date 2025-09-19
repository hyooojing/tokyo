package hw;

public class GymMain {

	public static void main(String[] args) {
		
		GymDAO dao = new GymDAO();
		GymService gymService = new GymService(dao);
		GymController controller = new GymController(gymService);
		
		controller.run();
	}

}
