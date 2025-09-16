package ch1;

public class Hw1 {

	public static void main(String[] args) {
		
		// 1. 케데헌 아이돌객체 생성
		Idol idol = new Idol("루미", "보컬", "헌트릭스");
		
		// 2. 피자 정보 출력
		Pizza pizza = new Pizza("페퍼로니", "L");
		System.out.println("피자 종류는 " + pizza.getType() + ", 사이즈는 " + pizza.getSize());
		System.out.println("============================");
		
		// 3.Song 클래스
		Song song = new Song("Golden","헌트릭스");
		song.play();
		System.out.println("============================");
		
		// 4. InstagramPost
		InstagramPost insta = new InstagramPost("민지", "오늘 날씨 짱");
		System.out.println("작성자: " + insta.getWriter());
		System.out.println("내용: " + insta.getContents());
		System.out.println("============================");

		// 5. 음식 배달
		DeliveryOrder order = new DeliveryOrder("떡볶이", "기숙사");
		order.deliver();
	}

}
