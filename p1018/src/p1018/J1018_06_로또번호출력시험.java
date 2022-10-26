package p1018;

import java.util.Scanner;

public class J1018_06_로또번호출력시험 {

	public static void main(String[] args) {
		// 로또 프로그램
		Scanner scan = new Scanner(System.in);

		int[] lotto = new int[45];
		int[] myLotto = new int[6];
		int random_num = 0;
		int temp = 0;
		int count = 0;
		// 1.1~45 번호 생성
		for (int i = 0; i < 45; i++) {
			lotto[i] = i + 1;
		}

		// 2.나의 로또 번호 입력
		for (int i = 0; i < 6; i++) {
			System.out.println("로또번호를 입력하세요");
			myLotto[i] = scan.nextInt();

		}
		// 3.1~45 로또 번호 섞기
		for (int i = 0; i < 500; i++) {

			random_num = (int) (Math.random() * 45);
			// 교환
			temp = lotto[0];
			lotto[0] = lotto[random_num];
			lotto[random_num] = temp;
		}

		// 4.입력 로또 번호 출력
		System.out.println("입력 로또 번호:");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d \t", myLotto[i]);
		}
		System.out.println();

		// 5.당첨 번호 출력
		System.out.println("당첨 로또 번호 :");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d \t", lotto[i]);
		}
		System.out.println();
		
		// 맞은개수 출력
		for (int j = 0; j < 6; j++) {
			if (myLotto[j] == lotto[j])
				count++;
		}
		System.out.println("맞은 개수 :"+count);

	}

}
