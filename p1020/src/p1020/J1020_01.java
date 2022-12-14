package p1020;

import java.util.Scanner;

public class J1020_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 배열 생성
		int[] num = new int[25];
		// 2차원 배열 생성
		int[][] score = new int[5][5];
		int temp = 0;
		int random = 0;
		int input1 = 0;
		int input2 = 0;

		// 배열에 1~25 숫자 넣기
		for (int i = 0; i < 25; i++) {
			num[i] = i + 1;
		}

		// 번호 섞기
		for (int i = 0; i < 500; i++) {
			random = (int) (Math.random() * 25);
			temp = num[0];
			num[0] = num[random];
			num[random] = temp;
		}

//		--------------------------------------------------------------------------
		// 2차원 배열에 num배열 숫자를 넣기

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				score[i][j] = num[5 * i + j];
			}
		}

		// 좌표 번호 입력하기

		System.out.println("번호 입력 하세요 (0~4)");
		input1 = scan.nextInt();
		input2 = scan.nextInt();
		System.out.printf("좌표 :%d,%d", input1, input2);
		System.out.println();

		// 2차원 배열 출력
		System.out.println("		[[  좌표 게임  ]]");
		System.out.println();
		System.out.printf("번호 |\t0\t1\t2\t3\t4\n");
		System.out.println("---------------------------------------------");

		for (int i = 0; i < 5; i++) {
			System.out.printf("%d   |\t", i);
			for (int j = 0; j < 5; j++) {
				System.out.printf("%d\t", score[i][j]);
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");

	} // main

} // class
