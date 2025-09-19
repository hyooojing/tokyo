package hw;

public class GymDTO {

	String name;
	int num;
	int basic;
	int kcal;
	
	public GymDTO() {}
	
	public GymDTO(String name, int num, int basic, int kcal) {
		super();
		this.name = name;
		this.num = num;
		this.basic = basic;
		this.kcal = kcal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getBasic() {
		return basic;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	public int getKcal() {
		return kcal;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	@Override
	public String toString() {
		return "회원명: " + name + ", 회원번호: " + num + ", 기준칼로리: " + basic + ", 소비칼로리: " + kcal;
	}
	
	
}
