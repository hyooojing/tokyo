package ch1;

public class DeliveryOrder {
	String food;
	String address;
	
	public DeliveryOrder(String food, String address) {
		super();
		this.food = food;
		this.address = address;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	void deliver() {
		System.out.println("주문하신 " + this.food + "가 " + this.address + "에 도착하였습니다.");
	}
}
