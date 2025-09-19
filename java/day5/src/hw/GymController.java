package hw;

import java.util.List;
import java.util.Scanner;

public class GymController {
	
	Scanner sc = new Scanner(System.in);
	private GymService service;

	public GymController(GymService service) {
		this.service = service;
	}
	
	public void run() {
		
		while(true) {
			System.out.println("번호입력:1-등록, 2-조회, 0-프로그램 종료");
			int q = sc.nextInt();
			
			switch (q) {
			case 1:
				System.out.println("회원이름: ");
				String name = sc.next();
				System.out.println("회원번호: ");
				int num = sc.nextInt();
				System.out.println("기준칼로리: ");
				int basic = sc.nextInt();
				System.out.println("소비칼로리: ");
				int kcal = sc.nextInt();
				
				service.addMember(name, num, basic, kcal);
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
		List<GymDTO> member = service.getAll();
		
		for(GymDTO dto : member) {
			System.out.println(dto);
		}
	}
}
