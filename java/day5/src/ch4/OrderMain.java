package ch4;

public class OrderMain {

	public static void main(String[] args) {
		String filename = "java/day5/DB/orders.csv";
		OrderDAO dao = new OrderDAO(filename);
		OrderService service = new OrderService(dao);
		OrderController controller = new OrderController(service);
		
		controller.run();
	}
}
