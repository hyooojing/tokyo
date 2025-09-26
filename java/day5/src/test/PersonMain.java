package test;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		Person[] person = new Person[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i ++) {
			person[i] = new Person();
			System.out.println("이름");
			String name = sc.next();
			person[i].setName(name);
			
			System.out.println("나이");
			int age = sc.nextInt();
			person[i].setAge(age);
			
			System.out.println("주소");
			String address = sc.next();
			person[i].setAddress(address);
		}
		
		System.out.println();
		for (int i = 0; i < person.length; i++) {
			System.out.println("이름: " + person[i].getName() + ", 나이: " + person[i].getAge() + ", 주소: " + person[i].getAddress());
		}

	}

}
