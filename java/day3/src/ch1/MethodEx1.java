package ch1;

public class MethodEx1 {

	// 돌려주는 값이 없는 경우, 기본
	public static void sayHello() {
		System.out.println("Hello, Java!");
	}
	
	// 매개변수가 있는 메서드
	public static void getName(String name) {
		System.out.println("안녕, " + name);
	}
	
	// void
	public static void printSum(int a, int b) {
		System.out.println("void: " + a + b);
	}
	
	// return
	public static double getSum(double a, double b) {
		return a + b;
	}
	
	public static boolean isAdult(int age) {
		return age > 18;
	}
	
	// 오버로딩
	// 같은 이름으로 매개변수만 다르게 여러 메서드를 정의하는 것
	public static int calc(int a, int b, int c) {
		return a + b + c;
	}
	
	public static double calc(double a, double b) {
		return a + b;
	}
	
	// 메서드 호출 (main 메서드)
	public static void main(String[] args) {
		// 실행
		sayHello();
		
		// 매개변수로 이름을 받음
		getName("한라봉");
		getName("진지향");
		getName("윈터프린스");
		
		// void와 return의 차이
		printSum(6, 9);
		double result = getSum(2.5, 3.677);
		System.out.println("return: " + result);
		
		// 성인 인증, return
		boolean total = isAdult(20); // 성인: true
		System.out.println(total);
		
		// 오버로딩
		System.out.println(calc(2, 2, 2));
		System.out.println(calc(1.2, 3.333));
	}

}
