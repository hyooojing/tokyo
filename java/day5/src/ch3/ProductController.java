package ch3;

import java.util.List;
import java.util.Scanner;

public class ProductController {

	Scanner sc = new Scanner(System.in);
	private ProductService service;

	public ProductController(ProductService service) {
		super();
		this.service = service;
	}

	public void run() {

		while (true) {
			System.out.println("====================================================================================");
			System.out.println("번호 입력: 1-상품등록, 2-전체상품조회, 3-개별상품조회, 4-상품정보삭제, 5-상품정보수정, 6-상품분석, 0-종료");
			int q = sc.nextInt();
			sc.nextLine(); // 버퍼 정리

			switch (q) {
			case 1:
				addProduct();
				break;

			case 2:
				outAllProduct();
				break;

			case 3:
				outProduct();
				break;

			case 4:
				removeProduct();
				break;

			case 5:
				modifyProduct();
				break;

			case 6:
				analProduct();
				break;

			case 0:
				System.out.println("프로그램 종료");
				return;

			default:
				System.out.println("지정된 번호만 입력하세요.");
			}
		}
	}

	// 1) 상품추가
	private void addProduct() {
		// System.out.println("상품 아이디");
		// int id = sc.nextInt();
		System.out.println("상품명");
		String name = sc.next();
		System.out.println("상품수량");
		int qty = sc.nextInt();
		System.out.println("상품가격");
		int price = sc.nextInt();

		service.addProduct(name, qty, price);
	}

	// 2) 전체 상품출력
	private void outAllProduct() {
		List<ProductDTO> products = service.getAllProduct();
		if (products.isEmpty()) {
			System.out.println("저장된 데이터가 없습니다.");
		} else {
			for (ProductDTO dto : products) {
				System.out.println(dto);
			}
		}
	}

	// 3) 지정 상품출력
	private void outProduct() {
		System.out.println("조회를 원하는 상품 번호를 입력해 주세요");
		int p_id = sc.nextInt();
		ProductDTO product = service.getProductById(p_id);
		if (product != null)
			System.out.println(product);
	}

	// 4) 지정 상품삭제
	private void removeProduct() {
		System.out.println("삭제를 원하는 상품 번호를 입력해 주세요");
		int r_id = sc.nextInt();
		service.removeProduct(r_id);

	}

	// 5) 지정 상품수정
	private void modifyProduct() {
		System.out.println("수정를 원하는 상품 번호를 입력해 주세요");
		int m_id = sc.nextInt();
		service.modifyProduct(m_id);
	}

	// 6) 상품분석
	private void analProduct() {
		int productCnt = service.getAllProduct().size();
		int productTotal = service.getTotal();
		System.out.println("등록된 전체 상품 수는 " + productCnt + "개 입니다.");
		System.out.println("등록된 전체 상품의 합계는 " + productTotal + "원 입니다.");
	}

}
