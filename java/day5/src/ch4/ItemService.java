package ch4;

import java.util.List;
import java.util.Scanner;

public class ItemService {

	private ItemDAO dao;
	Scanner sc = new Scanner(System.in);
	private static int idCounter = 1;
	
	public ItemService(ItemDAO dao) {
		super();
		this.dao = dao;
	}
	
	// 아이템 저장
	public void addItem(String name, int qty, int price) {
		ItemDTO dto = new ItemDTO(idCounter++, name, qty, price);
		dao.save(dto);
	}
	
	// 상품 합계
	public int getTotal() {
		List<ItemDTO> item = getAllItem();
		if (item.isEmpty())
			return 0;
		int total = 0;
		for(ItemDTO dto : item) {
			total += dto.getTotal();
		}
		return total;
	}
	
	// 전체 상품 조회
	public List<ItemDTO> getAllItem() {
		return dao.findAll();
	}
	
	// 개별 상품 조회
	public ItemDTO getItemById(int p_id) {
		return dao.findById(p_id);
	}
	
	// 개별 상품 삭제
	public boolean removeItem(int p_id) {
	    ItemDTO item = dao.findById(p_id);
	    if (item == null) {
	        return false;
	    }
	    return dao.delete(item);
	}
	
	// 개별 상품 수정
	public boolean modifyItem(ItemDTO item, String name, int qty, int price) {
	    return dao.updateProduct(item, name, qty, price);		
	}
	
	// 상품 상태 현황 체크
	public boolean checkEmptyList() {
	    return dao.findAll().isEmpty();
	}

}
