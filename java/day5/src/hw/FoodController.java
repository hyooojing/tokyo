package hw;

import java.util.List;
import java.util.Scanner;

public class FoodController {
	
	Scanner sc = new Scanner(System.in);
	private FoodService service;

	public FoodController(FoodService service) {
		this.service = service;
	}
	
	public void run() {
		
		while(true) {
			System.out.println("번호입력:1-등록, 2-조회, 0-프로그램 종료");
			int q = sc.nextInt();
			
			switch (q) {
			case 1:
				System.out.println("식자재번호: ");
				int num = sc.nextInt();
				System.out.println("식자재명: ");
				String name = sc.next();
				System.out.println("수량: ");
				int cnt = sc.nextInt();
				System.out.println("날짜: ");
				String date = sc.next();
				
				service.addFood(num, name, cnt, date);
				System.out.println("식자재 등록 완료!");
				break;
			case 2:
				showFoods();
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;	// 즉시 종료
			default:
				System.out.println("숫자만 입력하세요");
			}
		}
	}
	
	void showFoods() {
		List<FoodDTO> food = service.getAllFoods();
		
		for(FoodDTO dto : food) {
			System.out.println(dto);
		}
	}
}
