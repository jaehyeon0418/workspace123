package p1019;

import java.util.Scanner;

public class J1019_로또시험 {

	public static void main(String[] args) {
		//

		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[45];
		int[] mylotto = new int[6];
		int temp = 0;
		int random = 0;
		int count = 0;

		// 로또 생성
		for (int i = 0; i < 45; i++) {
			lotto[i] = i + 1;
		}

		// 로또 섞기
		for (int i = 0; i < 45; i++) {
			random = (int) (Math.random() * 45);
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}

		// 로또 번호 입력하기
		System.out.println("로또 번호 입력");
		for (int i = 0; i < 6; i++) {
			mylotto[i] = scan.nextInt();
			if (mylotto[i] < 1 || mylotto[i] > 45) {
				System.out.println("번호를 잘못입력했습니다.  다시 번호를 입력해주세요.");
			}
		}

		// 당첨 로또 번호
		System.out.println("당첨 번호");
		for (int i = 0; i < 6; i++) {
			System.out.println(lotto[i]);
		}

		// 맞은 로또 번호
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (lotto[i] == mylotto[j])
					;
				count++;

			}
		}
		System.out.println("맞은 개수 :" + count);
	} // main

} // class
