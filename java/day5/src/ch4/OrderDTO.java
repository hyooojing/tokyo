package ch4;

import java.text.DecimalFormat;

public class OrderDTO {

	private int id;
	private String name;
	private int price;
	private int qty;
	private int current;
	
	public OrderDTO() {}
	
	public OrderDTO(int id, String name, int price, int qty, int current) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.current = current;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}
	
	private String formatMoney(int money) {
		return String.format("%,d원", money);
	}
	
	DecimalFormat df = new DecimalFormat("#,###");

	@Override
	public String toString() {
		return String.format("번호: %d | 품명: %s | 가격: %s원 | 주문가능수: %d | 현재재고: %d ", id, name, df.format(price), qty, current);
	}
}
