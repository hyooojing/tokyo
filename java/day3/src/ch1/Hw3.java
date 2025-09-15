package ch1;

import java.util.Random;
import java.util.Scanner;

public class Hw3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 총 치킨 조각 
		System.out.print("치킨 몇 마리를 주문할까요? ");
		int n = sc.nextInt();
		int rslt = chicken(n);
		System.out.println("결과는: " + rslt);
		System.out.println("====================");
		
		// 2. 총 카페인 함량
		System.out.print("오늘 몇 잔의 커피를 마셨나요? ");
		int coffee = sc.nextInt();
		int rslt2 = caffeine(coffee);
		System.out.println("결과는: " + rslt2);
		System.out.println("====================");
		
		// 3. 총 칼로리
		System.out.print("오늘 몇 개의 삼각김밥을 먹었나요? ");
		int n3 = sc.nextInt();
		int rslt3 = kcal(n3);
		System.out.println("결과는: " + rslt3);
		System.out.println("====================");
		
		// 4. 연애 성공 확률
		System.out.print("내 이름 입력: ");
		String name1 = sc.next();
		System.out.print("상대 이름 입력: ");
		String name2 = sc.next();
		System.out.println(name1 +"와/과 " + name2 + "의 연애 성공 확률: " + love() + "%");
		System.out.println("====================");
		
		// 5. 메뉴 추천
		System.out.println("오늘의 추천 메뉴는 " + menu());
		System.out.println("====================");
		
		// 6. 점수에 해당하는 등급 반환
		System.out.print("점수를 입력해 주세요: ");
		int score = sc.nextInt();
		System.out.println("등급은 " + grade(score));
		System.out.println("====================");
		
		// 7.총 급여 반환
		System.out.print("시급을 입력해 주세요: ");
		int money = sc.nextInt();
		System.out.print("일한 시간을 입력해 주세요: ");
		int hours = sc.nextInt();
		System.out.println("총 급여는 " + salary(money, hours));
		System.out.println("====================");
		
	}
	
	public static int chicken(int n) {
		return n * 8;
	}
	
	public static int caffeine(int coffee) {
		return coffee * 80;
	}
	
	public static int kcal(int n) {
		return n * 200;
	}
	
	public static int love() {
		Random random = new Random();
		return random.nextInt(101);
	}
	
	public static String menu() {
		Random random = new Random();
		String menu = "";
		int recommend = random.nextInt(4);
		if (recommend == 0)
			menu = "김밥";
		else if (recommend == 1)
			menu = "라면";
		else if (recommend == 2)
			menu ="파스타";
		else
			menu = "샐러드";
		return menu;
	}
	
	public static String grade(int score) {
		String grade;
		if (score <= 100 && score > 80) {
			grade = "A";
		} else if (score <= 80 && score > 60) {
			grade = "B";
		} else if (score <= 60 && score > 40) {
			grade = "C";
		} else if (score <= 40 && score > 20) {
			grade = "D";
		} else {
			grade = "F";
		}
		return grade;
	}
	
	public static int salary(int money, int hours) {
		return money * hours;
	}

}
