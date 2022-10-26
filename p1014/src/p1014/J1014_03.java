package p1014;

import java.util.Scanner;

public class J1014_03 {

	public static void main(String[] args) {

		// math.random()
		// 1~100 까지 랜덤 숫자 10개 를 배열에 저장해서 출력하시오
		// 1.랜덤 1~100까지 1개를 출력해보세요

		// 1.랜덤 1~100까지 1개를 출력해보세요 (정답)
		int[] num = new int[10];
		int[] input = new int[10];
		int count = 0;
		Scanner scan = new Scanner(System.in);

		// 랜덤숫자 10개 (정답)
		for (int i = 0; i < 10; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
		}

		// 랜덤숫자 출력
		System.out.println("랜덤숫자");
		for (int i = 0; i < 10; i++) {
			System.out.println(num[i]);
		}

		// 1~100개 숫자10개를 Scanner 입력받으시오.
		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + "번째 숫자를 입력하세요");
			input[i] = scan.nextInt();
		}

		// 입력 input
		System.out.println("입력 숫자");
		for (int i = 0; i < 10; i++) {
			System.out.println(input[i]);
		}
		System.out.println();

		// num[0] == input [0] 맞는지 틀린지 출력하시오
		// 맞으면 count++ , 틀리면 그대로
		// count 출력하시오

		///// 2022-10-14 숙제 //////
		// num [0] -> input [0]~~~~~~~~~~~[9] 이중 for 사용
		// num [1] -> input [0]~~~~~~~~~~~[9] 이중 for 사용
		// num [2] -> input [0]~~~~~~~~~~~[9] 이중 for 사용
		// .....
		// num [7] -> input [0]~~~~~~~~~~~[9] 이중 for 사용
		// num [9] -> input [0]~~~~~~~~~~~[9] 이중 for 사용
		// num [9] -> input [0]~~~~~~~~~~~[9] 이중 for 사용
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {


				if (num[i] == input[j]) {
					count++;
				}
			}
		}
		System.out.println("맞는 개수 :" + count); // 맞는 개수 0 or 1

	}// mian

} // class
