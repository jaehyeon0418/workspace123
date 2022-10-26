package p1018;

import java.util.Scanner;

public class 정재현_study2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] lotto = new int[45];
		int[] mylotto = new int[6];
		int random_num = 0;
		int temp = 0;
		int count = 0;

		// 로또 번호 생성
		for (int i = 0; i < 45; i++) {
			lotto[i] = i + 1;
		}

		// 로또 번호 입력하기
		for (int i = 0; i < 6; i++) {
			System.out.println("번호를 입력하세요");
			mylotto[i] = scan.nextInt();
			if (mylotto[i] < 1 || mylotto[i] > 45) {
				System.out.println("잘못된 번호를 입력했습니다. 번호를 다시 입력해주세요");
				i--;
			}
		}

		// 로또 번호 섞기
		for (int i = 0; i < 500; i++) {
			random_num = (int) (Math.random() * 45);
			temp = lotto[0];
			lotto[0] = lotto[random_num];
			lotto[random_num] = temp;
		}

		// 입력한 로또 번호 출력
		System.out.println("입력한 로또 번호 :");
		for (int i = 0; i < 6; i++) {
			System.out.println(mylotto[i]);
		}
		System.out.println();

		// 당첨된 로또 번호 출력
		System.out.println("당첨된 로또 번호 :");
		for (int i = 0; i < 6; i++) {
			System.out.println(lotto[i]);
		}
		System.out.println();

		// 당첨된 로또 수
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (lotto[i] == mylotto[j])
					count++;
			}
		}
		System.out.println("맞은 개수"+count);
	}

}
