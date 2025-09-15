package ch2;

import java.util.Scanner;

/*
 	<반복문>
 	
 	초기값;
 	while(조건) {
 		실행문;
 		증감값;
 	}
 	
 	
 */

public class WhileEx1 {

	public static void main(String[] args) {
		int num = 1;
		/*
		while (num <= 5) {
			System.out.println(num);
			num++;
		}
		
		num = 1;
		while (num <= 3) {
			System.out.println("빠잉~");
			num++;
		}
		
		num = 10;
		while (num >= 1) {
			System.out.println(num);
			num--;
		}
		*/
		
		num = 2;
		while (num <= 10) {
			System.out.println(num);
			num += 2;
		}
		
		num = 1;
		int rslt = 0;
		while (num <= 5) {
			rslt += num;
			num++;
		}
		System.out.println("합계: " + rslt);

		System.out.println("==============");
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요: ");
		int num2 = sc.nextInt();
		System.out.println("두 수의 합은: " + (num1 +num2));
		
		int count = 0;
		int sum = 0;
		// 한 번만 실행
		while(count < 1) {
			sum = num1 + num2;
			count++;
		}
		// 한 번 실행하면 count의 값이 1보다 커지므로 더이상 반복 X
		System.out.println(sum);
		sc.close();
		
	}

}
