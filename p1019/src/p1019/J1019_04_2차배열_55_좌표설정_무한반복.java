package p1019;

import java.util.Scanner;

public class J1019_04_2차배열_55_좌표설정_무한반복 {

	public static void main(String[] args) {
		// 5,5 배열 생성 1~25 의 숫자를 랜덤으로 입력하고 출력하세요

		int[] num = new int[25];
		// num 배열 1~25 번호 넣기
		for (int i = 0; i < 25; i++) {
			num[i] = i + 1;
		}

		int[][] score = new int[5][5];
		int temp = 0;
		int random = 0;
		int input1 = 0;
		int input2 = 0;

		// num 배열 번호 섞기
		for (int i = 0; i < 500; i++) {
			random = (int) (Math.random() * 25);
			temp = num[0];
			num[0] = num[random];
			num[random] = temp;
		} // for

		// 2차원 score배열 번호넣기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				score[i][j] = num[5 * i + j];
//				score[i][j] = 5 * i + j + 1;
			} //for
		} //for
		
		//무한반복
		while (true) {

			// 번호를 입력
			Scanner scan = new Scanner(System.in);
			System.out.println("좌표를 입력하세요(0~4까지)");
			input1 = scan.nextInt();
			input2 = scan.nextInt();
			System.out.printf("좌표 : %d,%d \n", input1, input2); // 예 1 1
			System.out.println();

			// 2차원 score 배열 변경
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (i == input1 && j == input2) {
						score[i][j] = 0;
					} // if
				} // for
			} // for
			System.out.println();

			// 2차원 score 배열 5*5로 출력하기
			
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					System.out.printf("%d\t", score[i][j]);
				} // for
				System.out.println();
			} // for
		} // while

//		// 2차원 score 배열 5*5로 출력하기
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if ( i == input1 && j == input2) {
//
//					System.out.printf("%s\t", "X" );
//				} else {
//
//					System.out.printf("%d\t", score[i][j]);
//				}
//			} // for
//			System.out.println();
//		} // for

//////////////////////////////////////////////////////
// 출역 예   j[0]	 	j[1] 	j[2] 	j[3] 	j[4]	//
//	 i[0]	14		7		11		13		21		//
//	 i[1]	1		X		16		4		5		//
//	 i[2]	22		24		18		12		8		//
//	 i[3]	9		25		10		17		23		//
//	 i[4]	2		19		6		3		15		//
//////////////////////////////////////////////////////

	} // main

} // class
