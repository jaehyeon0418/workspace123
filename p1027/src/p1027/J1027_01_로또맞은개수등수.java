package p1027;

import java.util.Scanner;

public class J1027_01_로또맞은개수등수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] lotto = new int[45];
		int[] mylotto = new int[6];
		int temp = 0;
		int random = 0;
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int[] checklotto = new int[6];

//		System.out.println();
		loop: while (true) {
			for (int i = 0; i < 45; i++) {
				lotto[i] = i + 1;
			}

			for (int i = 0; i < 500; i++) {
				random = (int) (Math.random() * 45);
				temp = lotto[0];
				lotto[0] = lotto[random];
				lotto[random] = temp;
			}

			System.out.println("로또 입력하기");
			for (int i = 0; i < 6; i++) {
				System.out.println("1~45중에 번호를 입력하세요.");
				mylotto[i] = scan.nextInt();
			}

			System.out.println("당첨 로또 번호");
			for (int i = 0; i < 6; i++) {
				System.out.printf("%d\t", lotto[i]);
			}
			System.out.println();
			System.out.println("입력 로또 번호");
			for (int i = 0; i < 6; i++) {
				System.out.printf("%d\t", mylotto[i]);

			}
			System.out.println();

			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					if (lotto[i] == mylotto[j]) {
						count++;
						checklotto[i] = mylotto[j];
					}
				}
			}
			System.out.println("맞은 로또 개수" + count);
			for (int i = 0; i < 6; i++) {
				System.out.printf("%d\t", checklotto[i]);
			}
			System.out.println();

			switch (count) {
			case 6:
				System.out.println("1등 600억 입니다.");
				break;
			case 5:
				System.out.println("2등 400억 입니다.");
				break;
			case 4:
				System.out.println("3등 100억 입니다.");
				break;
			case 3:
				System.out.println("4등 10억 입니다.");
				break;
			case 2:
				System.out.println("5등 1억 입니다.");
				break;
			case 1:
				System.out.println("6등 5천만 입니다.");
				break;
			case 0:
				System.out.println("꽝 입니다.");
				break loop ;
			}
		}
	}

}
