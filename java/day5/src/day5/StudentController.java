package day5;

import java.util.List;
import java.util.Scanner;

public class StudentController {
	Scanner sc = new Scanner(System.in);
	
	private StudentService service;

	public StudentController(StudentService service) {
		this.service = service;
	}
	
	public void run() {
		
		while(true) {
			System.out.println("번호입력:1-등록, 2-조회, 0-프로그램 종료");
			int q = sc.nextInt();
			
			switch (q) {
			case 1:
				System.out.println("이름: ");
				String name = sc.next();
				System.out.println("학번: ");
				int id = sc.nextInt();
				System.out.println("전공: ");
				String major = sc.next();
				System.out.println("나이: ");
				int age = sc.nextInt();
				
				service.addStudent(name, id, major, age);
				System.out.println("학생 등록 완료!");
				break;
			case 2:
				showStudent();
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;	// 즉시 종료
			default:
				System.out.println("숫자만 입력하세요");
			}
		}
	}
	
	void showStudent() {
		List<StudentDTO> std = service.getAllStudent();
		
		for(StudentDTO dto : std) {
			System.out.println(dto);
		}
	}
}
