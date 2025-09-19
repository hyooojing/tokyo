package hw;

public class FoodDTO {

	int num;
	String name;
	int cnt;
	String date;
	
	public FoodDTO() {}

	public FoodDTO(int num, String name, int cnt, String date) {
		super();
		this.num = num;
		this.name = name;
		this.cnt = cnt;
		this.date = date;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "번호: " + num + ", 식자재명: " + name + ", 수량: " + cnt + ", 날짜: " + date;
	}
	
	
}
