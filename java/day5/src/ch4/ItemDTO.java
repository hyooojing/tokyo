package ch4;

/*
	<요구사향>
	아이템 번호(자동 조절), 아이템명, 수량, 가격, 합계
	1. 아이템 입력 (외부문서)
	2. 아이템 전체 조회
	3. 아이템 개별 조회
	4. 아이템 삭제
	5. 아이템 수정: 아이템명, 수량, 가격
	6. 통계
	7. 프로그램 종료
 */
public class ItemDTO {

	private int id;
	private String name;
	private int qty;
	private int price;
	private int total;
	
	public ItemDTO() {}
	
	public ItemDTO(int id, String name, int qty, int price) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
		this.total = price * qty;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
		setTotal();		
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
		setTotal();		
	}

	public int getTotal() {
		return total;
	}

	// 수량과 가격이 바뀔 때마다 자동 계산 필요
	private void setTotal() {
		this.total = this.qty * this.price;
	}

	private String formatMoney(int money) {
		return String.format("%,d원", money);
	}
	
	@Override
	public String toString() {
		// return "상품번호: " + id + ", 상품명: " + name + ", 상품수량: " + qty + ", 상품가격: " + price + ", 상품합계: " + total;
		return String.format("번호: %d, 상품명: %s, 수량: %d, 가격: %s, 합계: %s", id, name, qty, formatMoney(price), formatMoney(total));
	}
}
