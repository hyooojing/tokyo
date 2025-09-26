package test;

public class MemberMain {

	public static void main(String[] args) {
		
		Member member = new Member();
		
		member.setId("admin");
		member.setPassword("qwerty");
		member.setPoint(123);
		
		System.out.println(member.toString());

	}
}
