package ch4;

public class Book {

	private String title;
	private String author;
	private int price;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "[책 정보] 제목: " + getTitle() + ", 저자:" + getAuthor() + ", 가격: " + getPrice();
	}
	
	
}
