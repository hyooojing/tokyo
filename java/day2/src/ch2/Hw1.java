package ch2;

import java.util.Random;
import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {

		
		// 1.치킨 주문 알림기
		Scanner sc = new Scanner (System.in);
		System.out.print("치킨을 주문해 주세요(마리): ");
		int n1 = sc.nextInt();
		
		for (int i = 1; i <= n1; i++) {
			System.out.println("치킨 " + i + "마리 주문이요");
		}
		
		// 2.스쿼트 계산기
		System.out.println("====================");
		System.out.print("스쿼트 몇 번 할까요?: ");
		int n2 = sc.nextInt();
		
		for (int i = 1; i <= n2; i++) {
			System.out.println("스쿼트 " + i + "회 완료");
		}
		System.out.println("오늘 운동 끝");
		
		// 3.입력 받은 수의 짝수만 출력하는 계산기
		System.out.println("====================");
		System.out.print("숫자를 입력해 주세요: ");
		int num = sc.nextInt();
		if (num % 2 == 0)
			System.out.println(num);
		
		// 4.두 수를 입력 받아 그 사이 숫자 모두 출력
		System.out.println("====================");
		System.out.print("첫번째 숫자를 입력하세요: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요: ");
		int num2 = sc.nextInt();
		
		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
		}
		
		// 5.구구단 3단 출력
		System.out.println("====================");
		for (int i = 1; i <= 9; i++) {
			System.out.println("3 * " + i + " = " + (3 * i));
		}
		
		// 6.입력한 수로 구구단을 만드세요
		System.out.println("====================");
		System.out.print("구구단 몇 단을 출력할까요?: ");
		int dan = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		
		// 7.입력한 숫자가 3의 배수일 때만 "점프!" 출력, 아니면 "패스")
		System.out.println("====================");
		System.out.print("숫자를 입력해 주세요: ");
		int n3 = sc.nextInt();
		
		if (n3 % 3 == 0)
			System.out.println("점프!");
		else 
			System.out.println("패스!");
		
		// 8.입력한 숫자 * 입력한 숫자 크기의 별 출력
		System.out.println("====================");
		System.out.print("숫자를 입력해 주세요: ");
		int n4 = sc.nextInt();
		for (int i = 0; i < n4; i++) {
			for (int j = 0; j < n4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 9. 피자 몇 조각?
		System.out.println("====================");
		System.out.print("피자는 몇 조각? : ");
		int pizza = sc.nextInt();
		System.out.print("사람은 몇 명?: ");
		int person = sc.nextInt();
		
		System.out.println("한 사람 당 " + (pizza / person) + "조각 가능!");
		System.out.println("남은 조각은 " + (pizza % person) + "조각!");
		

		// 10. 주사위 결과
		System.out.println("====================");
		Random random = new Random();
		int rslt1 = random.nextInt(6) + 1;
		System.out.println("첫번째 주사위 값: " + rslt1);
		int rslt2 = random.nextInt(6) + 1;
		System.out.println("두번째 주사위 값: " + rslt2);
		System.out.println("두 수의 합: " + (rslt1 + rslt2));
		
		
		// 11.랜덤 숫자 맞추기
		System.out.println("====================");
		int secretNum = random.nextInt(50) + 1;
		int n5;
		
		do {
			System.out.print("숫자를 입력해 주세요: ");
			n5 = sc.nextInt();
			if (n5 > secretNum) 
				System.out.println("DOWN!");
			else if (n5 < secretNum)
				System.out.println("UP!");
		} while (n5 != secretNum);
		System.out.println("정답입니다!");
	}

}
