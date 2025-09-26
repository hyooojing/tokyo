package ch4;

public class ItemMain {

	public static void main(String[] args) {
		String filename = "DB/items.csv";
		ItemDAO dao = new ItemDAO(filename);
		ItemService service = new ItemService(dao);
		ItemsController controller = new ItemsController(service);
		
		controller.run();
	}
}