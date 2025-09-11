package ch1;

import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		
		// Random 랜덤 도구 객체 설정
		Random random = new Random();
		int result = random.nextInt(2);	// 0~2 전까지 값 중 하나
		if (result == 0) {
			System.out.println("등교");
		} else {
			System.out.println("자휴");
		}
	}

}
