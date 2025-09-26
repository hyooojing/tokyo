package test;

public class PizzaMain {

	public static void main(String[] args) {
		Pizza[] pizza = new Pizza[3];
		pizza[0] = new Pizza("페퍼로니", "L", 15000);
		pizza[1] = new Pizza("하와이안", "M", 13000);
		pizza[2] = new Pizza("치즈", "S", 9000);
		
		for (int i = 0; i < pizza.length; i++) {
			System.out.println("피자 종류: " + pizza[i].getType());
			System.out.println("피자 사이즈: " + pizza[i].getSize());
			System.out.println("피자 가격: " + pizza[i].getPrice());
		}
	}
}
