package day5;

public class MemberMain {

	public static void main(String[] args) {
		
		MemberDAO dao = new MemberDAO();
		MemberService memberService = new MemberService(dao);
		MemberController controller = new MemberController(memberService);
		
		controller.run();
	}

}
