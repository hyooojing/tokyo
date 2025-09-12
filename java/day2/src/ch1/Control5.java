package ch1;

import java.util.Scanner;

public class Control5 {

	public static void main(String[] args) {
		
		// 1~10까지의 정수 중 하나를 입력 받아 홀/짝수 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요(1-10): ");
		int num = sc.nextInt();
		
		if (!(num >= 1 && num <= 10))
			System.out.println("범위 내의 숫자를 입력해 주세요.");
		else if (num % 2 == 0)
			System.out.println("짝수입니다.");
		else
			System.out.println("홀수입니다.");

	}

}
