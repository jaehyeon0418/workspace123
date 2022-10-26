package p1014;

import java.util.Arrays;
import java.util.Scanner;

public class J1014_05_로또생성 {

	public static void main(String[] args) {
		// 1~45 까지 숫자를 배열에 저장하시오
		Scanner scan = new Scanner(System.in);

		int[] lotto = new int[45];
		int random = 0;
		int count = 0;
		int [] 	num = new int [6];
		
		// 배열 섞기
		for (int i = 0; i < 200; i++) {
			random = (int) (Math.random() * 45);
			int stemp = lotto[0];
			lotto[0] = lotto[random]; // 23 -> 0
			lotto[random] = stemp;
		}

		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 100 % 45);
//			lotto[i] = i + 1;	

		}
		// 출력
//		for (int i = 0; i < 45; i++) {
//			System.out.print(lotto[i] + " ");
//		}
//		System.out.println();

		// 입력

		for (int i = 0; i < 6; i++) {

			System.out.println("숫자를 입력하세요");
			num[i]= scan.nextInt();
			if (lotto[i] == num[i]) {
				System.out.println(count);
				count++;
			}

		}
		System.out.println("맞은 갯수 :" + count);
		System.out.println("랜덤 숫자 :" + Arrays.toString(lotto));
		System.out.println("넣은 숫자 :" + Arrays.toString(num));

		// 1-100 까지 랜덤숫자

//		int random = (int)(Math.random()*100+1);
//		
//		System.out.println(""random);

//		int num  = 0 ;
//		int num2 = 50 ;
//		int temp = 0 ;
//		num = (int)(Math.random()*100+1);
//		
//		System.out.println("num :" + num);  //랜덤숫자
//		System.out.println("num2 :"+ num2); // 50
//						
//		// num,num2의 숫자를 바꿔서 저장시켜 출력하시오
//		// temp 서로간의 값을 변경해야 함.
//
//		
//		temp = num ;
//		num = num2;
//		num2 = temp; 
//		
//		System.out.println("바뀐 변수 출력:" );  //
//		System.out.println("num :" + num);  // 50
//		System.out.println("num2 :"+ num2); // 랜덤

	} // main

} // class
