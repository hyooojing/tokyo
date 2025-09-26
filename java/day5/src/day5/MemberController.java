package day5;

import java.util.List;
import java.util.Scanner;

// 사용자가 입/출력 제어
public class MemberController {
	
	Scanner sc = new Scanner(System.in);
	
	private MemberService service;

	public MemberController(MemberService service) {
		this.service = service;
	}
	
	public void run() {
		
		while(true) {
			System.out.println("번호입력:1-회원입력, 2-회원출력, 0-프로그램 종료");
			int q = sc.nextInt();
			
			switch (q) {
			case 1:
				System.out.println("이름: ");
				String name = sc.next();
				System.out.println("아이디: ");
				String id = sc.next();
				System.out.println("이메일: ");
				String email = sc.next();
				
				service.addMember(name, id, email);
				System.out.println("회원 등록 완료!");
				break;
			case 2:
				showMember();
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;	// 즉시 종료
			default:
				System.out.println("숫자만 입력하세요");
			}
		}
	}
	
	void showMember() {
		List<MemberDTO> member = service.getAllMember();
		
		/*
		for (int i = 0; i < member.size(); i++) {
			MemberDTO dto = member.get(i);
			System.out.println(dto);
		}
		
		for(타입 변수명 : 컬렉션이나 배열) {
			실행문
		}
		*/
		
		for(MemberDTO dto : member) {
			System.out.println(dto);
		}
	}
}
