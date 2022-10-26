package p1017;

import java.util.Scanner;

public class J1017_04 {

	public static void main(String[] args) {
		//

		Scanner scan = new Scanner(System.in);
		int choice = 0;
		int[] num = new int[3];
		int total = 0;
		double avg = 0;
		String name = " ";

		String[] title = { "국어","영어","수학" };

		loop: while (true) {
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("0. 성적 출력");
			System.out.println("원하는 번호를 입력");
			choice = scan.nextInt();

//		if(choice == 1) {
//			System.out.println("성적입력 시작");
//		} else if (choice == 2) {
//			System.out.println("성적출력 시작");
//		}

			switch (choice) {
			case 1:
				System.out.println("성적입력 시작");

				// 이름 입력
				System.out.println("이름을 입력하세요.");
				name = scan.nextLine();
				scan.next();
				
				// 점수 입력 3번 반복
				for (int i = 0; i < 3; i++) {
					System.out.println(title[i] + "점수를 입력하세요"); // 국어점수 // 영어점수 // 수학점수 입력하세요
					num[i] = scan.nextInt(); // 점수입력
					total = total + num[i]; // 합계
				}
				break;
			case 2:
				System.out.println("성적출력 시작");
				break;
			case 0:
				System.out.println("프로그램 종료");
				break loop;
			}

		}
	}

}
