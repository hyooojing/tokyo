package ch4;

import java.util.List;
import java.util.Scanner;

public class OrderService {

	private OrderDAO dao;
	private OrderDTO dto;
	Scanner sc = new Scanner(System.in);
	private static int idCounter = 1;
	private int nextId;

	// 파일에서 제일 큰 상품번호 구하기
	public OrderService(OrderDAO dao) {
		super();
		this.dao = dao;
		this.nextId = getId() + 1;
	}

	private int getId() {
		int max = 0;
		for (OrderDTO dto : dao.findAll()) {
			if (dto.getId() > max) {
				max = dto.getId();
			}
		}
		return max;
	}

	// 상품 추가 (csv 파일)
	public void saveAllItems(String name, int price, int qty, int current) {
		OrderDTO dto = new OrderDTO(nextId++, name, price, qty, current);
		dao.save(dto);
	}

	// 아이템 저장 (콘솔)
	public void addItem(String name, int price, int qty, int current) {
		OrderDTO dto = new OrderDTO(idCounter++, name, price, qty, current);
		dao.save(dto);
	}

	// 상품 합계
	/*
	 * public int getTotal() { List<OrderDTO> order = getAllItem(); if
	 * (order.isEmpty()) return 0; int total = 0; for (OrderDTO dto : order) { total
	 * += dto.getTotal(); } return total; }
	 */

	// 전체 상품 조회
	public List<OrderDTO> getAllItem() {
		return dao.findAll();
	}

	// 개별 상품 조회
	public OrderDTO getItemById(int p_id) {
		return dao.findById(p_id);
	}

	// 개별 상품 삭제
	public boolean removeItem(int p_id) {
		OrderDTO item = dao.findById(p_id);
		if (item == null) {
			return false;
		}
		boolean result = dao.delete(item);
		if (result) {
			dao.writeCsv();
		}
		return result;
	}

	// 개별 상품 수정
	public boolean modifyItem(OrderDTO item, String name, int price, int qty, int current) {
		boolean result = dao.updateProduct(item, name, price, qty, current);
		if (result) {
			dao.writeCsv();
		}
		return result;
	}

	// 상품 상태 현황 체크
	public boolean checkEmptyList() {
		return dao.findAll().isEmpty();
	}
}
