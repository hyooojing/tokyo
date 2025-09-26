package ch4;

import java.util.List;
import java.util.Scanner;

public class ItemsController {

	Scanner sc = new Scanner(System.in);

	private ItemService service;

	public ItemsController(ItemService service) {
		this.service = service;
	}

	public void run() {

		while (true) {
			System.out.println("====================================================================================");
			System.out.println("번호 입력: 1-상품등록, 2-전체상품조회, 3-개별상품조회, 4-상품정보삭제, 5-상품정보수정, 6-상품분석, 0-종료");
			int q = sc.nextInt();

			switch (q) {
			case 1:
				addItems();
				break;
			case 2:
				outAllItems();
				break;
			case 3:
				outItemsById();
				break;
			case 4:
				deleteItems();
				break;
			case 5:
				updateItems();
				break;
			case 6:
				outReport();
				break;
			case 0:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("정해진 숫자만 입력하세요");
			}
		}
	}

	// 상품 분
	private void outReport() {
	
		
	}

	// 상품 수정
	private void updateItems() {
		
		
	}

	// 상품 삭제
	private void deleteItems() {
		
		
	}

	// 개별 상품 조회
	private void outItemsById() {
		
		
	}

	private void addItems() {
		System.out.println("상품명");
		String name = sc.next();
		System.out.println("상품수량");
		int qty = sc.nextInt();
		System.out.println("상품가격");
		int price = sc.nextInt();
		
		service.saveAllItems(name, qty, price);
		System.out.println("출력 완료");
		
	}

	private void outAllItems() {
		
		List<ItemDTO> list = service.getAllItem();
		
		if(list.isEmpty()) {
			System.out.println("등록된 상품이 없습니다.");
		} else {
			for(ItemDTO dto: list) {
				System.out.println(dto);
			}
		}
		
	}
}
