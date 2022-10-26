package p1013;

import java.util.Scanner;

public class J1013_03 {

	public static void main(String[] args) {
		// 10개의 숫자를 입력받아라.
		// 50보다 큰 수가 몇개인지 출력하시오
		// 입력한 숫자 : 10개
		// 50보다 큰 수 : 5개
		// 50보다 작은 수 : 5개
		Scanner scan = new Scanner(System.in);

		int[] num = new int[10]; // 1. 배열 5개 선언.
		int big = 0;
		String bigStr = " ";
		int small = 0;
		String smallStr = " ";
		for (int i = 0; i < 10; i++) {
			System.out.println("숫자를 10번 입력하세요");
			num[i] = scan.nextInt();
			if (num[i] >= 50) {
				System.out.println("50보다 크다");
				big++;
				bigStr = bigStr + num[1]; // "" + 20" = "20" +40 = "20 40
			} else {
				System.out.println("50보다 작다");
				small++;
				smallStr = smallStr+" " +num[1];
			}

		}
		System.out.print("입력한 숫자 :");
		for (int i = 0; i < 10; i++) {
			System.out.print(num[i] + ",");
		}
		System.out.println();
		System.out.println("큰 수 :" + big+" "+bigStr);

		System.out.println("작은 수 :" + small+" "+smallStr);
	}

}
