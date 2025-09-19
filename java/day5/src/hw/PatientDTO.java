package hw;

public class PatientDTO {

	String id;
	String p_name;
	String a_name;
	int age;
	int phone;
	
	public PatientDTO() {}

	public PatientDTO(String id, String p_name, String a_name, int age, int phone) {
		super();
		this.id = id;
		this.p_name = p_name;
		this.a_name = a_name;
		this.age = age;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getA_name() {
		return a_name;
	}

	public void setA_name(String a_name) {
		this.a_name = a_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "아이디: " + id + ", 보호자명: " + p_name + ", 동물명: " + a_name + ", 나이: " + age + ", 연락처: "
				+ phone;
	}
	
	
}
