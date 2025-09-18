package ch4;

public class Bicycle implements Vehicle {

	private int speed;
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int move() {
		return getSpeed() + 30;
	}
}
