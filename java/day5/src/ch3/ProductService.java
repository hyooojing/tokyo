package ch3;

import java.util.List;
import java.util.Scanner;

public class ProductService {
	
	private ProductDAO dao;
	Scanner sc = new Scanner(System.in);
	// 상품 아이디(자동카운트)
	private static int idCounter = 1;
	
	public ProductService(ProductDAO dao) {
		super();
		this.dao = dao;
	}
	
	// 상품 저장
	public void addProduct(String name, int qty, int price) {
		ProductDTO dto = new ProductDTO(idCounter++, name, qty, price);
		dao.save(dto);
	}
	
	// 전체 상품 조회
	public List<ProductDTO> getAllProduct() {
		return dao.findAll();
	}
	
	// 상품 합계
	public int getTotal() {
		List<ProductDTO> product = getAllProduct();
		if (product.isEmpty())
			return 0;
		int total = 0;
		for(ProductDTO dto: product) {
			total += dto.getTotal();
		}
		return total;
	}

	// 개별 상품 조회
	public ProductDTO getProductById(int p_id) {
		// 저장된 상품이 하나도 없을 때
		if (dao.findAll().isEmpty()) {
			System.out.println("저장된 상품이 없습니다");
			return null;
		}
		
		ProductDTO product = dao.findById(p_id);
		// 해당 아이디의 상품이 없을 떄
		if (product == null) {
            System.out.println("해당 ID의 상품이 없습니다: " + p_id);
        }
        return product;
	}

	// 개별 상품 삭제
	public void removeProduct(int p_id) {
		ProductDTO product = dao.findById(p_id);

	    if (dao.delete(product)) {
		    System.out.println("상품명: " + product.getName() +" 삭제 완료");
	    } else {
	    	System.out.println("해당 ID의 상품이 없습니다: " + p_id);	    
	    }
	}

	// 개별 상품 수정
	public void modifyProduct(int m_id) {
		ProductDTO product = dao.findById(m_id);

	    if (product == null) {
	    	System.out.println("해당 ID의 상품이 없습니다: " + m_id);
	    	return;
	    }
	    
		System.out.print("수정할 상품명("+ product.getName() + "): ");
		String name = sc.next();
		System.out.print("수정할 수량(" + product.getQty() + "): ");
		int qty = sc.nextInt();
		System.out.print("수정할 가격(" + product.getPrice() +"): ");
		int price = sc.nextInt();
		
		if (dao.updateProduct(product, name, qty, price)) {
			System.out.println("상품 수정 완료: " + product.getName());
		} else {
			System.out.println("상품 수정 실패");
		}		
	}

}
