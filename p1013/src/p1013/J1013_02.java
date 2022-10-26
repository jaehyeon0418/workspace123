package p1013;

import java.util.Scanner;

public class J1013_02 {

	public static void main(String[] args) {
		// 입력한 숫자 5개를 입력받아
		// 5개의 숫자,합과 평균을 구하시오
		// 입력한 숫자 : 1,2,3,4,5

		// 1. 배열 5개 선언.
		// 2. 배열 값을 넣는다.
		// 3. 배열 값을 출력한다.

		// 합계 : 15
		// 평균 : 3.0

		Scanner scan = new Scanner(System.in);
		int sum = 0;
		double avg = 0;
		int[] num = new int[5]; // 1. 배열 5개 선언.

		for (int i = 0; i < 5; i++) {
			System.out.println("숫자를 5번 입력하세요");
			num[i] = scan.nextInt();
			sum = sum + num[i];  // 합계 값 sum = 

		}
		avg = (double) sum / num.length; // 평균값 구하는 법
		System.out.print("입력한 숫자 :");
		for (int i = 0; i < 5; i++) {
			System.out.print(num[i] + ",");
		}
		System.out.println();
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);

	}

}
