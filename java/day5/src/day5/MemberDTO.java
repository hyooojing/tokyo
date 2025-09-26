package day5;

/*
	요구사항
	
	회원정보: 이름, 아이디, 이메일
	기능:
		회원 등록(입력)
		전체 회원 조회(출력)
		프로그램 종료
 */

public class MemberDTO {
	
	String name;
	String id;
	String email;
	
	public MemberDTO() {}

	public MemberDTO(String name, String id, String email) {
		//super();
		this.name = name;
		this.id = id;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "이름: " + name + ", 아이디: " + id + ", 이메일: " + email;
	}
}
