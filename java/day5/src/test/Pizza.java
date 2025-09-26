package test;

public class Pizza {
	
	String type;
	String size;
	int price;
	
	public Pizza(String type, String size, int price) {
		super();
		this.type = type;
		this.size = size;
		this.price = price;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
