package ch1;

import java.util.Scanner;

public class Basic1 {

	public static void main(String[] args) {
		//System.out.println("안녕?");
		boolean result = (3 == 7) || (6 < 2);
		System.out.println(result);
		
	    int rslt = 7 % 4;
	    System.out.println(rslt);
	    
	    boolean isWeekend = false;
	    
	    String password = "a1234";
	   
	    Scanner sc = new Scanner (System.in);
	    String userPw = sc.nextLine();
	    
	    /* if (userPw.equals(password))
	        System.out.println("비밀번호가 맞습니다.");
	    else 
	        System.out.println("비밀번호가 틀렸습니다."); */

	   switch (userPw) {
	   case "a1234":
		   System.out.println("비밀번호가 맞습니다.");
		   break;
	   default:
		   System.out.println("비밀번호가 틀렸습니다.");
	   }
	   
	   System.out.println("Hello Java");
	   
	   double score = 88.5;
	   
	   System.out.println(7 % 4);
	   
	   int num = sc.nextInt();
	   for (int i = 1; i <= num; i++) {
		   if (i % 2 == 0)
			   System.out.println(i);
	   }

	}

}
