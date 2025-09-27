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

	// 상품 분석
	private void outReport() {
		int itemCnt = service.getAllItem().size();
		int itemTotal = service.getTotal();
		System.out.println("등록된 전체 상품 수는 " + itemCnt + "개 입니다.");
		System.out.println("등록된 전체 상품의 합계는 " + itemTotal + "원 입니다.");
	}

	// 상품 수정
	private void updateItems() {
	    if (service.checkEmptyList()) {
	        System.out.println("저장된 상품이 없습니다.");
	        return;
	    }
	    
		System.out.println("수정를 원하는 상품 번호를 입력해 주세요");
		int m_id = sc.nextInt();
	    
	    ItemDTO item = service.getItemById(m_id);
	    System.out.print("수정할 상품명("+ item.getName() + "): ");
	    String name = sc.next();
	    System.out.print("수정할 수량(" + item.getQty() + "): ");
	    int qty = sc.nextInt();
	    System.out.print("수정할 가격(" + item.getPrice() +"): ");
	    int price = sc.nextInt();

	    if (service.modifyItem(item, name, qty, price)) {
	        System.out.println("상품 수정 완료: " + name);
	    } else {
	        System.out.println("상품 수정 실패");
	    }
	}

	// 상품 삭제
	private void deleteItems() {
	    if (service.checkEmptyList()) {
	        System.out.println("저장된 상품이 없습니다.");
	        return;
	    }
		 
	    System.out.println("삭제할 상품 번호를 입력해 주세요");
	    int r_id = sc.nextInt();
	    boolean removed = service.removeItem(r_id);
	    if (removed) {
	        System.out.println("삭제 완료: " + r_id);
	    } else {
	        System.out.println("해당 ID의 상품이 없습니다: " + r_id);
	    }
	}

	// 개별 상품 조회
	private void outItemsById() {
		// 상품 하나도 없을 때
	    if (service.checkEmptyList()) {
	        System.out.println("저장된 상품이 없습니다.");
	        return;
	    }
	    
		System.out.println("조회할 상품 번호를 입력해 주세요");
		int p_id = sc.nextInt();
		ItemDTO item = service.getItemById(p_id);
		if (item != null) {
			System.out.println(item);
		} else {
	        System.out.println("해당 ID의 상품이 없습니다: " + p_id);
		}
	}

	// 상품 추가
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

	// 전체 상품 조회
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
