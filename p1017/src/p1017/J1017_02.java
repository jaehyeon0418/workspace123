package p1017;

import java.util.Scanner;

public class J1017_02 {

	public static void main(String[] args) {
		
		// 입력한 숫자를 출력하는 무한반복 프로그램
//		String str ;//= scan.next();
		
		String choice = "";
		Scanner scan = new Scanner(System.in);

		
//		while(true) {
//			System.out.println("숫자를 입력하세요.(x,종료");
//			str = scan.next();
//			char ch = str.charAt(0);
//			if(ch=='x') {
//				System.out.println("프로그램 종료");
//				break ;
//			} else System.out.println(choice); //0 종료
//			
//			
//		}
		
		
		// x를 입력받아 프로그램 종료 시키기
		// 정답
//		while(true) {
//			System.out.println("숫자를 입력하세요.(x,종료");
//			choice = scan.next();
//			if(choice.charAt(0)=='x') {
//				System.out.println("프로그램 종료");
//				break ;
//			} else System.out.println(choice); //0 종료			
//		}
		
		// 알파벳 영문 소문자 입력시 종료
		// 정답
		while(true) {
			System.out.println("숫자를 입력하세요.(알파벳 영문 소문자 입력시 종료");
			choice = scan.next();
			if(choice.charAt(0)>='a' && choice.charAt(0)<='z') {
				System.out.println("프로그램 종료");
				break ;
			} else System.out.println(choice); //0 종료
		
		}
		
		
		
		
		
		
		
		// 1~100까지 3의 배수만 출력하세요
		
//		
//		int [] num = new int [100];
//
//		for (int i = 1; i < 100; i++) {
//			if(i%3==0)
//			System.out.println(i);
//		}
		
		
		
		
		

	}

}
