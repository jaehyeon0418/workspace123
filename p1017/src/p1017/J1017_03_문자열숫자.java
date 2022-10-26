package p1017;

import java.util.Scanner;

public class J1017_03_문자열숫자 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String choice = "";
		
		char ch = ' ' , ch1 =' ';
		
		
		System.out.println("2자리 숫자를 입력하세요.(예:27)>>");
		// 27 -> 2+7=9 , // 35 -> 3+5=8		
		choice = scan.next();           // String = charAt() -> '0'
		ch = choice.charAt(0);			// 2 / num = integer.parseInt(choice);
		ch1 = choice.charAt(1);
		
		System.out.println(ch);			
		System.out.println(ch1);
		System.out.println("더하기 : "+(ch)+(ch1)); // 아스키코드 0:48 1:49 2:50.....................
		 
		
		System.out.println("2자리 숫자를 더한 값");
		System.out.println((ch-'0')+(ch1-'0'));
		
		
		
		
		
		
		
		
		
		
//		char ch1 = choice.charAt(0);
//		char ch2 = choice.charAt(1);
		
		
//		System.out.println((ch1-'0')+(ch2-'0'));
								
		
		
		
		
		
//		int choice = 0;
//		System.out.println("숫자를 입력하세요");
//		choice = scan.nextInt();
//		System.out.println(choice);
//		
//		if(choice!=3) {
//			System.out.println("제대로 입력했습니다.");
//		} else {
//			System.out.println("잘못입력했습니다.");
//		}
		
		
		
		
//		String choice = "";
//		System.out.println("Yes를 입력하세요");
//		choice = scan.next();
////		if (choice.equals("Yes") || choice.equals("yes") ) {
//			if (choice.equalsIgnoreCase(choice)) { //yes Yes YEs YES 상관없이 다 됨
//			System.out.println("Yes가 입력되었습니다.");
//			} else {
//				System.out.println("Yes가 입력되지 않았습니다.");
//			}
		
		
		

	}

}
