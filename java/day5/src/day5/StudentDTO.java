package day5;

/*
	학생 관리 프로그램
	이름, 학번, 학과, 나이
	
	등록
	조회
	프로그램 종료
 */
public class StudentDTO {

	String name;
	int studentId;
	String major;
	int age;
	
	public StudentDTO() {}

	public StudentDTO(String name, int studentId, String major, int age) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.major = major;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "이름: " + name + ", 학번: " + studentId + ", 전공: " + major + ", 나이: " + age;
	}
}
