package ch2;

/*
 	for 반복문	
 	정해진 조건만큼 반복
 	
 	for (초기값; 조건식; 증감값) {
 		실행문;
 	}
 */

public class ForEx1 {

	public static void main(String[] args) {
		
		// 1~5까지 출력
		// i++ : 후위증가 연산자 1씩 증가
		// i-- : 후위감소
		// ++i : 전위증가 연산자
		// --i : 전위감소 연산자 1씩 감소
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			System.out.println(++i);
			System.out.println(i++);
			System.out.println(i);
		}
		
		System.out.println("===========");
		for (int i = 0; i < 3; i++) {
			System.out.println("빠잉~");
		}
		
		System.out.println("===========");
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		System.out.println("===========");
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
		
		System.out.println("===========");
		int rslt = 0;
		for (int i = 1; i <= 5; i++) {
			rslt += i;
		}
		System.out.println("합계: " + rslt);
	}

}
