package p1018;

import java.util.Scanner;

public class J1018_02_성적프로그램 {

	public static void main(String[] args) {
		//
		Scanner scan = new Scanner(System.in);
		int choice = 0;
//		int [] kor = new int [];
		
		
		loop: while (true) {

			System.out.println("[ 성적관리 프로그램 ]");
			System.out.println("[ 1.성적 입력 ]");
			System.out.println("[ 2.성적 수정 ]");
			System.out.println("[ 3.학생 검색 ]");
			System.out.println("[ 4.등수 처리 ]");
			System.out.println("[ 5.성적 출력 ]");
			System.out.println("[ 0.프로그램 종료 ]");
			System.out.println("[ -------------------------- ]");
			System.out.println("[ 원하는 번호를 입력하세요. ]");
			choice = scan.nextInt();

			// 비교 switch
			switch (choice) {

			case 1:
				System.out.println("[[ 성적입력 ]]");
				break;
			case 2:
				System.out.println("[[ 성적수정 ]]");
				
				break;
			case 3:
				System.out.println("[[ 학생검색 ]]");
				 
				break;
			case 0:
				System.out.println("[[프로그램 종료]]");
				break loop; // 빠져나오는
			case 4:

				break;
			}

		} // while

	}// main

}// class
