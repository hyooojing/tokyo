package ch2;

import java.util.Scanner;


public class Deposit {

	public static void main(String[] args) {
		
		boolean run = true;      
        int balance = 0;
        Scanner sc = new Scanner(System.in);
        
        while (run) {
        	System.out.println("-----------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-----------------------------------");
            System.out.println("선택> ");
            
            int num = sc.nextInt();
            
        	switch (num) {
	            case 1:
	            	System.out.print("입금액을 입력하세요: ");
	            	int deposit = sc.nextInt();
	            	if (deposit < 0) {
	            		System.out.println("마이너스액은 입금할 수 없습니다.");
	            	} else {
	            		balance += deposit;
	            		System.out.println(deposit + "원 입금되었습니다");
	            	}
	            	break;
	            
	            case 2:
	            	System.out.print("출금액을 입력하세요: ");
	            	int withdraw = sc.nextInt();
	            	if (withdraw > balance) {
	            		System.out.println("출금액이 잔고보다 커서 출금할 수 없습니다.");
	            	} else if (withdraw <= 0){
	            		System.out.println("0원 초과의 출금액을 입력해 주세요");
	            	}
	            	else {
	            		System.out.println(withdraw + "원 출금되었습니다");
	            		balance -= withdraw;
	            	}
	            	break;
	            		
	            case 3:
	            	System.out.println("잔고: " + balance + "원");
	            	break;
	            	
	            case 4:
	            	run = false;
	            	break;
	            	
	            default:
	            	System.out.println("잘못된 입력입니다.");
        	}
        }
        System.out.println("프로그램을 종료.");
        sc.close();
	}

}
