package ch1;

public class Pizza {
	String type;
	String size;
	
	public Pizza(String type, String size) {
		super();
		this.type = type;
		this.size = size;
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
}
