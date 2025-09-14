package ch2;

import java.util.Scanner;

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
		
		System.out.println("===========");
		System.out.print("숫자를 입력해 주세요: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		
		System.out.println("===========");
		// 배열 Array: 여러 개의 값을 한 번에 저장한 변수, 인덱스를 가짐
		// 한 번 크기를 정하면 변경할 수 없고 같은 자료형만 저장 가능
		// 자료형[] 배열명 = { }; OR 자료형[] 배열명 = new 자료형[크기];
		// 읽는 방식: 배열명[인덱스번호]
		// .length: 배열이나 문자열의 길이, 크기, 갯수를 알려주는 속성
		int[] nums = { 3, 5, 7, 9 };
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
