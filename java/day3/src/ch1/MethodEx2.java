package ch1;

public class MethodEx2 {

	public static void main(String[] args) {
		// 컵라면 칼로리 계산 메서드
		int kcal = cupRamen(3);
		System.out.println("총 칼로리는 " + kcal);
		
		// 컵라면 계산 메서드
		int price = pay(1500, 11);	// 결과값 계산
		System.out.println("총 가격은 " + price);

	}
	
	public static int cupRamen(int num) {
		return 500 * num;
	}
	
	public static int pay(int price, int num) {
		return price * num;
	}

}
