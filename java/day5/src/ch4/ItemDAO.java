package ch4;

import java.util.ArrayList;
import java.util.List;

public class ItemDAO {

	List<ItemDTO> itemList = new ArrayList<>();
	
	// 상품 저장
	public void save(ItemDTO dto) {
		itemList.add(dto);
	}
	
	// 전체 상품 목록 반환
	public List<ItemDTO> findAll() {
		return itemList;
	}

	// 개별 상품 목록 반환
	public ItemDTO findById(int p_id) {
		for (ItemDTO dto : itemList) {
			if (dto.getId() == p_id)
				return dto;
		}
		return null;
	}
	
	// 개별 상품 삭제
	public boolean delete(ItemDTO product) {
		return itemList.remove(product);
	}
	
	// 개별 상품 수정
	public boolean updateProduct(ItemDTO product, String name, int qty, int price) {
	    if (product == null) 
	    	return false;
	    
	    product.setName(name);
	    product.setQty(qty);
	    product.setPrice(price);
	    return true;
	}
}
