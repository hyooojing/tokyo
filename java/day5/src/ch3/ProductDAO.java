package ch3;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

	// 데이터 저장소
	List<ProductDTO> productList = new ArrayList<>();

	// 상품 저장
	public void save(ProductDTO dto) {
		productList.add(dto);
	}
	
	// 전체 상품 목록 반환
	public List<ProductDTO> findAll() {
		return productList;
	}

	// 개별 상품 목록 반환
	public ProductDTO findById(int p_id) {
		for (ProductDTO dto : productList) {
			if (dto.getId() == p_id)
				return dto;
		}
		return null;
	}

	// 개별 상품 삭제
	public boolean delete(ProductDTO product) {
		return productList.remove(product);
	}
	
	// 개별 상품 수정
	public boolean updateProduct(ProductDTO product, String name, int qty, int price) {
	    if (product == null) 
	    	return false;
	    
	    product.setName(name);
	    product.setQty(qty);
	    product.setPrice(price);
	    return true;
	}

	
}
