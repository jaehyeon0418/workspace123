package p1018;

import java.util.Scanner;

public class J1018_07_로또번호출력시험_연습 {

	public static void main(String[] args) {
		// 1~45까지 번호 생성
		Scanner scan = new Scanner(System.in);

		int[] lotto = new int[45];
		int[] mylotto = new int[6];
		int random_num = 0;
		int temp = 0;
		int count = 0;
		// 1 1~45까지 번호 생성

		for (int i = 0; i < 45; i++) {
			lotto[i] = i + 1;
		}

		// 2 my 로또 넘버 입력

		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호를 입력하세요");
			mylotto[i] = scan.nextInt();
			if (mylotto[i] < 1 || mylotto[i] > 45) {

				System.out.println("번호를 잘 못 입력했습니다. 다시 입력해주세요");
				i--;
			}	
		}

		// 3. 1~45까지 로또번호 섞기
		for (int i = 0; i < 500; i++) {
			random_num = (int) (Math.random() * 45); // 1.랜덤번호 생성
			temp = lotto[0]; // 2.temp 에 로또 0을 저장
			lotto[0] = lotto[random_num]; // 3.lotto 0 에 랜덤번호를 저장
			lotto[random_num] = temp; // 4.lotto랜덤번호에 temp를 저장
		}

		///////////////////////////////////////////////////////////////////////
		// 3. 1~45까지 로또번호 섞기
//		for (int i = 0; i < 500; i++) {
//			random_num = (int)(Math.random()*45);      // 1.랜덤번호 생성
//			1,temp  = 2,lotto[0] ;                    // 2.temp 에 로또 0을 저장
//			2,lotto[0]  = 3,lotto[random_num];		  // 3.lotto 0 에 랜덤번호를 저장
//			3,lotto[random_num] = 1,temp ;			 //  4.lotto랜덤번호에 temp를 저장
//		}

		///////////////////////////////////////////////////////////////////////

		// 4. 입력 로또 번호
		System.out.println("입력한 로또 번호");
		for (int i = 0; i < 6; i++) {
			System.out.println(mylotto[i]);
		}
		System.out.println();

		// 5 당첩 로또 번호 출력
		System.out.println("당첩 번호 :");
		for (int i = 0; i < 6; i++) {
			System.out.println(lotto[i]);
		}
		System.out.println();

		// 6 맞은 개수 출력
		for (int j = 0; j < 6; j++) {
			if (mylotto[j] == lotto[j])
				count++;
		}
		System.out.println("맞은 개수 :" + count);

	} // main

} // class
