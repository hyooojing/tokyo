package ch4;

public class VehicleMain {

	public static void main(String[] args) {
		
		Car car = new Car();
		Bicycle bike = new Bicycle();
		
		car.setSpeed(100);
		bike.setSpeed(35);
		
		System.out.println("이동 전 차 속도: " + car.getSpeed());
		System.out.println("이동 후 차 속도: " + car.move());
		
		System.out.println("=== === === === ===");
		System.out.println("이동 전 자전거 속도: " + bike.getSpeed());
		System.out.println("이동 후 자전거 속도: " + bike.move());
	}

}
