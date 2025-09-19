package hw;

import java.util.List;
import java.util.Scanner;

public class PatientController {
	Scanner sc = new Scanner(System.in);
	
	private PatientService service;

	public PatientController(PatientService service) {
		this.service = service;
	}
	
	public void run() {
		
		while(true) {
			System.out.println("번호입력:1-등록, 2-조회, 0-프로그램 종료");
			int q = sc.nextInt();
			
			switch (q) {
			case 1:
				System.out.println("아이디: ");
				String id = sc.next();
				System.out.println("보호자명: ");
				String p_name = sc.next();
				System.out.println("반려동물명: ");
				String a_name = sc.next();
				System.out.println("나이: ");
				int age = sc.nextInt();
				System.out.println("연락처: ");
				int phone = sc.nextInt();
				
				service.addAnimal(id, p_name, a_name, age, phone);
				System.out.println("동물 등록 완료!");
				break;
			case 2:
				showPatient();
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;	// 즉시 종료
			default:
				System.out.println("숫자만 입력하세요");
			}
		}
	}
	
	void showPatient() {
		List<PatientDTO> animal = service.getAllAnimals();
		
		for(PatientDTO dto : animal) {
			System.out.println(dto);
		}
	}
}
